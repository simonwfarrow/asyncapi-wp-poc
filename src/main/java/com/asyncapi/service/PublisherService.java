package com.asyncapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.asyncapi.model.BillRequest;
    

@Service
public class PublisherService {

    @Autowired
    private KafkaTemplate<Integer, Object> kafkaTemplate;
 
    /**
     * A topic for invoice data publication/subscription
     * A topic (channel) containing invoice data events that consumers can subscribe to, each event will encapsulate all invoice data lines for a single merchant
     */
    public void pmsbillrequestUuid1(Integer key, BillRequest billRequest) {
        Message<BillRequest> message = MessageBuilder.withPayload(billRequest)
                .setHeader(KafkaHeaders.TOPIC, "PMS_BILLREQUEST")
                .setHeader(KafkaHeaders.MESSAGE_KEY, key)
                .build();
        kafkaTemplate.send(message);
    }
}
