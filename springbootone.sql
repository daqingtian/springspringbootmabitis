/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : springbootone

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-11-03 01:47:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `stu_no` int(2) unsigned zerofill NOT NULL AUTO_INCREMENT COMMENT '学员编号',
  `stu_name` varchar(30) NOT NULL COMMENT '学员姓名',
  `stu_sex` varchar(3) NOT NULL COMMENT '学员性别',
  `stu_age` tinyint(2) unsigned zerofill DEFAULT NULL COMMENT '学员年代',
  `grade` double(5,2) unsigned zerofill DEFAULT NULL COMMENT '成绩',
  `class_no` int(2) unsigned zerofill DEFAULT NULL COMMENT '所在班级编号',
  PRIMARY KEY (`stu_no`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('01', '李白', '男', '18', '60.00', '01');
INSERT INTO `student` VALUES ('02', '杜甫', '男', '20', '76.00', '01');
INSERT INTO `student` VALUES ('03', '张飞', '男', '32', '80.00', '02');
INSERT INTO `student` VALUES ('04', '韩信', '男', '26', '98.00', '02');
INSERT INTO `student` VALUES ('05', '了龙', '男', '27', '56.00', '02');
INSERT INTO `student` VALUES ('06', '大乔', '女', '17', '88.00', '01');
INSERT INTO `student` VALUES ('07', '小乔', '女', '16', '96.00', '01');
INSERT INTO `student` VALUES ('08', '小乔', '女', '16', '90.00', '01');
INSERT INTO `student` VALUES ('09', '关哥', '男', '32', '80.00', '02');
INSERT INTO `student` VALUES ('10', '刘备', '男', '36', '98.00', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(4) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `address` char(32) NOT NULL COMMENT '用户地址',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'AA', 'address', '2017-11-02', '男');
