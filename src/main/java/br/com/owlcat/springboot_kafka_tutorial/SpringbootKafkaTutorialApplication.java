package br.com.owlcat.springboot_kafka_tutorial;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class SpringbootKafkaTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaTutorialApplication.class, args);
    }



}
