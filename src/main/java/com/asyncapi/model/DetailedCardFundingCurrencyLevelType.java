package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class DetailedCardFundingCurrencyLevelType {
    
    private @Valid String fundingCurrencyCode;
    
    private @Valid String headerName;
    
    private @Valid String pricingCurrencyCode;
    
    private @Valid String priceToChargeExchangeRate;
    
    private @Valid String priceToChargeExchangeMessage;
    
    private @Valid String fundToChargeExchangeRate;
    
    private @Valid String fundToChargeExchangeMessage;
    
    private @Valid CardTxnSummaryType cardList;
    
    private @Valid Object allCardsSummary;
    

    

    
    @JsonProperty("fundingCurrencyCode")
    public String getFundingCurrencyCode() {
        return fundingCurrencyCode;
    }

    public void setFundingCurrencyCode(String fundingCurrencyCode) {
        this.fundingCurrencyCode = fundingCurrencyCode;
    }
    

    
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    

    
    @JsonProperty("pricingCurrencyCode")
    public String getPricingCurrencyCode() {
        return pricingCurrencyCode;
    }

    public void setPricingCurrencyCode(String pricingCurrencyCode) {
        this.pricingCurrencyCode = pricingCurrencyCode;
    }
    

    
    @JsonProperty("priceToChargeExchangeRate")
    public String getPriceToChargeExchangeRate() {
        return priceToChargeExchangeRate;
    }

    public void setPriceToChargeExchangeRate(String priceToChargeExchangeRate) {
        this.priceToChargeExchangeRate = priceToChargeExchangeRate;
    }
    

    
    @JsonProperty("priceToChargeExchangeMessage")
    public String getPriceToChargeExchangeMessage() {
        return priceToChargeExchangeMessage;
    }

    public void setPriceToChargeExchangeMessage(String priceToChargeExchangeMessage) {
        this.priceToChargeExchangeMessage = priceToChargeExchangeMessage;
    }
    

    
    @JsonProperty("fundToChargeExchangeRate")
    public String getFundToChargeExchangeRate() {
        return fundToChargeExchangeRate;
    }

    public void setFundToChargeExchangeRate(String fundToChargeExchangeRate) {
        this.fundToChargeExchangeRate = fundToChargeExchangeRate;
    }
    

    
    @JsonProperty("fundToChargeExchangeMessage")
    public String getFundToChargeExchangeMessage() {
        return fundToChargeExchangeMessage;
    }

    public void setFundToChargeExchangeMessage(String fundToChargeExchangeMessage) {
        this.fundToChargeExchangeMessage = fundToChargeExchangeMessage;
    }
    

    
    @JsonProperty("cardList")
    public CardTxnSummaryType getCardList() {
        return cardList;
    }

    public void setCardList(CardTxnSummaryType cardList) {
        this.cardList = cardList;
    }
    

    
    @JsonProperty("allCardsSummary")
    public Object getAllCardsSummary() {
        return allCardsSummary;
    }

    public void setAllCardsSummary(Object allCardsSummary) {
        this.allCardsSummary = allCardsSummary;
    }
    
    

    @Override
    public String toString() {
        return "class DetailedCardFundingCurrencyLevelType {\n" +
        
                "    fundingCurrencyCode: " + toIndentedString(fundingCurrencyCode) + "\n" +
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    pricingCurrencyCode: " + toIndentedString(pricingCurrencyCode) + "\n" +
                "    priceToChargeExchangeRate: " + toIndentedString(priceToChargeExchangeRate) + "\n" +
                "    priceToChargeExchangeMessage: " + toIndentedString(priceToChargeExchangeMessage) + "\n" +
                "    fundToChargeExchangeRate: " + toIndentedString(fundToChargeExchangeRate) + "\n" +
                "    fundToChargeExchangeMessage: " + toIndentedString(fundToChargeExchangeMessage) + "\n" +
                "    cardList: " + toIndentedString(cardList) + "\n" +
                "    allCardsSummary: " + toIndentedString(allCardsSummary) + "\n" +
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