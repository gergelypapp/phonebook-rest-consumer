package com.example.resttemplate.controllers;

import com.example.resttemplate.model.Contact;
import com.example.resttemplate.services.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestConsumerController {
    ApiService apiService;

    public RestConsumerController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping
    public List<Contact> getContacts(){
        return apiService.getContacts();
    }
}
