package com.example.demo.service.product;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductCategory productCategory;

    @Override
    public List<Product> findALl() {
        return (List<Product>) productCategory.findAll();
    }

    @Override
    public Product findById(Long id) {
        return productCategory.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        return productCategory.save(product);
    }

    @Override
    public void remove(Long id) {
        productCategory.deleteById(id);
    }

    @Override
    public List<Product> findProductByCategory(String name) {
        return productCategory.findProductByCategory(name);
    }
}
