package com.SpringBootMiniTest.miniTest.utils;

import com.SpringBootMiniTest.miniTest.model.Product;

import java.util.List;

public interface IFileReader {
    List<Product> readFile(String filePath);
}
