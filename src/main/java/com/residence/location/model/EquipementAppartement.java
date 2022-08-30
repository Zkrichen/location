package com.residence.location.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "equipementappartement")
@Data
@NoArgsConstructor
public class EquipementAppartement {
    @Id @GeneratedValue
	private Long id;
	private String type;
	private String description;
	private Date dateAchat;
	private Long nombreDePiece;
	private Long prixAchat;
	private String reference;
	private Long appartement;
	
}
