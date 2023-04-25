package com.example.custodian.controllers;

import dmt.custodian2016.Request;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class BaseController {

    private final Marshaller marshaller;

    public BaseController(Marshaller marshaller) {
        this.marshaller = marshaller;
    }


    protected void saveToXml(Request request, File file) {
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

}
