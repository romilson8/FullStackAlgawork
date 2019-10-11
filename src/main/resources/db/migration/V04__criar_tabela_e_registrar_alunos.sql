CREATE TABLE IF NOT EXISTS aluno (
  codigo BIGINT(20) AUTO_INCREMENT,
  nome VARCHAR(45) NOT NULL,
  nascimento DATE NOT NULL,
  email VARCHAR(45) NULL,
  telefone VARCHAR(45) NULL,
  data_avaliacao DATE NULL,
  data_reavaliacao DATE NULL,
  logradouro VARCHAR(45) NULL,
  numero INT,
  complemento VARCHAR(45) NULL,
  cep VARCHAR(45) NULL,
  bairro VARCHAR(45) NULL,
  cidade VARCHAR(45) NULL,
  estado VARCHAR(45) NULL,
   PRIMARY KEY (`codigo`))
ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into aluno (nome, nascimento, email, telefone, data_avaliacao, data_reavaliacao, logradouro, numero, complemento, cep, bairro, cidade, estado) values("José Romilson de Souza Barros", '1980-02-18', "zero.barros@gmail.com", "81996759966",
 '2019-10-10', '2020-01-10', "Rua Viriato Correia", 71, "Apt 803", "51030-510", "Boa Viagem", "Recife", "Pernambuco");