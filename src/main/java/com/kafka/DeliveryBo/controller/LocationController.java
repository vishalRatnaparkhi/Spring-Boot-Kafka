package com.kafka.DeliveryBo.controller;

import com.kafka.DeliveryBo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/locations")
public class LocationController {
    @Autowired
    private KafkaService service;

    @PostMapping("/update")
    public ResponseEntity<?> updateLcoation()
    {
        service.updateLocation();
        return new ResponseEntity<>(Map.of("message","Location Updated" ), HttpStatus.OK);
    }
}
