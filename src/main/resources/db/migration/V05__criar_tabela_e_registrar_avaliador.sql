CREATE TABLE IF NOT EXISTS `avaliador` (
  `codigo` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL DEFAULT NULL,
  `cref` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `senha` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO avaliador(nome, cref, email, senha) VALUES ("Luciano Machado", "003540/G-PE", "luluboy@yahoo.com.br", "4333453")