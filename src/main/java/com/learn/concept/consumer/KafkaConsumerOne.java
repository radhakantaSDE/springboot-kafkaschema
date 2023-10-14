package com.learn.concept.consumer;


import com.learn.concept.model.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerOne {

    @KafkaListener(topics = "second_topic", groupId = "group_id")
    public void consume(ConsumerRecord<String, User> record) {

        System.out.println("message = " + record);
    }
}
