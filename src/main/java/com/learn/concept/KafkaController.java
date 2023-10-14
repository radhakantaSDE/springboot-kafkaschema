package com.learn.concept;

import com.learn.concept.model.User;
import com.learn.concept.producers.KafkaProducerOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducerOne kafkaProducerOne;

    @GetMapping("message/{id}")
    public void kafkaController(@PathVariable("id")String id) throws ExecutionException, InterruptedException {
        User user = new User(id, 10.0);
        kafkaProducerOne.produce(user);
    }
}
