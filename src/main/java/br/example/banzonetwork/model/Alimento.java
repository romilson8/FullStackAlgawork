package br.example.banzonetwork.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "nutri_plus")
public class Alimento {


	@JsonProperty("id")
	@Id
	private Integer id;
	@JsonProperty("description")
	private String description;
	
	@JsonProperty("category")
	private String category;
	
	@Column(name="humidity_percents")
	@JsonProperty("humidity_percents")
	private String humidityPercents;
	
	@Column(name = "energy_kcal")
	@JsonProperty("energy_kcal")
	private String energyKcal;
	
	@Column(name = "energy_kj")
	@JsonProperty("energy_kj")
	private String energyKj;
	
	@Column(name = "protein_g")
	@JsonProperty("protein_g")
	private String proteinG;
	@Column(name = "lipid_g")
	@JsonProperty("lipid_g")
	private String lipidG;
	
	@Column(name = "cholesterol_mg")
	@JsonProperty("cholesterol_mg")
	private String cholesterolMg;
	
	@Column(name = "carbohydrate_g")
	@JsonProperty("carbohydrate_g")
	private String carbohydrateG;
	
	@Column(name = "fiber_g")
	@JsonProperty("fiber_g")
	private String fiberG;
	
	@Column(name = "ashes_g")
	@JsonProperty("ashes_g")
	private String ashesG;
	
	@Column(name = "calcium_mg")
	@JsonProperty("calcium_mg")
	private String calciumMg;
	
	@Column(name = "magnesium_mg")
	@JsonProperty("magnesium_mg")
	private String magnesiumMg;
	
	@Column(name = "manganese_mg")
	@JsonProperty("manganese_mg")
	private String manganeseMg;
	
	@Column(name = "phosphorus_mg")
	@JsonProperty("phosphorus_mg")
	private String phosphorusMg;
	
	@Column(name = "iron_mg")
	@JsonProperty("iron_mg")
	private String ironMg;
	
	@Column(name = "sodium_mg")
	@JsonProperty("sodium_mg")
	private String sodiumMg;
	
	@Column(name = "potassium_mg")
	@JsonProperty("potassium_mg")
	private String potassiumMg;
	
	@Column(name = "copper_mg")
	@JsonProperty("copper_mg")
	private String copperMg;
	
	@Column(name = "zinc_mg")
	@JsonProperty("zinc_mg")
	private String zincMg;
	
	@Column(name = "retinol_mcg")
	@JsonProperty("retinol_mcg")
	private String retinolMcg;
	
	@Column(name = "re_mcg")
	@JsonProperty("re_mcg")
	private String reMcg;
	
	@Column(name = "rae_mcg")
	@JsonProperty("rae_mcg")
	private String raeMcg;
	
	@Column(name = "thiamine_mg")
	@JsonProperty("thiamine_mg")
	private String thiamineMg;
	
	@Column(name = "riboflavin_mg")
	@JsonProperty("riboflavin_mg")
	private String riboflavinMg;
	
	@Column(name = "pyridoxine_mg")
	@JsonProperty("pyridoxine_mg")
	private String pyridoxineMg;
	
	@Column(name = "niacin_mg")
	@JsonProperty("niacin_mg")
	private String niacinMg;
	
	@Column(name = "vitaminC_mg")
	@JsonProperty("vitaminC_mg")
	private String vitaminCMg;
	
	@Column(name = "saturated_g")
	@JsonProperty("saturated_g")
	private String saturatedG;
	
	@Column(name = "monounsaturated_g")
	@JsonProperty("monounsaturated_g")
	private String monounsaturatedG;
	
	@Column(name = "polyunsaturated_g")
	@JsonProperty("polyunsaturated_g")
	private String polyunsaturatedG;
	
	
	@JsonProperty("120_g")
	@Column(name = "120_g")
	private String _120G;
	
	@Column(name = "140_g")
	@JsonProperty("140_g")
	private String _140G;
	
