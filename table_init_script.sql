create database mybatis;
use mybatis;
CREATE TABLE t_user(id INT PRIMARY KEY AUTO_INCREMENT, c_name VARCHAR(20), c_age INT);
INSERT INTO t_user(c_name, c_age) VALUES('张三', 27);
INSERT INTO t_user(c_name, c_age) VALUES('李四', 28);