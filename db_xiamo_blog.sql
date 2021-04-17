/*
 Navicat Premium Data Transfer

 Source Server         : TencentCloud_WordPress
 Source Server Type    : MySQL
 Source Server Version : 50647
 Source Host           : 106.54.34.3:3306
 Source Schema         : db_xiamo_blog

 Target Server Type    : MySQL
 Target Server Version : 50647
 File Encoding         : 65001

 Date: 17/04/2021 13:43:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for flow_hour_count
-- ----------------------------
DROP TABLE IF EXISTS `flow_hour_count`;
CREATE TABLE `flow_hour_count`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `time` char(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '时间',
  `device_id` bigint(20) NOT NULL COMMENT '设备id',
  `count` int(10) NOT NULL DEFAULT 0 COMMENT '统计数',
  `ct` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '添加时间',
  `mt` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `idx_time_deivice`(`time`, `device_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 284 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '客流按设备小时统计表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of flow_hour_count
-- ----------------------------
INSERT INTO `flow_hour_count` VALUES (220, '2021040713', 3, 48, '2021-04-07 13:10:20', '2021-04-07 13:57:51');
INSERT INTO `flow_hour_count` VALUES (221, '2021040714', 3, 82, '2021-04-07 14:00:22', '2021-04-07 14:59:54');
INSERT INTO `flow_hour_count` VALUES (222, '2021040715', 3, 35, '2021-04-07 15:05:02', '2021-04-07 15:57:41');
INSERT INTO `flow_hour_count` VALUES (223, '2021040716', 3, 60, '2021-04-07 16:00:19', '2021-04-07 16:59:42');
INSERT INTO `flow_hour_count` VALUES (224, '2021040717', 3, 48, '2021-04-07 17:01:01', '2021-04-07 17:58:23');
INSERT INTO `flow_hour_count` VALUES (225, '2021040718', 3, 39, '2021-04-07 18:00:36', '2021-04-07 18:57:48');
INSERT INTO `flow_hour_count` VALUES (226, '2021040719', 3, 4, '2021-04-07 19:25:33', '2021-04-07 19:51:40');
INSERT INTO `flow_hour_count` VALUES (227, '2021040720', 3, 10, '2021-04-07 20:02:46', '2021-04-07 20:58:09');
INSERT INTO `flow_hour_count` VALUES (228, '2021040721', 3, 1, '2021-04-07 21:12:11', '2021-04-07 21:12:11');
INSERT INTO `flow_hour_count` VALUES (229, '2021040722', 3, 3, '2021-04-07 22:12:32', '2021-04-07 22:45:09');
INSERT INTO `flow_hour_count` VALUES (230, '2021040807', 3, 5, '2021-04-08 07:04:18', '2021-04-08 07:58:55');
INSERT INTO `flow_hour_count` VALUES (231, '2021040808', 3, 45, '2021-04-08 08:01:54', '2021-04-08 08:56:23');
INSERT INTO `flow_hour_count` VALUES (232, '2021040809', 3, 93, '2021-04-08 09:00:18', '2021-04-08 09:59:12');
INSERT INTO `flow_hour_count` VALUES (233, '2021040810', 3, 49, '2021-04-08 10:01:56', '2021-04-08 10:59:12');
INSERT INTO `flow_hour_count` VALUES (234, '2021040811', 3, 37, '2021-04-08 11:04:25', '2021-04-08 11:57:23');
INSERT INTO `flow_hour_count` VALUES (235, '2021040812', 3, 2, '2021-04-08 12:04:48', '2021-04-08 12:44:58');
INSERT INTO `flow_hour_count` VALUES (236, '2021040813', 3, 2, '2021-04-08 13:02:19', '2021-04-08 13:03:22');
INSERT INTO `flow_hour_count` VALUES (237, '2021040814', 3, 3, '2021-04-08 14:14:31', '2021-04-08 14:58:54');
INSERT INTO `flow_hour_count` VALUES (238, '2021040815', 3, 11, '2021-04-08 15:17:14', '2021-04-08 15:53:34');
INSERT INTO `flow_hour_count` VALUES (239, '2021040816', 3, 23, '2021-04-08 16:18:31', '2021-04-08 16:59:44');
INSERT INTO `flow_hour_count` VALUES (240, '2021040817', 3, 21, '2021-04-08 17:03:21', '2021-04-08 17:56:22');
INSERT INTO `flow_hour_count` VALUES (241, '2021040818', 3, 17, '2021-04-08 18:08:39', '2021-04-08 18:48:34');
INSERT INTO `flow_hour_count` VALUES (242, '2021040819', 3, 4, '2021-04-08 19:15:38', '2021-04-08 19:54:36');
INSERT INTO `flow_hour_count` VALUES (243, '2021040820', 3, 2, '2021-04-08 20:10:20', '2021-04-08 20:50:30');
INSERT INTO `flow_hour_count` VALUES (244, '2021040822', 3, 1, '2021-04-08 22:56:06', '2021-04-08 22:56:06');
INSERT INTO `flow_hour_count` VALUES (245, '2021040907', 3, 2, '2021-04-09 07:52:16', '2021-04-09 07:58:40');
INSERT INTO `flow_hour_count` VALUES (246, '2021040908', 3, 32, '2021-04-09 08:24:03', '2021-04-09 08:59:50');
INSERT INTO `flow_hour_count` VALUES (247, '2021040909', 3, 69, '2021-04-09 09:00:32', '2021-04-09 09:59:00');
INSERT INTO `flow_hour_count` VALUES (248, '2021040910', 3, 38, '2021-04-09 10:05:34', '2021-04-09 10:56:48');
INSERT INTO `flow_hour_count` VALUES (249, '2021040911', 3, 61, '2021-04-09 11:00:10', '2021-04-09 11:40:42');
INSERT INTO `flow_hour_count` VALUES (250, '2021040912', 3, 11, '2021-04-09 12:02:55', '2021-04-09 12:46:02');
INSERT INTO `flow_hour_count` VALUES (251, '2021040913', 3, 6, '2021-04-09 13:01:48', '2021-04-09 13:57:19');
INSERT INTO `flow_hour_count` VALUES (252, '2021040914', 3, 34, '2021-04-09 14:01:13', '2021-04-09 14:58:25');
INSERT INTO `flow_hour_count` VALUES (253, '2021040915', 3, 54, '2021-04-09 15:01:59', '2021-04-09 15:44:39');
INSERT INTO `flow_hour_count` VALUES (254, '2021040922', 3, 1, '2021-04-09 22:17:31', '2021-04-09 22:17:30');
INSERT INTO `flow_hour_count` VALUES (255, '2021041008', 3, 2, '2021-04-10 08:39:58', '2021-04-10 08:52:21');
INSERT INTO `flow_hour_count` VALUES (256, '2021041013', 3, 1, '2021-04-10 13:24:10', '2021-04-10 13:24:09');
INSERT INTO `flow_hour_count` VALUES (257, '2021041019', 3, 1, '2021-04-10 19:30:51', '2021-04-10 19:30:50');
INSERT INTO `flow_hour_count` VALUES (258, '2021041113', 3, 1, '2021-04-11 13:39:31', '2021-04-11 13:39:30');
INSERT INTO `flow_hour_count` VALUES (259, '2021041114', 3, 1, '2021-04-11 14:30:26', '2021-04-11 14:30:31');
INSERT INTO `flow_hour_count` VALUES (260, '2021041207', 3, 1, '2021-04-12 07:44:35', '2021-04-12 07:44:34');
INSERT INTO `flow_hour_count` VALUES (261, '2021041208', 3, 12, '2021-04-12 08:31:32', '2021-04-12 08:59:02');
INSERT INTO `flow_hour_count` VALUES (262, '2021041209', 3, 26, '2021-04-12 09:04:00', '2021-04-12 09:53:59');
INSERT INTO `flow_hour_count` VALUES (263, '2021041210', 3, 9, '2021-04-12 10:06:25', '2021-04-12 10:46:28');
INSERT INTO `flow_hour_count` VALUES (264, '2021041211', 3, 8, '2021-04-12 11:05:54', '2021-04-12 11:22:12');
INSERT INTO `flow_hour_count` VALUES (265, '2021041216', 3, 39, '2021-04-12 16:04:02', '2021-04-12 16:57:51');
INSERT INTO `flow_hour_count` VALUES (266, '2021041217', 3, 99, '2021-04-12 17:00:42', '2021-04-12 17:59:18');
INSERT INTO `flow_hour_count` VALUES (267, '2021041218', 3, 54, '2021-04-12 18:00:29', '2021-04-12 18:56:15');
INSERT INTO `flow_hour_count` VALUES (268, '2021041219', 3, 33, '2021-04-12 19:05:49', '2021-04-12 19:48:09');
INSERT INTO `flow_hour_count` VALUES (269, '2021041220', 3, 34, '2021-04-12 20:03:14', '2021-04-12 20:54:58');
INSERT INTO `flow_hour_count` VALUES (270, '2021041308', 3, 41, '2021-04-13 08:16:44', '2021-04-13 08:59:33');
INSERT INTO `flow_hour_count` VALUES (271, '2021041309', 3, 49, '2021-04-13 09:00:49', '2021-04-13 09:58:13');
INSERT INTO `flow_hour_count` VALUES (272, '2021041310', 3, 46, '2021-04-13 10:01:14', '2021-04-13 10:49:56');
INSERT INTO `flow_hour_count` VALUES (273, '2021041313', 3, 8, '2021-04-13 13:20:02', '2021-04-13 13:59:02');
INSERT INTO `flow_hour_count` VALUES (274, '2021041314', 3, 26, '2021-04-13 14:01:53', '2021-04-13 14:53:41');
INSERT INTO `flow_hour_count` VALUES (275, '2021041315', 3, 42, '2021-04-13 15:05:22', '2021-04-13 15:59:47');
INSERT INTO `flow_hour_count` VALUES (276, '2021041316', 3, 44, '2021-04-13 16:02:44', '2021-04-13 16:59:43');
INSERT INTO `flow_hour_count` VALUES (277, '2021041317', 3, 27, '2021-04-13 17:00:03', '2021-04-13 17:59:59');
INSERT INTO `flow_hour_count` VALUES (278, '2021041318', 3, 23, '2021-04-13 18:00:07', '2021-04-13 19:00:00');
INSERT INTO `flow_hour_count` VALUES (279, '2021041319', 3, 22, '2021-04-13 19:06:54', '2021-04-13 19:59:47');
INSERT INTO `flow_hour_count` VALUES (280, '2021041320', 3, 12, '2021-04-13 20:00:18', '2021-04-13 20:27:13');
INSERT INTO `flow_hour_count` VALUES (281, '2021041323', 3, 1, '2021-04-13 23:06:20', '2021-04-13 23:06:20');
INSERT INTO `flow_hour_count` VALUES (282, '2021041407', 3, 1, '2021-04-14 07:40:45', '2021-04-14 07:40:45');
INSERT INTO `flow_hour_count` VALUES (283, '2021041408', 3, 4, '2021-04-14 08:00:13', '2021-04-14 08:27:05');

-- ----------------------------
-- Table structure for tb_access_log
-- ----------------------------
DROP TABLE IF EXISTS `tb_access_log`;
CREATE TABLE `tb_access_log`  (
  `id` int(255) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `ipaddress` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'ip地址',
  `province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'ip所在省',
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'ip所在城市',
  `latandlon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '经纬度',
  `access_api` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '访问的api地址',
  `access_time` datetime(0) NULL DEFAULT NULL COMMENT '访问时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 114 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_access_log
-- ----------------------------
INSERT INTO `tb_access_log` VALUES (1, '58.45.31.185', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://pwr9ey.natappfree.cc/common/getLaJiHua', '2021-03-09 03:11:22');
INSERT INTO `tb_access_log` VALUES (2, '58.45.31.185', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-09 03:24:37');
INSERT INTO `tb_access_log` VALUES (3, '58.45.31.185', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-09 03:26:23');
INSERT INTO `tb_access_log` VALUES (4, '58.45.31.185', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-09 03:27:34');
INSERT INTO `tb_access_log` VALUES (5, '116.162.0.88', '[]', '[]', '[]', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-09 03:27:48');
INSERT INTO `tb_access_log` VALUES (6, '116.162.0.88', '[]', '[]', '[]', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-09 03:27:52');
INSERT INTO `tb_access_log` VALUES (7, '58.45.31.185', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-09 03:37:52');
INSERT INTO `tb_access_log` VALUES (8, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:03');
INSERT INTO `tb_access_log` VALUES (9, '61.129.11.211', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:09');
INSERT INTO `tb_access_log` VALUES (10, '117.136.118.187', '[]', '[]', '[]', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:15');
INSERT INTO `tb_access_log` VALUES (11, '123.122.45.220', '北京市', '北京市', '116.0119343,39.66127144;116.7829835,40.2164962', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:16');
INSERT INTO `tb_access_log` VALUES (12, '117.136.118.187', '[]', '[]', '[]', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:20');
INSERT INTO `tb_access_log` VALUES (13, '117.136.118.187', '[]', '[]', '[]', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:25');
INSERT INTO `tb_access_log` VALUES (14, '112.96.106.62', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:29');
INSERT INTO `tb_access_log` VALUES (15, '112.96.106.62', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:31');
INSERT INTO `tb_access_log` VALUES (16, '114.95.209.219', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:38');
INSERT INTO `tb_access_log` VALUES (17, '101.80.46.232', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:43');
INSERT INTO `tb_access_log` VALUES (18, '114.95.209.219', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:49:59');
INSERT INTO `tb_access_log` VALUES (19, '101.80.46.232', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:50:17');
INSERT INTO `tb_access_log` VALUES (20, '123.122.45.220', '北京市', '北京市', '116.0119343,39.66127144;116.7829835,40.2164962', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:50:40');
INSERT INTO `tb_access_log` VALUES (21, '223.104.25.240', '重庆市', '重庆市', '106.2832832,29.36962828;106.8138242,29.7401968', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:50:47');
INSERT INTO `tb_access_log` VALUES (22, '223.104.25.240', '重庆市', '重庆市', '106.2832832,29.36962828;106.8138242,29.7401968', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:52:30');
INSERT INTO `tb_access_log` VALUES (23, '223.104.25.240', '重庆市', '重庆市', '106.2832832,29.36962828;106.8138242,29.7401968', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:52:35');
INSERT INTO `tb_access_log` VALUES (24, '101.80.46.232', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:52:40');
INSERT INTO `tb_access_log` VALUES (25, '223.104.25.240', '重庆市', '重庆市', '106.2832832,29.36962828;106.8138242,29.7401968', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:53:16');
INSERT INTO `tb_access_log` VALUES (26, '117.136.118.187', '[]', '[]', '[]', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:53:20');
INSERT INTO `tb_access_log` VALUES (27, '223.104.25.240', '重庆市', '重庆市', '106.2832832,29.36962828;106.8138242,29.7401968', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:53:23');
INSERT INTO `tb_access_log` VALUES (28, '223.104.25.240', '重庆市', '重庆市', '106.2832832,29.36962828;106.8138242,29.7401968', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:53:38');
INSERT INTO `tb_access_log` VALUES (29, '101.80.46.232', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:53:40');
INSERT INTO `tb_access_log` VALUES (30, '223.104.25.240', '重庆市', '重庆市', '106.2832832,29.36962828;106.8138242,29.7401968', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:53:45');
INSERT INTO `tb_access_log` VALUES (31, '101.80.46.232', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:53:47');
INSERT INTO `tb_access_log` VALUES (32, '101.80.46.232', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:53:51');
INSERT INTO `tb_access_log` VALUES (33, '101.80.46.232', '上海市', '上海市', '120.8397067,30.77980118;122.1137989,31.66889673', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:54:03');
INSERT INTO `tb_access_log` VALUES (34, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:57:44');
INSERT INTO `tb_access_log` VALUES (35, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 02:59:06');
INSERT INTO `tb_access_log` VALUES (36, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:04:32');
INSERT INTO `tb_access_log` VALUES (37, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:04:37');
INSERT INTO `tb_access_log` VALUES (38, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:04:39');
INSERT INTO `tb_access_log` VALUES (39, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:04:40');
INSERT INTO `tb_access_log` VALUES (40, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:04:41');
INSERT INTO `tb_access_log` VALUES (41, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:04:41');
INSERT INTO `tb_access_log` VALUES (42, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:04:42');
INSERT INTO `tb_access_log` VALUES (43, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:04:43');
INSERT INTO `tb_access_log` VALUES (44, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:05:25');
INSERT INTO `tb_access_log` VALUES (45, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:05:26');
INSERT INTO `tb_access_log` VALUES (46, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:05:32');
INSERT INTO `tb_access_log` VALUES (47, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:05:33');
INSERT INTO `tb_access_log` VALUES (48, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:05:34');
INSERT INTO `tb_access_log` VALUES (49, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:05:34');
INSERT INTO `tb_access_log` VALUES (50, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:06:34');
INSERT INTO `tb_access_log` VALUES (51, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:07:23');
INSERT INTO `tb_access_log` VALUES (52, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:07:34');
INSERT INTO `tb_access_log` VALUES (53, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:44:14');
INSERT INTO `tb_access_log` VALUES (54, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:44:16');
INSERT INTO `tb_access_log` VALUES (55, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:44:54');
INSERT INTO `tb_access_log` VALUES (56, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 03:45:01');
INSERT INTO `tb_access_log` VALUES (57, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 05:48:32');
INSERT INTO `tb_access_log` VALUES (58, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://127.0.0.1:8020/common/getLaJiHua', '2021-03-19 05:48:35');
INSERT INTO `tb_access_log` VALUES (61, '58.45.73.238', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-19 06:01:13');
INSERT INTO `tb_access_log` VALUES (94, '58.45.73.195', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-22 10:42:03');
INSERT INTO `tb_access_log` VALUES (95, '117.136.32.96', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-22 10:44:54');
INSERT INTO `tb_access_log` VALUES (96, '117.136.32.96', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=46387922c771d74fe1f5b758ff00fea3', '2021-03-22 10:44:57');
INSERT INTO `tb_access_log` VALUES (97, '117.151.233.3', '湖北省', '鄂州市', '114.8134911,30.31371857;114.977653,30.4465741', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-22 10:45:50');
INSERT INTO `tb_access_log` VALUES (98, '117.151.233.3', '湖北省', '鄂州市', '114.8134911,30.31371857;114.977653,30.4465741', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=32c71f35fa2460a28295160a8a9b460c', '2021-03-22 10:45:52');
INSERT INTO `tb_access_log` VALUES (99, '117.151.233.3', '湖北省', '鄂州市', '114.8134911,30.31371857;114.977653,30.4465741', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-22 10:46:03');
INSERT INTO `tb_access_log` VALUES (100, '117.151.233.3', '湖北省', '鄂州市', '114.8134911,30.31371857;114.977653,30.4465741', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=32c71f35fa2460a28295160a8a9b460c', '2021-03-22 10:46:05');
INSERT INTO `tb_access_log` VALUES (101, '117.151.233.3', '湖北省', '鄂州市', '114.8134911,30.31371857;114.977653,30.4465741', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=32c71f35fa2460a28295160a8a9b460c', '2021-03-22 10:46:08');
INSERT INTO `tb_access_log` VALUES (102, '117.151.233.3', '湖北省', '鄂州市', '114.8134911,30.31371857;114.977653,30.4465741', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=32c71f35fa2460a28295160a8a9b460c', '2021-03-22 10:46:11');
INSERT INTO `tb_access_log` VALUES (103, '117.151.233.3', '湖北省', '鄂州市', '114.8134911,30.31371857;114.977653,30.4465741', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=32c71f35fa2460a28295160a8a9b460c', '2021-03-22 10:46:13');
INSERT INTO `tb_access_log` VALUES (104, '113.222.8.12', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-22 10:47:37');
INSERT INTO `tb_access_log` VALUES (105, '58.45.73.195', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-22 11:19:46');
INSERT INTO `tb_access_log` VALUES (106, '117.136.32.96', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-22 14:49:35');
INSERT INTO `tb_access_log` VALUES (107, '117.136.32.96', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=46387922c771d74fe1f5b758ff00fea3', '2021-03-22 14:49:38');
INSERT INTO `tb_access_log` VALUES (108, '117.136.32.96', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=46387922c771d74fe1f5b758ff00fea3', '2021-03-22 14:49:49');
INSERT INTO `tb_access_log` VALUES (109, '117.136.32.96', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=46387922c771d74fe1f5b758ff00fea3', '2021-03-22 14:49:55');
INSERT INTO `tb_access_log` VALUES (110, '117.136.32.96', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=46387922c771d74fe1f5b758ff00fea3', '2021-03-22 14:50:01');
INSERT INTO `tb_access_log` VALUES (111, '117.136.32.96', '广东省', '广州市', '113.1017375,22.93212254;113.6770499,23.3809537', 'http://xiamo.nat300.top/common/getLaJiHua?continueFlag=46387922c771d74fe1f5b758ff00fea3', '2021-03-22 14:50:36');
INSERT INTO `tb_access_log` VALUES (112, '58.45.30.205', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-23 01:22:01');
INSERT INTO `tb_access_log` VALUES (113, '58.45.30.205', '湖南省', '株洲市', '113.0271399,27.75179758;113.27209,27.92912825', 'http://xiamo.nat300.top/common/getLaJiHua', '2021-03-23 01:22:35');

-- ----------------------------
-- Table structure for tb_blog
-- ----------------------------
DROP TABLE IF EXISTS `tb_blog`;
CREATE TABLE `tb_blog`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '博客内容',
  `title` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '标题',
  `content_mini` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '内容缩略(列表)',
  `cover_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '封面图',
  `creator` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建者',
  `creator_nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建者昵称',
  `view` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文章点击数',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_blog
-- ----------------------------
INSERT INTO `tb_blog` VALUES (11, '<h1>emmm</h1><p><img src=\"https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/202104121930167192076.jpg\"></p>', 'emmm', 'emmm\n\n', 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021041219303284397049.png', '1', 'xiamo', '0', '2021-04-12 19:30:37', '2021-04-12 19:30:37');

-- ----------------------------
-- Table structure for tb_comment
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment`;
CREATE TABLE `tb_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `title` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '标题',
  `blog_id` int(11) NULL DEFAULT NULL COMMENT '博客表id',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `tb_comment_tb_blog_id_fk`(`blog_id`) USING BTREE,
  CONSTRAINT `tb_comment_tb_blog_id_fk` FOREIGN KEY (`blog_id`) REFERENCES `tb_blog` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_comment
-- ----------------------------
INSERT INTO `tb_comment` VALUES (13, 'emmm', 11, '2021-04-12 19:30:37', '2021-04-12 19:30:37');

-- ----------------------------
-- Table structure for tb_comment_detail
-- ----------------------------
DROP TABLE IF EXISTS `tb_comment_detail`;
CREATE TABLE `tb_comment_detail`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `parent_id` int(11) NOT NULL COMMENT '父表id',
  `pid` int(11) NULL DEFAULT NULL COMMENT '父级id',
  `content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '评论内容',
  `comment_status` tinyint(1) NULL DEFAULT NULL COMMENT '评论状态(0删除1隐藏2展示)',
  `create_by` int(11) NULL DEFAULT NULL COMMENT '评论者用户id',
  `is_user` tinyint(1) NULL DEFAULT NULL COMMENT '用户是否在用户表内(0否1是)',
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '评论者昵称',
  `qq` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '评论者qq',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '评论者邮箱',
  `ip_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '评论者ip地址',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '评论者头像地址',
  `city` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市',
  `province` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `commont_pid`(`pid`) USING BTREE,
  INDEX `tb_comment_detail_tb_comment_id_fk`(`parent_id`) USING BTREE,
  CONSTRAINT `tb_comment_detail_tb_comment_id_fk` FOREIGN KEY (`parent_id`) REFERENCES `tb_comment` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_comment_detail
-- ----------------------------
INSERT INTO `tb_comment_detail` VALUES (38, 13, NULL, 'emmm', 2, 1, 1, '浅末saki', '1499147526', '1499147526@qq.com', '58.45.74.244', 'http://q1.qlogo.cn/g?b=qq&nk=1499147526&s=640', '株洲市', '湖南省', '2021-04-12 19:31:53');
INSERT INTO `tb_comment_detail` VALUES (39, 13, NULL, '[img]https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021041515212375250358.png[/img][img]https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021041515213636557974.jpg[/img]\nemmm', 2, NULL, NULL, '浅末saki', '1499147526', '1499147526@qq.com', '58.45.29.34', 'http://q1.qlogo.cn/g?b=qq&nk=1499147526&s=640', '株洲市', '湖南省', '2021-04-15 15:21:40');
INSERT INTO `tb_comment_detail` VALUES (40, 13, NULL, '[img]https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021041619152695639400.jpg[/img]\nemm', 2, NULL, NULL, 'xiamo', '1499147502', '1499147502@qq.com', '58.152.172.11', 'http://q1.qlogo.cn/g?b=qq&nk=1499147502&s=640', '香港特别行政区', '香港特别行政区', '2021-04-16 19:15:52');
INSERT INTO `tb_comment_detail` VALUES (41, 13, 40, '[img]https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/202104161917241234438.png[/img]\nemmmm', 2, NULL, NULL, 'xiamo', '1499147502', '1499147502@qq.com', '58.45.29.116', 'http://q1.qlogo.cn/g?b=qq&nk=1499147502&s=640', '株洲市', '湖南省', '2021-04-16 19:17:34');

-- ----------------------------
-- Table structure for tb_emoji
-- ----------------------------
DROP TABLE IF EXISTS `tb_emoji`;
CREATE TABLE `tb_emoji`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type_id` int(11) NULL DEFAULT NULL COMMENT '表情分类id',
  `emoji_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '表情图地址',
  `is_dynamic` tinyint(1) NULL DEFAULT NULL COMMENT '是否动图(0否1是)',
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `emoji_pid`(`type_id`) USING BTREE,
  CONSTRAINT `emoji_pid` FOREIGN KEY (`type_id`) REFERENCES `tb_emoji_type` (`id`) ON DELETE CASCADE ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_emoji
-- ----------------------------
INSERT INTO `tb_emoji` VALUES (5, NULL, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040611401196423112.jfif', NULL, NULL, '2021-04-06 11:40:13', '2021-04-06 11:40:13');
INSERT INTO `tb_emoji` VALUES (7, NULL, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040611450337490205.jpg', NULL, '1', '2021-04-06 11:45:05', '2021-04-06 11:45:05');
INSERT INTO `tb_emoji` VALUES (8, NULL, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040613014427633095.JPG', NULL, '1', '2021-04-06 13:02:04', '2021-04-06 13:02:04');
INSERT INTO `tb_emoji` VALUES (9, NULL, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040613021534712451.jpg', NULL, '1', '2021-04-06 13:02:17', '2021-04-06 13:02:17');

-- ----------------------------
-- Table structure for tb_emoji_type
-- ----------------------------
DROP TABLE IF EXISTS `tb_emoji_type`;
CREATE TABLE `tb_emoji_type`  (
  `id` int(11) NOT NULL COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `create_by` int(10) NULL DEFAULT NULL COMMENT '创建者id',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tb_file
-- ----------------------------
DROP TABLE IF EXISTS `tb_file`;
CREATE TABLE `tb_file`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type_id` int(11) NULL DEFAULT NULL COMMENT '文件类型表id',
  `url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '文件地址',
  `ip_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '上传文件的ip地址',
  `create_by` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '上传者用户id',
  `file_status` tinyint(4) NULL DEFAULT NULL COMMENT '状态(0失效1有效)',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `file_pid`(`type_id`, `file_status`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_file
-- ----------------------------
INSERT INTO `tb_file` VALUES (3, 0, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040810413851988815.jpg', '127.0.0.1', '1', 1, '2021-04-08 10:41:47', '2021-04-08 10:41:48');
INSERT INTO `tb_file` VALUES (4, 0, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040811241255746363.jpg', '127.0.0.1', '1', 1, '2021-04-08 11:24:18', '2021-04-08 11:24:18');
INSERT INTO `tb_file` VALUES (7, 1, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040811264727886151.mp4', '127.0.0.1', '1', 1, '2021-04-08 11:27:19', '2021-04-08 11:27:19');
INSERT INTO `tb_file` VALUES (8, 1, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040816373172563869.mp4', '127.0.0.1', '1', 1, '2021-04-08 16:37:33', '2021-04-08 16:37:33');
INSERT INTO `tb_file` VALUES (9, 1, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040816374940526785.mp4', '127.0.0.1', '1', 1, '2021-04-08 16:37:54', '2021-04-08 16:37:54');
INSERT INTO `tb_file` VALUES (10, 0, 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021041004472500896694.jpg', '0:0:0:0:0:0:0:1', '1', 1, '2021-04-10 04:47:30', '2021-04-10 04:47:30');

-- ----------------------------
-- Table structure for tb_file_type
-- ----------------------------
DROP TABLE IF EXISTS `tb_file_type`;
CREATE TABLE `tb_file_type`  (
  `id` int(11) NOT NULL COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '类型名',
  `create_by` int(11) NULL DEFAULT NULL COMMENT '创建者用户id',
  `type_status` tinyint(4) NULL DEFAULT NULL COMMENT '类型状态(0失效1有效)',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `id`(`id`, `type_status`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_file_type
-- ----------------------------
INSERT INTO `tb_file_type` VALUES (0, '图片', NULL, NULL, '2021-04-08 10:19:04', '2021-04-08 10:19:07');
INSERT INTO `tb_file_type` VALUES (1, '视频', NULL, NULL, '2021-04-08 10:19:05', '2021-04-08 10:19:07');
INSERT INTO `tb_file_type` VALUES (2, '其他', NULL, NULL, '2021-04-08 10:19:06', '2021-04-08 10:19:08');

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type_id` int(11) NULL DEFAULT NULL COMMENT '用户类型',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `nickname` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像地址',
  `gender` tinyint(1) NULL DEFAULT NULL COMMENT '性别(0男1女)',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '地址',
  `token` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'token(用户登陆每次登陆都会刷新)',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `type_id`(`type_id`) USING BTREE,
  CONSTRAINT `tb_user_tb_user_type_id_fk` FOREIGN KEY (`type_id`) REFERENCES `tb_user_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 1, 'xiamo', '1447fe1faf3a2aed53c55b8b53f67f87', 'xiamo', 'https://xiamo.oss-cn-shenzhen.aliyuncs.com/xiamo/avatar/acb96e986eb0ac7e456c3c7f3665a59.jpg', 0, NULL, '5a8b498e-de77-4720-b20a-dee7350d933b', '2021-03-31 11:55:25', '2021-03-31 11:55:28');
INSERT INTO `tb_user` VALUES (5, 2, 'ceshi', 'cc17c30cd111c7215fc8f51f8790e0e1', 'ceshi', 'https://xiamo.oss-accelerate.aliyuncs.com/xiamo_avatar/2021040613023761725991.JPG', 0, NULL, '7bcfda67-6206-4af0-afc9-69cb8ef69afb', '2021-04-06 13:02:39', '2021-04-06 13:02:39');

-- ----------------------------
-- Table structure for tb_user_type
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_type`;
CREATE TABLE `tb_user_type`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of tb_user_type
-- ----------------------------
INSERT INTO `tb_user_type` VALUES (1, '管理员');
INSERT INTO `tb_user_type` VALUES (2, '普通用户');

SET FOREIGN_KEY_CHECKS = 1;
