package com.example.demo.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class AchatPetRequest {
	private Long idUser;
	private Long idPet;
	private int quantitePet;
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public Long getIdPet() {
		return idPet;
	}
	public void setIdPet(Long idPet) {
		this.idPet = idPet;
	}
	public int getQuantitePet() {
		return quantitePet;
	}
	public void setQuantitePet(int quantitePet) {
		this.quantitePet = quantitePet;
	}
}
