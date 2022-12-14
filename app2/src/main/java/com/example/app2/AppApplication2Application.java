package com.example.app2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.util.Scanner;

@SpringBootApplication
public class AppApplication2Application {



	public static void main(String[] args) {
		SpringApplication.run(AppApplication2Application.class, args);

		// load the Spring context

		ApplicationContext context =  new ClassPathXmlApplicationContext("spring-config.xml");
		// get the reference to the message channel
		MessageChannel channel = context.getBean("inputChannel", MessageChannel.class);


		// create a message with the content "World"
		Message<String> message = MessageBuilder.withPayload(askQuestion()).build();

		// send the message to the inputChannel
		channel.send(message);

	}

	private static String askQuestion(){
		System.out.println("Ahoj ako sa voláš? :");
		Scanner vstup = new Scanner(System.in);
		return vstup.nextLine();
	}

}