	@Column(name = "160_g")
	@JsonProperty("160_g")
	private String _160G;
	
	@JsonProperty("180_g")
	@Column(name = "180_g")
	private String _180G;
	
	@JsonProperty("200_g")
	@Column(name = "200_g")
	private String _200G;
	
	@JsonProperty("220_g")
	@Column(name = "220_g")
	private String _220G;
	
	@JsonProperty("240_g")
	@Column(name = "240_g")
	private String _240G;
	
	@JsonProperty("141_g")
	@Column(name = "141_g")
	private String _141G;
	
	@JsonProperty("161_g")
	@Column(name = "161_g")
	private String _161G;
	
	@JsonProperty("181_g")
	@Column(name = "181_g")
	private String _181G;
	
	@JsonProperty("201_g")
	@Column(name = "201_g")
	private String _201G;
	
	@JsonProperty("182_n6_g")
	@Column(name = "182_n6_g")
	private String _182N6G;
	
	@JsonProperty("183_n3_g")
	@Column(name = "183_n3_g")
	private String _183N3G;
	
	@JsonProperty("204_g")
	@Column(name = "204_g")
	private String _204G;
	
	@JsonProperty("205_g")
	@Column(name = "205_g")
	private String _205G;
	
	@JsonProperty("225_g")
	@Column(name = "225_g")
	private String _225G;
	
	@JsonProperty("226_g")
	@Column(name = "226_g")
	private String _226G;
	
	@JsonProperty("181t_g")
	@Column(name = "181t_g")
	private String _181tG;
	
	@JsonProperty("182t_g")
	@Column(name = "182t_g")
	private String _182tG;
	
	@Column(name = "tryptophan_g")
	@JsonProperty("tryptophan_g")
	private BigDecimal tryptophanG;
	
	@Column(name = "threonine_g")
	@JsonProperty("threonine_g")
	private String threonineG;
	
	@Column(name = "isoleucine_g")
	@JsonProperty("isoleucine_g")
	private BigDecimal isoleucineG;
	
	@Column(name = "leucine_g")
	@JsonProperty("leucine_g")
	private BigDecimal leucineG;
	
	@Column(name = "lysine_g")
	@JsonProperty("lysine_g")
	private BigDecimal lysineG;
	
	@Column(name = "methionine_g")
	@JsonProperty("methionine_g")
	private BigDecimal methionineG;
	
	@Column(name = "cystine_g")
	@JsonProperty("cystine_g")
	private BigDecimal cystineG;
	
	@Column(name = "phenylalanine_g")
	@JsonProperty("phenylalanine_g")
	private BigDecimal phenylalanineG;
	
	@Column(name = "tyrosine_g")
	@JsonProperty("tyrosine_g")
	private BigDecimal tyrosineG;
	
	@Column(name = "valine_g")
	@JsonProperty("valine_g")
	private BigDecimal valineG;
	
	@Column(name = "arginine_g")
	@JsonProperty("arginine_g")
	private BigDecimal arginineG;
	
	@Column(name = "histidine_g")
	@JsonProperty("histidine_g")
	private BigDecimal histidineG;
	
	@JsonProperty("alanine_g")
	@Column(name="alanine_g")
	private BigDecimal alanineG;
	
	@Column(name = "aspartic_g")
	@JsonProperty("aspartic_g")
	private BigDecimal asparticG;
	
	@Column(name = "glutamic_g")
	@JsonProperty("glutamic_g")
	private BigDecimal glutamicG;
	
	@Column(name = "glycine_g")
	@JsonProperty("glycine_g")
	private BigDecimal glycineG;
	
	@Column(name = "proline_g")
	@JsonProperty("proline_g")
	private BigDecimal prolineG;
	
	@Column(name = "serine_g")
	@JsonProperty("serine_g")
	private BigDecimal serineG;


	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("humidity_percents")
	public String getHumidityPercents() {
		return humidityPercents;
	}

