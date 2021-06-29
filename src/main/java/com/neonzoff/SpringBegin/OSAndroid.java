package com.neonzoff.SpringBegin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Tseplyaev Dmitry
 */
@Component
@Primary
public class OSAndroid implements OS {
    @Autowired
    private User user;

    public OSAndroid(User user) {
        this.user = user;
    }

    public OSAndroid() {
        System.out.println("Создание операцинной системы Android");
    }

    @Override
    public String toString() {
        return "Android";
    }

    @Override
    public User getUser() {
        return user;
    }
}
