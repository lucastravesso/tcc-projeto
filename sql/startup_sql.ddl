CREATE TABLE `usuario` (
  `id` varchar(255) NOT NULL,
  `ativo` bit(1) DEFAULT NULL,
  `cnpj` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `endereco` (
  `id` varchar(255) NOT NULL,
  `ativo` bit(1) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `place` varchar(255) DEFAULT NULL,
  `numero` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc6iyhe213lse0ilpljou01e8f` (`user_id`),
  CONSTRAINT `FKc6iyhe213lse0ilpljou01e8f` FOREIGN KEY (`user_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
