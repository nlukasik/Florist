package com.florist.projekt.controller;

import com.florist.projekt.domain.FlowerOrder;
import com.florist.projekt.domain.Product;
import com.florist.projekt.domain.ShopOrder;
import com.florist.projekt.service.FlowerOrderImpl;
import com.florist.projekt.service.ProductImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;
import java.util.Optional;


@RestController
public class ProductController {


    private String name;

    @Autowired
    private ProductImpl product;
    @Autowired
    private FlowerOrderImpl orderService;

    @GetMapping("/product")
    public ModelAndView ListProducts(ModelAndView model) throws IOException {
        List<Product> listProducts = product.findAll();
        model.addObject("name", name);
        model.addObject("products", listProducts);
        model.addObject("shopOrder",new ShopOrder());
        model.setViewName("product");
        return model;
    }

    @PostMapping(value = "/products/buyNow")
    public ModelAndView buyNow(ShopOrder order,@RequestParam("id") String id, ModelAndView model) {
        orderService.addOrderedProduct(Integer.parseInt(id),order.getQuantity());
        model.setViewName("redirect:/basket");
        return model;
    }
}


