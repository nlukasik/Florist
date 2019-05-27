package com.florist.projekt.service;

import com.florist.projekt.dao.ProductDAO;
import com.florist.projekt.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    public List<Product> findAll(){
        return (List<Product>) productDAO.findAll();
    }
}
