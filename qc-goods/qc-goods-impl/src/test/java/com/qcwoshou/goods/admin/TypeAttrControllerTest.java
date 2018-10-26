package com.qcwoshou.goods.admin;

import com.alibaba.fastjson.JSON;
import com.qcwoshou.SpringBootBaseTestCase;
import com.qcwoshou.goods.dto.request.TypeAttrAddRequest;
import com.qcwoshou.goods.dto.request.TypeAttrAllListRequest;
import com.qcwoshou.goods.dto.request.TypeAttrListRequest;
import com.qcwoshou.goods.dto.request.TypeAttrUpdateRequest;
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
 * @Description 商品attr
 * @Date 0:30 2018/10/24
 * @Param
 * @return
 **/
@Slf4j
public class TypeAttrControllerTest extends SpringBootBaseTestCase {

	@Test
	public void typeAttrListTest() throws Exception {
		TypeAttrListRequest request = new TypeAttrListRequest();
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/typeAttr/list").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品attr列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	@Test
	public void allAttrAndAttrValueListTest() throws Exception {
		TypeAttrListRequest request = new TypeAttrListRequest();
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/typeAttr/allAttrAndAttrValueList").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("获取商品attr及属性值列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	@Test
	public void typeAttrAllListTest() throws Exception {
		TypeAttrAllListRequest request = new TypeAttrAllListRequest();
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/typeAttr/allList?attributeName=商品").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品attr全部列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	@Test
	public void typeAttrDetailsTest() throws Exception {
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/typeAttr/details").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品attr详情返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
 
	}

	@Test
	public void addTypeAttrTest() throws Exception {
		TypeAttrAddRequest request = new TypeAttrAddRequest();
		request.setAttributeName("衣长");
		request.setSort(new Byte("10"));
		System.out.println(JSON.toJSONString(request));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/typeAttr/add").contentType(MediaType.APPLICATION_JSON)
						.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("新增商品attr返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}
	
	@Test
	public void updatetypeAttrTest() throws Exception {
		TypeAttrUpdateRequest request = new TypeAttrUpdateRequest();
		request.setId(7);
		request.setAttributeName("裤长");

		System.out.println(JSON.toJSONString(request));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/typeAttr/update").contentType(MediaType.APPLICATION_JSON)
						.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("修改商品attr返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}
	
	@Test
	public void deletetypeAttrTest() throws Exception {

		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.delete("/goodsCenter/admin/typeAttr/delete/7").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("修改商品attr返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}

}
