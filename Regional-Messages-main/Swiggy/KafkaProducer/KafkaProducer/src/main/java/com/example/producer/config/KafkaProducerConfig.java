package com.example.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {

    // State topics
    @Bean
    public NewTopic createStateMaharashtraTopic() {
        return new NewTopic("india-state-maharashtra", 5, (short) 1);
    }

    @Bean
    public NewTopic createStateAndhraPradeshTopic() {
        return new NewTopic("india-state-andhra-pradesh", 5, (short) 1);
    }

    @Bean
    public NewTopic createStateMadhyaPradeshTopic() {
        return new NewTopic("india-state-madhya-pradesh", 5, (short) 1);
    }

    @Bean
    public NewTopic createStateUttarPradeshTopic() {
        return new NewTopic("india-state-uttar-pradesh", 5, (short) 1);
    }

    // City topics under Maharashtra
    @Bean
    public NewTopic createCityMumbaiTopic() {
        return new NewTopic("india-city-maharashtra-mumbai", 5, (short) 1);
    }

    @Bean
    public NewTopic createCityPuneTopic() {
        return new NewTopic("india-city-maharashtra-pune", 5, (short) 1);
    }

    @Bean
    public NewTopic createCityNagpurTopic() {
        return new NewTopic("india-city-maharashtra-nagpur", 5, (short) 1);
    }

    // City topics under Andhra Pradesh
    @Bean
    public NewTopic createCityVijayawadaTopic() {
        return new NewTopic("india-city-andhra-pradesh-vijayawada", 5, (short) 1);
    }

    @Bean
    public NewTopic createCityVisakhapatnamTopic() {
        return new NewTopic("india-city-andhra-pradesh-visakhapatnam", 5, (short) 1);
    }

    @Bean
    public NewTopic createCityGunturTopic() {
        return new NewTopic("india-city-andhra-pradesh-guntur", 5, (short) 1);
    }

    // City topics under Madhya Pradesh
    @Bean
    public NewTopic createCityBhopalTopic() {
        return new NewTopic("india-city-madhya-pradesh-bhopal", 5, (short) 1);
    }

    @Bean
    public NewTopic createCityIndoreTopic() {
        return new NewTopic("india-city-madhya-pradesh-indore", 5, (short) 1);
    }

    @Bean
    public NewTopic createCityGwaliorTopic() {
        return new NewTopic("india-city-madhya-pradesh-gwalior", 5, (short) 1);
    }

    // City topics under Uttar Pradesh
    @Bean
    public NewTopic createCityLucknowTopic() {
        return new NewTopic("india-city-uttar-pradesh-lucknow", 5, (short) 1);
    }

    @Bean
    public NewTopic createCityKanpurTopic() {
        return new NewTopic("india-city-uttar-pradesh-kanpur", 5, (short) 1);
    }

    @Bean
    public NewTopic createCityVaranasiTopic() {
        return new NewTopic("india-city-uttar-pradesh-varanasi", 5, (short) 1);
    }
}
