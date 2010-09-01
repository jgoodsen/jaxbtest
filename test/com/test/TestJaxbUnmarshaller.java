package com.test;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;

import static junit.framework.Assert.assertTrue;

public class TestJaxbUnmarshaller {

    @Test
    public void unmarshallStateXml() throws Exception {

        String data = readFileAsString("test/states.xml");
        assertTrue("sanity check to make sure we're reading the sample XML file", data.contains("ArrayOfSetting"));

        ByteArrayInputStream source = new ByteArrayInputStream(data.getBytes());
        source.reset();  // necessary?

        JAXBContext jc = JAXBContext.newInstance("com.test");
        Unmarshaller u = jc.createUnmarshaller();
        Object obj = null;
        obj = u.unmarshal(source);
        assertTrue(obj.toString().startsWith("ArrayOfSetting"));
    }

    public static String readFileAsString(String filePath)
            throws java.io.IOException {
        StringBuffer fileData = new StringBuffer(1000);
        BufferedReader reader = new BufferedReader(
                new FileReader(filePath));
        char[] buf = new char[1024];
        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
            buf = new char[1024];
        }
        reader.close();
        return fileData.toString();
    }

}
