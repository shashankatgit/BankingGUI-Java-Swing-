-- MySQL dump 10.13  Distrib 5.5.14, for Win64 (x86)
--
-- Host: localhost    Database: bankaccount
-- ------------------------------------------------------
-- Server version	5.5.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accounts`
--

DROP TABLE IF EXISTS `accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `accounts` (
  `accNo` varchar(16) DEFAULT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Balance` float DEFAULT NULL,
  `Pin` varchar(25) DEFAULT NULL,
  `PinAttempts` int(11) DEFAULT NULL,
  `isLocked` tinyint(1) DEFAULT NULL,
  `SecurityQ` varchar(120) DEFAULT NULL,
  `SecurityA` varchar(30) DEFAULT NULL,
  `Gender` char(1) DEFAULT NULL,
  `MStatus` tinyint(1) DEFAULT NULL,
  `DOB` varchar(10) DEFAULT NULL,
  `AddLine1` varchar(25) DEFAULT NULL,
  `AddLine2` varchar(25) DEFAULT NULL,
  `AddLine3` varchar(25) DEFAULT NULL,
  `T1` varchar(100) DEFAULT NULL,
  `T2` varchar(100) DEFAULT NULL,
  `T3` varchar(100) DEFAULT NULL,
  `T4` varchar(100) DEFAULT NULL,
  `T5` varchar(100) DEFAULT NULL,
  `TD1` timestamp NULL DEFAULT NULL,
  `TD2` timestamp NULL DEFAULT NULL,
  `TD3` timestamp NULL DEFAULT NULL,
  `TD4` timestamp NULL DEFAULT NULL,
  `TD5` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounts`
--

LOCK TABLES `accounts` WRITE;
/*!40000 ALTER TABLE `accounts` DISABLE KEYS */;
INSERT INTO `accounts` VALUES ('11112','Shashank Singh',10020,'12161012',3,0,'Fav Book','-89228565','M',0,'22/08/95','227, Jyotinagar','Sitapur Road','Hadoi','Transferred 3000.0 to Account Number: 11113','Transferred 1000.0 to Account Number: 11114','Deposited 6000.0 into account','Withdrawn 1000.0 from account','Withdrawn 200.0 from account','2015-07-06 15:37:50','2015-07-06 16:05:28','2015-07-06 16:05:37','2015-07-06 16:05:48','2015-07-06 16:10:04'),('11113','Deepak',5700,'8080808',2,0,'Fav Book','411028389','M',0,'04/09','ABC','DEF','','Received 3000.0 from Account Number: 11112',NULL,NULL,NULL,NULL,'2015-07-06 15:37:50',NULL,NULL,NULL,NULL),('11114','Rekha',21000,'8080808',3,0,'fav book','2129323981','F',1,'20/08/95','dad','ad','','Received 1000.0 from Account Number: 11112',NULL,NULL,NULL,NULL,'2015-07-06 16:05:28',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `accounts` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-06 22:34:47
