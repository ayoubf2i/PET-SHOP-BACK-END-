package com.example.demo.requests;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class UserSinscrireRequest {

	private String userNom;
	private String userEmail;
	private String userMotDePasse;
	private String userTelephone;
	private String userAdresse;
	private String userNumCart;
	private String userCvc;
	private String moisExpCart;
	private String anneeExpCart;
	private String sourceClientIdStripe;
	private String sourceCartIdStrip;
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
