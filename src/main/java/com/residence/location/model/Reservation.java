package com.residence.location.model;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class Reservation {
	  @Id @GeneratedValue
	    private Long id;
	    private Date dateDebut;
	    private Date dateFin;
	    private BigDecimal prix;
	    private Boolean paye;
	    private String reduction;
	    private Long nombreDeNuite;
	    private BigDecimal prixParNuite;
	    @OneToOne
	    private Appartement appratement;
	    @OneToOne
	    private Client client;
	    
}
