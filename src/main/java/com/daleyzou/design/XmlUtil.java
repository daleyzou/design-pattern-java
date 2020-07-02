package com.daleyzou.design;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * XmlUtil
 * @description TODO
 * @author daleyzou
 * @date 2020年07月02日 21:20
 * @version 1.2.0
 */
public class XmlUtil {
    public static Object getBean(){
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("config.xml"));
            String className = doc.getElementsByTagName("className").item(0).getFirstChild().getNodeValue();
            Class c = Class.forName(className);
            Object o = c.newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
