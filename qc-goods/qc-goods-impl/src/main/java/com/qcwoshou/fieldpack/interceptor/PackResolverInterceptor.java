package com.qcwoshou.fieldpack.interceptor;

import com.github.pagehelper.PageInfo;
import com.qcwoshou.core.dto.result.BaseCommonResult;
import com.qcwoshou.fieldpack.annotations.PackEntity;
import com.qcwoshou.redis.util.JedisUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Aspect
@Component
public class PackResolverInterceptor {
	
	private static List<Class<?>> elemClassList;
	
	@PostConstruct
	public void initMethod(){
		elemClassList = new ArrayList<Class<?>>();
		elemClassList.add(String.class);
		elemClassList.add(Boolean.class);
		elemClassList.add(boolean.class);
		elemClassList.add(Byte.class);
		elemClassList.add(byte.class);
		elemClassList.add(Integer.class);
		elemClassList.add(int.class);
		elemClassList.add(Long.class);
		elemClassList.add(long.class);
		elemClassList.add(BigDecimal.class);
		elemClassList.add(Date.class);
		elemClassList.add(Short.class);
		elemClassList.add(short.class);
		elemClassList.add(Float.class);
		elemClassList.add(float.class);
		elemClassList.add(Double.class);
		elemClassList.add(double.class);
		elemClassList.add(Character.class);
		elemClassList.add(char.class);
	}

	@Autowired
	private JdbcTemplate coreJdbcTemplate;

	@Pointcut("execution(@com.qcwoshou.fieldpack.annotations.PackTarget * *(..))")
	private void pointRepeat() {
	};

	@Around("pointRepeat()")
	public Object doSomethingAround(ProceedingJoinPoint point) throws Throwable {
		Object result = point.proceed();
		if (result instanceof BaseCommonResult) {
			dealBodyData((BaseCommonResult) result);
		} else {
			dealCommonObject(result);
		}

		return result;
	}

	private void dealCommonObject(Object result) throws IllegalAccessException {
		if (result instanceof List<?>) {
			dealList((List<?>) result);
		} else {
			dealObject(result);
		}

	}

	private void dealList(List<?> list) throws IllegalAccessException {
		if (CollectionUtils.isEmpty(list)) {
			return;
		}
		for (int index = 0; index < list.size(); index++) {
			Object target = list.get(index);
			if(!elemClassList.contains(target.getClass())){
				dealObject(target);
			}
		}
	}

	private void dealObject(Object target) throws IllegalAccessException {
		if (target == null) {
			return;
		}
		Field[] fields = target.getClass().getDeclaredFields();
		if (fields != null) {
			for (Field field : fields) {
				PackEntity entity = field.getAnnotation(PackEntity.class);
				if (entity != null) {
				  
				  
					Field idField = FieldUtils.getField(target.getClass(),entity.idFieldName(), true);
					
					
					if (idField != null) {
					  
						Object idValue = FieldUtils.readField(idField, target,true);
						
						if (idValue != null) {
							String value = readValFromCacheOrDb(idValue, entity);
							if (!StringUtils.isEmpty(value)) {
								FieldUtils.writeField(field, target, value,
										true);
							}
						}
					}
				}else{
					Class<?> clazz = field.getType();
					if(clazz == List.class || !elemClassList.contains(clazz)){
					  
						dealCommonObject(FieldUtils.readField(field, target, true));
						
					}
				}
			}
		}
	}

	@SuppressWarnings("rawtypes")
	private void dealBodyData(BaseCommonResult bd) throws IllegalAccessException {
		if (bd == null) {
			return;
		}
		Object content = bd.getData();
		Object realObject = content;
		if (content instanceof PageInfo) {
			realObject = ((PageInfo) content).getList();
		}

		dealCommonObject(realObject);
	}

	private String readValFromCacheOrDb(Object idValue, PackEntity entity) {
		String cacheKey = entity.cacheKey().concat(idValue.toString());
		String value = JedisUtils.getJedisInstance().execGetFromCache(cacheKey);
		if (value == null) {
			List<Map<String, Object>> list = coreJdbcTemplate.queryForList(
					entity.querySql(), new Object[] { idValue });
			if (!CollectionUtils.isEmpty(list)) {
				Object dbValue = list.get(0).get(entity.dbColumn());
				if (dbValue != null) {
					value = dbValue.toString();
				}
			}
			int expireTime = 3600;
			if(value == null){
				expireTime = 300;
			}
			JedisUtils.getJedisInstance().execSetexToCache(cacheKey, expireTime,
					value == null ? "" : value);
		} else if ("".equals(value)) {
			value = null;
		}
		return value;
	}

}
