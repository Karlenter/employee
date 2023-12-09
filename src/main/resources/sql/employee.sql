/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80034
 Source Host           : localhost:3306
 Source Schema         : demo

 Target Server Type    : MySQL
 Target Server Version : 80034
 File Encoding         : 65001

 Date: 09/12/2023 17:39:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '职工ID 主键',
  `emp_name` varchar(6) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '职工姓名',
  `sex` varchar(2) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '性别 可选范围[男,女]',
  `age` int(0) NULL DEFAULT NULL COMMENT '年龄',
  `dept_name` varchar(25) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '部门名称 可选范围[业务部，后勤部，人事部]',
  `emp_degree_name` varchar(25) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '学历 可选范围[大专，本科，研究生]',
  `delete_flag` int(0) NOT NULL COMMENT '1为未删除 0为删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, '张一', '男', 25, '业务部', '研究生', 1);
INSERT INTO `employee` VALUES (2, '张二', '女', 26, '人事部', '本科', 1);
INSERT INTO `employee` VALUES (3, '张三', '男', 36, '后勤部', '大专', 1);
INSERT INTO `employee` VALUES (4, '张四', '男', 25, '后勤部', '研究生', 1);
INSERT INTO `employee` VALUES (5, '张五', '男', 24, '人事部', '大专', 1);
INSERT INTO `employee` VALUES (6, '张六', '女', 20, '业务部', '本科', 1);
INSERT INTO `employee` VALUES (7, '张七', '女', 26, '人事部', '研究生', 1);
INSERT INTO `employee` VALUES (8, '张八', '女', 23, '人事部', '本科', 1);
INSERT INTO `employee` VALUES (9, '张九', '男', 28, '后勤部', '大专', 1);
INSERT INTO `employee` VALUES (10, '张十', '女', 25, '人事部', '本科', 1);
INSERT INTO `employee` VALUES (11, '李一', '男', 26, '业务部', '研究生', 1);
INSERT INTO `employee` VALUES (12, '李二', '女', 24, '人事部', '大专', 1);
INSERT INTO `employee` VALUES (13, '李二', '男', 21, '人事部', '本科', 1);

SET FOREIGN_KEY_CHECKS = 1;
