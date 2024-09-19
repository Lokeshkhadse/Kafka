package com.example.KafkaConsumer.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    private static final Logger logger = LoggerFactory.getLogger(KafkaMessageListener.class);

    // State listeners
    @KafkaListener(topics = "india-state-maharashtra", groupId = "consumer-group-maharashtra")
    public void consumeFromMaharashtraState(String message) {
        logger.info("Consumer for Maharashtra State received the message: {}", message);
    }

    @KafkaListener(topics = "india-state-andhra-pradesh", groupId = "consumer-group-andhra-pradesh")
    public void consumeFromAndhraPradeshState(String message) {
        logger.info("Consumer for Andhra Pradesh State received the message: {}", message);
    }

    @KafkaListener(topics = "india-state-madhya-pradesh", groupId = "consumer-group-madhya-pradesh")
    public void consumeFromMadhyaPradeshState(String message) {
        logger.info("Consumer for Madhya Pradesh State received the message: {}", message);
    }

    @KafkaListener(topics = "india-state-uttar-pradesh", groupId = "consumer-group-uttar-pradesh")
    public void consumeFromUttarPradeshState(String message) {
        logger.info("Consumer for Uttar Pradesh State received the message: {}", message);
    }

    // City listeners for Maharashtra
    @KafkaListener(topics = "india-city-maharashtra-mumbai", groupId = "consumer-group-mumbai")
    public void consumeFromMumbai(String message) {
        logger.info("Consumer for Mumbai received the message: {}", message);
    }

    @KafkaListener(topics = "india-city-maharashtra-pune", groupId = "consumer-group-pune")
    public void consumeFromPune(String message) {
        logger.info("Consumer for Pune received the message: {}", message);
    }

    @KafkaListener(topics = "india-city-maharashtra-nagpur", groupId = "consumer-group-nagpur")
    public void consumeFromNagpur(String message) {
        logger.info("Consumer for Nagpur received the message: {}", message);
    }

    // City listeners for Andhra Pradesh
    @KafkaListener(topics = "india-city-andhra-pradesh-vijayawada", groupId = "consumer-group-vijayawada")
    public void consumeFromVijayawada(String message) {
        logger.info("Consumer for Vijayawada received the message: {}", message);
    }

    @KafkaListener(topics = "india-city-andhra-pradesh-visakhapatnam", groupId = "consumer-group-visakhapatnam")
    public void consumeFromVisakhapatnam(String message) {
        logger.info("Consumer for Visakhapatnam received the message: {}", message);
    }

    @KafkaListener(topics = "india-city-andhra-pradesh-guntur", groupId = "consumer-group-guntur")
    public void consumeFromGuntur(String message) {
        logger.info("Consumer for Guntur received the message: {}", message);
    }

    // City listeners for Madhya Pradesh
    @KafkaListener(topics = "india-city-madhya-pradesh-bhopal", groupId = "consumer-group-bhopal")
    public void consumeFromBhopal(String message) {
        logger.info("Consumer for Bhopal received the message: {}", message);
    }

    @KafkaListener(topics = "india-city-madhya-pradesh-indore", groupId = "consumer-group-indore")
    public void consumeFromIndore(String message) {
        logger.info("Consumer for Indore received the message: {}", message);
    }

    @KafkaListener(topics = "india-city-madhya-pradesh-gwalior", groupId = "consumer-group-gwalior")
    public void consumeFromGwalior(String message) {
        logger.info("Consumer for Gwalior received the message: {}", message);
    }

    // City listeners for Uttar Pradesh
    @KafkaListener(topics = "india-city-uttar-pradesh-lucknow", groupId = "consumer-group-lucknow")
    public void consumeFromLucknow(String message) {
        logger.info("Consumer for Lucknow received the message: {}", message);
    }

    @KafkaListener(topics = "india-city-uttar-pradesh-kanpur", groupId = "consumer-group-kanpur")
    public void consumeFromKanpur(String message) {
        logger.info("Consumer for Kanpur received the message: {}", message);
    }

    @KafkaListener(topics = "india-city-uttar-pradesh-varanasi", groupId = "consumer-group-varanasi")
    public void consumeFromVaranasi(String message) {
        logger.info("Consumer for Varanasi received the message: {}", message);
    }
}
