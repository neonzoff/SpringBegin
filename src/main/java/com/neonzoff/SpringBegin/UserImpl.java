package com.neonzoff.SpringBegin;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Tseplyaev Dmitry
 */

@Component
@Primary
public class UserImpl implements User {
    private String name;

    public UserImpl() {
        this.name = "Dmitry";
        System.out.println("Создание пользователя " + name);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }
}
