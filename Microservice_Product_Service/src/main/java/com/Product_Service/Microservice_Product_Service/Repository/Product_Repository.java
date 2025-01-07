package com.Product_Service.Microservice_Product_Service.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Product_Service.Microservice_Product_Service.Entity.Product;

@Repository
public interface Product_Repository extends JpaRepository<Product,Long>{

}
