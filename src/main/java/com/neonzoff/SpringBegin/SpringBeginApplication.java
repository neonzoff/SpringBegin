package com.neonzoff.SpringBegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeginApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
        Phone phone = context.getBean(Phone.class);


        Serializator serializator = context.getBean(SerializatorXML.class);
//        Serializator serializator = context.getBean(SerializatorJSON.class);
//        Serializator serializator = context.getBean(SerializatorYAML.class);
        serializator.serialize(phone);

    }

}
