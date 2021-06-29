package com.neonzoff.SpringBegin;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Tseplyaev Dmitry
 */
@Component
public class SerializatorYAML implements Serializator {

    @Override
    public void serialize(Phone phone) {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try (FileWriter fileWriter = new FileWriter("test.yaml")) {
            mapper.writeValue(fileWriter,phone);
        } catch (IOException e) {
            System.out.println("Ошибка сериализации " + e);
        }
        System.out.println("Объект был сериализован в test.yaml");
    }
}
