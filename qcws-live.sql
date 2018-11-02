/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : qcws-live

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2018-11-02 17:46:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for c_temeplate
-- ----------------------------
DROP TABLE IF EXISTS `c_temeplate`;
CREATE TABLE `c_temeplate` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT '模板id',
  `temeplate_name` varchar(255) NOT NULL COMMENT '模板名称',
  `description` text COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模板定义表';

-- ----------------------------
-- Records of c_temeplate
-- ----------------------------

-- ----------------------------
-- Table structure for c_temeplate_key
-- ----------------------------
DROP TABLE IF EXISTS `c_temeplate_key`;
CREATE TABLE `c_temeplate_key` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `key` varchar(255) NOT NULL COMMENT '模板下所有 key定义',
  `temeplate_id` bigint(10) NOT NULL COMMENT '模板定义id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模板-key表';

-- ----------------------------
-- Records of c_temeplate_key
-- ----------------------------

-- ----------------------------
-- Table structure for c_temeplate_value
-- ----------------------------
DROP TABLE IF EXISTS `c_temeplate_value`;
CREATE TABLE `c_temeplate_value` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `temeplate_key_id` bigint(10) NOT NULL COMMENT '模板_key_id',
  `value` varchar(255) NOT NULL COMMENT '模板_key 对应的默认值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='模板_value 表';

-- ----------------------------
-- Records of c_temeplate_value
-- ----------------------------

-- ----------------------------
-- Table structure for im_friends
-- ----------------------------
DROP TABLE IF EXISTS `im_friends`;
CREATE TABLE `im_friends` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `owner_account_id` int(11) NOT NULL DEFAULT '0' COMMENT '“我”的账号ID',
  `friend_account_id` int(11) NOT NULL DEFAULT '0' COMMENT '好友的账号ID',
  `relation` smallint(6) NOT NULL DEFAULT '0' COMMENT '好友关系（ 0：陌生人，1：好友 ）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_friends
-- ----------------------------

