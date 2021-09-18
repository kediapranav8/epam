package com.coding.task.ordersystem.service;


import com.coding.task.ordersystem.model.Fruit;
import com.coding.task.ordersystem.model.FruitSummary;

import java.util.List;

public interface OrderService {

    FruitSummary saveOrder(List<Fruit> fruit);
    List<FruitSummary> getOrders();
    FruitSummary getOrderById(Integer id);

}
