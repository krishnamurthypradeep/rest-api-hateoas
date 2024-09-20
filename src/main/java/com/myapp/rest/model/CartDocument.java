package com.myapp.rest.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "carts")

public class CartDocument {
	
	@Id
	private String id;
	
	private List<String> items;
	
	

	public CartDocument() {
		// TODO Auto-generated constructor stub
	}

}
