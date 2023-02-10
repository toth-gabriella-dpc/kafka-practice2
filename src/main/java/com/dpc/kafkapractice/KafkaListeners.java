package com.dpc.kafkapractice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(
            topics = "topic1",
            groupId =  "groupId"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " :3");
    }
}
