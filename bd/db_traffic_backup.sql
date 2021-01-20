CREATE DATABASE  IF NOT EXISTS `db_traffic` /*!40100 DEFAULT CHARACTER SET latin1 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_traffic`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: db_traffic
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `busqueda`
--

DROP TABLE IF EXISTS `busqueda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `busqueda` (
  `id_busqueda` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_destino` int NOT NULL,
  PRIMARY KEY (`id_busqueda`),
  KEY `id_destino` (`id_destino`),
  KEY `id_usuario` (`id_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `busqueda`
--

LOCK TABLES `busqueda` WRITE;
/*!40000 ALTER TABLE `busqueda` DISABLE KEYS */;
/*!40000 ALTER TABLE `busqueda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `destino`
--

DROP TABLE IF EXISTS `destino`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `destino` (
  `id_destino` int NOT NULL AUTO_INCREMENT,
  `punto_inicio` varchar(100) NOT NULL,
  `nombre_destino` varchar(100) NOT NULL,
  `recorrido` varchar(100) NOT NULL DEFAULT 'N/A',
  `tipo_transporte` varchar(45) NOT NULL,
  `tiempo_estimado` time(6) NOT NULL,
  `n_rut` int DEFAULT NULL,
  `letra` char(2) DEFAULT NULL,
  `tarifa` float DEFAULT NULL,
  PRIMARY KEY (`id_destino`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destino`
--

LOCK TABLES `destino` WRITE;
/*!40000 ALTER TABLE `destino` DISABLE KEYS */;
INSERT INTO `destino` VALUES (2,'Plaza Mundo ','UTEC','n/a','Coaster','00:40:00.000000',29,'A',0.25),(5,'UES','UTEC','n/a','Autobus','00:15:00.000000',3,'A',0.35),(4,'Metro Centro','Plaza Mundo','n/a','Coaster','00:45:00.000000',2,'A',0.4),(6,'UTEC','UES','n/a','Autobus','00:15:00.000000',2,'A',0.5),(7,'UTEC','Juzgados','n/a','Autobus','00:15:00.000000',52,'A',0.35),(8,'Plaza Mundo','Juzgados','n/a','Autobus','00:35:00.000000',NULL,NULL,NULL),(9,'Plaza Mundo','Galerias','n/a','Autobus','01:20:00.000000',NULL,NULL,NULL),(11,'Galerias','Metro Centro','n/a','Coaster','00:20:00.000000',NULL,NULL,NULL),(12,'Galerias','Metro Centro','n/a','Coaster','00:20:00.000000',NULL,NULL,NULL),(15,'Salvador del mundo','Medico Quirurjico','n/a','Autobus','00:00:25.000000',52,'A',0.35),(16,'Salvador del mundo','Medico Quirurjico','n/a','Autobus','00:25:00.000000',52,'A',0.35),(17,'a','b','n/a','Autobus','00:00:03.000000',2,'A',0.4);
/*!40000 ALTER TABLE `destino` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historial`
--

DROP TABLE IF EXISTS `historial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historial` (
  `id_historial` int NOT NULL AUTO_INCREMENT,
  `id_busqueda` int NOT NULL,
  PRIMARY KEY (`id_historial`),
  KEY `id_busqueda` (`id_busqueda`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historial`
--

LOCK TABLES `historial` WRITE;
/*!40000 ALTER TABLE `historial` DISABLE KEYS */;
/*!40000 ALTER TABLE `historial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rutas`
--

DROP TABLE IF EXISTS `rutas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rutas` (
  `id_ruta` int NOT NULL AUTO_INCREMENT,
  `n_rut` int NOT NULL,
  `letra` char(2) NOT NULL,
  `tarifa` float NOT NULL,
  PRIMARY KEY (`id_ruta`)
) ENGINE=MyISAM AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rutas`
--

LOCK TABLES `rutas` WRITE;
/*!40000 ALTER TABLE `rutas` DISABLE KEYS */;
INSERT INTO `rutas` VALUES (1,7,'A',0.25),(2,29,'B',0.35),(3,29,'H',0.25),(4,31,'D',0.25),(7,3,'B',0.4),(6,29,'A',0.35),(8,3,'A',0.25),(9,31,'A',0.2),(10,31,'A',0.25),(11,52,'A',0.35),(12,52,'A',0.35),(13,52,'A',0.35),(14,52,'A',0.35),(15,5,'F',0.35),(16,2,'F',0.35);
/*!40000 ALTER TABLE `rutas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `clave` varchar(50) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Admin','Administrador','admin','password'),(2,'Bryan','Aguilar','bryan','123456'),(3,'Bill','Gates','bill','bill.com'),(4,'Karla','Aguilar','karlita','123456');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `view_destinos`
--

DROP TABLE IF EXISTS `view_destinos`;
/*!50001 DROP VIEW IF EXISTS `view_destinos`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `view_destinos` AS SELECT 
 1 AS `ID`,
 1 AS `Punto de Inicio`,
 1 AS `Destino`,
 1 AS `N° Ruta`,
 1 AS `Letra`,
 1 AS `Tarifa`,
 1 AS `Tipo de Transporte`,
 1 AS `Tiempo de LLegada`,
 1 AS `Recorrido`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `view_letraruta`
--

DROP TABLE IF EXISTS `view_letraruta`;
/*!50001 DROP VIEW IF EXISTS `view_letraruta`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `view_letraruta` AS SELECT 
 1 AS `letra`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `view_nruta`
--

DROP TABLE IF EXISTS `view_nruta`;
/*!50001 DROP VIEW IF EXISTS `view_nruta`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `view_nruta` AS SELECT 
 1 AS `n_rut`*/;
