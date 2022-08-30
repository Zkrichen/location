
package com.residence.location.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity(name = "client")
@Data
@NoArgsConstructor
public class Client {
	
	    @Id @GeneratedValue
	    private Integer id;
	    private @NonNull String name;
	    private String cin;
	    private String notation;
	    private String adresse;
	   // @Enumerated(EnumType.STRING)
	    //private TypeClient typeClient;
	    private String comment;
	    private Boolean clientsaisonnaire;
	   @Column(name = "clientpermanent")
	    private Boolean clientpermanent;
	    private String email;
	    private String tel1;
	    private String tel2;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCin() {
			return cin;
		}
		public void setCin(String cin) {
			this.cin = cin;
		}
		public String getNotation() {
			return notation;
		}
		public void setNotation(String notation) {
			this.notation = notation;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public Boolean getClientsaisonnaire() {
			return clientsaisonnaire;
		}
		public void setClientsaisonnaire(Boolean clientsaisonnaire) {
			this.clientsaisonnaire = clientsaisonnaire;
		}
		public Boolean getClientpermanent() {
			return clientpermanent;
		}
		public void setClientpermanent(Boolean clientpermanent) {
			this.clientpermanent = clientpermanent;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTel1() {
			return tel1;
		}
		public void setTel1(String tel1) {
			this.tel1 = tel1;
		}
		public String getTel2() {
			return tel2;
		}	
		public void setTel2(String tel2) {
			this.tel2 = tel2;
		}
	    
}
