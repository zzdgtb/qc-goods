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

    /**---------------------------- 直播相关配置 ------------------------------- **/
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
     * 开播时间与预播时间默认偏差不能大于10分钟
     */
    public static final int BEGIN_LIVETIME_DEFAULT_BEHAIND_NOW = 10;
    /**
     * 视频编码由 当前时间+默认6位随机数生成
     */
    public static final int VEDIO_CODE_RANDOM_BIT_NUM = 6;
    /**
     * IM后台RESTful API的主机地址。
     */
    public static final String IM_HOST = "https://console.tim.qq.com/";

    /**
     * 需要开通云通信服务
     * 参考指引 @https://cloud.tencent.com/document/product/454/7953#3.-.E4.BA.91.E9.80.9A.E8.AE.AF.E6.9C.8D.E5.8A.A1.EF.BC.88im.EF.BC.89
     * 有介绍appid 和 accType的获取方法。以及私钥文件的下载方法。
     */
    public class IM_CONFIG {
        /**
         * 云通信 IM_SDKAPPID = IM_ACCOUNTTYPE 和 PRIVATEKEY 是云通信独立模式下，为您的独立账号 identifer，
         * 派发访问云通信服务的userSig票据的重要信息，填写错误会导致IM登录失败，IM功能不可用
         */
        public final static long IM_SDKAPPID = 1400143011;

        /**
         * 云通信 账号集成类型 IM_ACCOUNTTYPE = IM_SDKAPPID 和 PRIVATEKEY 是云通信独立模式下，为您的独立账户identifer，
         * 派发访问云通信服务的userSig票据的重要信息，填写错误会导致IM登录失败，IM功能不可用
         */
        public final static String IM_ACCOUNTTYPE = "39202";

        // 云通信 管理员账号
        public final static String ADMINISTRATOR = "admin";

        /**
         * 云通信 派发usersig 采用非对称加密算法RSA，用私钥生成签名。PRIVATEKEY就是用于生成签名的私钥，私钥文件可以在互动直播控制台获取
         * 配置privateKey
         * 将private_key文件的内容按下面的方式填写到 PRIVATEKEY。
         */
        public final static String PRIVATEKEY = "-----BEGIN PRIVATE KEY-----\n" +
                "MIGHAgEAMBMGByqGSM49AgEGCCqGSM49AwEHBG0wawIBAQQgo7+WN4kPcJ8rjqdb\n" +
                "jBY+JYLNTl2eavyLeP6/dWeyThihRANCAAQl+IKokDq0ZsnmfR4dao2HSKKCUYRV\n" +
                "2S3JMxbXr5LWoae6ae/7CAkekND5c6aaDwdQmIdNab3tp0IDfRZc2V1B\n" +
                "-----END PRIVATE KEY-----";
        /**
         * 云通信 验证usersig 所用的公钥
         */
        public final static String PUBLICKEY = "-----BEGIN PUBLIC KEY-----\n" +
                "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEJfiCqJA6tGbJ5n0eHWqNh0iiglGE\n" +
                "VdktyTMW16+S1qGnumnv+wgJHpDQ+XOmmg8HUJiHTWm97adCA30WXNldQQ==\n" +
                "-----END PUBLIC KEY-----\n";
    }

    /**
     * 直播视频状态
     */
    public static enum VIDEO_STATUS {
        NEW_CREATE(0, "新建"),
        LIVING(1, "直播中"),
        LIVE_RECORD(2, "直播回放"),
        LIVE_END(3, "直播完成"),
        UN_LIVE(4, "未开播");

        public Integer statusCode;

        public String statusname;

        private VIDEO_STATUS(Integer statusCode, String statusname) {
            this.statusCode = statusCode;
            this.statusname = statusname;
        }
    }
    /**
     * 群组类型
     */
    public static enum IM_GROUP_TYPE {
        PRIVATE("Private", "私有群"),
        PUBLIC("Public", "公开群"),
        CHAT_ROOM("ChatRoom", "聊天室"),
        AV_CHAT_ROOM("AVChatRoom", "互动直播聊天室"),
        B_CHAT_ROOM("BChatRoom", "在线成员广播大群");

        public String type;

        public String typeName;

        private IM_GROUP_TYPE(String type, String typeName) {
            this.type = type;
            this.typeName = typeName;
        }
    }
}
