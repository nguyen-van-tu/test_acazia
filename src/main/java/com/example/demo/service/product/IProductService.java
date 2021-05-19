package com.example.demo.service.product;

import com.example.demo.model.Product;
import com.example.demo.service.IService;

import java.util.List;

public interface IProductService extends IService<Product> {
    List<Product> findProductByCategory(String name);
}
