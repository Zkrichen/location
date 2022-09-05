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

	private Long id;
	private String type;
	private String description;
	private Date dateAchat;
	private Long nombreDePiece;
	private Long prixAchat;
	private String reference;
	private Long appartement;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Long getNombreDePiece() {
		return nombreDePiece;
	}
	public void setNombreDePiece(Long nombreDePiece) {
		this.nombreDePiece = nombreDePiece;
	}
	public Long getPrixAchat() {
		return prixAchat;
	}
	public void setPrixAchat(Long prixAchat) {
		this.prixAchat = prixAchat;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Long getAppartement() {
		return appartement;
	}
	public void setAppartement(Long appartement) {
		this.appartement = appartement;
	}
	
}
