/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50641
Source Host           : localhost:3306
Source Database       : custservicedb

Target Server Type    : MYSQL
Target Server Version : 50641
File Encoding         : 65001

Date: 2019-03-09 15:27:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `sys_friend`
-- ----------------------------
DROP TABLE IF EXISTS `sys_friend`;
CREATE TABLE `sys_friend` (
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户账号',
  `friend_id` varchar(255) DEFAULT NULL COMMENT '好友账号',
  `add_status` varchar(255) DEFAULT NULL COMMENT '状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='好友表';

-- ----------------------------
-- Records of sys_friend
-- ----------------------------
INSERT INTO `sys_friend` VALUES ('001', '003', null);
INSERT INTO `sys_friend` VALUES ('002', '003', null);
INSERT INTO `sys_friend` VALUES ('001', '002', null);
INSERT INTO `sys_friend` VALUES ('002', '001', null);

-- ----------------------------
-- Table structure for `sys_msg`
-- ----------------------------
DROP TABLE IF EXISTS `sys_msg`;
CREATE TABLE `sys_msg` (
  `msg_id` int(255) NOT NULL AUTO_INCREMENT,
  `send_id` varchar(255) DEFAULT NULL COMMENT '发送人编号',
  `content` varchar(255) DEFAULT NULL COMMENT '消息内容',
  `receive_id` varchar(255) DEFAULT NULL COMMENT '接收人编号',
  `time` varchar(255) DEFAULT NULL COMMENT '时间',
  `status` varchar(1) DEFAULT '0',
  PRIMARY KEY (`msg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10027 DEFAULT CHARSET=utf8 COMMENT='消息表';

-- ----------------------------
-- Records of sys_msg
-- ----------------------------
INSERT INTO `sys_msg` VALUES ('10022', '002', '你好，你是001吗', '001', '2019-03-09 12:31:59', '0');
INSERT INTO `sys_msg` VALUES ('10023', '001', '是的，我是001', '002', '2019-03-09 12:32:17', '0');
INSERT INTO `sys_msg` VALUES ('10024', '002', '002 是我', '001', '2019-03-09 12:32:21', '0');
INSERT INTO `sys_msg` VALUES ('10025', '002', '很高兴认识你', '001', '2019-03-09 12:32:36', '0');
INSERT INTO `sys_msg` VALUES ('10026', '001', 'Nice to meet You!', '002', '2019-03-09 12:33:01', '0');

-- ----------------------------
-- Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户账号',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `pwd` varchar(255) DEFAULT NULL COMMENT '密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('001', '张三', '1232');
INSERT INTO `sys_user` VALUES ('002', '李四', '321');
INSERT INTO `sys_user` VALUES ('003', '王五', '213');
INSERT INTO `sys_user` VALUES ('005', '赵六', '123456');
INSERT INTO `sys_user` VALUES ('012', '012', '123');