-- ----------------------------
-- Table structure for im_friends_apply
-- ----------------------------
DROP TABLE IF EXISTS `im_friends_apply`;
CREATE TABLE `im_friends_apply` (
  `id` int(11) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `from_account` varchar(50) NOT NULL,
  `from_account_id` int(11) NOT NULL,
  `to_account` varchar(50) NOT NULL,
  `to_account_id` int(11) NOT NULL,
  `auth_type` smallint(6) NOT NULL DEFAULT '0' COMMENT '身份验证方式：（0：直接添加 1：用户确认 )',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态：（0：等待处理 1：成功 2：拒绝 3：已被忽略）',
  `remark` varchar(100) DEFAULT '' COMMENT '发起申请时的描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_friends_apply
-- ----------------------------

-- ----------------------------
-- Table structure for im_friends_group
-- ----------------------------
DROP TABLE IF EXISTS `im_friends_group`;
CREATE TABLE `im_friends_group` (
  `id` int(11) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `group_name` varchar(20) NOT NULL COMMENT '好友分组名称',
  `account` varchar(50) NOT NULL COMMENT '我的账号',
  `account_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_friends_group
-- ----------------------------

-- ----------------------------
-- Table structure for im_friends_group_account
-- ----------------------------
DROP TABLE IF EXISTS `im_friends_group_account`;
CREATE TABLE `im_friends_group_account` (
  `group_id` int(11) NOT NULL COMMENT '好友分组id',
  `friend_account_id` int(11) NOT NULL,
  PRIMARY KEY (`group_id`,`friend_account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_friends_group_account
-- ----------------------------

-- ----------------------------
-- Table structure for im_group
-- ----------------------------
DROP TABLE IF EXISTS `im_group`;
CREATE TABLE `im_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_code` varchar(255) NOT NULL COMMENT '群组编码--对应云通信中的群组id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `modify_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `name` varchar(50) NOT NULL,
  `owner_account` varchar(50) NOT NULL,
  `owner_account_id` int(11) NOT NULL,
  `is_need_auth` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否需要验证（0-否 1-是）',
  `auth_type` smallint(6) NOT NULL DEFAULT '0' COMMENT '身份验证方式：（0：群主确认 1：回答问题 2：回答问题+群主确认)',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_group
-- ----------------------------
INSERT INTO `im_group` VALUES ('12', 'qcws20181031180005ggKp13', '2018-10-31 18:00:07', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');
INSERT INTO `im_group` VALUES ('13', 'qcws20181101111500NUghYh', '2018-11-01 11:15:01', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');
INSERT INTO `im_group` VALUES ('14', 'qcws20181101142728fPrgvq', '2018-11-01 14:27:30', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');
INSERT INTO `im_group` VALUES ('15', 'qcws20181101142817qyzzcG', '2018-11-01 14:28:18', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');
INSERT INTO `im_group` VALUES ('16', 'qcws20181101143233738m7b', '2018-11-01 14:32:35', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');
INSERT INTO `im_group` VALUES ('17', 'qcws20181101150408LG9wcR', '2018-11-01 15:04:10', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');
INSERT INTO `im_group` VALUES ('18', 'qcws20181101150739Zdt4Yr', '2018-11-01 15:07:41', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');
INSERT INTO `im_group` VALUES ('19', 'qcws20181101150929eRUg2x', '2018-11-01 15:09:31', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');
INSERT INTO `im_group` VALUES ('20', 'qcws20181101151409wmSylu', '2018-11-01 15:14:10', '0000-00-00 00:00:00', '1_11', '1', '1', '\0', '0', '0');

-- ----------------------------
-- Table structure for im_group_message
-- ----------------------------
DROP TABLE IF EXISTS `im_group_message`;
CREATE TABLE `im_group_message` (
  `id` bigint(20) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `content` varchar(2000) NOT NULL,
  `from_account_id` int(11) NOT NULL,
  `from_account` varchar(50) NOT NULL,
  `group_id` int(11) NOT NULL,
  `type` smallint(6) NOT NULL DEFAULT '0' COMMENT '消息类型：（ 0：文本消息、1：图片消息、2：语音消息 )',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_group_message
-- ----------------------------

-- ----------------------------
-- Table structure for im_group_question
-- ----------------------------
DROP TABLE IF EXISTS `im_group_question`;
CREATE TABLE `im_group_question` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `question` varchar(255) NOT NULL,
  `expect_answer` varchar(255) NOT NULL DEFAULT '',
  `group_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='进群身份认证问题';

-- ----------------------------
-- Records of im_group_question
-- ----------------------------
INSERT INTO `im_group_question` VALUES ('1', '1536025352348', '1536025352348', '你会JAVA嘛？', '略懂', '1');

-- ----------------------------
-- Table structure for im_group_user
-- ----------------------------
DROP TABLE IF EXISTS `im_group_user`;
CREATE TABLE `im_group_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `user_account_id` int(11) NOT NULL,
  `user_account` varchar(50) NOT NULL,
  `group_id` int(11) NOT NULL,
  `conversation_del_time` bigint(20) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_group_user
-- ----------------------------
INSERT INTO `im_group_user` VALUES ('1', '1536915784446', '1536915784446', '3', '13560479779', '1', '1536915784446');
INSERT INTO `im_group_user` VALUES ('2', '1536974795450', '1536974795450', '2', '15102063449', '2', '1536974795450');
INSERT INTO `im_group_user` VALUES ('3', '1536974887112', '1536974887112', '2', '15102063449', '3', '1536974887112');
INSERT INTO `im_group_user` VALUES ('4', '1536975053047', '1536975053047', '3', '13560479779', '2', '1536975053047');
INSERT INTO `im_group_user` VALUES ('5', '1536976680643', '1536976680643', '4', '17666545285', '2', '1536976680643');
INSERT INTO `im_group_user` VALUES ('6', '1536915784446', '1536915784446', '2', '15102063449', '1', '1536915784446');
INSERT INTO `im_group_user` VALUES ('7', '1536992608549', '1536992608549', '4', '17666545285', '1', '1536992608549');
INSERT INTO `im_group_user` VALUES ('8', '1539328444857', '1539328444857', '4', '15876509207', '5', '1539328444857');

-- ----------------------------
-- Table structure for im_group_user_apply
-- ----------------------------
DROP TABLE IF EXISTS `im_group_user_apply`;
CREATE TABLE `im_group_user_apply` (
  `id` int(11) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `group_id` int(11) NOT NULL,
  `user_account` varchar(50) NOT NULL,
  `user_account_id` int(11) NOT NULL,
  `auth_type` smallint(6) NOT NULL DEFAULT '0' COMMENT '身份验证方式：（0：群主确认 1：回答问题 2：回答问题+群主确认 3: 直接加群 )',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态：（0：等待处理 1：成功 2：拒绝 3：已被忽略）',
  `remark` varchar(100) DEFAULT '' COMMENT '发起申请时的描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_group_user_apply
-- ----------------------------
INSERT INTO `im_group_user_apply` VALUES ('6', '1536910024830', '1536910024830', '1', '13560479779', '3', '1', '1', '');

-- ----------------------------
-- Table structure for im_group_user_apply_answer
-- ----------------------------
DROP TABLE IF EXISTS `im_group_user_apply_answer`;
CREATE TABLE `im_group_user_apply_answer` (
  `id` int(11) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `apply_id` int(11) NOT NULL,
  `question` varchar(255) NOT NULL,
  `answer` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_group_user_apply_answer
-- ----------------------------
INSERT INTO `im_group_user_apply_answer` VALUES ('1', '1536915641507', '1536915641507', '6', '你会JAVA嘛？', '会');
INSERT INTO `im_group_user_apply_answer` VALUES ('2', '1536915784369', '1536915784369', '6', '你会JAVA嘛？', '略懂');

-- ----------------------------
-- Table structure for im_push_message
-- ----------------------------
DROP TABLE IF EXISTS `im_push_message`;
CREATE TABLE `im_push_message` (
  `id` int(11) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `content` varchar(2000) NOT NULL DEFAULT '',
  `push_num` int(11) NOT NULL DEFAULT '0',
  `received_num` int(11) NOT NULL DEFAULT '0' COMMENT '已接收人数',
  `effect_date` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_push_message
-- ----------------------------

-- ----------------------------
-- Table structure for im_push_tag
-- ----------------------------
DROP TABLE IF EXISTS `im_push_tag`;
CREATE TABLE `im_push_tag` (
  `id` int(11) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `push_msg_id` int(11) NOT NULL,
  `tag` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_push_tag
-- ----------------------------

-- ----------------------------
-- Table structure for im_user_account
-- ----------------------------
DROP TABLE IF EXISTS `im_user_account`;
CREATE TABLE `im_user_account` (
  `id` int(11) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `account` varchar(50) NOT NULL,
  `nick_name` varchar(50) NOT NULL,
  `head_url` varchar(255) NOT NULL,
  `type` smallint(6) NOT NULL DEFAULT '0' COMMENT '账号类型：（0：普通账号，1：机器人）',
  `is_locked` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_user_account
-- ----------------------------
INSERT INTO `im_user_account` VALUES ('2', '1536025352348', '1536025352348', '15102063449', 'kael', 'http://www.abc.com', '0', '\0');
INSERT INTO `im_user_account` VALUES ('3', '1536309652466', '1536310217561', '13560479779', 'zijian', 'http://www.abc.com', '0', '\0');
INSERT INTO `im_user_account` VALUES ('4', '1536976640417', '1536976640417', '15876509207', 'wanghai', 'http://www.abc.com', '0', '\0');

-- ----------------------------
-- Table structure for im_user_account_tag
-- ----------------------------
DROP TABLE IF EXISTS `im_user_account_tag`;
CREATE TABLE `im_user_account_tag` (
  `id` bigint(20) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `user_id` int(11) NOT NULL,
  `tag` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_user_account_tag
-- ----------------------------

-- ----------------------------
-- Table structure for im_user_message
-- ----------------------------
DROP TABLE IF EXISTS `im_user_message`;
CREATE TABLE `im_user_message` (
  `id` bigint(20) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `from_account_id` int(11) NOT NULL,
  `to_account_id` int(11) NOT NULL,
  `from_account` varchar(50) NOT NULL,
  `to_account` varchar(50) NOT NULL,
  `type` smallint(6) NOT NULL DEFAULT '0' COMMENT '消息类型：（ 0：文本消息、1：图片消息、2：语音消息 )',
  `content` varchar(2000) NOT NULL,
  `is_to_conversation_del` bit(1) NOT NULL,
  `is_from_conversation_del` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_user_message
-- ----------------------------
INSERT INTO `im_user_message` VALUES ('12', '1538121519815', '1538121519815', '2', '3', '15102063449', '13560479779', '0', '消息队列测试', '\0', '\0');
INSERT INTO `im_user_message` VALUES ('13', '1538121815594', '1538121815594', '2', '3', '15102063449', '13560479779', '0', '消息队列测试', '\0', '\0');

-- ----------------------------
-- Table structure for im_user_setting
-- ----------------------------
DROP TABLE IF EXISTS `im_user_setting`;
CREATE TABLE `im_user_setting` (
  `id` int(11) NOT NULL,
  `create_date` bigint(20) NOT NULL,
  `modify_date` bigint(20) NOT NULL,
  `account` varchar(50) NOT NULL,
  `account_id` int(11) NOT NULL,
  `need_valid` bit(1) NOT NULL COMMENT '添加我为好友时是否需要验证',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of im_user_setting
-- ----------------------------
INSERT INTO `im_user_setting` VALUES ('4', '1538114981361', '1538114981361', '13560479779', '3', '');

-- ----------------------------
-- Table structure for m_member_code
-- ----------------------------
DROP TABLE IF EXISTS `m_member_code`;
CREATE TABLE `m_member_code` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `mobile` varchar(16) DEFAULT NULL,
  `validate_code` varchar(32) DEFAULT NULL,
  `create_data` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='验证码';

-- ----------------------------
-- Records of m_member_code
-- ----------------------------

-- ----------------------------
-- Table structure for m_user
-- ----------------------------
DROP TABLE IF EXISTS `m_user`;
CREATE TABLE `m_user` (
  `id` bigint(20) NOT NULL COMMENT '标识',
  `mobile` varchar(16) DEFAULT NULL COMMENT '手机号码',
  `account` varchar(32) DEFAULT NULL COMMENT '名称',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `invited_name` varchar(32) DEFAULT NULL COMMENT '用户名',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `user_source` tinyint(4) DEFAULT NULL COMMENT '注册来源：\r\n            1,本地注册（Android，ios）\r\n            2.第三方（qq，微信等）\r\n            3.推荐\r\n            4.其他',
  `user_type` tinyint(4) DEFAULT NULL COMMENT '用户类型\r\n            1.老师\r\n            2.学生',
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='基本会员表';

-- ----------------------------
-- Records of m_user
-- ----------------------------

-- ----------------------------
-- Table structure for m_user_auth
-- ----------------------------
DROP TABLE IF EXISTS `m_user_auth`;
CREATE TABLE `m_user_auth` (
  `auth_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `login_token` varchar(64) DEFAULT NULL,
  `devices_type` varchar(16) DEFAULT NULL,
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `signle_day` int(11) DEFAULT NULL COMMENT '免登陆有效天数',
  `devices_id` varchar(64) DEFAULT NULL,
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`auth_id`),
  KEY `index_member_auth_user_id` (`auth_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='授权';

-- ----------------------------
-- Records of m_user_auth
-- ----------------------------

-- ----------------------------
-- Table structure for m_user_ext
-- ----------------------------
DROP TABLE IF EXISTS `m_user_ext`;
CREATE TABLE `m_user_ext` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户ID',
  `create_people` varchar(30) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `user_source` tinyint(4) DEFAULT NULL COMMENT '注册来源：\r\n            1,本地注册（Android，ios）\r\n            2.第三方（qq，微信等）\r\n            3.推荐\r\n            4.其他',
  `used_system` varchar(30) DEFAULT NULL COMMENT '提供给某个系统使用，多个系统用逗号隔开。\r\n            1.直播系统\r\n            等',
  `real_name` varchar(16) DEFAULT NULL,
  `nick_name` varchar(32) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL COMMENT '1：男；2：女',
  `age` int(11) DEFAULT NULL,
  `birthday` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `address` varchar(128) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `status` char(3) DEFAULT NULL,
  `last_login_ip` varchar(32) DEFAULT NULL,
  `last_login_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `device_type` varchar(8) DEFAULT NULL COMMENT '1.android\r\n            2.ios',
  `devices_id` varchar(64) DEFAULT NULL,
  `is_push` char(1) DEFAULT NULL COMMENT '1：是；\r\n            2：否；',
  `id_card` varchar(32) DEFAULT NULL,
  `id_card_eff_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `recommend_id` varchar(32) DEFAULT NULL,
  `recommend_name` varchar(32) DEFAULT NULL,
  `recommend_type` varchar(16) DEFAULT NULL,
  `member_code` varchar(32) DEFAULT NULL,
  `member_code_flag` int(11) DEFAULT NULL,
  `registry_id` varchar(30) DEFAULT NULL,
  `qccode` varchar(32) DEFAULT NULL,
  `m_location` int(11) DEFAULT NULL,
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  `user_type` char(1) DEFAULT NULL COMMENT '1:家长\r\n            2:主播',
  `signature` varchar(255) DEFAULT NULL,
  `country` tinyint(4) DEFAULT NULL,
  `province` tinyint(4) DEFAULT NULL,
  `city` tinyint(4) DEFAULT NULL,
  `area` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户扩展表';

-- ----------------------------
-- Records of m_user_ext
-- ----------------------------

-- ----------------------------
-- Table structure for m_user_hoster
-- ----------------------------
DROP TABLE IF EXISTS `m_user_hoster`;
CREATE TABLE `m_user_hoster` (
  `hoster_id` bigint(20) NOT NULL COMMENT '标识',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`hoster_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='主播人信息 (用户扩展表)';

-- ----------------------------
-- Records of m_user_hoster
-- ----------------------------

-- ----------------------------
-- Table structure for m_user_role
-- ----------------------------
DROP TABLE IF EXISTS `m_user_role`;
CREATE TABLE `m_user_role` (
  `id` bigint(20) NOT NULL,
  `role_name` varchar(30) DEFAULT NULL,
  `role_code` varchar(20) DEFAULT NULL,
  `create_people` varchar(30) DEFAULT NULL,
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of m_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for m_user_role_manager
-- ----------------------------
DROP TABLE IF EXISTS `m_user_role_manager`;
CREATE TABLE `m_user_role_manager` (
  `m_id` bigint(20) NOT NULL COMMENT '标识',
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色管理\r\n一个用户可以拥有多个角色';

-- ----------------------------
-- Records of m_user_role_manager
-- ----------------------------

-- ----------------------------
-- Table structure for p_collect
-- ----------------------------
DROP TABLE IF EXISTS `p_collect`;
CREATE TABLE `p_collect` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) DEFAULT NULL COMMENT '关注人',
  `video_code` varchar(255) DEFAULT NULL COMMENT '被关注视频编码',
  `create_by` bigint(11) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-否 1-是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of p_collect
-- ----------------------------
INSERT INTO `p_collect` VALUES ('1', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:19:17', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('2', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:26:49', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('3', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:26:51', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('4', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:26:52', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('5', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:35:40', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('6', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:35:46', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('7', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:35:48', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('8', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:59:58', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('9', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 10:00:04', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('10', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 10:55:33', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('11', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 10:55:54', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('12', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 16:35:16', '0000-00-00 00:00:00', '0');
INSERT INTO `p_collect` VALUES ('13', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 16:35:39', '0000-00-00 00:00:00', '0');

-- ----------------------------
-- Table structure for p_follow
-- ----------------------------
DROP TABLE IF EXISTS `p_follow`;
CREATE TABLE `p_follow` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) DEFAULT NULL COMMENT '关注人',
  `video_code` varchar(255) DEFAULT NULL COMMENT '被关注视频编码',
  `create_by` bigint(11) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-否 1-是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='关注信息表';

-- ----------------------------
-- Records of p_follow
-- ----------------------------
INSERT INTO `p_follow` VALUES ('1', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-01 17:58:25', '0000-00-00 00:00:00', '0');
INSERT INTO `p_follow` VALUES ('2', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-01 18:11:56', '0000-00-00 00:00:00', '0');
INSERT INTO `p_follow` VALUES ('3', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-01 18:12:24', '0000-00-00 00:00:00', '0');
INSERT INTO `p_follow` VALUES ('4', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-01 18:13:09', '0000-00-00 00:00:00', '0');
INSERT INTO `p_follow` VALUES ('5', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-01 18:19:59', '0000-00-00 00:00:00', '0');
INSERT INTO `p_follow` VALUES ('6', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-01 18:21:40', '0000-00-00 00:00:00', '0');
INSERT INTO `p_follow` VALUES ('7', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-01 18:22:53', '0000-00-00 00:00:00', '0');
INSERT INTO `p_follow` VALUES ('8', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-01 18:28:03', '0000-00-00 00:00:00', '0');
INSERT INTO `p_follow` VALUES ('9', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 16:33:25', '0000-00-00 00:00:00', '0');

-- ----------------------------
-- Table structure for p_gift
-- ----------------------------
DROP TABLE IF EXISTS `p_gift`;
CREATE TABLE `p_gift` (
  `id` bigint(11) NOT NULL,
  `user_id` bigint(11) DEFAULT NULL,
  `video_code` varchar(255) DEFAULT NULL,
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='关注视频';

-- ----------------------------
-- Records of p_gift
-- ----------------------------

-- ----------------------------
-- Table structure for p_goods_pic
-- ----------------------------
DROP TABLE IF EXISTS `p_goods_pic`;
CREATE TABLE `p_goods_pic` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `good_id` bigint(11) unsigned NOT NULL DEFAULT '0' COMMENT '商品ID',
  `sku_number` varchar(50) NOT NULL COMMENT 'Sku编码（商品编号）',
  `image_json_array` longtext NOT NULL COMMENT '图片URL json数组（非全路径）',
  PRIMARY KEY (`id`),
  UNIQUE KEY `goods_id` (`good_id`,`sku_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频图片管理表';

-- ----------------------------
-- Records of p_goods_pic
-- ----------------------------

-- ----------------------------
-- Table structure for p_goods_tag
-- ----------------------------
DROP TABLE IF EXISTS `p_goods_tag`;
CREATE TABLE `p_goods_tag` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(255) NOT NULL COMMENT '标签名',
  `is_delete` tinyint(3) unsigned NOT NULL DEFAULT '0' COMMENT '是否删除 0为否；1为是',
  `add_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '添加时间',
  `update_time` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `is_delete` (`is_delete`),
  KEY `tag_name` (`tag_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频标签管理表';

-- ----------------------------
-- Records of p_goods_tag
-- ----------------------------

-- ----------------------------
-- Table structure for p_like
-- ----------------------------
DROP TABLE IF EXISTS `p_like`;
CREATE TABLE `p_like` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) DEFAULT NULL COMMENT '关注人',
  `video_code` varchar(255) DEFAULT NULL COMMENT '被关注视频编码',
  `create_by` bigint(11) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-否 1-是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='视频点赞表';

-- ----------------------------
-- Records of p_like
-- ----------------------------
INSERT INTO `p_like` VALUES ('1', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:19:17', '0000-00-00 00:00:00', '0');
INSERT INTO `p_like` VALUES ('2', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:26:49', '0000-00-00 00:00:00', '0');
INSERT INTO `p_like` VALUES ('3', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:26:51', '0000-00-00 00:00:00', '0');
INSERT INTO `p_like` VALUES ('4', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 09:26:52', '0000-00-00 00:00:00', '0');
INSERT INTO `p_like` VALUES ('5', '1', 'qcws20181031174437IfWZUg', '1', '2018-11-02 16:33:38', '0000-00-00 00:00:00', '0');

-- ----------------------------
-- Table structure for p_live_gift_info
-- ----------------------------
DROP TABLE IF EXISTS `p_live_gift_info`;
CREATE TABLE `p_live_gift_info` (
  `id` bigint(11) NOT NULL,
  `gift_id` int(11) DEFAULT NULL,
  `video_code` varchar(255) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `host` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='直播在直播时候 收的礼物';

-- ----------------------------
-- Records of p_live_gift_info
-- ----------------------------

-- ----------------------------
-- Table structure for p_live_info
-- ----------------------------
DROP TABLE IF EXISTS `p_live_info`;
CREATE TABLE `p_live_info` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `main_pic_url` varchar(255) DEFAULT NULL COMMENT '封面图片',
  `course` varchar(255) DEFAULT NULL COMMENT '课程名称',
  `subject` varchar(255) DEFAULT NULL COMMENT '科目名称',
  `class_name` varchar(255) DEFAULT NULL COMMENT '班级名称',
  `course_data_url` varchar(255) DEFAULT NULL COMMENT '课程资料',
  `begin_live_time` timestamp NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '开播时间',
  `end_live_time` timestamp NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '结束时间',
  `status` tinyint(4) NOT NULL COMMENT '状态（0-新建（草稿）1-直播中   2-直播回放 3-直播完成 4-未开播（超过开始播放时间10分钟未开播））',
  `room_code` varchar(32) DEFAULT NULL COMMENT '直播房间号（便于统计，可重复）--每个用户唯一',
  `create_user_id` int(11) NOT NULL DEFAULT '-1' COMMENT '创建商品人的ID -1为管理员添加商品',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建商品日期',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '管理员更新时间',
  `last_update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新日期',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '删除标识，0，正常， 1为删除',
  PRIMARY KEY (`id`),
  KEY `is_delete` (`is_delete`),
  KEY `create_user_id` (`create_user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COMMENT='开播信息管理表';

-- ----------------------------
-- Records of p_live_info
-- ----------------------------
INSERT INTO `p_live_info` VALUES ('6', '11', '11', '22', '11', '11', '2018-10-31 16:40:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 16:42:24', '2018-10-31 16:42:24', '2018-10-31 16:42:24', '2018-10-31 16:42:24', '0');
INSERT INTO `p_live_info` VALUES ('7', '11', '11', '22', '11', '11', '2018-11-02 17:09:51', '2018-11-02 17:09:51', '1', 'qcws1', '1', '2018-10-31 17:12:25', '2018-10-31 17:12:25', '2018-11-02 17:09:51', '2018-11-02 17:09:51', '1');
INSERT INTO `p_live_info` VALUES ('8', '11', '11', '22', '11', '11', '2018-10-31 17:20:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:12:29', '2018-10-31 17:12:29', '2018-10-31 17:12:29', '2018-10-31 17:12:29', '0');
INSERT INTO `p_live_info` VALUES ('9', '11', '11', '22', '11', '11', '2018-10-31 17:20:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:12:30', '2018-10-31 17:12:30', '2018-10-31 17:12:30', '2018-10-31 17:12:30', '0');
INSERT INTO `p_live_info` VALUES ('10', '11', '11', '22', '11', '11', '2018-10-31 17:20:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:12:30', '2018-10-31 17:12:30', '2018-10-31 17:12:30', '2018-10-31 17:12:30', '0');
INSERT INTO `p_live_info` VALUES ('11', '11', '11', '22', '11', '11', '2018-10-31 17:20:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:12:31', '2018-10-31 17:12:31', '2018-10-31 17:12:31', '2018-10-31 17:12:31', '0');
INSERT INTO `p_live_info` VALUES ('12', '11', '11', '22', '11', '11', '2018-10-31 17:20:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:12:32', '2018-10-31 17:12:32', '2018-10-31 17:12:32', '2018-10-31 17:12:32', '0');
INSERT INTO `p_live_info` VALUES ('13', '11', '11', '22', '11', '11', '2018-11-02 17:08:14', '2018-11-02 17:08:14', '1', 'qcws1', '1', '2018-10-31 17:44:39', '2018-10-31 17:44:39', '2018-11-02 17:08:14', '2018-11-02 17:08:14', '0');
INSERT INTO `p_live_info` VALUES ('14', '11', '11', '22', '11', '11', '2018-10-31 17:50:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:44:46', '2018-10-31 17:44:46', '2018-10-31 17:44:46', '2018-10-31 17:44:46', '0');
INSERT INTO `p_live_info` VALUES ('15', '11', '11', '22', '11', '11', '2018-10-31 17:50:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:44:48', '2018-10-31 17:44:48', '2018-10-31 17:44:48', '2018-10-31 17:44:48', '0');
INSERT INTO `p_live_info` VALUES ('16', '11', '11', '22', '11', '11', '2018-10-31 17:50:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:49:24', '2018-10-31 17:49:24', '2018-10-31 17:49:24', '2018-10-31 17:49:24', '0');
INSERT INTO `p_live_info` VALUES ('17', '11', '11', '22', '11', '11', '2018-10-31 17:50:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:49:31', '2018-10-31 17:49:31', '2018-10-31 17:49:31', '2018-10-31 17:49:31', '0');
INSERT INTO `p_live_info` VALUES ('18', '11', '11', '22', '11', '11', '2018-10-31 17:50:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 17:49:32', '2018-10-31 17:49:32', '2018-10-31 17:49:32', '2018-10-31 17:49:32', '0');
INSERT INTO `p_live_info` VALUES ('19', '11', '11', '22', '11', '11', '2018-10-31 17:50:52', '2018-11-01 00:00:00', '1', 'qcws1', '1', '2018-10-31 18:00:07', '2018-10-31 18:00:07', '2018-10-31 18:00:07', '2018-10-31 18:00:07', '0');
INSERT INTO `p_live_info` VALUES ('20', '11', '11', '22', '11', '11', '2018-11-01 11:23:52', '2018-11-01 18:00:00', '1', 'qcws1', '1', '2018-11-01 11:15:01', '2018-11-01 11:15:01', '2018-11-01 11:15:01', '2018-11-01 11:15:01', '0');

-- ----------------------------
-- Table structure for p_logs
-- ----------------------------
DROP TABLE IF EXISTS `p_logs`;
CREATE TABLE `p_logs` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `logs_level` tinyint(5) DEFAULT NULL COMMENT '日志级别',
  `system_source` tinyint(20) DEFAULT NULL COMMENT '系统来源\r\n            警告1，一般2，严重3',
  `biz_process` longtext COMMENT '处理业务',
  `elapsed_time` varchar(255) DEFAULT NULL COMMENT '耗时',
  `message_res` longtext COMMENT '处理结果',
  `request` longtext COMMENT '请求',
  `response` longtext COMMENT '响应',
  `operator_id` varchar(255) DEFAULT NULL COMMENT '操作对象',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='日志记录\r\n日志记录字段：\r\n创建日期，日志级别（警告1，一般2，严重3...），日志来源（系统），';

-- ----------------------------
-- Records of p_logs
-- ----------------------------

-- ----------------------------
-- Table structure for p_share_record
-- ----------------------------
DROP TABLE IF EXISTS `p_share_record`;
CREATE TABLE `p_share_record` (
  `id` bigint(11) NOT NULL,
  `share_user` int(11) DEFAULT NULL,
  `title` varchar(32) DEFAULT NULL,
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT COMMENT='分享记录 \r\n只记录分享数据';

-- ----------------------------
-- Records of p_share_record
-- ----------------------------

-- ----------------------------
-- Table structure for p_transmit
-- ----------------------------
DROP TABLE IF EXISTS `p_transmit`;
CREATE TABLE `p_transmit` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_id` bigint(11) DEFAULT NULL COMMENT '转发人',
  `transmit_code` varchar(255) DEFAULT NULL COMMENT '被转发编码|（当transmit_type=0时为开播信息id,当transmit_type=1时为视频编码）',
  `transmit_type` tinyint(4) DEFAULT NULL COMMENT '转发类型（0-转发开播信息，1-转发视频）',
  `destination` int(4) DEFAULT NULL COMMENT '转发到（1-微信，2-微博，3-QQ空间，4-QQ）',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `is_delete` tinyint(4) NOT NULL DEFAULT '0' COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='转发信息表';

-- ----------------------------
-- Records of p_transmit
-- ----------------------------
INSERT INTO `p_transmit` VALUES ('1', '1', '1', '0', '1', '2018-11-01 12:56:47', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('2', '1', '4', '0', '1', '2018-11-01 12:56:56', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('3', '1', '1', '0', '1', '2018-11-01 13:46:46', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('4', '1', '1', '0', '1', '2018-11-01 13:48:34', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('5', '1', '1', '0', '1', '2018-11-01 13:52:51', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('6', '1', '1', '0', '1', '2018-11-01 13:55:52', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('7', '1', 'qcws20181031174437IfWZUg', '1', '1', '2018-11-01 17:39:02', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('8', '1', 'qcws20181031174437IfWZUg', '1', '1', '2018-11-01 18:04:47', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('9', '1', 'qcws20181031174437IfWZUg', '1', '1', '2018-11-01 18:11:46', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('10', '1', '1', '0', '1', '2018-11-02 16:31:47', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('11', '1', '1', '0', '1', '2018-11-02 16:32:33', '0000-00-00 00:00:00', '0');
INSERT INTO `p_transmit` VALUES ('12', '1', 'qcws20181031174437IfWZUg', '1', '1', '2018-11-02 16:33:13', '0000-00-00 00:00:00', '0');

-- ----------------------------
-- Table structure for p_video_1
-- ----------------------------
DROP TABLE IF EXISTS `p_video_1`;
CREATE TABLE `p_video_1` (
  `id` bigint(11) NOT NULL DEFAULT '0',
  `video_code` varchar(255) DEFAULT NULL COMMENT '商品编码',
  `submit_from` tinyint(4) unsigned NOT NULL DEFAULT '1' COMMENT '提交商品来源（1代理商 2商户3大后台）',
  `platform_source` tinyint(4) NOT NULL DEFAULT '1' COMMENT '商品信息来源平台：1，五福商城、2，大健康、3，顺道ERP，默认：1',
  `sub_title` varchar(255) NOT NULL DEFAULT '' COMMENT '短名称，用于短信，邮件等需要节约字符数的地方显示名称用',
  `name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `supplier_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '所属的商户ID',
  `agent_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '代理商创建的代理商ID',
  `type_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '分类ID',
  `ads_message` varchar(255) DEFAULT NULL COMMENT '商品广告语',
  `img` varchar(255) DEFAULT NULL COMMENT '主图（列表图）',
  `is_onlive` tinyint(4) unsigned NOT NULL DEFAULT '2' COMMENT '是否上架 0为已下架 1为已上架 2为未上架',
  `shelves_type` tinyint(4) NOT NULL DEFAULT '1' COMMENT '上架类型：1，立即上架，2，定时上架',
  `shelves_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '视频上架时间：\r\n            ',
  `unshelves_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '视频下架时间：\r\n            ',
  `origin_price` decimal(20,4) unsigned NOT NULL DEFAULT '0.0000' COMMENT '原价',
  `current_price` decimal(20,4) unsigned NOT NULL DEFAULT '0.0000' COMMENT '当前销售价',
  `balance_price` decimal(10,2) unsigned NOT NULL DEFAULT '0.00' COMMENT '与商家的结算价（即商价提供给平台商的成本价）',
  `is_best` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '商城商品的推荐（精品）标识',
  `is_new` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '商城商品的新品标识，0，不是，1是',
  `is_own` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '是否自营 0为否；1为是',
  `seo_keywords` varchar(255) DEFAULT NULL COMMENT 'seo关键词',
  `description` longtext COMMENT '商品详情信息',
  `publish_wait` tinyint(4) unsigned NOT NULL DEFAULT '3' COMMENT '商家提交的产品 0:等待审核 1:审核通过 2:审核不通过 3草稿发状态(没提交到审核)',
  `create_user_id` int(11) NOT NULL DEFAULT '-1' COMMENT '创建商品人的ID -1为管理员添加商品',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建商品日期',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '管理员更新时间',
  `last_update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新日期',
  `reviewer_id` int(10) unsigned DEFAULT NULL COMMENT '审核管理员ID（最后一个更新审核通过状态的管理员ID）',
  `last_reviewer_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最后通过审核的时间',
  `audit_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '审核通过时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '删除标识，0，正常， 1为删除',
  `is_hot` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '商城商品的热卖标识',
  `reviewer_meseage` varchar(255) DEFAULT '' COMMENT '审核结果描述',
  `room_code` varchar(32) DEFAULT NULL COMMENT '房间号',
  `sub_info` varchar(255) DEFAULT NULL,
  `end_live_time` timestamp NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '结束时间',
  `begin_live_time` timestamp NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP COMMENT '开播时间',
  `course_data_url` varchar(255) DEFAULT NULL COMMENT '课程资料',
  `class_name` varchar(255) DEFAULT NULL COMMENT '班级名称',
  `subject` varchar(255) DEFAULT NULL COMMENT '科目名称',
  `course` varchar(255) DEFAULT NULL COMMENT '课程名称',
  `main_pic_url` varchar(255) DEFAULT NULL COMMENT '封面图片',
  `status` tinyint(4) NOT NULL COMMENT '状态（0-新建（草稿）1-直播中   2-直播回放 3-直播完成 4-未开播（超过开始播放时间10分钟未开播））'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of p_video_1
-- ----------------------------
INSERT INTO `p_video_1` VALUES ('1', 'qcws20181030164256Jkfngm', '1', '1', '', null, '0', '0', '0', null, null, '2', '1', '2018-10-31 10:03:38', '0000-00-00 00:00:00', '0.0000', '0.0000', '0.00', '0', '0', '0', null, null, '3', '-1', '2018-10-26 09:34:09', '2018-10-26 09:34:09', '2018-10-31 10:03:38', '2018-10-31 10:03:38', null, '2018-10-26 09:34:09', '0000-00-00 00:00:00', '1', '0', '', 'qcws1', null, '2018-11-01 00:00:00', '2018-11-01 00:00:00', '11', '11', '22', '11', '11', '0');
INSERT INTO `p_video_1` VALUES ('2', 'qcws1540519680135', '1', '1', '', null, '0', '0', '0', null, null, '2', '1', '2018-10-26 10:08:00', '0000-00-00 00:00:00', '0.0000', '0.0000', '0.00', '0', '0', '0', null, null, '3', '-1', '2018-10-26 10:08:00', '2018-10-26 10:08:00', '2018-10-26 10:08:00', '2018-10-26 10:08:00', null, '2018-10-26 10:08:00', '0000-00-00 00:00:00', '0', '0', '', null, null, '2018-01-01 00:00:00', '2018-01-01 00:00:00', '11', '11', '11', '11', '11', '0');
INSERT INTO `p_video_1` VALUES ('3', null, '1', '1', '', null, '0', '0', '0', null, null, '2', '1', '2018-10-29 11:47:31', '0000-00-00 00:00:00', '0.0000', '0.0000', '0.00', '0', '0', '0', null, null, '3', '1', '2018-10-26 11:08:22', '2018-10-26 11:08:22', '2018-10-29 11:47:31', '2018-10-29 11:47:31', null, '2018-10-26 11:08:22', '0000-00-00 00:00:00', '0', '0', '', null, null, '2018-10-29 11:47:31', '2018-10-29 11:47:31', '11', '11', '11', '11', '11', '0');
INSERT INTO `p_video_1` VALUES ('4', null, '1', '1', '', null, '0', '0', '0', null, null, '2', '1', '2018-10-29 11:47:33', '0000-00-00 00:00:00', '0.0000', '0.0000', '0.00', '0', '0', '0', null, null, '3', '1', '2018-10-26 17:08:12', '2018-10-26 17:08:12', '2018-10-29 11:47:33', '2018-10-29 11:47:33', null, '2018-10-26 17:08:12', '0000-00-00 00:00:00', '0', '0', '', null, null, '2018-10-29 11:47:33', '2018-10-29 11:47:33', '11', '11', '33', '11', '11', '0');
INSERT INTO `p_video_1` VALUES ('5', 'qcws20181026171650z5SQ1e', '1', '1', '', null, '0', '0', '0', null, null, '2', '1', '2018-10-26 17:16:50', '0000-00-00 00:00:00', '0.0000', '0.0000', '0.00', '0', '0', '0', null, null, '3', '1', '2018-10-26 17:16:50', '2018-10-26 17:16:50', '2018-10-26 17:16:50', '2018-10-26 17:16:50', null, '2018-10-26 17:16:50', '0000-00-00 00:00:00', '0', '0', '', 'qcws1', null, '0000-00-00 00:00:00', '0000-00-00 00:00:00', '11', '11', '33', '11', '11', '1');

-- ----------------------------
-- Table structure for p_video_details
-- ----------------------------
DROP TABLE IF EXISTS `p_video_details`;
CREATE TABLE `p_video_details` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `video_code` varchar(255) DEFAULT NULL COMMENT '视频编码--唯一',
  `live_info_id` bigint(10) DEFAULT NULL COMMENT '所属开播信息id(可重复--续播)',
  `push_live_url` varchar(255) DEFAULT NULL COMMENT '推流url',
  `play_live_url` varchar(255) DEFAULT NULL COMMENT '直播播放地址',
  `play_record_url` varchar(255) DEFAULT NULL COMMENT '录播播放地址',
  `room_code` varchar(255) DEFAULT NULL COMMENT '直播房间号（便于统计，可重复）--每个用户唯一',
  `real_begin_livetime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '实际直播开始时间',
  `real_end_livetime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '实际直播结束时间',
  `is_end_live` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已结束直播（0-否，1-是）默认0',
  `create_user_id` int(11) NOT NULL DEFAULT '-1' COMMENT '创建商品人的ID -1为管理员添加商品',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '管理员更新时间',
  `is_delete` tinyint(4) unsigned NOT NULL DEFAULT '0' COMMENT '删除标识，0，正常， 1为删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `goods_id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8 COMMENT='视频详情信息表';

-- ----------------------------
-- Records of p_video_details
-- ----------------------------
INSERT INTO `p_video_details` VALUES ('40', 'qcws20181031171225oznvY7', '7', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=70a3c6ecbe39e9b574f8307f14edbf6a&txTime=5BD9B849', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:12:26', null, '0', '1', '2018-10-31 17:12:25', '2018-10-31 17:12:25', '0');
INSERT INTO `p_video_details` VALUES ('41', 'qcws20181031171229NcBHNZ', '8', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=45f7b7a9d1041faa846cbd7d019133d6&txTime=5BD9B84D', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:12:30', null, '0', '1', '2018-10-31 17:12:29', '2018-10-31 17:12:29', '0');
INSERT INTO `p_video_details` VALUES ('42', 'qcws20181031171230APpunA', '9', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=dc211bc7ef7b47372958a11d5ab5b2fd&txTime=5BD9B84E', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:12:31', null, '0', '1', '2018-10-31 17:12:30', '2018-10-31 17:12:30', '0');
INSERT INTO `p_video_details` VALUES ('43', 'qcws201810311712309RS7H2', '10', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=dc211bc7ef7b47372958a11d5ab5b2fd&txTime=5BD9B84E', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:12:31', null, '0', '1', '2018-10-31 17:12:30', '2018-10-31 17:12:30', '0');
INSERT INTO `p_video_details` VALUES ('44', 'qcws201810311712315bI7fd', '11', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=97f5d3130597074b9069f6a6fc9674bc&txTime=5BD9B84F', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:12:31', null, '0', '1', '2018-10-31 17:12:31', '2018-10-31 17:12:31', '0');
INSERT INTO `p_video_details` VALUES ('45', 'qcws20181031171231FrGrgk', '12', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=4f123d6438569bd83fcb8620ed2dd9ac&txTime=5BD9B850', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:12:32', null, '0', '1', '2018-10-31 17:12:32', '2018-10-31 17:12:32', '0');
INSERT INTO `p_video_details` VALUES ('46', 'qcws20181031174437IfWZUg', '13', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=00bfcc992007ccd2b5143aa9c7328f83&txTime=5BD9BFD7', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:44:39', null, '0', '1', '2018-10-31 17:44:39', '2018-10-31 17:44:39', '0');
INSERT INTO `p_video_details` VALUES ('47', 'qcws20181031174446Cpyhli', '14', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=cd5a2d5c36a69d46b39ea75e4d01ff22&txTime=5BD9BFDE', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:44:47', null, '0', '1', '2018-10-31 17:44:46', '2018-10-31 17:44:46', '0');
INSERT INTO `p_video_details` VALUES ('48', 'qcws20181031174447DFk2U3', '15', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=26aaa08f9daa2d033485cb9e2f84154b&txTime=5BD9BFE0', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:44:48', null, '0', '1', '2018-10-31 17:44:48', '2018-10-31 17:44:48', '0');
INSERT INTO `p_video_details` VALUES ('49', 'qcws20181031174923QHuyCZ', '16', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=64e483fc64b6d621fb17f599febd7df7&txTime=5BD9C0F4', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:49:25', null, '0', '1', '2018-10-31 17:49:24', '2018-10-31 17:49:24', '0');
INSERT INTO `p_video_details` VALUES ('50', 'qcws201810311749318HEgmM', '17', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=2c44624176b5e0f6c67fe74912b3d84e&txTime=5BD9C0FB', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:49:31', null, '0', '1', '2018-10-31 17:49:31', '2018-10-31 17:49:31', '0');
INSERT INTO `p_video_details` VALUES ('51', 'qcws20181031174932Wq9Y4k', '18', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=7e1f6ca7709c8e44f1ffddebe5bb02e8&txTime=5BD9C0FC', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 17:49:33', null, '0', '1', '2018-10-31 17:49:33', '2018-10-31 17:49:33', '0');
INSERT INTO `p_video_details` VALUES ('52', 'qcws20181031180005ggKp13', '19', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=f8770408c684f2686bb747818c8f6f4d&txTime=5BD9C377', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-10-31 18:00:07', null, '0', '1', '2018-10-31 18:00:07', '2018-10-31 18:00:07', '0');
INSERT INTO `p_video_details` VALUES ('53', 'qcws20181101111500NUghYh', '20', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=987b997bed8744192f0bbe73151e04a5&txTime=5BDAB605', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-11-01 11:15:01', null, '0', '1', '2018-11-01 11:15:01', '2018-11-01 11:15:01', '0');
INSERT INTO `p_video_details` VALUES ('54', 'qcws20181101142728fPrgvq', '1', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=27092c90bf8d7f7dcfad4024205c2425&txTime=5BDAE321', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-11-01 14:27:30', null, '0', '1', '2018-11-01 14:27:29', '2018-11-01 14:27:29', '0');
INSERT INTO `p_video_details` VALUES ('55', 'qcws20181101142817qyzzcG', '1', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=d38367a0d139aec75ad819a31dfdff82&txTime=5BDAE351', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-11-01 14:28:18', null, '0', '1', '2018-11-01 14:28:17', '2018-11-01 14:28:17', '0');
INSERT INTO `p_video_details` VALUES ('56', 'qcws20181101143233738m7b', '1', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=5a07927420dafe87cae26b45883b2431&txTime=5BDAE452', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-11-01 14:32:35', null, '0', '1', '2018-11-01 14:32:34', '2018-11-01 14:32:34', '0');
INSERT INTO `p_video_details` VALUES ('57', 'qcws20181101150408LG9wcR', '1', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=2f906272abfd881ecb1b0aa4dc87c8df&txTime=5BDAEBBA', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-11-01 15:04:10', null, '0', '1', '2018-11-01 15:04:10', '2018-11-01 15:04:10', '0');
INSERT INTO `p_video_details` VALUES ('58', 'qcws20181101150739Zdt4Yr', '1', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=d5ccdd1c3a793c88be22a6f3dabba3c7&txTime=5BDAEC8D', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-11-01 15:07:41', null, '0', '1', '2018-11-01 15:07:41', '2018-11-01 15:07:41', '0');
INSERT INTO `p_video_details` VALUES ('59', 'qcws20181101150929eRUg2x', '1', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=7cce9172213caf6bf27518dc66bfa2a4&txTime=5BDAECFA', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-11-01 15:09:31', null, '0', '1', '2018-11-01 15:09:30', '2018-11-01 15:09:30', '0');
INSERT INTO `p_video_details` VALUES ('60', 'qcws20181101151409wmSylu', '1', 'rtmp://31884.livepush.myqcloud.com/live/31884_qcws1?txSecret=c697908ce2b3184e7eaca5c44f278a62&txTime=5BDAEE12', 'http://31884.liveplay.myqcloud.com/live/31884_qcws1.flv', null, 'qcws1', '2018-11-01 15:14:10', null, '0', '1', '2018-11-01 15:14:10', '2018-11-01 15:14:10', '0');

-- ----------------------------
-- Table structure for p_video_statistical
-- ----------------------------
DROP TABLE IF EXISTS `p_video_statistical`;
CREATE TABLE `p_video_statistical` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `sku_number` varchar(50) NOT NULL COMMENT 'Sku编码（商品编号）',
  `goods_id` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '商品ID',
  `user_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '下单量（按单计算,每组商品多件购买算一笔）',
  `buy_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '销量（购买的件数）',
  `dp_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '总参与的点评人数',
  `dp_count_1` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '一星点评数',
  `dp_count_2` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '二星点评数',
  `dp_count_3` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '三星点评数',
  `dp_count_4` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '四星点评数',
  `dp_count_5` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '五星点评数',
  `view_count` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '浏览量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='视频数据统计表';

-- ----------------------------
-- Records of p_video_statistical
-- ----------------------------

-- ----------------------------
-- Table structure for p_video_type
-- ----------------------------
DROP TABLE IF EXISTS `p_video_type`;
CREATE TABLE `p_video_type` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `area_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '父级ID',
  `school_id` int(11) NOT NULL COMMENT '分类名',
  `subject_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '排序 从大到小',
  `create_by` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  `update_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '修改日期',
  `id_del` char(1) DEFAULT NULL COMMENT '1:是\r\n            2:否',
  PRIMARY KEY (`id`),
  KEY `pid` (`area_id`),
  KEY `sort` (`subject_id`),
  KEY `name` (`school_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='分类表';

-- ----------------------------
-- Records of p_video_type
-- ----------------------------

-- ----------------------------
-- Procedure structure for get_collect_video_list
-- ----------------------------
DROP PROCEDURE IF EXISTS `get_collect_video_list`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_collect_video_list`(
userid    bigint
)
BEGIN
DECLARE sqlstr VARCHAR(1000);
set sqlstr ='SELECT DISTINCT
		a.id,
		a.video_code as videoCode,
		a.live_info_id as liveInfoId,
		a.create_user_id as createUserId,
		a.is_end_live as isEndLive,
		a.real_begin_livetime as realBeginLivetime,
		a.real_end_livetime as realEndLivetime,
		b.begin_live_time as beginLiveTime,
		b.class_name as className,
		b.course ,
		b.course_data_url as courseDataUrl,
		b.end_live_time as endLiveTime,
		b.main_pic_url as mainPicUrl,
		b.`subject`
	FROM
		p_collect c
inner join
		p_video_details a on c.video_code=a.video_code and a.is_delete =0
	inner join
		p_live_info b
	on 
		a.live_info_id =b.id and b.is_delete=0
	WHERE
		c.is_delete =0  ';
IF userid is not NULL THEN
	set sqlstr =CONCAT(sqlstr,'and c.user_id=',userid,'  ');
	
END IF;


SET @sqlstr =sqlstr;
/*select @sqlstr;*/

prepare stmt from @sqlstr;
execute stmt;
DEALLOCATE PREPARE stmt ;
end
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for get_video_list
-- ----------------------------
DROP PROCEDURE IF EXISTS `get_video_list`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `get_video_list`(
userid    bigint,
isendlive tinyint
)
BEGIN
DECLARE sqlstr VARCHAR(1000);
set sqlstr ='SELECT DISTINCT
		a.id,
		a.video_code as videoCode,
		a.live_info_id as liveInfoId,
		a.create_user_id as createUserId,
		a.is_end_live as isEndLive,
		a.real_begin_livetime as realBeginLivetime,
		a.real_end_livetime as realEndLivetime,
		b.begin_live_time as beginLiveTime,
		b.class_name as className,
		b.course ,
		b.course_data_url as courseDataUrl,
		b.end_live_time as endLiveTime,
		b.main_pic_url as mainPicUrl,
		b.`subject`
	FROM
		p_video_details a
	inner join
		p_live_info b
	on 
		a.live_info_id =b.id and b.is_delete=0
	WHERE
		a.is_delete =0  ';
IF userid is not NULL THEN
	set sqlstr =CONCAT(sqlstr,'and a.create_user_id=',userid,'  ');
	
END IF;
IF isendlive is not NULL THEN
	set sqlstr =CONCAT(sqlstr,'and a.is_end_live=',isendlive);
	
END IF;

SET @sqlstr =sqlstr;
/*select @sqlstr;*/

prepare stmt from @sqlstr;
execute stmt;
DEALLOCATE PREPARE stmt ;
end
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for pr_add
-- ----------------------------
DROP PROCEDURE IF EXISTS `pr_add`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `pr_add`(
   a int,
   b int
)
begin
   declare c int;
   if a is null then
      set a = 0;
   end if;
   if b is null then
      set b = 0;
   end if;
   set c = a + b;
   select c as sum;
   
end
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for 创建群消息
-- ----------------------------
DROP PROCEDURE IF EXISTS `创建群消息`;
DELIMITER ;;
CREATE DEFINER=`root`@`%` PROCEDURE `创建群消息`()
BEGIN
	declare i int;
	set i=0;
	while i<10000 do
		INSERT INTO `im_group_message` (`create_date`, `modify_date`, `content`, `from_account_id`, `from_account`, `group_id`, `type`) VALUES ('1536992624916', '1536992624916', '我是kael5', '4', '17666545285', '1', '0');
		set i=i+1;
	end while;
END
;;
DELIMITER ;
