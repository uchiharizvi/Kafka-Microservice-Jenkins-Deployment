package com.kavish.kafka;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.Properties;

public class MyKafkaConsumer {
    @Value(value = "${users.topic.name}")
    private String usersTopicName;

    @KafkaListener(topics = "dev-user", groupId = "")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message " + message);
    }
}
