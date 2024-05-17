package com.kafka.DeliveryBo.service;

import com.kafka.DeliveryBo.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@Service
public class KafkaService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger= LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation()
    {
        for(int i=1;i<=100000;i++) {
            kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, "( "+Math.round(Math.random()*100)+" , "+Math.round(Math.random()*100)+" )");
            logger.info(i+" Location Produced in Kafka");
        }
        return  true;
    }
}
