package com.neonzoff.SpringBegin;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Tseplyaev Dmitry
 */
@Component
@Primary
public class Phone {
    private OS os;
    private Processor processor;
    private Screen screen;

    public Phone(OS os, Processor processor, Screen screen) {
        this.os = os;
        this.processor = processor;
        this.screen = screen;
        System.out.println("Создание телефона для пользователя " + os.getUser()
        + " с OS " + os
        + " процессором " + processor
        + " экраном " + screen);
    }

    @Override
    public String toString() {
        return "Phone{ для пользователя " + os.getUser() +
                " с OS " + os +
                " процессором " + processor +
                " экраном " + screen + " }";
    }

    public OS getOs() {
        return os;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Screen getScreen() {
        return screen;
    }
}
