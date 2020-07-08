/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : sot

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2020-04-13 22:02:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for commodity
-- ----------------------------
DROP TABLE IF EXISTS `commodity`;
CREATE TABLE `commodity` (
  `commodityId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品Id',
  `commodityName` varchar(255) NOT NULL COMMENT '商品名称',
  `commodityPrice` float(11,0) NOT NULL COMMENT '商品价格',
  `commoditySell` int(11) NOT NULL COMMENT '商品已售数量',
  `commodityAuthor` int(11) NOT NULL COMMENT '商品作者',
  `commodityOther` varchar(255) NOT NULL COMMENT '其他',
  `desoft` int(1) NOT NULL DEFAULT '1' COMMENT '软删标记（1表示存在，0表示删除）',
  PRIMARY KEY (`commodityId`)
) ENGINE=InnoDB AUTO_INCREMENT=10000002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodity
-- ----------------------------
INSERT INTO `commodity` VALUES ('10000001', '青春校园风', '1000', '1000', '100022', '青春风', '1');

-- ----------------------------
-- Table structure for commodityinfo
-- ----------------------------
DROP TABLE IF EXISTS `commodityinfo`;
CREATE TABLE `commodityinfo` (
  `commodityInfoId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品详情Id',
  `commondityId` int(11) NOT NULL COMMENT '商品Id',
  `commodityDataType` varchar(255) NOT NULL COMMENT '商品数据类型',
  `commondityData` varchar(255) NOT NULL COMMENT '商品数据',
  `commodityDescribe` varchar(255) DEFAULT NULL COMMENT '商品数据描述',
  `desoft` int(1) NOT NULL DEFAULT '1' COMMENT '软删标记（1表示存在，0表示删除）',
  PRIMARY KEY (`commodityInfoId`)
) ENGINE=InnoDB AUTO_INCREMENT=10000003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodityinfo
-- ----------------------------
INSERT INTO `commodityinfo` VALUES ('10000001', '10000001', 'image', 'images/index_image/spring/spring-2.jpg', '展示图片1', '1');
INSERT INTO `commodityinfo` VALUES ('10000002', '10000001', 'image', 'images/index_image/spring/spring-3.jpg', '展示图片1', '1');

