package com.neonzoff.SpringBegin;

import com.thoughtworks.xstream.XStream;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Tseplyaev Dmitry
 */
@Component
public class SerializatorXML implements Serializator {

    @Override
    public void serialize(Phone phone) {
        XStream xStream = new XStream();
        try (FileWriter fileWriter = new FileWriter("test.xml")) {
            fileWriter.write(xStream.toXML(phone));
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println("Ошибка сериализации " + e);
        }
        System.out.println("Объект был сериализован в test.xml");
    }

}
