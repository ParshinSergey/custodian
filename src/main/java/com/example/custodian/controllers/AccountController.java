package com.example.custodian.controllers;

import dmt.custodian2016.Request;
import dmt.custodian2016.TCustomer;
import dmt.custodian2016.THeaderRequest;
import dmt.custodian2016.TbodyRequest;
import jakarta.xml.bind.Marshaller;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@RestController
@RequestMapping(value = "/api/request/account", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
public class AccountController extends BaseController {

   private final static String NEW_ACCOUNT = "newAccount";

   public AccountController(Marshaller marshaller, HttpClient httpClient) {
        super(marshaller, httpClient);
    }


    @PostMapping (value = "/" + NEW_ACCOUNT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Request> getNewAccount (@RequestBody Request request) {
        THeaderRequest tHeaderRequest = Util.getHeaderRequest();
        tHeaderRequest.setRequestType(NEW_ACCOUNT);
        request.setHeader(tHeaderRequest);

        File file = Util.getFile();
        saveToFileXml(request, file);

        return ResponseEntity.ok().body(request);
    }

    @PostMapping (value = "/" + NEW_ACCOUNT + "UO", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Request> getNewAccountUO (@RequestBody Request request) {
        THeaderRequest tHeaderRequest = Util.getHeaderRequest();
        tHeaderRequest.setRequestType(NEW_ACCOUNT);
        request.setHeader(tHeaderRequest);

        Writer writer = new StringWriter();
        saveToXml(request, writer);

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(DECKRA_URL))
                .POST(HttpRequest.BodyPublishers.ofString(writer.toString()))
                .header("Content-Type", "application/xml")
                .build();


        HttpResponse<String> responce = null;
        try {
            responce = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(responce.body());

        return ResponseEntity.ok().body(request);
    }


    @PostMapping (value = "/" + NEW_ACCOUNT + "FO", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Request> getNewAccountFO (@RequestParam Request request) {
        THeaderRequest tHeaderRequest = Util.getHeaderRequest();
        tHeaderRequest.setRequestType(NEW_ACCOUNT);
        request.setHeader(tHeaderRequest);

        TCustomer tCustomer = new TCustomer();
        tCustomer.setAccount(null);
        tCustomer.setCustomerID(null);
        tCustomer.setCNUM(null);
        tCustomer.setCountry(null);
        tCustomer.setCountryTax(null);
        tCustomer.setIdCode(null);
        tCustomer.setClientTypeCode(null);
        tCustomer.setName(null);
        tCustomer.setAddresses(null);
        tCustomer.setDocFO(null);
        tCustomer.setDocUO(null);
        tCustomer.setBankDetails(null);
        tCustomer.setAddParams(null);
        tCustomer.setContact(null);
        tCustomer.setBirthInfo(null);
        tCustomer.setFund(null);
        tCustomer.setCurrency(null);
        tCustomer.setRefusingCode(null);
        tCustomer.setForm(null);

        TbodyRequest tbodyRequest = new TbodyRequest();
        tbodyRequest.setCustomer(tCustomer);
        request.setBody(tbodyRequest);


        File file = Util.getFile();
        saveToFileXml(request, file);

        return ResponseEntity.ok().body(request);
    }


}
