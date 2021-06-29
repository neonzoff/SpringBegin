package com.neonzoff.SpringBegin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tseplyaev Dmitry
 */
@Configuration

public class SpringConfig {

    @Bean
    public User getUser() {
        return new UserImpl();
    }

    @Bean
    public Screen getScreen() {
        return new ScreenImpl();
    }

    @Bean
    public Processor getProcessorSnapdragor() {
        return new ProcessorSnapdragon();
    }


    @Bean
    public OS getOS() {
        return new OSAndroid();
    }

    @Bean
    public Phone getPhoneSnap() {
        return new Phone(getOS(), getProcessorSnapdragor(), getScreen());
    }

    @Bean
    public SerializatorJSON getSerializatorJSON() {
        return new SerializatorJSON();
    }

    @Bean
    public SerializatorYAML getSerializatorYAML() {
        return new SerializatorYAML();
    }

    @Bean
    public SerializatorXML getSerializatorXML() {
        return new SerializatorXML();
    }

}
