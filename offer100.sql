/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : localhost:3306
 Source Schema         : offer100

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 28/02/2018 10:55:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for check
-- ----------------------------
DROP TABLE IF EXISTS `check`;
CREATE TABLE `check`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表ID 自增',
  `user_id` int(11) NOT NULL COMMENT '外键，企业用户ID，关联用户表',
  `enterprise_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业营业执照图片地址',
  `enterprise_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业名称',
  `enterprise_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业邮箱',
  `create_time` datetime(6) NOT NULL COMMENT '创建时间、详细时间',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '审核状态，默认 0 待审核，1，审核通过，2 审核不通过',
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '审核不通过原因，默认空',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for enterprise
-- ----------------------------
DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE `enterprise`  (
  `enterprise_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表id,自增',
  `user_id` int(11) NOT NULL COMMENT '外键，关联用户表，企业用户id',
  `enterprise_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业名称',
  `enterprise_logourl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业Logo图片存放地址',
  `enterprise_website` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '企业官网',
  `enterprise_phone` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业联系电话',
  `enterprise_email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业联系邮箱',
  `enterprise_city` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业所在城市',
  `enterprise_sector` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业行业领域',
  `enterprise_scale` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业规模',
  `enterprise_profile` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业简介',
  `enterprise_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '企业介绍',
  PRIMARY KEY (`enterprise_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '企业表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for interview
-- ----------------------------
DROP TABLE IF EXISTS `interview`;
CREATE TABLE `interview`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `resume_id` int(11) NOT NULL COMMENT '外键，简历表id，关联简历基础表',
  `user_id` int(11) NOT NULL COMMENT '外键，企业用户ID，用户表',
  `position_id` int(11) NOT NULL COMMENT '外键，职位ID，关联职位表',
  `interview_time` datetime(0) NOT NULL COMMENT '面试安排时间',
  `interview_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '面试地点',
  `contact_user` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '面试联系人名',
  `contact_phone` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '联系人电话',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '面试状态，默认待确认 0 待面试，1、拒绝面试 2.推迟面试 3.已面试。待面试和推迟面试根据面试和系统时间比较自动更新为已面试',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表ID',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员登录名，唯一',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '登录密码',
  `usertype` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理员类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表id，自增',
  `enterprise_id` int(11) NOT NULL COMMENT '外键，企业id关联企业表',
  `user_id` int(11) NOT NULL COMMENT '外键，企业用户id，关联用户表',
  `position_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位名称',
  `position_category` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位类别，【Java、C++等】',
  `position_num` int(10) NOT NULL COMMENT '职位招聘人数',
  `position_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工作详细地址，如上海 - 杨浦区 - 长阳路1687号长阳创谷',
  `position_city` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '工作城市',
  `position_temptation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位诱惑',
  `position_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位描述',
  `position_minwage` int(11) NOT NULL COMMENT '职位最低工资',
  `position_maxwage` int(11) NOT NULL COMMENT '职位最高工资',
  `position_minexperience` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '最低工作经验【1、2、3..0代表不限，-1代表应届毕业生】',
  `position_maxexperience` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '最高工作经验【1、2、3..0代表不限，-1代表应届毕业生】',
  `position_education` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位学历要求【不限、大专、本科等】',
  `position_creattime` datetime(0) NOT NULL COMMENT '职位创建时间，【年月日时间】',
  `position_nature` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位工作性质，【全职，兼职，实习】',
  `position_label` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '职位标签',
  `position_status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '职位当前状态【0、待审核 1、上线 2、下线 3、审核不通过 -1、逻辑删除】',
  `position_reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '不通过原因，默认为空\r\n',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for post_box
-- ----------------------------
DROP TABLE IF EXISTS `post_box`;
CREATE TABLE `post_box`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表ID，自增',
  `resume_id` int(11) NOT NULL COMMENT '外键，简历表ID，关联简历表',
  `position_id` int(11) NOT NULL COMMENT '职位ID，外键，关联职位表',
  `post_time` datetime(0) NOT NULL COMMENT '简历投递时间，详细时间格式',
  `status` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简历状态，默认，投递成功【0 投递成功，1 通知面试，2 不合适 3 录用 -1、逻辑删除】',
  `reason` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '不合适原因，默认为空',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '投递箱' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for resume_education
-- ----------------------------
DROP TABLE IF EXISTS `resume_education`;
CREATE TABLE `resume_education`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表id，自增',
  `resume_id` int(11) NOT NULL COMMENT '外键，关联用户基础简历表',
  `school_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学校名',
  `school_major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所学专业',
  `school_background` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '同最高学历，专本硕博等',
  `graduation_year` datetime(6) NOT NULL COMMENT '毕业年份',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '教育经验表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for resume_fundation
-- ----------------------------
DROP TABLE IF EXISTS `resume_fundation`;
CREATE TABLE `resume_fundation`  (
  `resume_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL COMMENT '外键，关联用户表',
  `user_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '简历用户姓名',
  `user_gender` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户性别',
  `user_birthday` datetime(6) NOT NULL COMMENT '用户生日，年/月',
  `user_education` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户最高学历【大专、本、硕、博、其它】',
  `user_workyears` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户最高年限【应届毕业生、1、2、3~10、10年以上】',
  `user_city` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '所在城市',
  `user_email` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户邮箱',
  `user_phone` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户电话号码',
  `user_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像地址,可为空',
  `user_selfvaluation` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户一句话自我评价',
  PRIMARY KEY (`resume_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户基础简历表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for resume_interships
-- ----------------------------
DROP TABLE IF EXISTS `resume_interships`;
CREATE TABLE `resume_interships`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表id，主键，自增长',
  `resume_id` int(11) NOT NULL COMMENT '外键，关联用户基础简历表id',
  `intership_enterprise` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '实习企业',
  `intershi_position` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '实习职位',
  `intership_startdate` datetime(6) NOT NULL COMMENT '实习开始时间，年月',
  `intership_enddate` datetime(6) NOT NULL COMMENT '实习结束时间，年月',
  `intership_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '实习内容，可为空',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '简历实习经验表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for resume_introducation
-- ----------------------------
DROP TABLE IF EXISTS `resume_introducation`;
CREATE TABLE `resume_introducation`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表id，自增',
  `resume_id` int(11) NOT NULL COMMENT '外键，关联用户基础简历表',
  `introduce_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '自我描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for resume_project
-- ----------------------------
DROP TABLE IF EXISTS `resume_project`;
CREATE TABLE `resume_project`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '本表id,自增',
  `resume_id` int(11) NOT NULL COMMENT '外键，关联用户基础简历表',
  `project_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '项目名称',
  `project_responsibility` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '你的职责',
  `project_starttime` datetime(6) NOT NULL COMMENT '项目开始时间，年月',
  `project_endtime` datetime(6) NOT NULL COMMENT '项目结束时间，年月',
  `project_details` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '项目描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '简历项目经验表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID，自增',
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户登录名',
  `user_password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户登录密码',
  `user_type` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户类型【企业用户，普通用户或管理员】',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '111', '111', '普通用户');
INSERT INTO `user` VALUES (2, '222', '222', '普通用户');
INSERT INTO `user` VALUES (3, '333', '333', '企业用户');
INSERT INTO `user` VALUES (4, '444', '444', '企业用户');
INSERT INTO `user` VALUES (5, '555', '555', '管理用户');

-- ----------------------------
-- Table structure for user_collection
-- ----------------------------
DROP TABLE IF EXISTS `user_collection`;
CREATE TABLE `user_collection`  (
  `collection_id` int(11) NOT NULL COMMENT '收藏表ID，自增',
  `user_id` int(11) NOT NULL COMMENT '用户ID，外键对应用户表',
  `position_id` int(11) NOT NULL COMMENT '职位ID，外键对应职位表',
  PRIMARY KEY (`collection_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
