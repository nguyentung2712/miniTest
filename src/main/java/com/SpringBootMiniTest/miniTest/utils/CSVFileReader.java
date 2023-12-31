package com.SpringBootMiniTest.miniTest.utils;

import com.SpringBootMiniTest.miniTest.model.Product;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class CSVFileReader implements IFileReader{
    @Override
    public List<Product> readFile(String filePath) {
        List<Product> productList = new ArrayList<>();

        Path path = Paths.get(filePath);
        try {
            FileReader filereader = new FileReader(path.toFile());
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withSkipLines(1)
                    .build();

            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                Product product = new Product();
                product.setId(Integer.valueOf(row[0]));
                product.setName(row[1]);
                product.setDescription(row[2]);
                product.setThumbnail(row[3]);
                product.setPrice(Integer.parseInt(row[4]));
                product.setRating(Double.parseDouble(row[5]));
                product.setPriceDiscount(Integer.parseInt(row[6]));

                productList.add(product);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return productList;
    }
}
