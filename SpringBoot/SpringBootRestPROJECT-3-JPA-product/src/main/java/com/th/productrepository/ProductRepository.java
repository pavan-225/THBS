package com.th.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.th.model.Product;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
