package com.qcwoshou.fieldpack.annotations;

import java.lang.annotation.*;


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PackEntity {
	String querySql();
	String cacheKey();
	String idFieldName();
	String dbColumn();
}
