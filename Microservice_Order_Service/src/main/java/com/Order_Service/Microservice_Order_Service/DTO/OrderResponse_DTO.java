package com.Order_Service.Microservice_Order_Service.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponse_DTO {

	private Long OrderId;
	private Long ProductId;
	private int quantity;
	private double totalPrice;
	
	//Product Details
	private String name;
	private Double price;
	
	
	
	
	
	public OrderResponse_DTO(Long orderId, Long productId, int quantity, double totalPrice, String name, Double price) {
		super();
		OrderId = orderId;
		ProductId = productId;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.name = name;
		this.price = price;
	}





	public OrderResponse_DTO()
	{
		
	}





	public Long getOrderId() {
		return OrderId;
	}





	public void setOrderId(Long orderId) {
		OrderId = orderId;
	}





	public Long getProductId() {
		return ProductId;
	}





	public void setProductId(Long productId) {
		ProductId = productId;
	}





	public int getQuantity() {
		return quantity;
	}





	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}





	public double getTotalPrice() {
		return totalPrice;
	}





	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Double getPrice() {
		return price;
	}





	public void setPrice(Double price) {
		this.price = price;
	}

	
	
	
}
