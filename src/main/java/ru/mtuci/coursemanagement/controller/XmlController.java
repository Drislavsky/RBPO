package ru.mtuci.coursemanagement.controller;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.StringReader;

@RestController
public class XmlController {
    @PostMapping(value = "/api/xml/parse", consumes = {MediaType.TEXT_XML_VALUE, MediaType.APPLICATION_XML_VALUE})
    public String parse(@RequestBody String xml) throws Exception {
        SAXReader reader = new SAXReader();
        Document doc = reader.read(new StringReader(xml));
        return doc.getRootElement().getText();
    }
}
