package com.florist.projekt.controller;


import com.florist.projekt.dao.FlowerOrderDAO;
import com.florist.projekt.dao.ProductDAO;
import com.florist.projekt.domain.FlowerOrder;
import com.florist.projekt.domain.OrderResponse;
import com.florist.projekt.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.LinkedList;
import java.util.List;

@Controller
public class OrderSummaryController {

    @Autowired
    private FlowerOrderDAO flowerOrderDAO;
    @Autowired
    private ProductDAO productDAO;

    @GetMapping("/summary/order")
    public String summaryPage(@PathVariable(required = false) String color, Model model){
        List<FlowerOrder> orders =  flowerOrderDAO.findAll();
        List<OrderResponse> result = new LinkedList<>();
        for(FlowerOrder order : orders){
            OrderResponse ord = new OrderResponse();
            ord.setProduct(productDAO.findById(Integer.valueOf(order.getProductId())).get());
            ord.setQuantity(order.getQuantity());
            result.add(ord);
        }
        model.addAttribute("orders",result);
        return "ordersSummary";
    }
}
