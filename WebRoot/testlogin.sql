/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50143
Source Host           : localhost:3306
Source Database       : testlogin

Target Server Type    : MYSQL
Target Server Version : 50143
File Encoding         : 65001

Date: 2013-12-06 17:17:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_txl`
-- ----------------------------
DROP TABLE IF EXISTS `t_txl`;
CREATE TABLE `t_txl` (
  `txlid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `phone` varchar(40) DEFAULT NULL,
  `qq` varchar(20) DEFAULT NULL,
  `youxiang` varchar(50) DEFAULT NULL,
  `dizhi` varchar(500) DEFAULT NULL,
  `birthday` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`txlid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_txl
-- ----------------------------
INSERT INTO `t_txl` VALUES ('1', '丁游', '13698411093', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('2', '张三', '13698411093', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('3', '张三', '13698411093', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('4', '李四', '13698411093', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('5', '小刘', '13698411093', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('6', '丁游', '13698411093', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('7', '丁游', '13698411093', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('8', '丁游', '13698411096', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('10', '丁游', '13698411094', '502763217', '45@163.com', '江西南昌', '1989-05-19');
INSERT INTO `t_txl` VALUES ('11', '丁游', '13698411093', '502763217', '123@163.com', '江西南昌', '1989-05-19');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'dingyou', '1023');
