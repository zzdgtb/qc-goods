package com.qcwoshou.goods.app;

import com.qcwoshou.SpringBootBaseTestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * 
* 功能描述: 商品attr
* @author: xiongkun
* @date: 2017年11月21日 下午2:08:05
 */
@Slf4j
public class TypeAttrControllerTest extends SpringBootBaseTestCase {

	@Test
	public void typeAttrListTest() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/app/typeAttr/v1/list?goodsTypeId=3").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("app查看商品attr列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
	}
	
}
