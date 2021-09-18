package com.coding.task.ordersystem.model;


import java.util.List;

public class FruitSummary {

    public Integer orderId;
    public List<Fruit> listFruit;
    public float totalCost;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public FruitSummary() {
    }

    public List<Fruit> getListFruit() {
        return listFruit;
    }

    public void setListFruit(List<Fruit> listFruit) {
        this.listFruit = listFruit;
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }


}
