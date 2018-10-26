package com.qcwoshou.goods.admin;

import com.alibaba.fastjson.JSON;
import com.qcwoshou.SpringBootBaseTestCase;
import com.qcwoshou.goods.dto.request.GoodsTypeAddRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeAllListRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeListRequest;
import com.qcwoshou.goods.dto.request.GoodsTypeUpdateRequest;
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
 * @Description 商品分类
 * @Date 23:39 2018/10/23
 * @Param
 * @return
 **/
@Slf4j
public class GoodsTypeControllerTest extends SpringBootBaseTestCase {

	@Test
	public void goodsTypeListTest() throws Exception {
		GoodsTypeListRequest request = new GoodsTypeListRequest();
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goodsType/list?name=品").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品分类列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	@Test
	public void goodsTypeAllListTest() throws Exception {
		GoodsTypeAllListRequest request = new GoodsTypeAllListRequest();
		request.setPid(0);
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goodsType/allList").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品分类所有列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}
	
	@Test
	public void goodsTypeDetailsTest() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goodsType/details").param("id","420").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品分类详情返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		

	}

	@Test
	public void addGoodsTypeTest() throws Exception {
		GoodsTypeAddRequest request = new GoodsTypeAddRequest();
		request.setName("ceshi");
		request.setPid(0);
		request.setIcon("goods/1497542400/14976107552084.jpeg");
		Integer[] arrtIds = {1, 4};
		request.setAttrIds(arrtIds);
		request.setAppHome(new Byte("0"));
		request.setLevel(new Byte("1"));
		request.setSort(10);
		request.setAdsImage("goods/1497542400/14976107552084.jpeg");
		System.out.println(JSON.toJSONString(request));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/goodsType/add").contentType(MediaType.APPLICATION_JSON)
						.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("新增商品分类返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}
	
	@Test
	public void updateGoodsTypeTest() throws Exception {
		GoodsTypeUpdateRequest request = new GoodsTypeUpdateRequest();
		request.setId(420);
		request.setName("测试");
		request.setPid(0);
		request.setIcon("goods/1497542400/14976107552084.jpeg");
		Integer[] arrtIds = {1, 5};
		request.setAttrIds(arrtIds);
		request.setAppHome(new Byte("0"));
		request.setLevel(new Byte("1"));
		request.setSort(12);
		request.setAdsImage("goods/1497542400/14976107552084.jpeg");


		System.out.println(JSON.toJSONString(request));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/goodsType/update").contentType(MediaType.APPLICATION_JSON)
						.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("修改商品分类返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}
	
	@Test
	public void deleteGoodsTypeTest() throws Exception {

		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.delete("/goodsCenter/admin/goodsType/delete?id=195").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("删除商品分类返回信息为：{}", result.getResponse().getContentAsString());
			}
		});
	}

}
