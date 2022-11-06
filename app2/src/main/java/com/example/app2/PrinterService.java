package com.example.app2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public class PrinterService {

    @ServiceActivator
    public void printPayValue(Customer value){
        System.out.println(value.getNameCustomer()
                + " zaplat za " + value.getFood().getName()
                + " v hodnote: " + value.getFood().getPrice());
    }
}
