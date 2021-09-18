package com.coding.task.ordersystem.controller;

import com.coding.task.ordersystem.model.Fruit;
import com.coding.task.ordersystem.model.FruitSummary;
import com.coding.task.ordersystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;


    @RequestMapping("/")
    public String test() {
        return "App Work s";
    }

    @PostMapping("/order")
    public FruitSummary order(@RequestBody List<Fruit> fruit) {
        //exception handling with logging
        return orderService.saveOrder(fruit);

    }

@GetMapping("/orders/{id}")
    public FruitSummary getOrderById(@PathVariable Integer id){
        System.out.println("Id Value "+id);
        return orderService.getOrderById(id);
    }

    @GetMapping("/orders")
    public List<FruitSummary> getOrder() {
        return orderService.getOrders();
    }
}
