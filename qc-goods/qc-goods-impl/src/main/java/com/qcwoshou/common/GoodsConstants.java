package com.qcwoshou.common;

/**
 * @Author zhouzhiming
 * @Description 商品模块自定义常量
 * @Date 18:02 2018/10/23
 * @Param
 * @return
 **/
public class GoodsConstants {

    //固定销售量
    public static final Integer TEN = 10;

    //商品分类层级
    public static final Byte GOODS_TYPE_LEVEL_ONE = 1;
    public static final Byte GOODS_TYPE_LEVEL_TWO = 2;
    public static final Byte GOODS_TYPE_LEVEL_THREE = 3;

    /**
     * 是否上架 0为已下架 1为已上架 2为未上架
     */
    public static final Byte GOODS_IS_ONLIVE_ZERO = 0;
    /**
     * 是否上架 0为已下架 1为已上架 2为未上架
     */
    public static final Byte GOODS_IS_ONLIVE_ONE = 1;
    /**
     * 是否上架 0为已下架 1为已上架 2为未上架
     */
    public static final Byte GOODS_IS_ONLIVE_TWO = 2;

    /**
     * 商品审核状态：0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)
     */
    public static final Byte GOODS_PUBLISH_WAIT_ZERO = 0;
    /**
     * 商品审核状态：0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)
     */
    public static final Byte GOODS_PUBLISH_WAIT_ONE = 1;
    /**
     * 商品审核状态：0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)
     */
    public static final Byte GOODS_PUBLISH_WAIT_TWO = 2;
    /**
     * 商品审核状态：0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)
     */
    public static final Byte GOODS_PUBLISH_WAIT_THREE = 3;

    /**
     * 用户类型
     */
    public static final String USER_AGENT = "1";// 代理商
    public static final String USER_SUPPLIER = "2";// 商户
    public static final String USER_BACK = "3";// 后台

    /**
     * 系统
     */
    public static final String USER_AGENT_BACK = "1";// 代理商后台
    public static final String USER_SUPPLIER_BACK = "2";// 商户后台
    public static final String USER_BIG_BACK = "3";// 大后台

    /** 直播相关配置  **/
    /**
     * bizid
     */
    public static final String BIZ_ID = "31884";
    /**
     * 鉴权key
     */
    public static final String LIVE_KEY = "0a4c252417b70765ee2f75960438bad3";
    /**
     * 默认直播时长
     */
    public static final int DEFAULT_LIVE_TIME = 5;

    /**
     * 直播开始时间默认至少大于当前时间10分钟
     */
    public static final int BEGIN_LIVETIME_DEFAULT_BEHAIND_NOW = 10;
    /**
     * 视频编码由 当前时间+默认6位随机数生成
     */
    public static final int VEDIO_CODE_RANDOM_BIT_NUM = 6;

    /**
     * 直播视频状态
     */
    public static enum VIDEO_STATUS {
        NEW_CREATE(0),
        LIVING(1),
        LIVE_RECORD(2),
        LIVE_END(3),
        UN_LIVE(4);

        public Integer statusCode;

        private VIDEO_STATUS(Integer statusCode) {
            this.statusCode = statusCode;
        }
    }

}
