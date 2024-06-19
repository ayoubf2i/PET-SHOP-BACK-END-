package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

public class AchatProduitEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idAchatProduit")
	private Long idAchatProduit;

	@ManyToOne
	@JoinColumn(name = "fk_idUser")
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name = "fk_idProduit")
	private ProduitEntity Produit;

	@JoinColumn(name = "quantiteProduit")
	private int quantiteProduit;

	@Column(name = "statusAchatProduit")
	private boolean statusAchatProduit = true;

	public Long getIdAchatProduit() {
		return idAchatProduit;
	}

	public void setIdAchatProduit(Long idAchatProduit) {
		this.idAchatProduit = idAchatProduit;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public ProduitEntity getProduit() {
		return Produit;
	}

	public void setProduit(ProduitEntity produit) {
		Produit = produit;
	}

	public int getQuantiteProduit() {
		return quantiteProduit;
	}

	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}

	public boolean isStatusAchatProduit() {
		return statusAchatProduit;
	}

	public void setStatusAchatProduit(boolean statusAchatProduit) {
		this.statusAchatProduit = statusAchatProduit;
	}

}
