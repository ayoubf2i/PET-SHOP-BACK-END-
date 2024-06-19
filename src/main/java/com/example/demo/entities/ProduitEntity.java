package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class ProduitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduit")
	private Long idProduit;

	@Column(name = "nomProduit")
	private String nomProduit;

	@Column(name = "descriptionProduit")
	private String descriptionProduit;

	@Column(name = "prixProduit")
	private Long prixProduit;

	@Column(name = "imageProduit")
	private String imageProduit;

	@Column(name = "promotion")
	private boolean promotion;

	@ManyToOne
	@JoinColumn(name = "fk_idCategorie")
	private CategorieEntity categorie;

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getDescriptionProduit() {
		return descriptionProduit;
	}

	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}

	public Long getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(Long prixProduit) {
		this.prixProduit = prixProduit;
	}

	public String getImageProduit() {
		return imageProduit;
	}

	public void setImageProduit(String imageProduit) {
		this.imageProduit = imageProduit;
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
