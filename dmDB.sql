/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50536
Source Host           : localhost:3306
Source Database       : dm

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2019-06-14 07:58:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for depart_info
-- ----------------------------
DROP TABLE IF EXISTS `depart_info`;
CREATE TABLE `depart_info` (
  `id` varchar(32) NOT NULL,
  `depart_name` varchar(32) DEFAULT NULL,
  `depart_code` varchar(32) DEFAULT NULL,
  `del_flag` char(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of depart_info
-- ----------------------------
INSERT INTO `depart_info` VALUES ('1', '人事科', 'rsk', '0');
INSERT INTO `depart_info` VALUES ('2', '内科', 'nk', '0');
INSERT INTO `depart_info` VALUES ('3', '外科', 'wk', '0');

-- ----------------------------
-- Table structure for drug_info
-- ----------------------------
DROP TABLE IF EXISTS `drug_info`;
CREATE TABLE `drug_info` (
  `id` varchar(32) NOT NULL,
  `drug_code` varchar(32) DEFAULT NULL,
  `drug_name` varchar(64) DEFAULT NULL,
  `unit` varchar(10) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `del_flag` char(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drug_info
-- ----------------------------
INSERT INTO `drug_info` VALUES ('1', 'blg', '板蓝根', '盒', '12', '0');
INSERT INTO `drug_info` VALUES ('2', 'tb', '头孢颗粒', '盒', '22', '0');
INSERT INTO `drug_info` VALUES ('3', 'VC', '维生素c', '瓶', '100', '0');
INSERT INTO `drug_info` VALUES ('4', 'bjh', '白加黑', '盒', '40', '0');
INSERT INTO `drug_info` VALUES ('5', 'kky', '可卡因', '片', '1000', '0');

-- ----------------------------
-- Table structure for employee_info
-- ----------------------------
DROP TABLE IF EXISTS `employee_info`;
CREATE TABLE `employee_info` (
  `id` varchar(32) NOT NULL,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `name` varchar(32) DEFAULT NULL,
  `depart_id` varchar(32) DEFAULT NULL,
  `del_flag` char(1) DEFAULT '0',
  `phone` varchar(20) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee_info
-- ----------------------------
INSERT INTO `employee_info` VALUES ('1', 'admin', '1234', '啊啊啊', '1', '0', '139139139139', null);
INSERT INTO `employee_info` VALUES ('22', 'huatuo', '1234', '华佗', '3', '0', '1232134', '2019-05-31 07:08:58');
INSERT INTO `employee_info` VALUES ('33', 'bianque', '1234', '扁鹊', '2', '0', '123213', '2019-05-31 07:09:00');
INSERT INTO `employee_info` VALUES ('876170b34d4b48ea9d473faa11154302', '1111', '1234', 'ASas', '1', '0', '12123213', '2019-05-30 12:30:40');
INSERT INTO `employee_info` VALUES ('9e171791548447279b7cbd5b9d34b87e', 'aaa', '1234', 'sad', '1', '0', 'asd', '2019-05-30 13:12:02');

-- ----------------------------
-- Table structure for medical_record
-- ----------------------------
DROP TABLE IF EXISTS `medical_record`;
CREATE TABLE `medical_record` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `doctor_id` varchar(32) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `depart_id` varchar(32) DEFAULT NULL,
  `contract` varchar(10) DEFAULT NULL,
  `pay_status` char(1) DEFAULT NULL,
  `pay_time` datetime DEFAULT NULL,
  `operator_id` varchar(32) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `self_paying` double DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `del_flag` char(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of medical_record
-- ----------------------------
INSERT INTO `medical_record` VALUES ('1', '赵翔', '1', '22', '22', '3', '医保', '', null, null, null, null, '2019-05-31 07:10:16', '0');
INSERT INTO `medical_record` VALUES ('190531165552_44', '范乔丹', '男', '22', '12', null, '医保', '0', null, null, null, null, '2019-05-31 16:55:52', '0');
INSERT INTO `medical_record` VALUES ('2', '韩正', '2', '33', '24', '2', '自费', null, null, null, null, null, '2019-05-31 07:10:14', '0');
INSERT INTO `medical_record` VALUES ('20190602215306_75', '范乔丹', '男', '22', '12', null, '医保', '0', null, null, null, null, '2019-06-02 21:53:06', '0');

-- ----------------------------
-- Table structure for mr_drug
-- ----------------------------
DROP TABLE IF EXISTS `mr_drug`;
CREATE TABLE `mr_drug` (
  `drug_info_id` varchar(32) NOT NULL DEFAULT '',
  `mr_id` varchar(32) NOT NULL DEFAULT '',
  `drug_count` double DEFAULT NULL,
  PRIMARY KEY (`drug_info_id`,`mr_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mr_drug
-- ----------------------------
INSERT INTO `mr_drug` VALUES ('1', '1', '10');
INSERT INTO `mr_drug` VALUES ('1', '2', '2');
INSERT INTO `mr_drug` VALUES ('2', '2', '1');
INSERT INTO `mr_drug` VALUES ('3', '1', '2');
INSERT INTO `mr_drug` VALUES ('3', '2', '1');
INSERT INTO `mr_drug` VALUES ('4', '1', '5');
INSERT INTO `mr_drug` VALUES ('5', '1', '30');
INSERT INTO `mr_drug` VALUES ('5', '2', '22');
