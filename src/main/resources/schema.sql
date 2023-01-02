CREATE TABLE `reservation` (
  `id` int NOT NULL AUTO_INCREMENT,
  `datedebut` date DEFAULT NULL,
  `datefin` date DEFAULT NULL,
  `prixloyer` int DEFAULT NULL,
  `paye` tinyint DEFAULT NULL,
  `reduction` int DEFAULT NULL,
  `nombredenuite` int DEFAULT NULL,
  `prixparnuite` int DEFAULT NULL,
  `appratement` int DEFAULT NULL,
  `client` int DEFAULT NULL,
  `avance` int DEFAULT '0',
  `feedbackclient` varchar(1040) DEFAULT NULL,
  `feedbackproprio` varchar(1024) DEFAULT NULL,
  `typelocation` varchar(1024) DEFAULT NULL,
  `nombrenuitgratuit` int DEFAULT '0',
  `nombredemois` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
);

CREATE TABLE `equipementappartement` (
  `id` int NOT NULL AUTO_INCREMENT  PRIMARY KEY,
  `type` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `dateachat` date DEFAULT NULL,
  `nombredepiece` int DEFAULT NULL,
  `prixachat` int DEFAULT NULL,
  `reference` varchar(45) DEFAULT NULL,
  `appartement` int DEFAULT NULL
);

CREATE TABLE `client` (
  `id` int NOT NULL AUTO_INCREMENT   PRIMARY KEY,
  `name` varchar(128) DEFAULT NULL,
  `cin` varchar(45) DEFAULT NULL,
  `notation` int DEFAULT NULL,
  `adresse` varchar(45) DEFAULT NULL,
  `typeclient` varchar(45) DEFAULT NULL,
  `comment` varchar(45) DEFAULT NULL,
  `Tel1` varchar(45) DEFAULT NULL,
  `Tel2` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `clientcontrattype` varchar(45) DEFAULT NULL,
  `clientsaisonnaire` tinyint DEFAULT NULL,
  `profil` varchar(45) DEFAULT NULL
 

);

CREATE TABLE `chargeappartement` (
  `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `description` varchar(1024) DEFAULT NULL,
  `dateeffet` date DEFAULT NULL,
  `prix` int DEFAULT NULL,
  `appartement` int DEFAULT NULL
   
);

CREATE TABLE `appartement` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL,
  `superficie` int DEFAULT NULL,
  `batiment` varchar(45) DEFAULT NULL,
  `compteurEau` varchar(128) DEFAULT NULL,
  `compteurElec` varchar(128) DEFAULT NULL,
  `adresse` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
);