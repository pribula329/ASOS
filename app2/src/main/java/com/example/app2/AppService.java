package com.example.app2;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class AppService {


    public Customer payment(String value) {
        Scanner vstup2 = new Scanner(System.in);
        System.out.println(value +" vyber si jedlo:");
        System.out.println("1. Kurací rezeň 4,50€");
        System.out.println("2. Palacinky 3,50€");

        if (vstup2.nextLine().equals("1")){
            Customer customer = new Customer(value, new Food("Kurací rezeň","4.50€"));
            return customer;
        } else if (vstup2.nextLine().equals("2")) {
            Customer customer = new Customer(value, new Food("Palacinky","3.50€"));
            return customer;
        }
        else {
            return  new Customer(value,new Food("nic","0"));
        }
    }


}
