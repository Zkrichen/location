package com.residence.location.model;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
@Entity(name = "appartement")
@Data
@NoArgsConstructor
public class Appartement {
	
	    @Id @GeneratedValue
	    private Long id;
	    private @NonNull String name;
	    private Integer superficie;
	    private String batiment;
	    private String adresse;
	    private String equipement;
	    


}
