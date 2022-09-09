package com.residence.location.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "equipementappartement")
@Data
@NoArgsConstructor
public class EquipementAppartement {
	
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String type;
	private String description;
	private Date dateachat;
	private Integer nombredepiece;
	private Integer prixachat;
	private String reference;
	private Integer appartement;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getNombredepiece() {
		return nombredepiece;
	}
	public void setNombredepiece(Integer nombredepiece) {
		this.nombredepiece = nombredepiece;
	}
	public Integer getPrixachat() {
		return prixachat;
	}
	public void setPrixachat(Integer prixachat) {
		this.prixachat = prixachat;
	}
	public Date getDateachat() {
		return dateachat;
	}
	public void setDateachat(Date dateachat) {
		this.dateachat = dateachat;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}

	public Integer getAppartement() {
		return appartement;
	}
	public void setAppartement(Integer appartement) {
		this.appartement = appartement;
	}

	
}
