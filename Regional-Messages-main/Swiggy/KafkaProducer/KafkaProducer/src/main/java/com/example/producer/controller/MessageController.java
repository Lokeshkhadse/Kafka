package com.example.producer.controller;


import com.example.producer.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private KafkaMessagePublisher publisher;

    @GetMapping("/send")
    public String sendMessage(
            @RequestParam("message") String message,
            @RequestParam("state") String state,
            @RequestParam("city") String city) {

        publisher.sendMessageToStateAndCity(message, state, city);
        return "Message sent to state: " + state + ", city: " + city;
    }
}
