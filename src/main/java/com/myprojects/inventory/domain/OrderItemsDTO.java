package com.myprojects.inventory.domain;

import lombok.Getter;
import lombok.Setter;

//to do move the dto to common project 
@Getter
@Setter
public class OrderItemsDTO {
	private int id;
	private int orderId;
	private int bookId;
}
