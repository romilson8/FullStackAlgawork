package br.example.banzonetwork.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Avaliador.class)
public abstract class Avaliador_ {

	public static volatile SingularAttribute<Avaliador, String> senha;
	public static volatile SingularAttribute<Avaliador, Long> codigo;
	public static volatile SingularAttribute<Avaliador, String> nome;
	public static volatile SingularAttribute<Avaliador, String> cref;
	public static volatile SingularAttribute<Avaliador, String> email;

	public static final String SENHA = "senha";
	public static final String CODIGO = "codigo";
	public static final String NOME = "nome";
	public static final String CREF = "cref";
	public static final String EMAIL = "email";

}

