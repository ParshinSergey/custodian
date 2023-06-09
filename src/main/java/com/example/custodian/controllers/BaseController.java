package com.example.custodian.controllers;

import dmt.custodian2016.Request;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.Writer;
import java.net.http.HttpClient;

public class BaseController {

    public static final String DECKRA_URL = "http://localhost:8080/api/service/result";

    private final Marshaller marshaller;
    protected final HttpClient httpClient;

   public BaseController(Marshaller marshaller, HttpClient httpClient) {
        this.marshaller = marshaller;
        this.httpClient = httpClient;
    }


    protected void saveToFileXml(Request request, File file) {
        try {
            marshaller.marshal(request, file);
        }
        catch (JAXBException ex) {
            String message = ex.getMessage();
            if (message == null) {
                message = ex.getCause().getMessage();
                if (message == null) {
                    message = "Unidentified JAXB error";
                }
            }
            System.out.println(message);
        }
    }

    protected void saveToXml(Request request, Writer writer) {
        try {
            marshaller.marshal(request, writer);
        }
        catch (JAXBException ex) {
            String message = ex.getMessage();
            if (message == null) {
                message = ex.getCause().getMessage();
                if (message == null) {
                    message = "Unidentified JAXB error";
                }
            }
            System.out.println(message);
        }
    }

}
