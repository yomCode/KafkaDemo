package com.example.kafkademo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMsgToTopic(String message){
        kafkaTemplate.send("codeDecode_topic", message);
    }
}
