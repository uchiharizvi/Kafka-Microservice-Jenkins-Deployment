package com.example.demo.kafka;

import org.apache.kafka.clients.producer.Producer;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;

import java.util.Properties;

public class MyKafkaProducer {
    private final static String TOPIC = "users";
    private final static String BOOTSTRAP_SERVERS = "192.168.1.1:9092,192.168.1.1:9093,192.168.1.1:9094";

    private static Producer<Long, String> createProducer(){
        Properties props = new Properties();
        /*props.put-*/
    }
}
