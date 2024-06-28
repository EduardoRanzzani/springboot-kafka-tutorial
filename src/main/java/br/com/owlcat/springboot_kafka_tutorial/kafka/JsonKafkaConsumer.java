package br.com.owlcat.springboot_kafka_tutorial.kafka;

import br.com.owlcat.springboot_kafka_tutorial.payload.User;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaGuidesJson", groupId = "myGroup")
    public void consume(User data) {
        LOGGER.info(String.format("Received Json message -> %s", data.toString()));
    }

}
