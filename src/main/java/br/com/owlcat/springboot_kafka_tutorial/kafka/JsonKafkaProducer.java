package br.com.owlcat.springboot_kafka_tutorial.kafka;

import br.com.owlcat.springboot_kafka_tutorial.payload.User;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JsonKafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);
    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User data) {
        LOGGER.info(String.format("Message sent -> %s", data.toString()));
        Message<User> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "javaGuidesJson")
                .build();

        kafkaTemplate.send(message);
    }

}
