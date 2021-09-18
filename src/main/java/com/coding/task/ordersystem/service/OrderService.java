package com.coding.task.ordersystem.service;


import com.coding.task.ordersystem.model.Fruit;
import com.coding.task.ordersystem.model.FruitSummary;

import java.util.List;

public interface OrderService {

    public FruitSummary saveOrder(List<Fruit> fruit);


}
