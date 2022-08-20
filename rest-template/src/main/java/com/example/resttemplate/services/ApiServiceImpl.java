package com.example.resttemplate.services;

import com.example.resttemplate.model.Contact;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Contact> getContacts() {
        ResponseEntity<Contact[]> response =
                restTemplate.getForEntity(
                        "http://localhost:8080/api/contacts",
                        Contact[].class);
        return Arrays.stream(response.getBody()).toList();
    }
}
