package com.example.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessageToStateAndCity(String message, String state, String city) {
        String stateTopic = "india-state-" + state.toLowerCase().replace(" ", "-");
        String cityTopic = "india-city-" + state.toLowerCase().replace(" ", "-") + "-" + city.toLowerCase().replace(" ", "-");

        // Send to state topic
        // It allows handling the result or any errors that may occur during the sending process.
        CompletableFuture<SendResult<String, String>> stateFuture = kafkaTemplate.send(stateTopic, message);
        //whenComplete: This method gets called when the message is successfully sent or if an error occurs.
        stateFuture.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + message + "] to state topic=[" + stateTopic + "] with offset=" + result.getRecordMetadata().offset());
            } else {
                System.out.println("Unable to send message=[" + message + "] to state topic due to : " + ex.getMessage());
            }
        });

        // Send to city topic
        CompletableFuture<SendResult<String, String>> cityFuture = kafkaTemplate.send(cityTopic, message);
        cityFuture.whenComplete((result, ex) -> {
            if (ex == null) {
                System.out.println("Sent message=[" + message + "] to city topic=[" + cityTopic + "] with offset=" + result.getRecordMetadata().offset());
            } else {
                System.out.println("Unable to send message=[" + message + "] to city topic due to : " + ex.getMessage());
            }
        });
    }
}
