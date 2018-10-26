package com.qcwoshou.goods.admin;

import com.alibaba.fastjson.JSON;
import com.qcwoshou.SpringBootBaseTestCase;
import com.qcwoshou.goods.dto.request.TypeAttrValueAddRequest;
import com.qcwoshou.goods.dto.request.TypeAttrValueListRequest;
import com.qcwoshou.goods.dto.request.TypeAttrValueUpdateRequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author zhouzhiming
 * @Description 商品属性值
 * @Date 0:29 2018/10/24
 * @Param
 * @return
 **/
@Slf4j
public class TypeAttrValueControllerTest extends SpringBootBaseTestCase {

	@Test
	public void typeAttrListTest() throws Exception {
		TypeAttrValueListRequest request = new TypeAttrValueListRequest();
		request.setAttributeId(1);
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/typeAttrValue/list").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品属性值列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	@Test
	public void typeAttrDetailsTest() throws Exception {
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/typeAttrValue/details/8").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品属性值详情返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}

	@Test
	public void addTypeAttrValueTest() throws Exception {
		TypeAttrValueAddRequest request = new TypeAttrValueAddRequest();
		request.setAttributeId(7);
		request.setAttributeValue("裤长1m");
		request.setSort(new Byte("10"));
		System.out.println(JSON.toJSONString(request));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/typeAttrValue/add").contentType(MediaType.APPLICATION_JSON)
						.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("新增商品属性值返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}
	
	@Test
	public void updatetypeAttrTest() throws Exception {
		TypeAttrValueUpdateRequest request = new TypeAttrValueUpdateRequest();
		request.setId(14);
		request.setAttributeValue("裤长1.2m");
		request.setSort(new Byte("10"));
		
		System.out.println(JSON.toJSONString(request));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/typeAttrValue/update").contentType(MediaType.APPLICATION_JSON)
						.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("修改商品属性值返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}
	
	@Test
	public void deletetypeAttrTest() throws Exception {

		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.delete("/goodsCenter/admin/typeAttrValue/delete/14").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("修改商品属性值返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}

}
