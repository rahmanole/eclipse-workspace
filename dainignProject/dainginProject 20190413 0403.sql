-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.43-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema dainingproject
--

CREATE DATABASE IF NOT EXISTS dainingproject;
USE dainingproject;

--
-- Definition of table `current_meal_status`
--

DROP TABLE IF EXISTS `current_meal_status`;
CREATE TABLE `current_meal_status` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `card_no` int(5) DEFAULT NULL,
  `on_or_off` varchar(5) DEFAULT 'on',
  PRIMARY KEY (`id`),
  UNIQUE KEY `card_no` (`card_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `current_meal_status`
--

/*!40000 ALTER TABLE `current_meal_status` DISABLE KEYS */;
INSERT INTO `current_meal_status` (`id`,`card_no`,`on_or_off`) VALUES 
 (1,44,'on'),
 (2,45,'on'),
 (3,46,'on'),
 (4,47,'on'),
 (5,48,'on'),
 (6,49,'on'),
 (7,50,'on');
/*!40000 ALTER TABLE `current_meal_status` ENABLE KEYS */;


--
-- Definition of table `dept_names`
--

DROP TABLE IF EXISTS `dept_names`;
CREATE TABLE `dept_names` (
  `id` int(4) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dept_names`
--

/*!40000 ALTER TABLE `dept_names` DISABLE KEYS */;
INSERT INTO `dept_names` (`id`,`dept_name`) VALUES 
 (1,'Physics'),
 (2,'Chemistry'),
 (3,'Mathematics'),
 (4,'CSE'),
 (5,'Zoology'),
 (6,'Staistics');
/*!40000 ALTER TABLE `dept_names` ENABLE KEYS */;


--
-- Definition of table `manager`
--

DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `card_no` int(5) DEFAULT NULL,
  `month_name` varchar(10) DEFAULT NULL,
  `year` varchar(5) DEFAULT NULL,
  `pin` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manager`
--

/*!40000 ALTER TABLE `manager` DISABLE KEYS */;
INSERT INTO `manager` (`id`,`card_no`,`month_name`,`year`,`pin`) VALUES 
 (1,44,'March','2019','803yf7o'),
 (2,46,'March','2019','763by8a');
/*!40000 ALTER TABLE `manager` ENABLE KEYS */;


--
-- Definition of table `meal_details_for_march_2019`
--

DROP TABLE IF EXISTS `meal_details_for_march_2019`;
CREATE TABLE `meal_details_for_march_2019` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `meal_date` date DEFAULT NULL,
  `total_meals` int(11) DEFAULT NULL,
  `on_meal` int(11) DEFAULT NULL,
  `off_meal` int(11) DEFAULT NULL,
  `meal_type` varchar(20) DEFAULT NULL,
  `actual_expensess` double DEFAULT NULL,
  `spent_expenss` double DEFAULT NULL,
  `balance` double DEFAULT NULL,
  `item_details` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `meal_details_for_march_2019`
--

/*!40000 ALTER TABLE `meal_details_for_march_2019` DISABLE KEYS */;
INSERT INTO `meal_details_for_march_2019` (`id`,`meal_date`,`total_meals`,`on_meal`,`off_meal`,`meal_type`,`actual_expensess`,`spent_expenss`,`balance`,`item_details`) VALUES 
 (1,'2019-03-01',7,5,2,'Normal',300,400,-100,'Beef,vegetables others'),
 (2,'2019-03-02',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (3,'2019-03-03',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (4,'2019-03-04',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (5,'2019-03-05',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (6,'2019-03-06',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (7,'2019-03-07',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (8,'2019-03-08',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (9,'2019-03-09',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (10,'2019-03-10',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (11,'2019-03-11',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (12,'2019-03-12',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (13,'2019-03-13',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (14,'2019-03-14',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (15,'2019-03-15',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (16,'2019-03-16',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (17,'2019-03-17',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (18,'2019-03-18',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (19,'2019-03-19',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (20,'2019-03-20',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (21,'2019-03-21',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (22,'2019-03-22',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (23,'2019-03-23',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (24,'2019-03-24',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (25,'2019-03-25',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (26,'2019-03-26',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (27,'2019-03-27',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (28,'2019-03-28',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (29,'2019-03-29',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (30,'2019-03-30',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (31,'2019-03-31',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `meal_details_for_march_2019` ENABLE KEYS */;


--
-- Definition of table `meal_history_for_march_2019`
--

DROP TABLE IF EXISTS `meal_history_for_march_2019`;
CREATE TABLE `meal_history_for_march_2019` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `card_no` int(11) DEFAULT NULL,
  `March_1` varchar(10) DEFAULT NULL,
  `March_2` varchar(10) DEFAULT NULL,
  `March_3` varchar(10) DEFAULT NULL,
  `March_4` varchar(10) DEFAULT NULL,
  `March_5` varchar(10) DEFAULT NULL,
  `March_6` varchar(10) DEFAULT NULL,
  `March_7` varchar(10) DEFAULT NULL,
  `March_8` varchar(10) DEFAULT NULL,
  `March_9` varchar(10) DEFAULT NULL,
  `March_10` varchar(10) DEFAULT NULL,
  `March_11` varchar(10) DEFAULT NULL,
  `March_12` varchar(10) DEFAULT NULL,
  `March_13` varchar(10) DEFAULT NULL,
  `March_14` varchar(10) DEFAULT NULL,
  `March_15` varchar(10) DEFAULT NULL,
  `March_16` varchar(10) DEFAULT NULL,
  `March_17` varchar(10) DEFAULT NULL,
  `March_18` varchar(10) DEFAULT NULL,
  `March_19` varchar(10) DEFAULT NULL,
  `March_20` varchar(10) DEFAULT NULL,
  `March_21` varchar(10) DEFAULT NULL,
  `March_22` varchar(10) DEFAULT NULL,
  `March_23` varchar(10) DEFAULT NULL,
  `March_24` varchar(10) DEFAULT NULL,
  `March_25` varchar(10) DEFAULT NULL,
  `March_26` varchar(10) DEFAULT NULL,
  `March_27` varchar(10) DEFAULT NULL,
  `March_28` varchar(10) DEFAULT NULL,
  `March_29` varchar(10) DEFAULT NULL,
  `March_30` varchar(10) DEFAULT NULL,
  `March_31` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `meal_history_for_march_2019`
--

/*!40000 ALTER TABLE `meal_history_for_march_2019` DISABLE KEYS */;
INSERT INTO `meal_history_for_march_2019` (`id`,`card_no`,`March_1`,`March_2`,`March_3`,`March_4`,`March_5`,`March_6`,`March_7`,`March_8`,`March_9`,`March_10`,`March_11`,`March_12`,`March_13`,`March_14`,`March_15`,`March_16`,`March_17`,`March_18`,`March_19`,`March_20`,`March_21`,`March_22`,`March_23`,`March_24`,`March_25`,`March_26`,`March_27`,`March_28`,`March_29`,`March_30`,`March_31`) VALUES 
 (1,44,'on',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (2,45,'on',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (3,46,'off',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `meal_history_for_march_2019` ENABLE KEYS */;


--
-- Definition of table `member_info`
--

DROP TABLE IF EXISTS `member_info`;
CREATE TABLE `member_info` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(55) DEFAULT NULL,
  `mobile` varchar(55) DEFAULT NULL,
  `email` varchar(55) DEFAULT NULL,
  `dept_name` varchar(55) DEFAULT NULL,
  `reg_no` varchar(55) DEFAULT NULL,
  `session` varchar(55) DEFAULT NULL,
  `card_no` int(5) DEFAULT NULL,
  `membership_type` varchar(55) DEFAULT NULL,
  `membership_status` varchar(55) DEFAULT NULL,
  `creation_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `card_no` (`card_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `member_info`
--

/*!40000 ALTER TABLE `member_info` DISABLE KEYS */;
INSERT INTO `member_info` (`id`,`name`,`mobile`,`email`,`dept_name`,`reg_no`,`session`,`card_no`,`membership_type`,`membership_status`,`creation_date`) VALUES 
 (1,'Minhazur Rahmanole','01515616259','rahmanole.bd@gmail.com','Physics','2011-812-997','2011-12',44,'Regular','Inactive','2019-04-12'),
 (2,'Rofiq Hossain','01515616259','rofiq.bd@gmail.com','Chemistry','2011-812-997','2011-12',45,'Regular','Inactive','2019-04-12'),
 (3,'Maruf Hasan','01515616259','Maruf@gmail.com','Chemistry','2011-812-997','2011-12',46,'Regular','Inactive','2019-04-12'),
 (4,'Mehdi hasan','01717948254','mehedi@gmail.com','Staistics','2011-844-998','2011-12',47,'Regular','Inactive','2019-04-12'),
 (5,'Yasin Arif','01717948254','yasin@gmail.com','Zoology','2011-844-998','2011-12',48,'Regular','Inactive','2019-04-12'),
 (6,'Showkat','01717948254','showkat@gmail.com','Zoology','2011-844-998','2011-12',49,'Regular','Inactive','2019-04-12'),
 (7,'Rahmat Ullah','01717948254','rahmat@gmail.com','Zoology','2011-844-998','2011-12',50,'Regular','Inactive','2019-04-12');
/*!40000 ALTER TABLE `member_info` ENABLE KEYS */;


--
-- Definition of table `month_details`
--

DROP TABLE IF EXISTS `month_details`;
CREATE TABLE `month_details` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `month_name` varchar(55) DEFAULT NULL,
  `year` varchar(5) DEFAULT NULL,
  `employee_fees` double DEFAULT NULL,
  `total_days` int(11) DEFAULT NULL,
  `total_fridays` int(11) DEFAULT NULL,
  `friday_mealRate` double DEFAULT NULL,
  `total_normalDaymeals` double DEFAULT NULL,
  `normal_mealRate` double DEFAULT NULL,
  `feast_mealRate` double DEFAULT NULL,
  `total_cost` double DEFAULT NULL,
  `feast_date` date DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `month_details`
--

/*!40000 ALTER TABLE `month_details` DISABLE KEYS */;
INSERT INTO `month_details` (`id`,`month_name`,`year`,`employee_fees`,`total_days`,`total_fridays`,`friday_mealRate`,`total_normalDaymeals`,`normal_mealRate`,`feast_mealRate`,`total_cost`,`feast_date`,`start_date`,`end_date`) VALUES 
 (1,'March','2019',180,31,31,40,26,30,100,2300,'2019-04-12','2019-03-01','2019-03-31');
/*!40000 ALTER TABLE `month_details` ENABLE KEYS */;


--
-- Definition of table `monthly_expense_march_2019`
--

DROP TABLE IF EXISTS `monthly_expense_march_2019`;
CREATE TABLE `monthly_expense_march_2019` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `card_no` int(11) DEFAULT NULL,
  `previsous_month_bumping` double DEFAULT NULL,
  `needtopay` double DEFAULT NULL,
  `payment_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `monthly_expense_march_2019`
--

/*!40000 ALTER TABLE `monthly_expense_march_2019` DISABLE KEYS */;
/*!40000 ALTER TABLE `monthly_expense_march_2019` ENABLE KEYS */;


--
-- Definition of table `off_cards`
--

DROP TABLE IF EXISTS `off_cards`;
CREATE TABLE `off_cards` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `card_no` int(5) DEFAULT NULL,
  `start_daet` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `card_no` (`card_no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `off_cards`
--

/*!40000 ALTER TABLE `off_cards` DISABLE KEYS */;
INSERT INTO `off_cards` (`id`,`card_no`,`start_daet`,`end_date`) VALUES 
 (2,46,'2019-03-01',NULL),
 (3,50,'2019-03-01',NULL);
/*!40000 ALTER TABLE `off_cards` ENABLE KEYS */;


--
-- Definition of table `personal_info`
--

DROP TABLE IF EXISTS `personal_info`;
CREATE TABLE `personal_info` (
  `id` int(6) NOT NULL AUTO_INCREMENT,
  `name` varchar(55) DEFAULT NULL,
  `cnt_num` varchar(20) DEFAULT NULL,
  `email` varchar(55) DEFAULT NULL,
  `dept_name` varchar(55) DEFAULT NULL,
  `reg_num` varchar(20) DEFAULT NULL,
  `session` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personal_info`
--

/*!40000 ALTER TABLE `personal_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `personal_info` ENABLE KEYS */;


--
-- Definition of table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `email` varchar(55) DEFAULT NULL,
  `role_name` varchar(55) DEFAULT NULL,
  `pin` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` (`id`,`email`,`role_name`,`pin`) VALUES 
 (1,'rahman@gmail.com','Admin','673if7i'),
 (2,'rahmanole.bd@gmail.com','manager','803yf7o'),
 (3,'rofiq@gmail.com','manager','763by8a');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;


--
-- Definition of table `summary`
--

DROP TABLE IF EXISTS `summary`;
CREATE TABLE `summary` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `card_no` int(5) DEFAULT NULL,
  `onDys` int(2) DEFAULT NULL,
  `normal_offMeal` int(2) DEFAULT NULL,
  `friday_offMeal` int(1) DEFAULT NULL,
  `was_feast_on` varchar(5) DEFAULT NULL,
  `total_off_meal` int(2) DEFAULT NULL,
  `bumping` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `card_no` (`card_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `summary`
--

/*!40000 ALTER TABLE `summary` DISABLE KEYS */;
INSERT INTO `summary` (`id`,`card_no`,`onDys`,`normal_offMeal`,`friday_offMeal`,`was_feast_on`,`total_off_meal`,`bumping`) VALUES 
 (1,44,NULL,NULL,NULL,NULL,NULL,NULL),
 (2,45,NULL,NULL,NULL,NULL,NULL,NULL),
 (3,46,NULL,NULL,NULL,NULL,NULL,NULL),
 (4,47,NULL,NULL,NULL,NULL,NULL,NULL),
 (5,48,NULL,NULL,NULL,NULL,NULL,NULL),
 (6,49,NULL,NULL,NULL,NULL,NULL,NULL),
 (7,50,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `summary` ENABLE KEYS */;


--
-- Definition of table `table_with_date`
--

DROP TABLE IF EXISTS `table_with_date`;
CREATE TABLE `table_with_date` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `day` int(2) DEFAULT NULL,
  `meal_date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `table_with_date`
--

/*!40000 ALTER TABLE `table_with_date` DISABLE KEYS */;
INSERT INTO `table_with_date` (`id`,`day`,`meal_date`) VALUES 
 (2,2,'2019-03-02'),
 (3,3,'2019-03-03'),
 (4,4,'2019-03-04'),
 (5,5,'2019-03-05'),
 (6,6,'2019-03-06'),
 (7,7,'2019-03-07'),
 (8,8,'2019-03-08'),
 (9,9,'2019-03-09'),
 (10,10,'2019-03-10'),
 (11,11,'2019-03-11'),
 (12,12,'2019-03-12'),
 (13,13,'2019-03-13'),
 (14,14,'2019-03-14'),
 (15,15,'2019-03-15'),
 (16,16,'2019-03-16'),
 (17,17,'2019-03-17'),
 (18,18,'2019-03-18'),
 (19,19,'2019-03-19'),
 (20,20,'2019-03-20'),
 (21,21,'2019-03-21'),
 (22,22,'2019-03-22'),
 (23,23,'2019-03-23'),
 (24,24,'2019-03-24'),
 (25,25,'2019-03-25'),
 (26,26,'2019-03-26'),
 (27,27,'2019-03-27'),
 (28,28,'2019-03-28'),
 (29,29,'2019-03-29'),
 (30,30,'2019-03-30'),
 (31,31,'2019-03-31'),
 (32,32,'2019-04-01');
/*!40000 ALTER TABLE `table_with_date` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
