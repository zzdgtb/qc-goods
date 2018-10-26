package com.qcwoshou.goods.admin;

import com.alibaba.fastjson.JSON;
import com.qcwoshou.SpringBootBaseTestCase;
import com.qcwoshou.goods.dto.request.*;
import com.qcwoshou.goods.facade.dto.request.GoodsBoughtDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsBoughtUpdateDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsDetailsDRequest;
import com.qcwoshou.goods.facade.dto.request.GoodsStatisticalUpdateRequest;
import com.qcwoshou.goods.service.IGoodsService;
import com.qcwoshou.goods.service.IGoodsSkuService;
import com.qcwoshou.goods.service.IGoodsStatisticalService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultHandler;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @Author zhouzhiming
 * @Description 商品
 * @Date 23:42 2018/10/23
 * @Param
 * @return
 **/
@Slf4j
public class GoodsAdminControllerTest extends SpringBootBaseTestCase {
	@Autowired
	IGoodsService iGoodsService;
	@Autowired
	IGoodsSkuService iGoodsSkuService;
	@Autowired
	IGoodsStatisticalService goodsStatisticalService;

	
	@Test
	public void goodsGet() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goods/get/4050")
				//.headers(header)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
				

	}
	
	@Test
	public void goodsListTest() throws Exception {
		GoodsTagListRequest request = new GoodsTagListRequest();
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goods/list?publishWait=1&isOnlive=1&name=测试")
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
				

	}
	
	@Test
	public void goodsExportListTest() throws Exception {
		GoodsTagListRequest request = new GoodsTagListRequest();
		
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goods/exportList?publishWait=1&isOnlive=1&name=测试")
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("商品导出列表返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
				

	}
	
	@Test
	public void goodsTagRelationTest() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goods/goodsTagRelation?goodsId=3710").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品标签关联关系返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
				

	}
	
	@Test
	public void goodsBindTagTest() throws Exception {
		GoodsBindTagRequest request = new GoodsBindTagRequest();
		Integer[] tagIds = {4,7};
		request.setTagIds(tagIds);
		request.setGoodsId(2);
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/goods/goodsBindTag").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("商品列绑定标签返回信息为：{}", result.getResponse().getContentAsString());
			}
		});	
	}
	
	@Test
	public void goodsAttrRelationTest() throws Exception {
		ResultActions result = mockMvc.perform(
				MockMvcRequestBuilders.get("/goodsCenter/admin/goods/goodsAttrRelation?goodsId=3714").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("查看商品标签关联关系返回信息为：{}", result.getResponse().getContentAsString());
			}
		});		
				

	}
	
	@Test
	public void goodsBindAttrTest() throws Exception {
		GoodsBindAttrRequest request = new GoodsBindAttrRequest();
		request.setGoodsId(2);
		List<TypeAttrValueBindRequest> attrValues = new ArrayList<>();
		
		TypeAttrValueBindRequest attrValue1 = new TypeAttrValueBindRequest();
		attrValue1.setId(8);
		attrValue1.setAttributeId(1);
		attrValues.add(attrValue1);
		
		TypeAttrValueBindRequest attrValue2 = new TypeAttrValueBindRequest();
		attrValue2.setId(9);
		attrValue2.setAttributeId(1);
		attrValues.add(attrValue2);
		
		request.setAttrValues(attrValues);
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/goods/goodsBindAttr").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("商品列绑定属性返回信息为：{}", result.getResponse().getContentAsString());
			}
		});	
	}

	@Test
	public void goodsIsOnliveUpdate() throws Exception {
		GoodsIsOnliveUpdateRequest request = new GoodsIsOnliveUpdateRequest();
		request.setId(2);
		request.setIsOnlive(new Byte("1"));
		ResultActions result = mockMvc.perform(
				post("/goodsCenter/admin/goods/isOnlive/update").contentType(MediaType.APPLICATION_JSON)
				.content(JSON.toJSONString(request)).accept(MediaType.APPLICATION_JSON)) // 执行请求
				.andExpect(status().isOk()); // 请求
		result.andDo(new ResultHandler() {
			@Override
			public void handle(MvcResult result) throws Exception {
				log.info("商品更新上架状态，结果为：{}", result.getResponse().getContentAsString());
			}
		});	
	}

	@Test
	public void getGoodsDetailsByIdAndSkuNumber() throws Exception {
		GoodsDetailsDRequest request = new GoodsDetailsDRequest();
		request.setGoodsId(3964);
		request.setSkuNumber("1508751522396483");
		iGoodsService.getGoodsDetailsByIdAndSkuNumber(request);
	}
	@Test
	public void getGoodsBought() throws Exception {
		GoodsBoughtDRequest request = new GoodsBoughtDRequest();
		request.setGoodsId(4015);
		request.setSkuNumber("201712190000000005");
		iGoodsService.getGoodsBought(request);
	}

	@Test
	public void updateGoodsBought() throws Exception {
		GoodsBoughtUpdateDRequest request = new GoodsBoughtUpdateDRequest();
		request.setGoodsId(3842);
		request.setSkuNumber("1498563142384228");
		request.setType(1);
		request.setCount(10);
		iGoodsService.updateGoodsBought(request);
	}

	@Test
	public void deleteSkuModel() throws Exception {
		iGoodsSkuService.deleteSkuModel(760);
	}

	@Test
	public void updateGoodsStastical() throws Exception{
		List<GoodsStatisticalUpdateRequest> request = new ArrayList<GoodsStatisticalUpdateRequest>();
		GoodsStatisticalUpdateRequest r1 = new GoodsStatisticalUpdateRequest();
		r1.setGoodsId(112);
		r1.setSkuNumber("123456789");
		r1.setCount(1);
		r1.setType(2);
		request.add(r1);
		
		GoodsStatisticalUpdateRequest r2 = new GoodsStatisticalUpdateRequest();
		r2.setGoodsId(112);
		r2.setSkuNumber("123456787");
		r2.setCount(22);
		r2.setType(2);
		request.add(r2);
		
		GoodsStatisticalUpdateRequest r3 = new GoodsStatisticalUpdateRequest();
		r3.setGoodsId(1122);
		r3.setSkuNumber("12345678122");
		r3.setCount(22);
		r3.setType(2);
		request.add(r3);
		
		goodsStatisticalService.updateGoodsStatistical(request);
	}

	@Test
	public void updateGoodsStastical2() throws Exception{
		List<GoodsStatisticalUpdateRequest> request = new ArrayList<GoodsStatisticalUpdateRequest>();
		GoodsStatisticalUpdateRequest r1 = new GoodsStatisticalUpdateRequest();
		r1.setGoodsId(23);
		r1.setSkuNumber("3434242334");
		r1.setCount(23);
		r1.setType(1);
		goodsStatisticalService.updateGoodsStatistical(request);
	}
}
