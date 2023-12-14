-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: kd-electronics
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `idclientes` int(11) NOT NULL,
  `nombrecliente` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  PRIMARY KEY (`idclientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (2,'Juan Vargas','Calle 234','damian@gmail.com','2365413'),(3,'Diana Alvarez','Calle 563','diana@gmail.com','2365414'),(4,'Sofia Gutierrez','Calle 455','sofia@gmail.com','2365415'),(5,'Luciana Peres','Carrera 56','luciana@gmail.com','2365416'),(6,'Juan Vargas','Pasaje Andrés, 3, Palencia, Rio 43222','francisco.rincon@yahoo.com','631.440.269'),(7,'Juan Valle Águilar','Esc. 227 Calleja Rafael 3, Mataró, Ast 87643','ruben.camacho@gmail.com','649442832');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `idproducto` int(11) NOT NULL,
  `nombreproducto` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `preciobase` double NOT NULL,
  `precioventa` double NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `cantidaddisponible` int(11) NOT NULL,
  PRIMARY KEY (`idproducto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (1,'Convertidor HDMI A VGA ACTIVO','Cajas convertidoras',31000,36890,'Audio y video',50),(2,'Convertidor Display Port a VGA','Cajas convertidoras',28000,33320,'Audio y video',20),(3,'Calibrador Pie de Rey Digital','Calibradores',150000,178500,'Herramientas',40),(4,'Probador Tester Truper','Tester',4500,5355,'Herramientas',23),(5,'Adaptador de Voltaje 12vdc 5Amp','Fuentes adaptadores',38000,45220,'Fuentes de energia',10),(6,'Protector de Voltaje AIRPRO 120','Protector de voltaje',45000,53550,'Fuentes de energia',5),(7,'Adaptador Bluetooth para Multimetro UT-D07A','Multimetro digital',84300,100317,'Equipos de medicion',12),(8,'Calibrador de Medidores de Temperatura UT701','Multimetro digital',1470000,1749300,'Equipos de medicion',5);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-13 22:02:51