	@JsonProperty("humidity_percents")
	public void setHumidityPercents(String humidityPercents) {
		this.humidityPercents = humidityPercents;
	}

	@JsonProperty("energy_kcal")
	public String getEnergyKcal() {
		return energyKcal;
	}

	@JsonProperty("energy_kcal")
	public void setEnergyKcal(String energyKcal) {
		this.energyKcal = energyKcal;
	}

	@JsonProperty("energy_kj")
	public String getEnergyKj() {
		return energyKj;
	}

	@JsonProperty("energy_kj")
	public void setEnergyKj(String energyKj) {
		this.energyKj = energyKj;
	}

	@JsonProperty("protein_g")
	public String getProteinG() {
		return proteinG;
	}

	@JsonProperty("protein_g")
	public void setProteinG(String proteinG) {
		this.proteinG = proteinG;
	}

	@JsonProperty("lipid_g")
	public String getLipidG() {
		return lipidG;
	}

	@JsonProperty("lipid_g")
	public void setLipidG(String lipidG) {
		this.lipidG = lipidG;
	}

	@JsonProperty("cholesterol_mg")
	public String getCholesterolMg() {
		return cholesterolMg;
	}

	@JsonProperty("cholesterol_mg")
	public void setCholesterolMg(String cholesterolMg) {
		this.cholesterolMg = cholesterolMg;
	}

	@JsonProperty("carbohydrate_g")
	public String getCarbohydrateG() {
		return carbohydrateG;
	}

	@JsonProperty("carbohydrate_g")
	public void setCarbohydrateG(String carbohydrateG) {
		this.carbohydrateG = carbohydrateG;
	}

	@JsonProperty("fiber_g")
	public String getFiberG() {
		return fiberG;
	}

	@JsonProperty("fiber_g")
	public void setFiberG(String fiberG) {
		this.fiberG = fiberG;
	}

	@JsonProperty("ashes_g")
	public String getAshesG() {
		return ashesG;
	}

	@JsonProperty("ashes_g")
	public void setAshesG(String ashesG) {
		this.ashesG = ashesG;
	}

	@JsonProperty("calcium_mg")
	public String getCalciumMg() {
		return calciumMg;
	}

	@JsonProperty("calcium_mg")
	public void setCalciumMg(String calciumMg) {
		this.calciumMg = calciumMg;
	}

	@JsonProperty("magnesium_mg")
	public String getMagnesiumMg() {
		return magnesiumMg;
	}

	@JsonProperty("magnesium_mg")
	public void setMagnesiumMg(String magnesiumMg) {
		this.magnesiumMg = magnesiumMg;
	}

	@JsonProperty("manganese_mg")
	public String getManganeseMg() {
		return manganeseMg;
	}

	@JsonProperty("manganese_mg")
	public void setManganeseMg(String manganeseMg) {
		this.manganeseMg = manganeseMg;
	}

	@JsonProperty("phosphorus_mg")
	public String getPhosphorusMg() {
		return phosphorusMg;
	}

	@JsonProperty("phosphorus_mg")
	public void setPhosphorusMg(String phosphorusMg) {
		this.phosphorusMg = phosphorusMg;
	}

	@JsonProperty("iron_mg")
	public String getIronMg() {
		return ironMg;
	}

	@JsonProperty("iron_mg")
	public void setIronMg(String ironMg) {
		this.ironMg = ironMg;
	}

	@JsonProperty("sodium_mg")
	public String getSodiumMg() {
		return sodiumMg;
	}

	@JsonProperty("sodium_mg")
	public void setSodiumMg(String sodiumMg) {
		this.sodiumMg = sodiumMg;
	}

	@JsonProperty("potassium_mg")
	public String getPotassiumMg() {
		return potassiumMg;
	}

	@JsonProperty("potassium_mg")
	public void setPotassiumMg(String potassiumMg) {
		this.potassiumMg = potassiumMg;
	}

