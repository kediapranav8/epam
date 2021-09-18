package com.coding.task.ordersystem.repository;

import com.coding.task.ordersystem.model.Fruit;
import com.coding.task.ordersystem.model.FruitSummary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class OrderRepository {

 //   static List<Fruit> fruitList = new ArrayList<Fruit>();
    static Integer OrderID = 0;

    public FruitSummary orderSummary(List<Fruit> fruit, float orderCost) {
        FruitSummary summary = new FruitSummary();
        summary.setOrderId(++OrderID);
        summary.setListFruit(fruit);
        summary.setTotalCost(orderCost);

        return summary;
    }


}
