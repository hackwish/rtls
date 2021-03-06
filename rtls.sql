-- MySQL dump 10.13  Distrib 5.7.12, for Linux (x86_64)
--
-- Host: localhost    Database: rtls
-- ------------------------------------------------------
-- Server version	5.7.12-0ubuntu1.1

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
-- Table structure for table `rssi`
--

DROP TABLE IF EXISTS `rssi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rssi` (
  `idrssi` int(11) NOT NULL AUTO_INCREMENT,
  `valor_x` double DEFAULT NULL,
  `valor_y` double DEFAULT NULL,
  `rssi_valor1` double DEFAULT NULL,
  `rssi_valor2` double DEFAULT NULL,
  `rssi_valor3` double DEFAULT NULL,
  `res_x` double DEFAULT NULL,
  `res_y` double DEFAULT NULL,
  PRIMARY KEY (`idrssi`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rssi`
--

LOCK TABLES `rssi` WRITE;
/*!40000 ALTER TABLE `rssi` DISABLE KEYS */;
INSERT INTO `rssi` VALUES (1,100,100,50,30,10,12500,10),(2,12,23,344,5,56,NULL,NULL),(3,12,34,56,78,90,NULL,NULL),(4,12,12,12,12,12,0,0),(5,23,23,23,23,23,10,10),(6,10,10,12,45,78,-89,-5955),(7,12,12,324,345,435,-579.375,-84266.83449074074),(8,12,13,12,1,2,11.958333333333334,-12.039529914529917),(9,12,13,12,1,2,11.958333333333334,-12.039529914529917),(10,12,13,12,1,2,11.958333333333334,-12.039529914529917),(11,12,12,45,67,10,-96.66666666666667,62.37384259259259),(12,12,12,1,2,3,5.875,-18.167824074074076),(13,10,10,2,3,4,4.75,-15.402000000000001);
/*!40000 ALTER TABLE `rssi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-10  4:42:25
