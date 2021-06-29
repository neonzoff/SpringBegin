package com.neonzoff.SpringBegin;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Tseplyaev Dmitry
 */
@Component
@Primary
public class ScreenImpl implements Screen {
    private final int DPI;
    private final int RefreshRate;

    public ScreenImpl() {
        this.DPI = 445;
        RefreshRate = 65;
        System.out.println("Создание экрана " + DPI + " dpi, " + RefreshRate + " частота обновления");
    }

    @Override
    public String toString() {
        return "DPI " + DPI + " частота обновления " + RefreshRate;
    }

    @Override
    public int getDPI() {
        return DPI;
    }

    @Override
    public int getRefreshRate() {
        return RefreshRate;
    }
}
