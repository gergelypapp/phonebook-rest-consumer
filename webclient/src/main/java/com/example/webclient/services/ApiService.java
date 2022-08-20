package com.example.webclient.services;


import com.example.webclient.model.Contact;
import reactor.core.publisher.Flux;

public interface ApiService {
    Flux<Contact> getContact();
}
