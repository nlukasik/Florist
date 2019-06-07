package com.florist.projekt.dao;

import com.florist.projekt.domain.FlowerOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlowerOrderDAO extends CrudRepository <FlowerOrder, Integer> {
    List<FlowerOrder> findAll();

}
