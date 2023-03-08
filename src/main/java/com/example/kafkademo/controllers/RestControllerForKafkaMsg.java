package com.example.kafkademo.controllers;

import com.example.kafkademo.services.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {

    private final ProducerService service;

    @GetMapping("/producerMsg")
    public void getMessageFromClient(@RequestParam(name = "message") String message){
        service.sendMsgToTopic(message);
    }
}
