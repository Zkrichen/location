package com.residence.location.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "chargeappartement")
@Data
@NoArgsConstructor
public class ChargeAppartement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

			  private Long id;
			  private String description;
			  private Date dateeffet;
			  private Long prix;
			  private Long appartement;
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public Date getDateeffet() {
				return dateeffet;
			}
			public void setDateeffet(Date dateeffet) {
				this.dateeffet = dateeffet;
			}
			public Long getPrix() {
				return prix;
			}
			public void setPrix(Long prix) {
				this.prix = prix;
			}
			public Long getAppartement() {
				return appartement;
			}
			public void setAppartement(Long appartement) {
				this.appartement = appartement;
			}
			
}
