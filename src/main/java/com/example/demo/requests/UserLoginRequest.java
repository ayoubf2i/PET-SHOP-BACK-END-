package com.example.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class UserLoginRequest {

	private String userEmail;
	private String userMotDePasse;
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
}
