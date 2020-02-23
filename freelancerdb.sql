/*
SQLyog Community Edition- MySQL GUI v8.04 
MySQL - 5.0.37-community-nt : Database - freelancerdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`freelancerdb` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `freelancerdb`;

/*Table structure for table `employer` */

DROP TABLE IF EXISTS `employer`;

CREATE TABLE `employer` (
  `ename` varchar(25) NOT NULL,
  `epassword` varchar(25) default NULL,
  `company` varchar(25) default NULL,
  `email` varchar(30) default NULL,
  `phone` decimal(10,0) default NULL,
  `city` varchar(20) default NULL,
  PRIMARY KEY  (`ename`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employer` */

insert  into `employer`(`ename`,`epassword`,`company`,`email`,`phone`,`city`) values ('bawa','bawa','new','abc@gmail.com','1234567890','indore'),('company1','123','company one','asadj@mail.com','123456789','indore'),('company2','HELLO','New international','newint@mail.com','12354584','indore');

/*Table structure for table `freelancer` */

DROP TABLE IF EXISTS `freelancer`;

CREATE TABLE `freelancer` (
  `fname` varchar(25) NOT NULL,
  `fpassword` varchar(25) default NULL,
  `fullname` varchar(25) default NULL,
  `email` varchar(30) default NULL,
  `age` decimal(3,0) default NULL,
  `phone` decimal(10,0) default NULL,
  `city` decimal(20,0) default NULL,
  PRIMARY KEY  (`fname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `freelancer` */

insert  into `freelancer`(`fname`,`fpassword`,`fullname`,`email`,`age`,`phone`,`city`) values ('aman','111','aman','asssd','21','156515166','0'),('gaurav','12345','gaurav gupta','gau@gmail.com','21','1234567899','0');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
