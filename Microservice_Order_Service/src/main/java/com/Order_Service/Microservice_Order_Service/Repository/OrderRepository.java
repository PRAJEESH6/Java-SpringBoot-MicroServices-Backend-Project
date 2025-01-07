package com.Order_Service.Microservice_Order_Service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Order_Service.Microservice_Order_Service.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

}