SET character_set_client = @saved_cs_client;

--
-- Temporary view structure for view `view_rutas`
--

DROP TABLE IF EXISTS `view_rutas`;
/*!50001 DROP VIEW IF EXISTS `view_rutas`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `view_rutas` AS SELECT 
 1 AS `ID`,
 1 AS `N° Ruta`,
 1 AS `Letra`,
 1 AS `Tarifa`*/;
SET character_set_client = @saved_cs_client;

--
-- Dumping events for database 'db_traffic'
--

--
-- Dumping routines for database 'db_traffic'
--
/*!50003 DROP PROCEDURE IF EXISTS `sp_addDestinos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_addDestinos`(
	in inicio varchar(100),
    in destino varchar(100),
    in recorrido varchar(100),
    in tipoTransporte varchar(45),
    in tiempo time,
    in nRuta int, 
    in _letra char(2),
	in _tarifa float)
begin
	insert into destino values(null,inicio,destino,recorrido,tipoTransporte,tiempo,nruta,_letra,_tarifa);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_addRutas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_addRutas`(in ruta int, in letra char(2), in tarifa float)
begin
	insert into rutas values(null,ruta,letra,tarifa);
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_addUsuarios` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`db_traffic`@`190.62.244.%` PROCEDURE `sp_addUsuarios`(IN nom VARCHAR(50),IN ape VARCHAR(50),IN usuario VARCHAR(50), IN pass VARCHAR(25))
BEGIN
	INSERT INTO usuarios(nombre,apellido,usuario,clave) VALUES(nom,ape,usuario,pass);
	SELECT LAST_INSERT_ID();
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_alterDestinos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_alterDestinos`(
	in id int,
	in inicio varchar(100),
    in destino varchar(100),
    in _recorrido varchar(100),
    in tipoTransporte varchar(45),
    in tiempo time,
    in nRuta int, 
    in _letra char(2),
	in _tarifa float)
begin
	UPDATE destino SET punto_inicio=inicio,nombre_destino=destino,recorrido=_recorrido,
	tipo_transporte=tipoTransporte,tiempo_estimado=tiempo,n_rut=nRuta,letra=_letra,tarifa=_tarifa
	WHERE id_destino=id;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_alterRutas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_alterRutas`(in id int, in nruta int, in letra char(2), in tarifa float)
begin
	UPDATE rutas SET n_rut=nruta,letra=letra,tarifa=tarifa WHERE id_ruta=id;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_alterUsuarios` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`db_traffic`@`190.62.244.%` PROCEDURE `sp_alterUsuarios`(IN id INT,IN nom VARCHAR(50),IN ape VARCHAR(50),
IN usuario VARCHAR(50),IN pass VARCHAR(25))
BEGIN
	UPDATE usuarios SET nombre=nom,apellido=ape,usuario=usuario,clave=pass
	WHERE id_usuario=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_eliminarDestino` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarDestino`(in id int)
begin
	DELETE FROM destino WHERE id_destino=id;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_eliminarRuta` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarRuta`(in id int)
begin
	DELETE FROM rutas WHERE id_ruta=id;
end ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_eliminarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarUsuario`(IN id INT)
BEGIN
	DELETE FROM usuarios WHERE id_usuario=id;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_login` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_login`(IN _user VARCHAR(50),IN pass VARCHAR(50))
BEGIN
	DECLARE validUser Varchar(50);
    set validUser = (SELECT EXISTS(SELECT id_usuario FROM usuarios WHERE usuario=_user AND clave=pass));
    
    if(validUser = 1) then
		SELECT id_usuario,(SELECT CONCAT(nombre,' ', apellido)) AS Usuario, clave  FROM usuarios 
		WHERE usuario=_user AND clave=pass;
	ELSE
		SELECT -1;
	END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `sp_verUsuarios` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_AUTO_VALUE_ON_ZERO' */ ;
DELIMITER ;;
CREATE DEFINER=`db_traffic`@`190.62.244.%` PROCEDURE `sp_verUsuarios`()
BEGIN
	SELECT id_usuario AS ID,nombre,apellido,usuario,clave FROM usuarios;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Final view structure for view `view_destinos`
--

/*!50001 DROP VIEW IF EXISTS `view_destinos`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_destinos` AS select distinct `destino`.`id_destino` AS `ID`,`destino`.`punto_inicio` AS `Punto de Inicio`,`destino`.`nombre_destino` AS `Destino`,`destino`.`n_rut` AS `N° Ruta`,`destino`.`letra` AS `Letra`,`destino`.`tarifa` AS `Tarifa`,`destino`.`tipo_transporte` AS `Tipo de Transporte`,cast(`destino`.`tiempo_estimado` as time) AS `Tiempo de LLegada`,`destino`.`recorrido` AS `Recorrido` from `destino` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_letraruta`
--

/*!50001 DROP VIEW IF EXISTS `view_letraruta`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_letraruta` AS select distinct `rutas`.`letra` AS `letra` from `rutas` order by `rutas`.`letra` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_nruta`
--

/*!50001 DROP VIEW IF EXISTS `view_nruta`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_nruta` AS select distinct `rutas`.`n_rut` AS `n_rut` from `rutas` order by `rutas`.`n_rut` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;

--
-- Final view structure for view `view_rutas`
--

/*!50001 DROP VIEW IF EXISTS `view_rutas`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_0900_ai_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_rutas` AS select `rutas`.`id_ruta` AS `ID`,`rutas`.`n_rut` AS `N° Ruta`,`rutas`.`letra` AS `Letra`,`rutas`.`tarifa` AS `Tarifa` from `rutas` */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-20  1:07:39
