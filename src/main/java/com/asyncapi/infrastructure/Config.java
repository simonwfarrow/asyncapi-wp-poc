package com.asyncapi.infrastructure;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.*;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class Config {

    @Value("${spring.kafka.bootstrap-servers}")
    private String bootstrapServers;

    @Value("${spring.kafka.listener.poll-timeout}")
    private long pollTimeout;

    @Value("${spring.kafka.listener.concurrency}")
    private int concurrency;
    @Bean
    public KafkaTemplate<Integer, Object> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }

    @Bean
    public ProducerFactory<Integer, Object> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    @Bean
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    props.put(JsonSerializer.TYPE_MAPPINGS,
        "billRequest:com.asyncapi.model.BillRequest," +
        
        "invoiceType:com.asyncapi.model.InvoiceType," +
        
        "invoiceHeaderType:com.asyncapi.model.InvoiceHeaderType," +
        
        "marketingMessagesType:com.asyncapi.model.MarketingMessagesType," +
        
        "brochureType:com.asyncapi.model.BrochureType," +
        
        "merchantBankAccountType:com.asyncapi.model.MerchantBankAccountType," +
        
        "worldpayBankAccountType:com.asyncapi.model.WorldpayBankAccountType," +
        
        "invoiceSummaryType:com.asyncapi.model.InvoiceSummaryType," +
        
        "summaryLevelChargesSubType:com.asyncapi.model.SummaryLevelChargesSubType," +
        
        "chargeSummaryType:com.asyncapi.model.ChargeSummaryType," +
        
        "taxSummaryType:com.asyncapi.model.TaxSummaryType," +
        
        "taxAnalysisType:com.asyncapi.model.TaxAnalysisType," +
        
        "creditNoteType:com.asyncapi.model.CreditNoteType," +
        
        "creditNoteHeaderType:com.asyncapi.model.CreditNoteHeaderType," +
        
        "packageInfoType:com.asyncapi.model.PackageInfoType," +
        
        "summariesCardListType:com.asyncapi.model.SummariesCardListType," +
        
        "summariesCardsType:com.asyncapi.model.SummariesCardsType," +
        
        "summariesChargeListType:com.asyncapi.model.SummariesChargeListType," +
        
        "detailedCardFundingCurrencyLevelType:com.asyncapi.model.DetailedCardFundingCurrencyLevelType," +
        
        "cardTxnSummaryType:com.asyncapi.model.CardTxnSummaryType," +
        
        "cardType:com.asyncapi.model.CardType," +
        
        "transactionType:com.asyncapi.model.TransactionType," +
        
        "detailedChargeFundingCurrencyLevelType:com.asyncapi.model.DetailedChargeFundingCurrencyLevelType," +
        
        "detailedChargeType:com.asyncapi.model.DetailedChargeType," +
        
        "detailedBatchTotalFundingCurrencyLevelType:com.asyncapi.model.DetailedBatchTotalFundingCurrencyLevelType," +
        
        "batchListType:com.asyncapi.model.BatchListType," +
        
        "batchTotalType:com.asyncapi.model.BatchTotalType," +
        
        "summaryChargeFundingCurrencyLevelType:com.asyncapi.model.SummaryChargeFundingCurrencyLevelType," +
        
        "summaryChargeFundingCurrencySubType:com.asyncapi.model.SummaryChargeFundingCurrencySubType," +
        
        "txnPartyType:com.asyncapi.model.TxnPartyType," +
        
        "fundingCurrencyType:com.asyncapi.model.FundingCurrencyType," +
        
        "txnPartySummaryType:com.asyncapi.model.TxnPartySummaryType," +
        
        "detailedChargeTopCategoryType:com.asyncapi.model.DetailedChargeTopCategoryType," +
        
        "invoiceDetailsType:com.asyncapi.model.InvoiceDetailsType," +
        
        "overpaymentsType:com.asyncapi.model.OverpaymentsType," +
        
        "creditNoteNettingType:com.asyncapi.model.CreditNoteNettingType," +
        
        "creditNoteDetailsType:com.asyncapi.model.CreditNoteDetailsType," +
        
        "midBatchTotalType:com.asyncapi.model.MidBatchTotalType," +
        
        "merchantDetailsType:com.asyncapi.model.MerchantDetailsType," +
        
        "communicationChannelType:com.asyncapi.model.CommunicationChannelType," +
        
        "addressType:com.asyncapi.model.AddressType," +
        
        "emailType:com.asyncapi.model.EmailType," +
        
        "worldpayType:com.asyncapi.model.WorldpayType"
        );
        // See https://kafka.apache.org/documentation/#producerconfigs for more properties
        return props;
    }

    @Bean
    KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<Integer, Object>>
    kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<Integer, Object> factory =
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setConcurrency(concurrency);
        factory.getContainerProperties().setPollTimeout(pollTimeout);
        return factory;
    }

    @Bean
    public ConsumerFactory<Integer, Object> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    @Bean
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, IntegerDeserializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(JsonDeserializer.TYPE_MAPPINGS,
        "billRequest:com.asyncapi.model.BillRequest," +
        
        "invoiceType:com.asyncapi.model.InvoiceType," +
        
        "invoiceHeaderType:com.asyncapi.model.InvoiceHeaderType," +
        
        "marketingMessagesType:com.asyncapi.model.MarketingMessagesType," +
        
        "brochureType:com.asyncapi.model.BrochureType," +
        
        "merchantBankAccountType:com.asyncapi.model.MerchantBankAccountType," +
        
        "worldpayBankAccountType:com.asyncapi.model.WorldpayBankAccountType," +
        
        "invoiceSummaryType:com.asyncapi.model.InvoiceSummaryType," +
        
        "summaryLevelChargesSubType:com.asyncapi.model.SummaryLevelChargesSubType," +
        
        "chargeSummaryType:com.asyncapi.model.ChargeSummaryType," +
        
        "taxSummaryType:com.asyncapi.model.TaxSummaryType," +
        
        "taxAnalysisType:com.asyncapi.model.TaxAnalysisType," +
        
        "creditNoteType:com.asyncapi.model.CreditNoteType," +
        
        "creditNoteHeaderType:com.asyncapi.model.CreditNoteHeaderType," +
        
        "packageInfoType:com.asyncapi.model.PackageInfoType," +
        
        "summariesCardListType:com.asyncapi.model.SummariesCardListType," +
        
        "summariesCardsType:com.asyncapi.model.SummariesCardsType," +
        
        "summariesChargeListType:com.asyncapi.model.SummariesChargeListType," +
        
        "detailedCardFundingCurrencyLevelType:com.asyncapi.model.DetailedCardFundingCurrencyLevelType," +
        
        "cardTxnSummaryType:com.asyncapi.model.CardTxnSummaryType," +
        
        "cardType:com.asyncapi.model.CardType," +
        
        "transactionType:com.asyncapi.model.TransactionType," +
        
        "detailedChargeFundingCurrencyLevelType:com.asyncapi.model.DetailedChargeFundingCurrencyLevelType," +
        
        "detailedChargeType:com.asyncapi.model.DetailedChargeType," +
        
        "detailedBatchTotalFundingCurrencyLevelType:com.asyncapi.model.DetailedBatchTotalFundingCurrencyLevelType," +
        
        "batchListType:com.asyncapi.model.BatchListType," +
        
        "batchTotalType:com.asyncapi.model.BatchTotalType," +
        
        "summaryChargeFundingCurrencyLevelType:com.asyncapi.model.SummaryChargeFundingCurrencyLevelType," +
        
        "summaryChargeFundingCurrencySubType:com.asyncapi.model.SummaryChargeFundingCurrencySubType," +
        
        "txnPartyType:com.asyncapi.model.TxnPartyType," +
        
        "fundingCurrencyType:com.asyncapi.model.FundingCurrencyType," +
        
        "txnPartySummaryType:com.asyncapi.model.TxnPartySummaryType," +
        
        "detailedChargeTopCategoryType:com.asyncapi.model.DetailedChargeTopCategoryType," +
        
        "invoiceDetailsType:com.asyncapi.model.InvoiceDetailsType," +
        
        "overpaymentsType:com.asyncapi.model.OverpaymentsType," +
        
        "creditNoteNettingType:com.asyncapi.model.CreditNoteNettingType," +
        
        "creditNoteDetailsType:com.asyncapi.model.CreditNoteDetailsType," +
        
        "midBatchTotalType:com.asyncapi.model.MidBatchTotalType," +
        
        "merchantDetailsType:com.asyncapi.model.MerchantDetailsType," +
        
        "communicationChannelType:com.asyncapi.model.CommunicationChannelType," +
        
        "addressType:com.asyncapi.model.AddressType," +
        
        "emailType:com.asyncapi.model.EmailType," +
        
        "worldpayType:com.asyncapi.model.WorldpayType"
        );
        props.put(JsonDeserializer.TRUSTED_PACKAGES, "com.asyncapi.model");
        return props;
    }

}
