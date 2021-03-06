DROP DATABASE parking02;

# 创建数据库 parking02
CREATE DATABASE parking02;
# 使用数据库 
USE parking02;

# 删除管理员表
DROP TABLE t_admin;

# 创建表
# 创建管理员表
CREATE TABLE t_admin(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	userName VARCHAR(255) DEFAULT NULL,
	userPassword VARCHAR(255) DEFAULT NULL
);

# 插入数据
INSERT INTO t_admin VALUES(NULL,'张三','123456');
INSERT INTO t_admin VALUES(NULL,'李四','123456');
INSERT INTO t_admin VALUES(NULL,'王五','123456');
INSERT INTO t_admin VALUES(NULL,'赵柳','123456');

# 查询数据
SELECT * FROM t_admin;


#删除数据
DELETE FROM t_admin WHERE id = '3';


# 对表进行重新排序`t_admin`
ALTER TABLE t_admin DROP COLUMN id;
ALTER TABLE t_admin ADD id MEDIUMINT(8) NOT NULL PRIMARY KEY AUTO_INCREMENT FIRST;


# 删除用户信息表
DROP TABLE t_userinfo;

# 创建用户信息表`t_userinfo`

CREATE TABLE t_userinfo(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	uername VARCHAR(255) DEFAULT NULL,
	pwd VARCHAR(255) DEFAULT NULL,
	age INT DEFAULT NULL,
	tel VARCHAR(11) DEFAULT NULL,
	money INT DEFAULT NULL
);

# 插入表数据
INSERT INTO t_userinfo VALUES(NULL,'张三','123131',22,'18629550754',1000);
INSERT INTO t_userinfo VALUES(NULL,'李四','123456',22,'18392139133',800);
INSERT INTO t_userinfo VALUES(NULL,'王五','123131',22,'18392162126',500)

#删除车辆信息表
DROP TABLE t_che;

# 创建车辆信息表
CREATE TABLE t_che(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	hao VARCHAR(255) DEFAULT NULL,
	leixing VARCHAR(255) DEFAULT NULL,
	picture VARCHAR(255) DEFAULT NULL,
	info VARCHAR(255) DEFAULT NULL,
	uid INT DEFAULT NULL
);

# 删除车位信息表
DROP TABLE t_chewei;

# 创建车位信息
CREATE TABLE t_chewei(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	hao VARCHAR(255) DEFAULT NULL,
	info VARCHAR(255) DEFAULT NULL,
	quyu VARCHAR(255) DEFAULT NULL,
	chepai VARCHAR(255) DEFAULT NULL,
	adate VARCHAR(255) DEFAULT NULL
);

# 删除车费标准表
DROP TABLE t_fei;
# 创建车费标准表
CREATE TABLE t_fei(
	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
	price INT 
);
