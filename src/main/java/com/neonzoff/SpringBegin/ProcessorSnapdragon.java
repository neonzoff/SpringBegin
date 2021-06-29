package com.neonzoff.SpringBegin;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Tseplyaev Dmitry
 */
@Component
@Primary
public class ProcessorSnapdragon implements Processor {
    private final int cores;
    private final int freq;

    public ProcessorSnapdragon() {
        this.cores = 4;
        this.freq = 3600;
        System.out.println("Создание процессора Snapdragon с " + cores
        + " ядрами и " + freq + " частотой");
    }

    @Override
    public String toString() {
        return "Snapdragon " + cores + " ядер частотой " + freq;
    }

    @Override
    public int getCores() {
        return cores;
    }

    @Override
    public int getFreq() {
        return freq;
    }
}
