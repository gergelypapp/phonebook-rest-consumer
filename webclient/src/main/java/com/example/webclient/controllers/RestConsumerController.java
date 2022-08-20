package com.example.webclient.controllers;

import com.example.webclient.model.Contact;
import com.example.webclient.services.ApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class RestConsumerController {
    ApiService apiService;

    public RestConsumerController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping
    public Flux<Contact> getContacts() {
        return apiService.getContact();
    }
}
