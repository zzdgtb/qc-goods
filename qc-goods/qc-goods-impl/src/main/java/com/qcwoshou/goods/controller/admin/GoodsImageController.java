package com.qcwoshou.goods.controller.admin;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhouzhiming
 * @Description 商品模块图片上传功能列表
 * @Date 9:08 2018/10/24
 * @Param
 * @return
 **/
@Api(description = "商品模块图片上传功能列表", basePath = "/goods/image")
@RestController
@RequestMapping("/goodsCenter/admin/goods/image")
public class GoodsImageController {
/*
    *//** 图片上传 *//*
	//@ApiOperation(value = "图片上传", httpMethod = "POST")
    @RequestMapping(value="/upload",method=RequestMethod.POST)
    @ResponseBody
    public BaseCommonResult upload(MultipartFile file,Integer type,
    		boolean isRepeatUpload,String imgUrl)throws Exception {
		return new BaseCommonResult();
    }
    *//** 图片上传 *//*
    @ApiOperation(value = "图片上传", httpMethod = "POST")
    @RequestMapping(value="/upload1",method=RequestMethod.POST)
    @ResponseBody
    public BaseCommonResult upload(@RequestBody GoodsFileUploadRequest request)throws Exception {
    	return new BaseCommonResult();
    }
    
    *//** 多图片上传 *//*
    @RequestMapping(value = "/multipartUpload",method = RequestMethod.POST)
    @ResponseBody
    public BaseCommonResult multipartUpload(@RequestBody MultipartUploadRequest request){
		return new BaseCommonResult();
    }*/
}
