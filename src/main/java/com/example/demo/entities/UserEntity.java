package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser")
	private Long idUser;

	@Column(name = "userNom")
	private String userNom;

	@Column(name = "userEmail")
	private String userEmail;

	@Column(name = "userMotDePasse")
	private String userMotDePasse;

	@Column(name = "userTelephone")
	private String userTelephone;

	@Column(name = "userAdresse")
	private String userAdresse;

	@Column(name = "userNumCart")
	private String userNumCart;

	@Column(name = "userCvc")
	private String userCvc;

	@Column(name = "moisExpCart")
	private String moisExpCart;

	@Column(name = "anneeExpCart")
	private String anneeExpCart;
	
	@Column(name = "sourceClientIdStripe")
	private String sourceClientIdStripe;

	
	@Column(name = "sourceCartIdStrip")
	private String sourceCartIdStrip;


	public Long getIdUser() {
		return idUser;
	}


	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}


	public String getUserNom() {
		return userNom;
	}


	public void setUserNom(String userNom) {
		this.userNom = userNom;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserMotDePasse() {
		return userMotDePasse;
	}


	public void setUserMotDePasse(String userMotDePasse) {
		this.userMotDePasse = userMotDePasse;
	}


	public String getUserTelephone() {
		return userTelephone;
	}


	public void setUserTelephone(String userTelephone) {
		this.userTelephone = userTelephone;
	}


	public String getUserAdresse() {
		return userAdresse;
	}


	public void setUserAdresse(String userAdresse) {
		this.userAdresse = userAdresse;
	}


	public String getUserNumCart() {
		return userNumCart;
	}


	public void setUserNumCart(String userNumCart) {
		this.userNumCart = userNumCart;
	}


	public String getUserCvc() {
		return userCvc;
	}


	public void setUserCvc(String userCvc) {
		this.userCvc = userCvc;
	}


	public String getMoisExpCart() {
		return moisExpCart;
	}


	public void setMoisExpCart(String moisExpCart) {
		this.moisExpCart = moisExpCart;
	}


	public String getAnneeExpCart() {
		return anneeExpCart;
	}


	public void setAnneeExpCart(String anneeExpCart) {
		this.anneeExpCart = anneeExpCart;
	}


	public String getSourceClientIdStripe() {
		return sourceClientIdStripe;
	}


	public void setSourceClientIdStripe(String sourceClientIdStripe) {
		this.sourceClientIdStripe = sourceClientIdStripe;
	}


	public String getSourceCartIdStrip() {
		return sourceCartIdStrip;
	}


	public void setSourceCartIdStrip(String sourceCartIdStrip) {
		this.sourceCartIdStrip = sourceCartIdStrip;
	}


}
