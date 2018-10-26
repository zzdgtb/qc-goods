package com.qcwoshou.goods.admin;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {

	public static void main(String[] args) {  
		String modelNumber = "s136es185e";
		String skuTitle = "白色 中码";
		int id = 145;
		
		String newModelNumber = updateSkuModelNumber(id,modelNumber,skuTitle);
		System.out.println("old:"+modelNumber+" new:"+newModelNumber);
  
    }  
      
      public static String updateSkuModelNumber(int id,String modelNumber,String skuTitle){
    	String[] skuModelIds = modelNumber.split("e");
    	int skuModelIndex = 0;
  		for (int i = 0; i < skuModelIds.length; i++) {
  			int tempId = Integer.parseInt(skuModelIds[i].replaceAll("s", ""));
  			if(id>tempId){
  				skuModelIndex = skuModelIndex +1;
  			}
  		}
  		//如果为第一个，则直接拼接前面返回
  		if(skuModelIndex==0){
  			return "s"+id+"e"+" "+skuTitle;
  		}
  		//如果为最后一个，则直接拼接在后面返回
  		if(skuModelIndex==skuModelIds.length){
  			return skuTitle+" "+"s"+id+"e";
  		}
  		
 	    //这里是获取"e"符号的位置对应次数出现位置
 	    Matcher slashMatcher = Pattern.compile(" ").matcher(skuTitle);
 	    int mIdx = 0;
 	    while(slashMatcher.find()) {
 	       mIdx++;
 	       if(mIdx == skuModelIndex){
 	          break;
 	       }
 	    }
 	    String newModelNumber = modelNumber.substring(0, slashMatcher.start()+1)+"s"+id+"e"+" "+skuTitle.substring(slashMatcher.start()+2);
  		return newModelNumber;
      }
      
}
