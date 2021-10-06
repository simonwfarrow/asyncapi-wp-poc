package com.asyncapi;

 
import com.asyncapi.model.BillRequest;
 
 
import com.asyncapi.model.BillRequest;
 
import com.asyncapi.service.PublisherService;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import org.springframework.kafka.test.rule.EmbeddedKafkaRule;
import org.springframework.kafka.test.utils.KafkaTestUtils;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.util.AssertionErrors.assertEquals;

/**
 * Example of tests for kafka based on spring-kafka-test library
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleKafkaTest {
     
    private static final String PMSBILLREQUEST_UUID1_TOPIC = "PMS_BILLREQUEST";
     
    private static final String PMSBILLREQUEST_UUID2_TOPIC = "PMS_BILLREQUEST";
     
    @ClassRule
    public static EmbeddedKafkaRule embeddedKafka = new EmbeddedKafkaRule(1, false, 1, PMSBILLREQUEST_UUID1_TOPIC);

    private static EmbeddedKafkaBroker embeddedKafkaBroker = embeddedKafka.getEmbeddedKafka();

    @DynamicPropertySource
    public static void kafkaProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.kafka.bootstrap-servers", embeddedKafkaBroker::getBrokersAsString);
    }

    
    @Autowired
    private PublisherService publisherService;
     
    Consumer<Integer, BillRequest> consumerPmsBillrequest;
       
    Producer<Integer, Object> producer;
    
    @Before
    public void init() {
        
        Map<String, Object> consumerConfigs = new HashMap<>(KafkaTestUtils.consumerProps("consumer", "true", embeddedKafkaBroker));
        consumerConfigs.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
         
        consumerPmsBillrequest = new DefaultKafkaConsumerFactory<>(consumerConfigs, new IntegerDeserializer(), new JsonDeserializer<>(BillRequest.class)).createConsumer();
        consumerPmsBillrequest.subscribe(Collections.singleton(PMSBILLREQUEST_UUID1_TOPIC));
        consumerPmsBillrequest.poll(Duration.ZERO);
           
        Map<String, Object> producerConfigs = new HashMap<>(KafkaTestUtils.producerProps(embeddedKafkaBroker));
        producer = new DefaultKafkaProducerFactory<>(producerConfigs, new IntegerSerializer(), new JsonSerializer()).createProducer();
        
    }
     
    @Test
    public void pmsbillrequestUuid1ProducerTest() {
        BillRequest payload = new BillRequest();
        Integer key = 1;

        KafkaTestUtils.getRecords(consumerPmsBillrequest);

        publisherService.pmsbillrequestUuid1(key, payload);

        ConsumerRecord<Integer, BillRequest> singleRecord = KafkaTestUtils.getSingleRecord(consumerPmsBillrequest, PMSBILLREQUEST_UUID1_TOPIC);

        assertEquals("Key is wrong", key, singleRecord.key());
    }
         
    @Test
    public void pmsbillrequestUuid2ConsumerTest() throws InterruptedException {
        Integer key = 1;
        BillRequest payload = new BillRequest();

        ProducerRecord<Integer, Object> producerRecord = new ProducerRecord<>(PMSBILLREQUEST_UUID2_TOPIC, key, payload);
        producer.send(producerRecord);
        producer.flush();
        Thread.sleep(1_000);
    }
        
    
}
