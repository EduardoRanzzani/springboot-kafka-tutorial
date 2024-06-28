package br.com.owlcat.springboot_kafka_tutorial.kafka;

import br.com.owlcat.springboot_kafka_tutorial.payload.User;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "javaGuides", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Received message -> %s", message));
    }

}
