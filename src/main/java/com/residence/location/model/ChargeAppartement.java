package com.residence.location.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "chargeappartement")
@Data
@NoArgsConstructor
public class ChargeAppartement {

    @Id @GeneratedValue
			  private Long id;
			  private String description;
			  private Date dateeffet;
			  private Long prix;
			  private Long appartement;
			
}
