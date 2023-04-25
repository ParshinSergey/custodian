package com.example.custodian.controllers;

import dmt.custodian2016.Request;
import dmt.custodian2016.THeaderRequest;
import jakarta.xml.bind.Marshaller;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/request/account", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
public class AccountController extends BaseController {

    private final static String NEW_ACCOUNT = "newAccount";

   public AccountController(Marshaller marshaller) {
        super(marshaller);
    }


    @GetMapping(value = "/" + NEW_ACCOUNT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Request> getNewAccount(@RequestBody Request request) {
        THeaderRequest header = new THeaderRequest();
        header.setRequestType(NEW_ACCOUNT);
        header.setRequestID(UUID.randomUUID().toString());
        header.setTimeStamp(Util.xmlGregorianCalendar());
        header.setSourceAPPidentity("1DD4EC32-45DB-404A-A123-6F657895E502");
        request.setHeader(header);

        File file = Util.getFile();
        saveToXml(request, file);

        return ResponseEntity.ok().body(request);
    }



}
