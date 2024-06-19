package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class PetEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPet")
	private Long idPet;

	@Column(name = "nomPet")
	private String nomPet;

	@Column(name = "descriptionPet")
	private String descriptionPet;

	@Column(name = "prixPet")
	private Long prixPet;

	@Column(name = "special")
	private boolean special;

	@Column(name = "imagePet")
	private String imagePet;

	@Column(name = "promotion")
	private boolean promotion;

	@ManyToOne
	@JoinColumn(name = "fk_idCategorie")
	private CategorieEntity categorie;

	public Long getIdPet() {
		return idPet;
	}

	public void setIdPet(Long idPet) {
		this.idPet = idPet;
	}

	public String getNomPet() {
		return nomPet;
	}

	public void setNomPet(String nomPet) {
		this.nomPet = nomPet;
	}

	public String getDescriptionPet() {
		return descriptionPet;
	}

	public void setDescriptionPet(String descriptionPet) {
		this.descriptionPet = descriptionPet;
	}

	public Long getPrixPet() {
		return prixPet;
	}

	public void setPrixPet(Long prixPet) {
		this.prixPet = prixPet;
	}

	public boolean isSpecial() {
		return special;
	}

	public void setSpecial(boolean special) {
		this.special = special;
	}

	public String getImagePet() {
		return imagePet;
	}

	public void setImagePet(String imagePet) {
		this.imagePet = imagePet;
	}

	public boolean isPromotion() {
		return promotion;
	}

	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}

	public CategorieEntity getCategorie() {
		return categorie;
	}

	public void setCategorie(CategorieEntity categorie) {
		this.categorie = categorie;
	}

}
