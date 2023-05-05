package com.devsuperior.examplemockspy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.examplemockspy.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
