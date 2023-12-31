package com.SpringBootMiniTest.miniTest.database;

import com.SpringBootMiniTest.miniTest.utils.CSVFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    private CSVFileReader csvFileReader;

    @Override
    public void run(String... args) throws Exception {
        ProductDB.productList = csvFileReader.readFile("product.csv");
    }
}
