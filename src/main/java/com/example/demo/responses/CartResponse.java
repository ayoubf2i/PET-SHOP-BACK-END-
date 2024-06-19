package com.example.demo.responses;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;


public class CartResponse {
	private Map<String, String> detailsMapCart = new HashMap<>();

	public Map<String, String> getDetailsMapCart() {
		return detailsMapCart;
	}

	public void setDetailsMapCart(Map<String, String> detailsMapCart) {
		this.detailsMapCart = detailsMapCart;
	}
}
