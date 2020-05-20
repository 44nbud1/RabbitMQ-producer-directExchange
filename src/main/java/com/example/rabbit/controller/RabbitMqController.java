package com.example.rabbit.controller;

import com.example.rabbit.model.Message;
import com.example.rabbit.producer.RabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController
{
    @Autowired
    RabbitMqProducer rabbitMqProducer;

    @PostMapping("/test")
    public ResponseEntity<?> aan(@RequestBody Message aan)
    {
        rabbitMqProducer.testConnection(aan);
        return ResponseEntity.ok("successfully");
    }
}
