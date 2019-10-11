-- -----------------------------------------------------
-- Table `system_a`.`aluno`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `system_a`.`aluno` (
  codigo BIGINT(20) AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  nascimento DATE NOT NULL,
  email VARCHAR(45) NULL,
  telefone VARCHAR(45) NULL,
  data_avaliacao DATE NULL,
  data_reavaliacao DATE NULL,
  sexo CHAR NULL,
  logradouro VARCHAR(45) NULL,
  numero INT,
  complemento VARCHAR(45) NULL,
  cep VARCHAR(45) NULL,
  bairro VARCHAR(45) NULL,
  cidade VARCHAR(45) NULL,
  estado VARCHAR(45) NULL,
  PRIMARY KEY (`codigo`))
ENGINE=InnoDB 
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `system_a`.`avaliador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `system_a`.`avaliador` (
  `codigo` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NULL DEFAULT NULL,
  `cref` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `senha` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `system_a`.`avaliacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `system_a`.`avaliacao` (
  `codigo` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `percentual_gordura_atual` DECIMAL(10,0) NULL DEFAULT NULL,
  `relacao_cintura_quadril` DECIMAL(10,0) NULL DEFAULT NULL,
  `percentual_gordura_ideal` DECIMAL(10,0) NULL DEFAULT NULL,
  `imc` DECIMAL(10,0) NULL DEFAULT NULL,
  `peso_gorodo` DECIMAL(10,0) NULL DEFAULT NULL,
  `peso_magro` DECIMAL(10,0) NULL DEFAULT NULL,
  `peso_ideal` DECIMAL(10,0) NULL DEFAULT NULL,
  `avaliador_codigo` BIGINT(20) NOT NULL,
  `aluno_codigo` BIGINT(20) NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_avaliacao_avaliador1_codigox` (`avaliador_codigo` ASC) VISIBLE,
  INDEX `fk_avaliacao_aluno1_codigox` (`aluno_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_avaliacao_avaliador1`
    FOREIGN KEY (`avaliador_codigo`)
    REFERENCES `system_a`.`avaliador` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_avaliacao_aluno1`
    FOREIGN KEY (`aluno_codigo`)
    REFERENCES `system_a`.`aluno` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `system_a`.`dobras`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `system_a`.`dobras` (
  `codigo` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `subescapular` DECIMAL(10,0) NULL DEFAULT NULL,
  `tricipital` DECIMAL(10,0) NULL DEFAULT NULL,
  `peitoral` DECIMAL(10,0) NULL DEFAULT NULL,
  `axilar_media` DECIMAL(10,0) NULL DEFAULT NULL,
  `supra_iliaca` DECIMAL(10,0) NULL DEFAULT NULL,
  `bicipital` DECIMAL(10,0) NULL DEFAULT NULL,
  `supra_espinhal` DECIMAL(10,0) NULL DEFAULT NULL,
  `abdominal` DECIMAL(10,0) NULL DEFAULT NULL,
  `coxa` DECIMAL(10,0) NULL DEFAULT NULL,
  `panturrilha_media` DECIMAL(10,0) NULL DEFAULT NULL,
  `aluno_codigo` BIGINT(20) NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_dobras_aluno1_codigox` (`aluno_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_dobras_aluno1`
    FOREIGN KEY (`aluno_codigo`)
    REFERENCES `system_a`.`aluno` (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `system_a`.`perimetria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `system_a`.`perimetria` (
  `codigo` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `peso` DECIMAL(10,0) NULL DEFAULT NULL,
  `altura` DECIMAL(10,0) NULL DEFAULT NULL,
  `torax` DECIMAL(10,0) NULL DEFAULT NULL,
  `cintura` DECIMAL(10,0) NULL DEFAULT NULL,
  `abdomen` DECIMAL(10,0) NULL DEFAULT NULL,
  `quadril` DECIMAL(10,0) NULL DEFAULT NULL,
  `braço_direito` DECIMAL(10,0) NULL DEFAULT NULL,
  `braco_esquedo` DECIMAL(10,0) NULL DEFAULT NULL,
  `ante_braco_direito` DECIMAL(10,0) NULL DEFAULT NULL,
  `ante_braco_esquerdo` DECIMAL(10,0) NULL DEFAULT NULL,
  `coxa_direita` DECIMAL(10,0) NULL DEFAULT NULL,
  `coxa_esquerda` DECIMAL(10,0) NULL DEFAULT NULL,
  `perna_direita` DECIMAL(10,0) NULL DEFAULT NULL,
  `perna_esquerda` DECIMAL(10,0) NULL DEFAULT NULL,
  `aluno_codigo` BIGINT(20) NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_perimetria_aluno_codigox` (`aluno_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_perimetria_aluno`
    FOREIGN KEY (`aluno_codigo`)
    REFERENCES `system_a`.`aluno` (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;





insert into aluno (nome, nascimento, email, telefone, data_avaliacao, data_reavaliacao, logradouro, numero, complemento, cep, bairro, cidade, estado) values("José Romilson de Souza Barros", '1980-02-18', "zero.barros@gmail.com", "81996759966",
 '2019-10-10', '2020-01-10', "Rua Viriato Correia", 71, "Apt 803", "51030-510", "Boa Viagem", "Recife", "Pernambuco");