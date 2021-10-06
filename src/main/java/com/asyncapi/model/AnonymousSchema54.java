package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema54 {
    
    private @Valid String localTotalTaxAmount;
    
    private @Valid String localCurrencyCode;
    
    private @Valid String exchangeRate;
    

    

    
    @JsonProperty("localTotalTaxAmount")
    public String getLocalTotalTaxAmount() {
        return localTotalTaxAmount;
    }

    public void setLocalTotalTaxAmount(String localTotalTaxAmount) {
        this.localTotalTaxAmount = localTotalTaxAmount;
    }
    

    
    @JsonProperty("localCurrencyCode")
    public String getLocalCurrencyCode() {
        return localCurrencyCode;
    }

    public void setLocalCurrencyCode(String localCurrencyCode) {
        this.localCurrencyCode = localCurrencyCode;
    }
    

    
    @JsonProperty("exchangeRate")
    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
    

    @Override
    public String toString() {
        return "class AnonymousSchema54 {\n" +
        
                "    localTotalTaxAmount: " + toIndentedString(localTotalTaxAmount) + "\n" +
                "    localCurrencyCode: " + toIndentedString(localCurrencyCode) + "\n" +
                "    exchangeRate: " + toIndentedString(exchangeRate) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
           return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}