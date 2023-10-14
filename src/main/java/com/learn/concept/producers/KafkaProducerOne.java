package com.learn.concept.producers;

import com.learn.concept.model.User;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Component
public class KafkaProducerOne {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void produce(User user) throws ExecutionException, InterruptedException {

        ProducerRecord<String, User> record =
                new ProducerRecord<>("second_topic", user.getId(), user);
        ListenableFuture<SendResult<String, User>> metadataFuture = kafkaTemplate.send(record);
        System.out.println(metadataFuture.get().getRecordMetadata().toString());
    }
}
