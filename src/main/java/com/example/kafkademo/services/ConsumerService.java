package com.example.kafkademo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "codeDecode_topic", groupId = "codeDecode_group")
    public void listenToTopic(String receiveMessage){
        System.out.println("The message received is: " + receiveMessage);
    }

}