	@JsonProperty("copper_mg")
	public String getCopperMg() {
		return copperMg;
	}

	@JsonProperty("copper_mg")
	public void setCopperMg(String copperMg) {
		this.copperMg = copperMg;
	}

	@JsonProperty("zinc_mg")
	public String getZincMg() {
		return zincMg;
	}

	@JsonProperty("zinc_mg")
	public void setZincMg(String zincMg) {
		this.zincMg = zincMg;
	}

	@JsonProperty("retinol_mcg")
	public String getRetinolMcg() {
		return retinolMcg;
	}

	@JsonProperty("retinol_mcg")
	public void setRetinolMcg(String retinolMcg) {
		this.retinolMcg = retinolMcg;
	}

	@JsonProperty("re_mcg")
	public String getReMcg() {
		return reMcg;
	}

	@JsonProperty("re_mcg")
	public void setReMcg(String reMcg) {
		this.reMcg = reMcg;
	}

	@JsonProperty("rae_mcg")
	public String getRaeMcg() {
		return raeMcg;
	}

	@JsonProperty("rae_mcg")
	public void setRaeMcg(String raeMcg) {
		this.raeMcg = raeMcg;
	}

	@JsonProperty("thiamine_mg")
	public String getThiamineMg() {
		return thiamineMg;
	}

	@JsonProperty("thiamine_mg")
	public void setThiamineMg(String thiamineMg) {
		this.thiamineMg = thiamineMg;
	}

	@JsonProperty("riboflavin_mg")
	public String getRiboflavinMg() {
		return riboflavinMg;
	}

	@JsonProperty("riboflavin_mg")
	public void setRiboflavinMg(String riboflavinMg) {
		this.riboflavinMg = riboflavinMg;
	}

	@JsonProperty("pyridoxine_mg")
	public String getPyridoxineMg() {
		return pyridoxineMg;
	}

	@JsonProperty("pyridoxine_mg")
	public void setPyridoxineMg(String pyridoxineMg) {
		this.pyridoxineMg = pyridoxineMg;
	}

	@JsonProperty("niacin_mg")
	public String getNiacinMg() {
		return niacinMg;
	}

	@JsonProperty("niacin_mg")
	public void setNiacinMg(String niacinMg) {
		this.niacinMg = niacinMg;
	}

	@JsonProperty("vitaminC_mg")
	public String getVitaminCMg() {
		return vitaminCMg;
	}

	@JsonProperty("vitaminC_mg")
	public void setVitaminCMg(String vitaminCMg) {
		this.vitaminCMg = vitaminCMg;
	}

	@JsonProperty("saturated_g")
	public String getSaturatedG() {
		return saturatedG;
	}

	@JsonProperty("saturated_g")
	public void setSaturatedG(String saturatedG) {
		this.saturatedG = saturatedG;
	}

	@JsonProperty("monounsaturated_g")
	public String getMonounsaturatedG() {
		return monounsaturatedG;
	}

	@JsonProperty("monounsaturated_g")
	public void setMonounsaturatedG(String monounsaturatedG) {
		this.monounsaturatedG = monounsaturatedG;
	}

	@JsonProperty("polyunsaturated_g")
	public String getPolyunsaturatedG() {
		return polyunsaturatedG;
	}

	@JsonProperty("polyunsaturated_g")
	public void setPolyunsaturatedG(String polyunsaturatedG) {
		this.polyunsaturatedG = polyunsaturatedG;
	}

	@JsonProperty("120_g")
	public String get120G() {
		return _120G;
	}

	@JsonProperty("120_g")
	public void set120G(String _120G) {
		this._120G = _120G;
	}

	@JsonProperty("140_g")
	public String get140G() {
		return _140G;
	}

	@JsonProperty("140_g")
	public void set140G(String _140G) {
		this._140G = _140G;
	}

	@JsonProperty("160_g")
	public String get160G() {
		return _160G;
	}

	@JsonProperty("160_g")
	public void set160G(String _160G) {
		this._160G = _160G;
	}

