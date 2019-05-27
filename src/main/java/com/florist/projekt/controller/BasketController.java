package com.florist.projekt.controller;


import com.florist.projekt.dao.FlowerOrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class BasketController {

    @Autowired
    FlowerOrderDAO flowerOrderDAO;


    @GetMapping("/basket")


        public ModelAndView BasketPage (ModelAndView model) throws IOException {

            model.setViewName("product");

        return model;
    }
}
