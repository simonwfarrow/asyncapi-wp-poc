package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema56 {
    
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnonymousSchema56 anonymousSchema56 = (AnonymousSchema56) o;
        return 
            Objects.equals(this.localTotalTaxAmount, anonymousSchema56.localTotalTaxAmount) &&
            Objects.equals(this.localCurrencyCode, anonymousSchema56.localCurrencyCode) &&
            Objects.equals(this.exchangeRate, anonymousSchema56.exchangeRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(localTotalTaxAmount, localCurrencyCode, exchangeRate);
    }

    @Override
    public String toString() {
        return "class AnonymousSchema56 {\n" +
        
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