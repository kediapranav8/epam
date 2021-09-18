package com.coding.task.ordersystem.repository;

import com.coding.task.ordersystem.model.Fruit;
import com.coding.task.ordersystem.model.FruitSummary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepository {

    static List<FruitSummary> fruitList = new ArrayList<>();
    static Integer OrderID = 0;

    public FruitSummary orderSummary(List<Fruit> fruit, float orderCost) {

        FruitSummary summary = new FruitSummary();
        summary.setOrderId(++OrderID);
        summary.setListFruit(fruit);
        summary.setTotalCost(orderCost);
        fruitList.add(summary);
        return summary;
    }


    public List<FruitSummary> getOrders() {
    /*      if cost is not required to return
       for (FruitSummary fruitSummary : fruitList) {
            fruitSummary.setTotalCost(null);
        }
     */
        System.out.println("Final " + fruitList);
        return fruitList;
    }

    public FruitSummary getOrderById(Integer orderID){
        FruitSummary fruitSummary = null;

        Optional<FruitSummary> fruit = fruitList.stream().filter(o -> o.getOrderId().equals(orderID)).findAny();
      if(fruit.isPresent()){
          fruitSummary = fruit.get();
      }
      return fruitSummary;
    }

}
