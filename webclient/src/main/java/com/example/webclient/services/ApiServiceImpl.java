package com.example.webclient.services;

import com.example.webclient.model.Contact;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class ApiServiceImpl implements ApiService {


    private final WebClient webClient;

    public ApiServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8080/api/contacts").build();
    }

    @Override
    public Flux<Contact> getContact() {
        return this.webClient.get().uri("")
                .retrieve().bodyToFlux(Contact.class);
    }
}
