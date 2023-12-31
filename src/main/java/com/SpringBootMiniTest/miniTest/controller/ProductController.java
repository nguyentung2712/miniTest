package com.SpringBootMiniTest.miniTest.controller;

import com.SpringBootMiniTest.miniTest.dao.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/")
    public String getAllProduct(Model model){
        model.addAttribute("productList",productDAO.getAllProduct());
        return "getAllProduct";
    }

    @GetMapping("/product/{id}")
    public String getProductDetailPage(@PathVariable int id, Model model){
        model.addAttribute("productDetail",productDAO.getProductById(id));
        return "getProductById";
    }
}
