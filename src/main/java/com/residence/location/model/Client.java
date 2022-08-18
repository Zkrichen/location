package com.residence.location.model;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity
@Data
@NoArgsConstructor
public class Client {
	
	    @Id @GeneratedValue
	    private Integer id;
	    private @NonNull String name;
	    private String cin;
	    private String notation;
	    private String adresse;
	    @Enumerated(EnumType.STRING)
	    private TypeClient typeClient;
	    private String comment;
	    
}