	@JsonProperty("180_g")
	public String get180G() {
		return _180G;
	}

	@JsonProperty("180_g")
	public void set180G(String _180G) {
		this._180G = _180G;
	}

	@JsonProperty("200_g")
	public String get200G() {
		return _200G;
	}

	@JsonProperty("200_g")
	public void set200G(String _200G) {
		this._200G = _200G;
	}

	@JsonProperty("220_g")
	public String get220G() {
		return _220G;
	}

	@JsonProperty("220_g")
	public void set220G(String _220G) {
		this._220G = _220G;
	}

	@JsonProperty("240_g")
	public String get240G() {
		return _240G;
	}

	@JsonProperty("240_g")
	public void set240G(String _240G) {
		this._240G = _240G;
	}

	@JsonProperty("141_g")
	public String get141G() {
		return _141G;
	}

	@JsonProperty("141_g")
	public void set141G(String _141G) {
		this._141G = _141G;
	}

	@JsonProperty("161_g")
	public String get161G() {
		return _161G;
	}

	@JsonProperty("161_g")
	public void set161G(String _161G) {
		this._161G = _161G;
	}

	@JsonProperty("181_g")
	public String get181G() {
		return _181G;
	}

	@JsonProperty("181_g")
	public void set181G(String _181G) {
		this._181G = _181G;
	}

	@JsonProperty("201_g")
	public String get201G() {
		return _201G;
	}

	@JsonProperty("201_g")
	public void set201G(String _201G) {
		this._201G = _201G;
	}

	@JsonProperty("182_n6_g")
	public String get182N6G() {
		return _182N6G;
	}

	@JsonProperty("182_n6_g")
	public void set182N6G(String _182N6G) {
		this._182N6G = _182N6G;
	}

	@JsonProperty("183_n3_g")
	public String get183N3G() {
		return _183N3G;
	}

	@JsonProperty("183_n3_g")
	public void set183N3G(String _183N3G) {
		this._183N3G = _183N3G;
	}

	@JsonProperty("204_g")
	public String get204G() {
		return _204G;
	}

	@JsonProperty("204_g")
	public void set204G(String _204G) {
		this._204G = _204G;
	}

	@JsonProperty("205_g")
	public String get205G() {
		return _205G;
	}

	@JsonProperty("205_g")
	public void set205G(String _205G) {
		this._205G = _205G;
	}

	@JsonProperty("225_g")
	public String get225G() {
		return _225G;
	}

	@JsonProperty("225_g")
	public void set225G(String _225G) {
		this._225G = _225G;
	}

	@JsonProperty("226_g")
	public String get226G() {
		return _226G;
	}

	@JsonProperty("226_g")
	public void set226G(String _226G) {
		this._226G = _226G;
	}

	@JsonProperty("181t_g")
	public String get181tG() {
		return _181tG;
	}

	@JsonProperty("181t_g")
	public void set181tG(String _181tG) {
		this._181tG = _181tG;
	}

	@JsonProperty("182t_g")
	public String get182tG() {
		return _182tG;
	}

	@JsonProperty("182t_g")
	public void set182tG(String _182tG) {
		this._182tG = _182tG;
	}

	@JsonProperty("tryptophan_g")
	public BigDecimal getTryptophanG() {
		return tryptophanG;
	}

	@JsonProperty("tryptophan_g")
	public void setTryptophanG(BigDecimal tryptophanG) {
		this.tryptophanG = tryptophanG;
	}

	@JsonProperty("threonine_g")
	public String getThreonineG() {
		return threonineG;
	}

	@JsonProperty("threonine_g")
	public void setThreonineG(String threonineG) {
		this.threonineG = threonineG;
	}

	@JsonProperty("isoleucine_g")
	public BigDecimal getIsoleucineG() {
		return isoleucineG;
	}

	@JsonProperty("isoleucine_g")
	public void setIsoleucineG(BigDecimal isoleucineG) {
		this.isoleucineG = isoleucineG;
	}

