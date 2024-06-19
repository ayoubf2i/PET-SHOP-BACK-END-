package com.example.demo.requests;

import lombok.Data;


public class PaiementRequest {
	
	private long idUser;
	
	private int total;
		
	private String sourceClientIdStripe;
	
	private String sourceCartIdStrip;

	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
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
