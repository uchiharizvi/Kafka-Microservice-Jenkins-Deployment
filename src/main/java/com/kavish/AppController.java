package com.kavish;

import com.kavish.kafka.MyKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class AppController {

    @Autowired
    private MyKafkaProducer producer;

    @PostMapping("v1/write")
    public String writeToMessageQueue(@RequestBody String payload) {
        producer.sendMessage(payload);
        return "Message Successfully Pushed";
    }
}
