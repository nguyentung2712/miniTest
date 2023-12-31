package com.SpringBootMiniTest.miniTest.dao;

import com.SpringBootMiniTest.miniTest.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductDAO {
    List<Product> getAllProduct();

    Product getProductById(int id);
}
