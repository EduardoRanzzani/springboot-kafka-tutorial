package br.com.owlcat.springboot_kafka_tutorial.controller;

import br.com.owlcat.springboot_kafka_tutorial.kafka.JsonKafkaProducer;
import br.com.owlcat.springboot_kafka_tutorial.payload.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private final JsonKafkaProducer kafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to kafka topic");
    }

}
