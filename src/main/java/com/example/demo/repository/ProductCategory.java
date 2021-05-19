package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductCategory extends JpaRepository< Product, Long> {
    @Query(value = "select * from product join category c on c.id = product.category_id where c.name like %:name% order by product.price desc, product.name;", nativeQuery = true)
    List<Product> findProductByCategory(String name );
}
