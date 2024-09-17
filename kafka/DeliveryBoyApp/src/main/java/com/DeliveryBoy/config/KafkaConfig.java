package com.DeliveryBoy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){                    //(step1)topic create here


        return TopicBuilder
                .name(AppConstants.LOCATION_TOPIC_NAME)   // "location-update-topic"
//                .partitions()
//                .replicas()
                .build();

    }
}
