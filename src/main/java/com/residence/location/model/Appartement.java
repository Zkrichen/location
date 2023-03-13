package com.residence.location.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity(name = "appartement")
@Data
@NoArgsConstructor
public class Appartement {
	
	    @Id 
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private @NonNull String name;
	    private Integer superficie;
	    private String batiment;
	    private String adresse;
	    private Integer etage;
	    private String description;
	    private Integer nombredechambre;
	    private String type;
		
	    
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getSuperficie() {
			return superficie;
		}
		public void setSuperficie(Integer superficie) {
			this.superficie = superficie;
		}
		public String getBatiment() {
			return batiment;
		}
		public void setBatiment(String batiment) {
			this.batiment = batiment;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}

	    


}
