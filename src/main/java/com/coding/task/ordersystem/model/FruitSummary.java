package com.coding.task.ordersystem.model;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

public class FruitSummary {

    private Integer orderId;
    private List<Fruit> listFruit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Float totalCost;

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

    public Float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Float totalCost) {
        this.totalCost = totalCost;
    }


}
