package joydeep.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import joydeep.kafka.consumer.model.User;

@Service
public class KafkaConsumer 
    {
	    @KafkaListener(topics="kafka_example",groupId = "group_id")
        public void consume(String message)
        {
        	System.out.println("Consumed message "+message);
        }
	    
	    @KafkaListener(topics="kafka_example_json",groupId = "group_id_json",containerFactory = "userKafkaListenerFactory")
        public void consumeJson(User user)
        {
	    	System.out.println("Consumed json user :"+user);
        }
    }