-- ----------------------------
-- Table structure for commodityparameter
-- ----------------------------
DROP TABLE IF EXISTS `commodityparameter`;
CREATE TABLE `commodityparameter` (
  `commodityParameterId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品参数id',
  `commodityId` int(11) NOT NULL COMMENT '商品Id',
  `clothing` int(11) NOT NULL COMMENT '服装',
  `makeup` int(11) NOT NULL COMMENT '妆容',
  `headdress` int(11) NOT NULL COMMENT '头饰',
  `shootingStyle` int(11) NOT NULL COMMENT '拍摄方式',
  `view` int(11) NOT NULL COMMENT '取景',
  `style` int(11) NOT NULL COMMENT '风格类型',
  `photographer` int(11) NOT NULL COMMENT '摄影师',
  `desoft` int(1) NOT NULL DEFAULT '1' COMMENT '软删标记（1表示存在，0表示删除）',
  PRIMARY KEY (`commodityParameterId`)
) ENGINE=InnoDB AUTO_INCREMENT=10000002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of commodityparameter
-- ----------------------------
INSERT INTO `commodityparameter` VALUES ('10000001', '10000001', '10000004', '10000008', '10000010', '10000014', '10000019', '10000021', '10000024', '1');

-- ----------------------------
-- Table structure for parameter
-- ----------------------------
DROP TABLE IF EXISTS `parameter`;
CREATE TABLE `parameter` (
  `parameterId` int(11) NOT NULL AUTO_INCREMENT COMMENT '参数Id',
  `parameterType` varchar(255) NOT NULL COMMENT '参数类型',
  `parameterContent` varchar(255) NOT NULL COMMENT '参数内容',
  `paramaterMark` int(255) NOT NULL COMMENT '参数标识',
  `paramaterPrice` float(11,0) NOT NULL COMMENT '参数价格',
  `paramaterDescribe` text COMMENT '参数描述',
  `desoft` int(1) NOT NULL DEFAULT '1' COMMENT '软删标记（1表示存在，0表示删除）',
  PRIMARY KEY (`parameterId`)
) ENGINE=InnoDB AUTO_INCREMENT=10000025 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of parameter
-- ----------------------------
INSERT INTO `parameter` VALUES ('10000001', 'clothing', '古装', '1', '200', '古装', '1');
INSERT INTO `parameter` VALUES ('10000002', 'clothing', '婚纱', '2', '300', '婚纱', '1');
INSERT INTO `parameter` VALUES ('10000003', 'clothing', '日常', '3', '100', '日常', '1');
INSERT INTO `parameter` VALUES ('10000004', 'clothing', '学生', '4', '200', '学生', '1');
INSERT INTO `parameter` VALUES ('10000005', 'clothing', '民国', '5', '300', '民国', '1');
INSERT INTO `parameter` VALUES ('10000006', 'makeup', '淡妆', '1', '100', '淡妆', '1');
INSERT INTO `parameter` VALUES ('10000007', 'makeup', '浓妆', '2', '200', '浓妆', '1');
INSERT INTO `parameter` VALUES ('10000008', 'makeup', '精妆', '3', '300', '精妆', '1');
INSERT INTO `parameter` VALUES ('10000009', 'headdress', '无', '1', '0', '无', '1');
INSERT INTO `parameter` VALUES ('10000010', 'headdress', '艺术帽', '2', '50', '艺术帽', '1');
INSERT INTO `parameter` VALUES ('10000011', 'headdress', '头巾', '3', '60', '头巾', '1');
INSERT INTO `parameter` VALUES ('10000012', 'headdress', '皇冠', '4', '100', '皇冠', '1');
INSERT INTO `parameter` VALUES ('10000013', 'headdress', '凤冠', '5', '200', '凤冠', '1');
INSERT INTO `parameter` VALUES ('10000014', 'shootingStyle', '摆拍', '1', '300', '摆拍', '1');
INSERT INTO `parameter` VALUES ('10000015', 'shootingStyle', '抓拍', '2', '300', '抓拍', '1');
INSERT INTO `parameter` VALUES ('10000016', 'shootingStyle', '跟拍', '3', '600', '跟拍', '1');
INSERT INTO `parameter` VALUES ('10000017', 'shootingStyle', '写真', '4', '1000', '写真', '1');
INSERT INTO `parameter` VALUES ('10000018', 'shootingStyle', '微电影', '5', '2000', '微电影', '1');
INSERT INTO `parameter` VALUES ('10000019', 'view', '内景', '1', '400', '内景', '1');
INSERT INTO `parameter` VALUES ('10000020', 'view', '外景', '2', '800', '外景', '1');
INSERT INTO `parameter` VALUES ('10000021', 'style', '青春校园', '1', '1000', '青春校园', '1');
INSERT INTO `parameter` VALUES ('10000022', 'style', '毕业婚礼', '2', '2000', '毕业婚礼', '1');
INSERT INTO `parameter` VALUES ('10000023', 'style', '微电影', '3', '3000', '微电影', '1');
INSERT INTO `parameter` VALUES ('10000024', 'photographer', 'tony', '1', '1000', '首席摄影师', '1');

-- ----------------------------
-- Table structure for resources
-- ----------------------------
DROP TABLE IF EXISTS `resources`;
CREATE TABLE `resources` (
  `resourcesId` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源Id',
  `commodityId` int(11) NOT NULL COMMENT '商品id',
  `resourcesName` varchar(255) NOT NULL COMMENT '资源名称',
  `resourcesType` varchar(255) NOT NULL COMMENT '资源类型',
  `resourcesClass` varchar(255) NOT NULL COMMENT '资源种类',
  `resourcesAddress` varchar(255) NOT NULL COMMENT '资源地址',
  `resourcesDescribe` text NOT NULL COMMENT '资源描述',
  `resourcesPeople` varchar(255) NOT NULL COMMENT '资源上传者',
  `resourcesTime` varchar(255) NOT NULL COMMENT '资源上传时间',
  `resourcesSize` varchar(255) NOT NULL COMMENT '资源大小',
  `desoft` int(1) NOT NULL DEFAULT '1' COMMENT '软删标记（1表示存在，0表示删除）',
  PRIMARY KEY (`resourcesId`)
) ENGINE=InnoDB AUTO_INCREMENT=10000018 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resources
-- ----------------------------
INSERT INTO `resources` VALUES ('10000001', '10000001', '青春校园', 'jpg', '青春校园', 'images/index_image/spring/spring-1.jpg', '测试', 'admin', '2020-03-29 20:35:23', '474', '1');
INSERT INTO `resources` VALUES ('10000002', '10000001', '青春校园', 'jpg', '青春校园', 'images/index_image/spring/spring-2.jpg', '测试', 'admin', '2020-03-29', '172', '1');
INSERT INTO `resources` VALUES ('10000003', '10000001', '青春校园', 'jpg', '青春校园', 'images/index_image/spring/spring-3.jpg', '测试', 'admin', '2020-03-29', '1759', '1');
INSERT INTO `resources` VALUES ('10000004', '10000001', '青春校园', 'jpg', '青春校园', ' images/index_image/spring/spring-4.jpg', '测试', 'admin', '2020-02-29', '1358', '1');
INSERT INTO `resources` VALUES ('10000005', '10000001', '青春校园', 'jpg', '青春校园', 'images/index_image/spring/spring-5.jpg', '测试', 'admin', '2020-02-29', '376', '1');
INSERT INTO `resources` VALUES ('10000006', '10000001', '青春校园', 'jpg', '青春校园', 'images/index_image/spring/spring-6.jpg', '测试', 'admin', '2020-03-29', '1113', '1');
INSERT INTO `resources` VALUES ('10000007', '10000001', '青春校园', 'jpg', '青春校园', 'images/index_image/spring/spring-7.jpg', '测试', 'admin', '2020-03-29', '115', '1');
INSERT INTO `resources` VALUES ('10000008', '10000001', '青春校园', 'jpg', '青春校园', 'images/index_image/spring/spring-8.jpg', '测试', 'admin', '2020-03-29', '278', '1');
INSERT INTO `resources` VALUES ('10000009', '10000001', '毕业婚礼', 'jpg', '毕业婚礼', 'images/index_image/widding/wedding-1.jpg', '测试', 'admin', '2020-03-29', '972', '1');
INSERT INTO `resources` VALUES ('10000010', '10000001', '毕业婚礼', 'jpg', '毕业婚礼', 'images/index_image/widding/wedding-2.jpg', '测试', 'admin', '2020-03-29', '89', '1');
INSERT INTO `resources` VALUES ('10000011', '10000001', '毕业婚礼', 'jpg', '毕业婚礼', 'images/index_image/widding/wedding-3.jpg', '测试', 'admin', '2020-03-29', '1663', '1');
INSERT INTO `resources` VALUES ('10000012', '10000001', '毕业婚礼', 'jpg', '毕业婚礼', 'images/index_image/widding/wedding-4.jpg', '测试', 'admin', '2020-03-29', '256', '1');
INSERT INTO `resources` VALUES ('10000013', '10000001', '毕业婚礼', 'jpg', '毕业婚礼', 'images/index_image/widding/wedding-5.jpg', '测试', 'admin', '2020-03-29', '338', '1');
INSERT INTO `resources` VALUES ('10000014', '10000001', '毕业婚礼', 'jpg', '毕业婚礼', 'images/index_image/widding/wedding-6.jpg', '测试', 'admin', '2020-03-29', '211', '1');
INSERT INTO `resources` VALUES ('10000015', '10000001', '毕业婚礼', 'jpg', '毕业婚礼', 'images/index_image/widding/wedding-7.jpg', '测试', 'admin', '2020-03-29', '45', '1');
INSERT INTO `resources` VALUES ('10000016', '10000001', '毕业婚礼', 'jpg', '毕业婚礼', 'images/index_image/widding/wedding-8.jpg', '测试', 'admin', '2020-03-29', '510', '1');
INSERT INTO `resources` VALUES ('10000017', '10000001', '短视频', 'jpg', '短视频', 'images/index_image/video/video-1.jpg', '测试', 'admin', '2020-03-29', '177', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `userName` varchar(255) NOT NULL COMMENT '用户名',
  `userPassword` varchar(255) NOT NULL COMMENT '用户密码',
  `userEmail` varchar(255) NOT NULL COMMENT '用户邮箱',
  `userTel` varchar(11) NOT NULL COMMENT '用户电话',
  `desoft` int(1) NOT NULL DEFAULT '1' COMMENT '软删标记（1表示存在，0表示删除）',
  `role` int(1) NOT NULL DEFAULT '1' COMMENT '用户权限（1普通用户，2摄影师，3管理员）',
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=100024 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('100001', 'admin', '123456', '1315@qq.com', '15581396772', '1', '3');
INSERT INTO `user` VALUES ('100022', 'song', '1234', '13@qq.com', '13312312312', '1', '1');
INSERT INTO `user` VALUES ('100023', 'test', '1234', '12@11.com', '13123211323', '1', '1');

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `userInfoId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户详情Id',
  `userId` int(11) NOT NULL COMMENT '用户id',
  `userHeaderImage` varchar(255) NOT NULL COMMENT '用户头像',
  `userSex` int(1) NOT NULL DEFAULT '0' COMMENT '用户性别（0保密，1男，2女）',
  `userAddress` varchar(255) DEFAULT NULL COMMENT '用户地址',
  `userRegisterTime` varchar(255) NOT NULL COMMENT '用户注册时间',
  `userNote` text COMMENT '用户签名',
  `userVip` int(1) NOT NULL DEFAULT '0' COMMENT '用户vip等级（0非会员,1大会员，2超级会员）',
  `userBirth` varchar(255) DEFAULT NULL COMMENT '用户出生日期',
  `desoft` int(1) NOT NULL DEFAULT '1' COMMENT '软删标记（1表示存在，0表示删除）',
  PRIMARY KEY (`userInfoId`)
) ENGINE=InnoDB AUTO_INCREMENT=10000006 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('10000001', '100001', '/files/2020-03-28/headImage.jpg', '1', '湖南省永州市', '2020-3-29', '第一天', '2', '1999-02-13', '1');
INSERT INTO `userinfo` VALUES ('10000002', '100022', '/files/2020-03-30/headImage.png', '1', '湖南省永州市', '2020-03-29 20:35:23', '第一天', '2', '1999-02-13', '1');
INSERT INTO `userinfo` VALUES ('10000005', '100023', '/images/header.jpg', '0', null, '2020-04-06 17:31:25', null, '0', null, '1');
