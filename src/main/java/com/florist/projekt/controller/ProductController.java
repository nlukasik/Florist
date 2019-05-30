package com.florist.projekt.controller;

import com.florist.projekt.domain.Product;
import com.florist.projekt.service.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@RestController
public class ProductController {


    private String name;

    @Autowired
    private ProductImpl product;

    @GetMapping("/product")
    public ModelAndView ListProducts(ModelAndView model) throws IOException {
        List<Product> listProducts = product.findAll();
        model.addObject("name", name);
        model.addObject("products", listProducts);
        model.setViewName("product");

        return model;


    }

    @GetMapping(value = "/products/buyNow/{id}")
    public ModelAndView buyNow(@PathVariable("id") String id, ModelAndView model) {
    return model;

    }
}


