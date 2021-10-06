package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class DetailedChargeFundingCurrencyLevelType {
    
    private @Valid String fundingCurrencyCode;
    
    private @Valid String headerName;
    
    private @Valid String pricingCurrencyCode;
    
    private @Valid String priceToChargeExchangeRate;
    
    private @Valid String priceToChargeExchangeMessage;
    
    private @Valid String fundToChargeExchangeRate;
    
    private @Valid String fundToChargeExchangeMessage;
    
    private @Valid Object chargesGroup;
    
    private @Valid Object chargesList;
    
    private @Valid DetailedChargeType chargesSummary;
    
    private @Valid DetailedChargeType chargesGroupSummary;
    

    

    
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
    

    
    @JsonProperty("chargesGroup")
    public Object getChargesGroup() {
        return chargesGroup;
    }

    public void setChargesGroup(Object chargesGroup) {
        this.chargesGroup = chargesGroup;
    }
    

    
    @JsonProperty("chargesList")
    public Object getChargesList() {
        return chargesList;
    }

    public void setChargesList(Object chargesList) {
        this.chargesList = chargesList;
    }
    

    
    @JsonProperty("chargesSummary")
    public DetailedChargeType getChargesSummary() {
        return chargesSummary;
    }

    public void setChargesSummary(DetailedChargeType chargesSummary) {
        this.chargesSummary = chargesSummary;
    }
    

    
    @JsonProperty("chargesGroupSummary")
    public DetailedChargeType getChargesGroupSummary() {
        return chargesGroupSummary;
    }

    public void setChargesGroupSummary(DetailedChargeType chargesGroupSummary) {
        this.chargesGroupSummary = chargesGroupSummary;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailedChargeFundingCurrencyLevelType detailedChargeFundingCurrencyLevelType = (DetailedChargeFundingCurrencyLevelType) o;
        return 
            Objects.equals(this.fundingCurrencyCode, detailedChargeFundingCurrencyLevelType.fundingCurrencyCode) &&
            Objects.equals(this.headerName, detailedChargeFundingCurrencyLevelType.headerName) &&
            Objects.equals(this.pricingCurrencyCode, detailedChargeFundingCurrencyLevelType.pricingCurrencyCode) &&
            Objects.equals(this.priceToChargeExchangeRate, detailedChargeFundingCurrencyLevelType.priceToChargeExchangeRate) &&
            Objects.equals(this.priceToChargeExchangeMessage, detailedChargeFundingCurrencyLevelType.priceToChargeExchangeMessage) &&
            Objects.equals(this.fundToChargeExchangeRate, detailedChargeFundingCurrencyLevelType.fundToChargeExchangeRate) &&
            Objects.equals(this.fundToChargeExchangeMessage, detailedChargeFundingCurrencyLevelType.fundToChargeExchangeMessage) &&
            Objects.equals(this.chargesGroup, detailedChargeFundingCurrencyLevelType.chargesGroup) &&
            Objects.equals(this.chargesList, detailedChargeFundingCurrencyLevelType.chargesList) &&
            Objects.equals(this.chargesSummary, detailedChargeFundingCurrencyLevelType.chargesSummary) &&
            Objects.equals(this.chargesGroupSummary, detailedChargeFundingCurrencyLevelType.chargesGroupSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundingCurrencyCode, headerName, pricingCurrencyCode, priceToChargeExchangeRate, priceToChargeExchangeMessage, fundToChargeExchangeRate, fundToChargeExchangeMessage, chargesGroup, chargesList, chargesSummary, chargesGroupSummary);
    }

    @Override
    public String toString() {
        return "class DetailedChargeFundingCurrencyLevelType {\n" +
        
                "    fundingCurrencyCode: " + toIndentedString(fundingCurrencyCode) + "\n" +
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    pricingCurrencyCode: " + toIndentedString(pricingCurrencyCode) + "\n" +
                "    priceToChargeExchangeRate: " + toIndentedString(priceToChargeExchangeRate) + "\n" +
                "    priceToChargeExchangeMessage: " + toIndentedString(priceToChargeExchangeMessage) + "\n" +
                "    fundToChargeExchangeRate: " + toIndentedString(fundToChargeExchangeRate) + "\n" +
                "    fundToChargeExchangeMessage: " + toIndentedString(fundToChargeExchangeMessage) + "\n" +
                "    chargesGroup: " + toIndentedString(chargesGroup) + "\n" +
                "    chargesList: " + toIndentedString(chargesList) + "\n" +
                "    chargesSummary: " + toIndentedString(chargesSummary) + "\n" +
                "    chargesGroupSummary: " + toIndentedString(chargesGroupSummary) + "\n" +
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