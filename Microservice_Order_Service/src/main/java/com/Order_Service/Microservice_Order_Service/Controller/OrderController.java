package com.Order_Service.Microservice_Order_Service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.Order_Service.Microservice_Order_Service.DTO.OrderResponse_DTO;
import com.Order_Service.Microservice_Order_Service.DTO.Product_DTO;
import com.Order_Service.Microservice_Order_Service.Entity.Order;
import com.Order_Service.Microservice_Order_Service.Repository.OrderRepository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private WebClient.Builder WebClientBuilder;
	
	//Create a method to place order
	
	@PostMapping("/placeOrder")
	public Mono<ResponseEntity<OrderResponse_DTO>> placeOrder(@RequestBody Order orders)
	{
		//Fetch product details from product Service...
		return WebClientBuilder.build().get().uri("http://localhost:8081/products/" + orders.getProduct_id()).retrieve()
				
				.bodyToMono(Product_DTO.class).map(productDto -> {
					
					OrderResponse_DTO responseDTO = new OrderResponse_DTO();
					
					responseDTO.setProductId(orders.getProduct_id());
					responseDTO.setQuantity(orders.getQuantity());
					
					//Set Product Details
					responseDTO.setName(productDto.getName());
					responseDTO.setPrice(productDto.getPrice());
					responseDTO.setTotalPrice(orders.getQuantity() * productDto.getPrice());
					
					//Save Order Details to DB
					orderRepository.save(orders);
					responseDTO.setOrderId(orders.getId());
					return ResponseEntity.ok(responseDTO);
					
					
				});
	}
	
	//Get ALL Orders
	@GetMapping
	public List<Order> getAllOrders()
	{
	     return orderRepository.findAll();	
	}

}
