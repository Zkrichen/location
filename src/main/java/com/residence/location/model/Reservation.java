package com.residence.location.model;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name = "reservation")
@Data
@NoArgsConstructor
public class Reservation {
	  @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    @Temporal(TemporalType.DATE)
	    private Date datedebut;
	    @Temporal(TemporalType.DATE)
	    private Date datefin;
	    private BigDecimal prixloyer;
	    private Boolean paye;
	    private String reduction;
	    private Integer nombredenuite;
	    private BigDecimal prixparnuite;
	    @OneToOne( cascade = CascadeType.REFRESH ) 
	    @JoinColumn( name="appratement" )
	    private Appartement appratement;
	    @OneToOne( cascade = CascadeType.REFRESH ) 
	    @JoinColumn( name="client" )
	    private Client client;
	    private Integer avance;
	    private String feedbackclient;
	    private String feedbackproprio;
	    private Integer nombrenuitgratuit;
	    private String typelocation;
	    private Integer nombredemois;
	    private String oknok;
	    private Integer nombrepersonnereel;
	    private Boolean casse;
	    private Boolean bruit;
	    
	    
		public Integer getNombredemois() {
			return nombredemois;
		}
		public void setNombredemois(Integer nombredemois) {
			this.nombredemois = nombredemois;
		}
		public BigDecimal getPrixloyer() {
			return prixloyer;
		}
		public void setPrixloyer(BigDecimal prixloyer) {
			this.prixloyer = prixloyer;
		}
		public String getTypelocation() {
			return typelocation;
		}
		public void setTypelocation(String typelocation) {
			this.typelocation = typelocation;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Date getDatedebut() {
			return datedebut;
		}
		public void setDatedebut(Date datedebut) {
			this.datedebut = datedebut;
		}
		public Date getDatefin() {
			return datefin;
		}
		public void setDatefin(Date datefin) {
			this.datefin = datefin;
		}

		public Boolean getPaye() {
			return paye;
		}
		public void setPaye(Boolean paye) {
			this.paye = paye;
		}
		public String getReduction() {
			return reduction;
		}
		public void setReduction(String reduction) {
			this.reduction = reduction;
		}
		public Integer getNombredenuite() {
			return nombredenuite;
		}
		public void setNombredenuite(Integer nombredenuite) {
			this.nombredenuite = nombredenuite;
		}
		public BigDecimal getPrixparnuite() {
			return prixparnuite;
		}
		public void setPrixparnuite(BigDecimal prixparnuite) {
			this.prixparnuite = prixparnuite;
		}
		public Appartement getAppratement() {
			return appratement;
		}
		public void setAppratement(Appartement appratement) {
			this.appratement = appratement;
		}
		public Client getClient() {
			return client;
		}
		public void setClient(Client client) {
			this.client = client;
		}
		public Integer getAvance() {
			return avance;
		}
		public void setAvance(Integer avance) {
			this.avance = avance;
		}
		public String getFeedbackclient() {
			return feedbackclient;
		}
		public void setFeedbackclient(String feedbackclient) {
			this.feedbackclient = feedbackclient;
		}
		public String getFeedbackproprio() {
			return feedbackproprio;
		}
		public void setFeedbackproprio(String feedbackproprio) {
			this.feedbackproprio = feedbackproprio;
		}
		public Integer getNombrenuitgratuit() {
			return nombrenuitgratuit;
		}
		public void setNombrenuitgratuit(Integer nombrenuitgratuit) {
			this.nombrenuitgratuit = nombrenuitgratuit;
		}
		public String getOknok() {
			return oknok;
		}
		public void setOknok(String oknok) {
			this.oknok = oknok;
		}
		public Integer getNombrepersonnereel() {
			return nombrepersonnereel;
		}
		public void setNombrepersonnereel(Integer nombrepersonnereel) {
			this.nombrepersonnereel = nombrepersonnereel;
		}
		public Boolean getCasse() {
			return casse;
		}
		public void setCasse(Boolean casse) {
			this.casse = casse;
		}
		public Boolean getBruit() {
			return bruit;
		}
		public void setBruit(Boolean bruit) {
			this.bruit = bruit;
		}
		
}
