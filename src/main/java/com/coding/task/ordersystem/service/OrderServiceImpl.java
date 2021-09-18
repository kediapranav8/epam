package com.coding.task.ordersystem.service;

import com.coding.task.ordersystem.model.Fruit;
import com.coding.task.ordersystem.model.FruitSummary;
import com.coding.task.ordersystem.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository repository;

    public static final int appleCost = 60;
    public static final int orangeCost = 25;

    @Override
    public FruitSummary saveOrder(List<Fruit> fruits) {
        float fruitCost;
        float totalOrderCost = 0;
        for (Fruit f : fruits) {
            if (f.getFruitName().equalsIgnoreCase("apple")) {
                fruitCost = appleCost * f.getQuantity();
                f.setQuantity(f.getQuantity()+f.getQuantity());     // introducing offer on apple buy 1, get 1
            } else if (f.getFruitName().equalsIgnoreCase("orange")) {
                fruitCost = orangeCost * f.getQuantity();
                if(f.getQuantity()>1){
                f.setQuantity(f.getQuantity() + f.getQuantity()/2 + f.getQuantity()%2);  // introducing offer on orange 3 for the price of 2
            }} else {
                fruitCost = 0;
            }
            totalOrderCost = fruitCost + totalOrderCost;
        }

        System.out.println("cost " + totalOrderCost);
        return repository.orderSummary(fruits, totalOrderCost);

    }
}
