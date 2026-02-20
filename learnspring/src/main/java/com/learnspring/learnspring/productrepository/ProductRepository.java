package com.learnspring.learnspring.productrepository;

import com.learnspring.learnspring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
