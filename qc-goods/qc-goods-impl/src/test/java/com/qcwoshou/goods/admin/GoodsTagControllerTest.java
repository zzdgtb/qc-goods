package com.qcwoshou.goods.admin;

import com.alibaba.fastjson.JSON;
import com.qcwoshou.SpringBootBaseTestCase;
import com.qcwoshou.goods.dto.request.GoodsTagAddRequest;
import com.qcwoshou.goods.dto.request.GoodsTagListRequest;
import com.qcwoshou.goods.dto.request.GoodsTagUpdateRequest;
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
 * 
* 功能描述: 商品标签
* @author: xiongkun
* @date: 2017年11月21日 下午2:08:05
 */
@Slf4j
public class GoodsTagControllerTest extends SpringBootBaseTestCase {

	@Test
	public void goodsTagListTest() throws Exception {
		GoodsTagListRequest request = new GoodsTagListRequest();
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goodsTag/list").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品标签列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
				
//		MvcResult mvcResult = mockMvc
//                .perform(// 1
//                        MockMvcRequestBuilders.get("/goodsCenter/admin/goodsTag/list") // 2
//                )
//                .andReturn();// 4
//		
//		int status = mvcResult.getResponse().getStatus(); // 5
//        String responseString = mvcResult.getResponse().getContentAsString(); // 6
//        log.info("商品标签列表返回信息为：{}", responseString);
	}
	
	@Test
	public void goodsTagAllListTest() throws Exception {
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goodsTag/allList")
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("获取所有商品标签列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	
	@Test
	public void goodsTagDetailsTest() throws Exception {
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goodsTag/details/7").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品标签详情返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}

	@Test
	public void addGoodsTagAgent() throws Exception {
		GoodsTagAddRequest request = new GoodsTagAddRequest();
		request.setTagName("tsx");

		System.out.println(JSON.toJSONString(request));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/goodsTag/add").contentType(MediaType.APPLICATION_JSON)
						.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("新增商品标签返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}
	
	@Test
	public void updateGoodsTagAgent() throws Exception {
		GoodsTagUpdateRequest request = new GoodsTagUpdateRequest();
		request.setId(7);
		request.setTagName("1234");

		System.out.println(JSON.toJSONString(request));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/goodsTag/update").contentType(MediaType.APPLICATION_JSON)
						.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("修改商品标签返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}
	
	@Test
	public void deleteGoodsTagAgent() throws Exception {

		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.delete("/goodsCenter/admin/goodsTag/delete/7").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("修改商品标签返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}

}
