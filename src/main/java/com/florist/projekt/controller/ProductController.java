package com.florist.projekt.controller;

import com.florist.projekt.domain.Product;
import com.florist.projekt.service.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;


@RestController
public class ProductController {

    //@Value("${app.header.product}")
    private String name;

    @Autowired
    private ProductImpl products;

    @GetMapping("/product")
    public ModelAndView ListProducts (ModelAndView model) throws IOException {
        List<Product> listProducts = products.findAll();
        model.addObject("name", name );
        model.addObject("products", listProducts);
        model.setViewName("product");

        return model;

}}




