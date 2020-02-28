create schema research;

CREATE TABLE `research`.`T_EMPLOYEE` (
  `EMP_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `EMP_DEPT` varchar(255) DEFAULT NULL,
  `EMP_NAME` varchar(255) DEFAULT NULL,
  `EMP_SALARY` double DEFAULT NULL,
  PRIMARY KEY (`EMP_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `research`.`t_employee` (`EMP_ID`,`EMP_DEPT`,`EMP_NAME`,`EMP_SALARY`) VALUES (1,'PD','John',100000000);
INSERT INTO `research`.`t_employee` (`EMP_ID`,`EMP_DEPT`,`EMP_NAME`,`EMP_SALARY`) VALUES (2,'IT','Meera',2000000);
