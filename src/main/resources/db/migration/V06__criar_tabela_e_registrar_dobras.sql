CREATE TABLE IF NOT EXISTS `dobras` (
  `codigo` BIGINT NOT NULL AUTO_INCREMENT,
  `subescapular` DECIMAL NULL,
  `tricipital` DECIMAL NULL,
  `peitoral` DECIMAL NULL,
  `axilar_media` DECIMAL NULL,
  `supra_iliaca` DECIMAL NULL,
  `bicipital` DECIMAL NULL,
  `supra_espinhal` DECIMAL NULL,
  `abdominal` DECIMAL NULL,
  `coxa` DECIMAL NULL,
  `panturrilha_media` DECIMAL NULL,
  `aluno_codigo` BIGINT NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_dobras_aluno1_codigox` (`aluno_codigo` ASC) VISIBLE,
  CONSTRAINT `fk_dobras_aluno1`
    FOREIGN KEY (`aluno_codigo`)
    REFERENCES `aluno` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO `dobras` (`subescapular`, `tricipital`, `peitoral`, `axilar_media`, `supra_iliaca`, `bicipital`, `supra_espinhal`, `abdominal`, `coxa`, `panturrilha_media`, `aluno_codigo`) VALUES ('22.2', '13', '14', '22', '35', '16', '25', '35', '35', '17', '1');
INSERT INTO `dobras` (`subescapular`, `tricipital`, `peitoral`, `axilar_media`, `supra_iliaca`, `bicipital`, `supra_espinhal`, `abdominal`, `coxa`, `panturrilha_media`, `aluno_codigo`) VALUES ('24', '12', '11', '22.3', '33.2', '15', '21', '30', '32', '13', '1');