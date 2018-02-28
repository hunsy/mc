/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : mc

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2018-02-28 11:13:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `gz_change_record`
-- ----------------------------
DROP TABLE IF EXISTS `gz_change_record`;
CREATE TABLE `gz_change_record` (
  `id` varchar(32) NOT NULL,
  `info_id` varchar(32) DEFAULT NULL COMMENT '固资信息id',
  `name` varchar(64) DEFAULT NULL COMMENT '资产名称（冗余）',
  `type` varchar(64) DEFAULT NULL COMMENT '类型（冗余）',
  `op_type` int(11) DEFAULT NULL COMMENT '操作类型  0 消除 1 新增',
  `created_at` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='资产变更记录（只记增减）';

-- ----------------------------
-- Records of gz_change_record
-- ----------------------------

-- ----------------------------
-- Table structure for `gz_info`
-- ----------------------------
DROP TABLE IF EXISTS `gz_info`;
CREATE TABLE `gz_info` (
  `id` varchar(32) NOT NULL,
  `statistic_id` varchar(32) DEFAULT NULL COMMENT '统计信息id',
  `gz_no` varchar(64) NOT NULL COMMENT '固资编号 按类型时间数量生成',
  `type` int(2) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL COMMENT '资产名称',
  `remark` varchar(255) DEFAULT NULL COMMENT '附加信息',
  `created_at` date DEFAULT NULL,
  `updated_at` date DEFAULT NULL,
  `valid` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='固定资产信息';

-- ----------------------------
-- Records of gz_info
-- ----------------------------

-- ----------------------------
-- Table structure for `gz_statistic`
-- ----------------------------
DROP TABLE IF EXISTS `gz_statistic`;
CREATE TABLE `gz_statistic` (
  `id` varchar(32) NOT NULL,
  `name` varchar(64) NOT NULL COMMENT '资产名称',
  `type` int(3) DEFAULT NULL COMMENT '类型',
  `quantity` int(11) DEFAULT '0' COMMENT '数量',
  `created_at` date DEFAULT NULL COMMENT '新增事件',
  `updated_at` date DEFAULT NULL,
  `valid` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='固定资产统计数据表';

-- ----------------------------
-- Records of gz_statistic
-- ----------------------------
INSERT INTO `gz_statistic` VALUES ('1519383657458Tn172Kx2NrbDKrGw', '育仔圈', '1', '0', '2018-02-23', '2018-02-23', '1');
INSERT INTO `gz_statistic` VALUES ('1519444839356yeFJotQYr9MTZyeE', '育肥圈', '1', '0', '2018-02-24', '2018-02-24', '1');
INSERT INTO `gz_statistic` VALUES ('1519460066907Tu5YtvzCxGidkMvp', '撒旦', '2', '0', '2018-02-24', '2018-02-24', '1');
INSERT INTO `gz_statistic` VALUES ('1519460102959THmlYoKeuSHYKXxF', '阿斯顿', '2', '0', '2018-02-24', '2018-02-24', '1');
INSERT INTO `gz_statistic` VALUES ('1519460126584ndzyyToaCOE4RXZs', '安抚', '2', '0', '2018-02-24', '2018-02-24', '1');
INSERT INTO `gz_statistic` VALUES ('1519460133449VamBq9T2tEOX7p9c', '阿飞', '2', '0', '2018-02-24', '2018-02-24', '1');
INSERT INTO `gz_statistic` VALUES ('1519466066145Yx503R9JXOmvVCnM', '安抚1112', '2', '0', '2018-02-21', '2018-02-24', '1');

-- ----------------------------
-- Table structure for `uc_permission`
-- ----------------------------
DROP TABLE IF EXISTS `uc_permission`;
CREATE TABLE `uc_permission` (
  `id` varchar(64) NOT NULL,
  `name` varchar(32) NOT NULL,
  `type` int(2) NOT NULL DEFAULT '1' COMMENT '1 菜单  2 连接  3 按钮',
  `path` varchar(255) NOT NULL,
  `valid` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of uc_permission
-- ----------------------------

-- ----------------------------
-- Table structure for `uc_user`
-- ----------------------------
DROP TABLE IF EXISTS `uc_user`;
CREATE TABLE `uc_user` (
  `id` varchar(64) NOT NULL,
  `user_name` varchar(64) NOT NULL COMMENT '用户名',
  `password` varchar(64) NOT NULL COMMENT '密码',
  `nick_name` varchar(64) NOT NULL COMMENT '昵称',
  `valid` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of uc_user
-- ----------------------------
