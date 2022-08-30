package com.residence.location.model;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity(name = "reservation")
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
	    private BigDecimal avance;
	    private String feedbackClient;
	    private String feedbackProprio;
	    private Long nombreNuitGratuit;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Date getDateDebut() {
			return dateDebut;
		}
		public void setDateDebut(Date dateDebut) {
			this.dateDebut = dateDebut;
		}
		public Date getDateFin() {
			return dateFin;
		}
		public void setDateFin(Date dateFin) {
			this.dateFin = dateFin;
		}
		public BigDecimal getPrix() {
			return prix;
		}
		public void setPrix(BigDecimal prix) {
			this.prix = prix;
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
		public Long getNombreDeNuite() {
			return nombreDeNuite;
		}
		public void setNombreDeNuite(Long nombreDeNuite) {
			this.nombreDeNuite = nombreDeNuite;
		}
		public BigDecimal getPrixParNuite() {
			return prixParNuite;
		}
		public void setPrixParNuite(BigDecimal prixParNuite) {
			this.prixParNuite = prixParNuite;
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
		public BigDecimal getAvance() {
			return avance;
		}
		public void setAvance(BigDecimal avance) {
			this.avance = avance;
		}
		public String getFeedbackClient() {
			return feedbackClient;
		}
		public void setFeedbackClient(String feedbackClient) {
			this.feedbackClient = feedbackClient;
		}
		public String getFeedbackProprio() {
			return feedbackProprio;
		}
		public void setFeedbackProprio(String feedbackProprio) {
			this.feedbackProprio = feedbackProprio;
		}
	    
}
