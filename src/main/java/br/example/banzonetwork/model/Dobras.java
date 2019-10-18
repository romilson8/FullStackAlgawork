package br.example.banzonetwork.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dobras")
public class Dobras {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo; 
	
	private Double subescapular;
	
	private Double tricipital;
	
	private Double axilar_media;
	
	private Double supra_iliaca;
	
	private Double bicipital;
	
	private Double supra_espinhal;
	
	private Double abdominal;
	
	private Double coxa;
	
	private Double panturrilha_media;
	
	private Long aluno_codigo;

	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Double getSubescapular() {
		return subescapular;
	}

	public void setSubescapular(Double subescapular) {
		this.subescapular = subescapular;
	}

	public Double getTricipital() {
		return tricipital;
	}

	public void setTricipital(Double tricipital) {
		this.tricipital = tricipital;
	}

	public Double getAxilar_media() {
		return axilar_media;
	}

	public void setAxilar_media(Double axilar_media) {
		this.axilar_media = axilar_media;
	}

	public Double getSupra_iliaca() {
		return supra_iliaca;
	}

	public void setSupra_iliaca(Double supra_iliaca) {
		this.supra_iliaca = supra_iliaca;
	}

	public Double getBicipital() {
		return bicipital;
	}

	public void setBicipital(Double bicipital) {
		this.bicipital = bicipital;
	}

	public Double getSupra_espinhal() {
		return supra_espinhal;
	}

	public void setSupra_espinhal(Double supra_espinhal) {
		this.supra_espinhal = supra_espinhal;
	}

	public Double getAbdominal() {
		return abdominal;
	}

	public void setAbdominal(Double abdominal) {
		this.abdominal = abdominal;
	}

	public Double getCoxa() {
		return coxa;
	}

	public void setCoxa(Double coxa) {
		this.coxa = coxa;
	}

	public Double getPanturrilha_media() {
		return panturrilha_media;
	}

	public void setPanturrilha_media(Double panturrilha_media) {
		this.panturrilha_media = panturrilha_media;
	}

	public Long getAluno_codigo() {
		return aluno_codigo;
	}

	public void setAluno_codigo(Long aluno_codigo) {
		this.aluno_codigo = aluno_codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dobras other = (Dobras) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
