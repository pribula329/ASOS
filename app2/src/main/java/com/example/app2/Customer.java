package com.example.app2;

public class Customer {

    private String nameCustomer;
    private Food food;

    public Customer(String nameCustomer, Food food) {
        this.nameCustomer = nameCustomer;
        this.food = food;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", food=" + food +
                '}';
    }
}
