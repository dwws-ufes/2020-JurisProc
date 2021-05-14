-- MySQL dump 10.13  Distrib 8.0.23, for Linux (x86_64)
--
-- Host: localhost    Database: jurisproc
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Dumping data for table `Acordao`
--

LOCK TABLES `Acordao` WRITE;
/*!40000 ALTER TABLE `Acordao` DISABLE KEYS */;
INSERT INTO `Acordao` VALUES (1,'333066f8-d0dc-4e45-a82a-71ed732ad1e7',0,14502001,NULL),(2,'9132d558-7a80-4354-ac51-4e9266e1b520',0,30002015,NULL),(3,'da6e828a-88c4-442a-b943-4d0090a097bb',0,43502015,NULL);
/*!40000 ALTER TABLE `Acordao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Assunto`
--

LOCK TABLES `Assunto` WRITE;
/*!40000 ALTER TABLE `Assunto` DISABLE KEYS */;
INSERT INTO `Assunto` VALUES (1,'a3daf35d-de2b-4bac-96db-f32f26f62bd9',0,'Direito Previdenciário','Aposentadoria por Invalidez'),(2,'a3daf35d-de2b-4bac-96av-f32f26f62bd9',0,'Direito Previdenciário','Auxílio-Doença'),(3,'badaf35d-de2b-4bac-96av-f32f26f62bd9',0,'Direito Previdenciário','Auxílio-Reclusão'),(4,'722cd727-ba04-4b84-9d5a-07a4c40bfb36',0,'Direito Previdenciário','Aposentadoria por tempo de serviço'),(5,'9e0b8953-9a35-4719-bffb-d7e37de4d72e',0,'Direito Previdenciário','RMI - Renda Mensal Inicial'),(6,'4ffa6dca-e3a9-49ca-913f-fb243b596906',0,'Direito Tributário','Contribuiçoes'),(7,'9d967316-0a65-4b87-b146-7dfdb9f77ee1',0,'Direito Tributário','Impostos'),(8,'4eb56daa-5ede-4f51-8697-cec4b8714d77',0,'Direito Administrativo','Servidor Público Civil'),(9,'572a1927-38f0-4e65-93a4-b0222961af90',0,'Direito Administrativo','Militar'),(10,'985230f3-8243-455f-a18d-560460b19003',0,'Direito Consumidor','Contratos de Consumo'),(11,'5a2d17fa-7f22-4654-ac0a-fbae2a2b9df3',0,'Direito Consumidor','Práticas Abusivas');
/*!40000 ALTER TABLE `Assunto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Assunto_PedidoUniformizacao`
--

LOCK TABLES `Assunto_PedidoUniformizacao` WRITE;
/*!40000 ALTER TABLE `Assunto_PedidoUniformizacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Assunto_PedidoUniformizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `PedidoUniformizacao`
--

LOCK TABLES `PedidoUniformizacao` WRITE;
/*!40000 ALTER TABLE `PedidoUniformizacao` DISABLE KEYS */;
INSERT INTO `PedidoUniformizacao` VALUES (7,'211ca7ad-f6ae-4a81-bc5a-7f63823cfde5',0,0,'http://localhost:9444/jurisproc/spring-boot-acelere-o-desenvolvimento-de-microsservicos.pdf?noAuth=true',_binary '\0','2021-04-17','2021-04-29 00:00:00.000000',_binary '\0',124,133,'joao','joao',0,1,4),(8,'ee45f8e5-edd0-4950-9dad-93057d6d8083',0,0,'http://localhost:9444/jurisproc/jenkins-automatize-tudo-sem-complicacoes.pdf?noAuth=true',_binary '\0','2021-04-17','2021-04-24 00:00:00.000000',_binary '\0',1233,3000,'Joao','Joao',0,1,4),(10,'6f648940-e024-4441-8a6d-950713be6dd4',0,0,'http://localhost:9444/jurisproc/spring-boot-acelere-o-desenvolvimento-de-microsservicos.pdf?noAuth=true',_binary '\0','2021-04-24','2021-04-30 00:00:00.000000',_binary '\0',150,200,'Canabrava','Canabrava',0,3,4),(11,'c004caab-a7fe-489a-8fdc-47d78b584a2d',0,0,'http://localhost:9444/jurisproc/pandas-python-data-wrangling-para-ciencia-de-dados.pdf?noAuth=true',_binary '','2021-05-19','2021-06-25 00:00:00.000000',_binary '\0',4000,3000,'Cerberus','Joao',2,3,4),(12,'3d11f7f2-ba1d-4965-b17f-fd6be2f7307f',0,0,'http://localhost:9444/jurisproc/pandas-python-data-wrangling-para-ciencia-de-dados.pdf?noAuth=true',_binary '','2021-04-05','2021-04-05 00:00:00.000000',_binary '\0',5000,12000,'Casa','Casa',2,1,4),(16,'16120ab6-c596-445e-a4f2-bcfd39354707',0,0,'http://localhost:9444/jurisproc/188300-004-0F2FF046.jpg?noAuth=true',_binary '\0','2021-04-21','2021-04-30 00:00:00.000000',_binary '\0',1222,30000,'José da Silva Sauro','Carlos José de Nobrega',1,3,4),(17,'4ae0db08-39e7-4eb0-8dc4-c3649add0f6b',0,0,'http://localhost:9444/jurisproc/html5-e-css3-domine-a-web-do-futuro.pdf?noAuth=true',_binary '','2021-04-24','2021-04-28 00:00:00.000000',_binary '',2000,3000,'João Carlos','Fernado Moraes',2,3,5),(20,'482ab7a8-d8a2-4393-ba78-a4066ccdb377',0,0,'http://localhost:9444/jurisproc/188300-004-0F2FF046.jpg?noAuth=true',_binary '\0','2021-04-26','2021-04-17 22:59:29.957000',_binary '',150,200,'ccc','ddd',0,1,4),(22,'0a490faa-00c6-4a2d-b1bd-ef563139579d',0,0,'http://localhost:9444/jurisproc/188300-004-0F2FF046.jpg?noAuth=true',_binary '\0','2021-04-28','2021-04-18 20:41:02.855000',_binary '',122,300,'João da Costa','Fernando de Moraes',0,1,21),(25,'c987bf8e-5ffa-4cba-bb13-953014053834',0,0,'http://localhost:9444/jurisproc/java-ee-aproveite-toda-a-plataforma-para-construir-aplicacoes.pdf?noAuth=true',_binary '\0','2021-04-21','2021-04-18 21:27:54.139000',_binary '',122,1223,'João','Afonso',0,1,4);
/*!40000 ALTER TABLE `PedidoUniformizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `PedidoUniformizacao_Assunto`
--

LOCK TABLES `PedidoUniformizacao_Assunto` WRITE;
/*!40000 ALTER TABLE `PedidoUniformizacao_Assunto` DISABLE KEYS */;
INSERT INTO `PedidoUniformizacao_Assunto` VALUES (7,1),(8,1),(10,1),(12,1),(17,1),(25,1),(8,2),(11,2),(12,2),(16,2),(22,2),(20,5),(22,5),(25,5),(20,6);
/*!40000 ALTER TABLE `PedidoUniformizacao_Assunto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Relatoria`
--

LOCK TABLES `Relatoria` WRITE;
/*!40000 ALTER TABLE `Relatoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `Relatoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `SecaoJudiciaria`
--

LOCK TABLES `SecaoJudiciaria` WRITE;
/*!40000 ALTER TABLE `SecaoJudiciaria` DISABLE KEYS */;
INSERT INTO `SecaoJudiciaria` VALUES (1,'58e6b065-b42c-4a6e-95d1-773a398c4499',0,NULL,NULL,'Vitória-ES',1,1),(2,'c18fabec-d6c4-45c9-ba78-71f5fd139164',0,NULL,NULL,'São Paulo',1,2),(3,'5c3f2706-c142-4d4c-81bc-67494f60c318',0,NULL,NULL,'Rio de Janeiro',2,1),(4,'513dd310-71ad-4b57-a269-64ade3da2265',0,NULL,NULL,'Curitiba',1,3),(5,'6ae9f709-9503-4135-ac66-53d045f386f0',0,NULL,NULL,'Campo Grande',1,2),(6,'b04f813c-f13d-48f2-9977-eca688722c34',0,NULL,NULL,'Brasília',1,0),(7,'d5a6707c-a158-418f-97ed-799993e0315e',0,NULL,NULL,'Porto Alegre',1,3),(8,'5bb2f472-6eed-453b-baae-6a8b24a9f945',0,NULL,NULL,'São Mateus',1,1),(9,'4e793a43-540d-46ca-909d-768c263822ea',0,NULL,NULL,'Salvador',1,0),(10,'d5272193-cce4-4f86-9bd7-a2e2a0da73b8',0,NULL,NULL,'Recife',1,4);
/*!40000 ALTER TABLE `SecaoJudiciaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `SystemRole`
--

LOCK TABLES `SystemRole` WRITE;
/*!40000 ALTER TABLE `SystemRole` DISABLE KEYS */;
INSERT INTO `SystemRole` VALUES ('ADMIN'),('USUARIO_NORMAL');
/*!40000 ALTER TABLE `SystemRole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `TurmaRecursal`
--

LOCK TABLES `TurmaRecursal` WRITE;
/*!40000 ALTER TABLE `TurmaRecursal` DISABLE KEYS */;
/*!40000 ALTER TABLE `TurmaRecursal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Usuario`
--

LOCK TABLES `Usuario` WRITE;
/*!40000 ALTER TABLE `Usuario` DISABLE KEYS */;
INSERT INTO `Usuario` VALUES (1,'df3dc963-6539-4e05-baa0-9ba759062b28',0,'123','2021-04-14 18:23:08.857000','joao@el.com.br','joao','MTIzNDU2',NULL),(2,'640469fc-5a3a-498c-a8a3-6822e8d8440c',0,'137','2021-04-14 18:27:53.903000','fernando.moraes@el.com.br','Fernando Moraes','123456',NULL),(3,'f5b29437-6189-43e9-ae74-5dcf14c001bf',5,'123','2021-04-14 18:48:55.472000','carlos@el.com.br','Carlos','pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=',NULL),(4,'83217d4d-df74-4928-91da-9b0d6e4e12d7',4,'25432','2021-04-15 16:21:40.644000','pedro.hoppe@edu.ufes.br','Pedro','pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=','9c0f3798-7fa7-483b-8ca6-d8b88bcbe560'),(5,'ef0d7968-0a7f-4ec8-9475-2c36e1377258',3,'12222','2021-04-15 16:54:20.276000','vitor.souza@ufes.edu.br','Vitor Souza','a1HUMd9dfxQcvs7M957fPdhhw7QGnwsRZho+76y7qRg=',NULL),(14,'c0f23ec9-d564-4b23-8e79-e761292e9a9e',0,'70900','2021-04-16 19:44:48.559000','joao.guimaraes@el.com.br','João da Silva','pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=',NULL),(19,'afea7bc1-d24a-4b8c-a1c5-a46a73496ff4',0,'111111111','2021-04-17 22:40:46.685000','melissa.zorzanelli@el.com.br','Melissa Zorzanelli','pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=',NULL),(21,'fb6ca0c4-5f30-4aa7-b545-811f3b65d40b',0,'1234','2021-04-18 16:50:23.419000','fernando@el.com.br','Fernando','pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=',NULL),(23,'d91abbd3-e171-499a-b8f8-66723dd3109f',4,'122233','2021-04-18 21:01:22.262000','egner.rainholz@el.com.br','egner','pmWkWSBCL51Bfkhn79xPuKBKHz//H6B+mY6G9/eieuM=',NULL);
/*!40000 ALTER TABLE `Usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Usuario_SystemRole`
--

LOCK TABLES `Usuario_SystemRole` WRITE;
/*!40000 ALTER TABLE `Usuario_SystemRole` DISABLE KEYS */;
INSERT INTO `Usuario_SystemRole` VALUES (3,'ADMIN'),(4,'ADMIN'),(5,'USUARIO_NORMAL'),(14,'USUARIO_NORMAL'),(19,'USUARIO_NORMAL'),(21,'USUARIO_NORMAL'),(23,'USUARIO_NORMAL');
/*!40000 ALTER TABLE `Usuario_SystemRole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `Workshop`
--

LOCK TABLES `Workshop` WRITE;
/*!40000 ALTER TABLE `Workshop` DISABLE KEYS */;
INSERT INTO `Workshop` VALUES (6,'67cabbf6-1b56-4b93-ae74-5880ba002916',0,'JP','Joao Pestana','2021-04-30','2021-04-22',2020);
/*!40000 ALTER TABLE `Workshop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (26),(26),(26),(26),(26),(26),(26),(26);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'jurisproc'
--

--
-- Dumping routines for database 'jurisproc'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-14 17:38:39
