package br.com.owlcat.springboot_kafka_tutorial.controller;

import br.com.owlcat.springboot_kafka_tutorial.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/kafka")
public class MessageController {
    private final KafkaProducer kafkaProducer;

    // http://localhost:8080/api/v1/kafka/publish?message=hello World
    @GetMapping("/publish")
    public ResponseEntity<String> publish(@RequestParam("message") String message) {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the topic");
    }

}