	@JsonProperty("leucine_g")
	public BigDecimal getLeucineG() {
		return leucineG;
	}

	@JsonProperty("leucine_g")
	public void setLeucineG(BigDecimal leucineG) {
		this.leucineG = leucineG;
	}

	@JsonProperty("lysine_g")
	public BigDecimal getLysineG() {
		return lysineG;
	}

	@JsonProperty("lysine_g")
	public void setLysineG(BigDecimal lysineG) {
		this.lysineG = lysineG;
	}

	@JsonProperty("methionine_g")
	public BigDecimal getMethionineG() {
		return methionineG;
	}

	@JsonProperty("methionine_g")
	public void setMethionineG(BigDecimal methionineG) {
		this.methionineG = methionineG;
	}

	@JsonProperty("cystine_g")
	public BigDecimal getCystineG() {
		return cystineG;
	}

	@JsonProperty("cystine_g")
	public void setCystineG(BigDecimal cystineG) {
		this.cystineG = cystineG;
	}

	@JsonProperty("phenylalanine_g")
	public BigDecimal getPhenylalanineG() {
		return phenylalanineG;
	}

	@JsonProperty("phenylalanine_g")
	public void setPhenylalanineG(BigDecimal phenylalanineG) {
		this.phenylalanineG = phenylalanineG;
	}

	@JsonProperty("tyrosine_g")
	public BigDecimal getTyrosineG() {
		return tyrosineG;
	}

	@JsonProperty("tyrosine_g")
	public void setTyrosineG(BigDecimal tyrosineG) {
		this.tyrosineG = tyrosineG;
	}

	@JsonProperty("valine_g")
	public BigDecimal getValineG() {
		return valineG;
	}

	@JsonProperty("valine_g")
	public void setValineG(BigDecimal valineG) {
		this.valineG = valineG;
	}

	@JsonProperty("arginine_g")
	public BigDecimal getArginineG() {
		return arginineG;
	}

	@JsonProperty("arginine_g")
	public void setArginineG(BigDecimal arginineG) {
		this.arginineG = arginineG;
	}

	@JsonProperty("histidine_g")
	public BigDecimal getHistidineG() {
		return histidineG;
	}

	@JsonProperty("histidine_g")
	public void setHistidineG(BigDecimal histidineG) {
		this.histidineG = histidineG;
	}

	@JsonProperty("alanine_g")
	public BigDecimal getAlanineG() {
		return alanineG;
	}

	@JsonProperty("alanine_g")
	public void setAlanineG(BigDecimal alanineG) {
		this.alanineG = alanineG;
	}

	@JsonProperty("aspartic_g")
	public BigDecimal getAsparticG() {
		return asparticG;
	}

	@JsonProperty("aspartic_g")
	public void setAsparticG(BigDecimal asparticG) {
		this.asparticG = asparticG;
	}

	@JsonProperty("glutamic_g")
	public BigDecimal getGlutamicG() {
		return glutamicG;
	}

	@JsonProperty("glutamic_g")
	public void setGlutamicG(BigDecimal glutamicG) {
		this.glutamicG = glutamicG;
	}

	@JsonProperty("glycine_g")
	public BigDecimal getGlycineG() {
		return glycineG;
	}

	@JsonProperty("glycine_g")
	public void setGlycineG(BigDecimal glycineG) {
		this.glycineG = glycineG;
	}

	@JsonProperty("proline_g")
	public BigDecimal getProlineG() {
		return prolineG;
	}

	@JsonProperty("proline_g")
	public void setProlineG(BigDecimal prolineG) {
		this.prolineG = prolineG;
	}

	@JsonProperty("serine_g")
	public BigDecimal getSerineG() {
		return serineG;
	}

	@JsonProperty("serine_g")
	public void setSerineG(BigDecimal serineG) {
		this.serineG = serineG;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Alimento other = (Alimento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


}