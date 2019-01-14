package com.myprojects.inventory.controller;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.myprojects.inventory.domain.OrderDTO;

@FeignClient(name = "orders-service")
public interface OrdersClient {

	@GetMapping("/orders")
	public List<OrderDTO> getListOfAllOrders();

}
