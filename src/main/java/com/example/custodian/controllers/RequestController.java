package com.example.custodian.controllers;

import dmt.custodian2016.Request;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static com.example.custodian.config.AppConfiguration.DIRECTORY;

@RestController
@RequestMapping(value = "/api/request", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
public class RequestController {

    private final Marshaller marshaller;

    public RequestController(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    @GetMapping(value = "/balance", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Request> getBalanceToFile(@RequestBody Request request) {
        File file;
        try {
            Path tempRequest = Files.createTempFile(Path.of(DIRECTORY), "request", ".xml");
            file = new File(tempRequest.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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

        return ResponseEntity.ok().body(request);
    }

}
