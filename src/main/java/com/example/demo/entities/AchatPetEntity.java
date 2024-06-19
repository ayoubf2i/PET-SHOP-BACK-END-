package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class AchatPetEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAchatPet")
	private Long idAchatPet;

	@ManyToOne
	@JoinColumn(name = "fk_idUser")
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name = "fk_idPet")
	private PetEntity pet;

	@JoinColumn(name = "quantitePet")
	private int quantitePet;

	private boolean statusAchatPet = true;

	public Long getIdAchatPet() {
		return idAchatPet;
	}

	public void setIdAchatPet(Long idAchatPet) {
		this.idAchatPet = idAchatPet;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public PetEntity getPet() {
		return pet;
	}

	public void setPet(PetEntity pet) {
		this.pet = pet;
	}

	public int getQuantitePet() {
		return quantitePet;
	}

	public void setQuantitePet(int quantitePet) {
		this.quantitePet = quantitePet;
	}

	public boolean isStatusAchatPet() {
		return statusAchatPet;
	}

	public void setStatusAchatPet(boolean statusAchatPet) {
		this.statusAchatPet = statusAchatPet;
	}

}
