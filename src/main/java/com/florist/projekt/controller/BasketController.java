package com.florist.projekt.controller;


import com.florist.projekt.dao.FlowerOrderDAO;
import com.florist.projekt.domain.FlowerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class BasketController {

    @Autowired
    FlowerOrderDAO flowerOrderDAO;

    @RequestMapping("")
    public String home(){
        return "index";
    }

    @GetMapping("/basket")
    public String BasketPage (Model model) throws IOException {
        model.addAttribute("order",new FlowerOrder());
        return "basket";
    }
}
