package br.com.owlcat.springboot_kafka_tutorial.kafka;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        LOGGER.info(String.format("Sending message: %s", message));
        kafkaTemplate.send("javaGuides", message);
    }
    
}
