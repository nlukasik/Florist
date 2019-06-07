package com.florist.projekt.controller;


import com.florist.projekt.dao.FlowerOrderDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class OrderSummaryController {

    @Autowired
    FlowerOrderDAO flowerOrderDAO;


    @GetMapping("/summary")
    public String summaryPage(@PathVariable(required = false) String color, Model model){


        return "summary";
    }
}
