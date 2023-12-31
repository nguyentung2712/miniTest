package com.SpringBootMiniTest.miniTest.dao;

import com.SpringBootMiniTest.miniTest.database.ProductDB;
import com.SpringBootMiniTest.miniTest.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {
    @Override
    public List<Product> getAllProduct() {
        return ProductDB.productList;
    }

    @Override
    public Product getProductById(int id) {
        return ProductDB.productList.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
