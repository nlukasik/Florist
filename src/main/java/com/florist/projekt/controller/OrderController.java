package com.florist.projekt.controller;


import com.florist.projekt.dao.FlowerOrderDAO;
import com.florist.projekt.domain.FlowerOrder;
import com.florist.projekt.service.FlowerOrderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @Autowired
    private FlowerOrderImpl orderService;

    @PostMapping("/order")
    public String selectFlowerPage(FlowerOrder order, Model model){
        FlowerOrder o =  orderService.save(order);
        model.addAttribute("orderId", o == null ? -1 : o.getOrderId());
        return "summary";
    }
}
