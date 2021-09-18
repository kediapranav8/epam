package com.coding.task.ordersystem.controller;

import com.coding.task.ordersystem.model.Fruit;
import com.coding.task.ordersystem.model.FruitSummary;
import com.coding.task.ordersystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;


    @RequestMapping("/")
    public String test(){
        return "App Work s";
    }

    @PostMapping("/order")
    public FruitSummary order(@RequestBody List<Fruit> fruit){
        //exception handling with logging
       return orderService.saveOrder(fruit);

    }

}
