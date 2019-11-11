/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50709
Source Host           : 127.0.0.1:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2019-11-11 16:05:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
INSERT INTO `hibernate_sequence` VALUES ('1');

-- ----------------------------
-- Table structure for t_base_girl
-- ----------------------------
DROP TABLE IF EXISTS `t_base_girl`;
CREATE TABLE `t_base_girl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `birth` datetime DEFAULT NULL,
  `cup_size` varchar(255) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `status` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_base_girl
-- ----------------------------
INSERT INTO `t_base_girl` VALUES ('1', '111222', null, '3333', null, null);

-- ----------------------------
-- Table structure for t_order_base
-- ----------------------------
DROP TABLE IF EXISTS `t_order_base`;
CREATE TABLE `t_order_base` (
  `id` int(100) NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `order_title` varchar(200) DEFAULT NULL COMMENT '订单标题',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_order_base
-- ----------------------------
INSERT INTO `t_order_base` VALUES ('1', '22');

-- ----------------------------
-- Table structure for t_sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_permission`;
CREATE TABLE `t_sys_permission` (
  `permission_id` bigint(200) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `permission_name` varchar(20) NOT NULL COMMENT '权限名称',
  `permission_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_permission
-- ----------------------------
INSERT INTO `t_sys_permission` VALUES ('1', '添加', 'add');
INSERT INTO `t_sys_permission` VALUES ('2', '删除', 'delete');

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `role_name` varchar(200) DEFAULT NULL COMMENT '角色名称',
  `role_code` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
INSERT INTO `t_sys_role` VALUES ('1', '董事长', 'dongshizhang', 'ROLE_USER');
INSERT INTO `t_sys_role` VALUES ('2', '管理员', 'admin', 'ROLE_ADMIN');
INSERT INTO `t_sys_role` VALUES ('3', '数据管理员', 'ROLE_ADMIN', 'ROLE_ADB');

-- ----------------------------
-- Table structure for t_sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role_permission`;
CREATE TABLE `t_sys_role_permission` (
  `role_permission_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `role_id` bigint(20) NOT NULL COMMENT '用户ID',
  `permission_id` bigint(20) NOT NULL COMMENT '权限ID',
  PRIMARY KEY (`role_permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_role_permission
-- ----------------------------
INSERT INTO `t_sys_role_permission` VALUES ('1', '2', '1');
INSERT INTO `t_sys_role_permission` VALUES ('2', '1', '2');
INSERT INTO `t_sys_role_permission` VALUES ('3', '3', '1');

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `id` bigint(200) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL,
  `salt` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `username_index` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
INSERT INTO `t_sys_user` VALUES ('1', 'hong', '123456', null);
INSERT INTO `t_sys_user` VALUES ('3', '11', '11', null);
INSERT INTO `t_sys_user` VALUES ('4', '22', '22', null);
INSERT INTO `t_sys_user` VALUES ('6', '123', '297254e9bfe0b8f39c682eda30bb9be0', '313233');
INSERT INTO `t_sys_user` VALUES ('7', '111', 'd89267ba6e888426c8f798a04f2fb874', '313131');
INSERT INTO `t_sys_user` VALUES ('8', '222', '7165e4fbb0b73542dc2ba357e802f880', '323232');
INSERT INTO `t_sys_user` VALUES ('9', '333', '13e1feb08766fedbf1a692aa9fb97984', '333333');
INSERT INTO `t_sys_user` VALUES ('10', '777', '783ab3e2d02f5c8a654111b2e064d52d', '373737');
INSERT INTO `t_sys_user` VALUES ('11', '888', 'c798dcd63c4a9fd265268ba0d3e85253', '9636300ffbe08cc6b349ddcd8c52c461');

-- ----------------------------
-- Table structure for t_sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user_role`;
CREATE TABLE `t_sys_user_role` (
  `user_role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` bigint(20) NOT NULL COMMENT 'user_id',
  `role_id` bigint(20) NOT NULL COMMENT 'role_id',
  PRIMARY KEY (`user_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sys_user_role
-- ----------------------------
INSERT INTO `t_sys_user_role` VALUES ('2', '3', '3');

-- ----------------------------
-- Table structure for t_test_user
-- ----------------------------
DROP TABLE IF EXISTS `t_test_user`;
CREATE TABLE `t_test_user` (
  `user_test_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user_id` bigint(20) NOT NULL COMMENT 'user_id',
  `user_other` varchar(200) DEFAULT NULL COMMENT 'other',
  PRIMARY KEY (`user_test_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_test_user
-- ----------------------------
INSERT INTO `t_test_user` VALUES ('2', '3', '333');
INSERT INTO `t_test_user` VALUES ('3', '444', '444');
