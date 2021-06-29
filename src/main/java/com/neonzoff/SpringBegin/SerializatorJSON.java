package com.neonzoff.SpringBegin;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Tseplyaev Dmitry
 */
@Component
public class SerializatorJSON implements Serializator {

    @Override
    public void serialize(Phone phone) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        try (FileWriter fileWriter = new FileWriter("test.json")) {
            fileWriter.write(gson.toJson(phone));
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Ошибка сериализации " + e);
        }
        System.out.println("Объект был сериализован в test.json");

    }


}
