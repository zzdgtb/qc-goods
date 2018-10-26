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
 * @Author zhouzhiming
 * @Description 商品列表
 * @Date 23:38 2018/10/23
 * @Param
 * @return
 **/
@Slf4j
public class GoodsControllerTest extends SpringBootBaseTestCase {

	@Test
	public void goodsListTest() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/app/goods/v1/list?goodsTypeId=116&priceOrder=2").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("app查看商品列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	@Test
	public void goodsSearchListTest() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/app/goods/v1/searchList?keyword=测试&page=2&pageSize=20&priceOrder=2").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("app商品搜索列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	@Test
	public void goodsHomeNewListTest() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/app/goods/v1/homeNewList").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("app首页新商品列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
	}
	
	@Test
	public void goodsDetailsTest() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/app/goods/v1/details?goodsId=3747").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("app查看商品详情返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
}
