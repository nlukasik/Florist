package com.florist.projekt.dao;

import com.florist.projekt.domain.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductDAO extends CrudRepository <Product, Integer> {
}
