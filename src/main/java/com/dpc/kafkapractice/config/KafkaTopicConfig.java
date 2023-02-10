package com.dpc.kafkapractice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    // responsible for creating topics
    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name("topic1").build();
    }
}
