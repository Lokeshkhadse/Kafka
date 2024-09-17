package com.DeliveryBoy.Service;

import com.DeliveryBoy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {       //this is service is used to send msg

    @Autowired
    private KafkaTemplate<String,String>kafkaTemplate;  //by using this we can send msg

    private Logger logger = LoggerFactory.getLogger(KafkaService.class);


    public boolean updateLocation(String location){

        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);  //topic,data
        this.logger.info("message/location produced");
        return true;   //if exception not occur then return true

    }
}
