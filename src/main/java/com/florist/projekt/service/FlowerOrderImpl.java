package com.florist.projekt.service;

import com.florist.projekt.dao.FlowerOrderDAO;
import com.florist.projekt.domain.FlowerOrder;
import com.florist.projekt.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class FlowerOrderImpl {

    private int orderGroupId = 1;
    private Integer orderedProductsId;
    private Integer quantity;

    public FlowerOrderImpl(){}

    @Autowired
    private FlowerOrderDAO orderDAO;

    public FlowerOrder save(FlowerOrder order){
        order.setProductId(String.valueOf(orderedProductsId));
        order.setQuantity(quantity);
        return orderDAO.save(order);
    }

    public void addOrderedProduct(int id,int quantity){
        this.orderedProductsId = id;
        this.quantity = quantity;
    }
}
