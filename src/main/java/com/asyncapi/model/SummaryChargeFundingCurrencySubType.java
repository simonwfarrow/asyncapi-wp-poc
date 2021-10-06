package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class SummaryChargeFundingCurrencySubType {
    
    private @Valid List<SummaryChargeFundingCurrencyLevelType> fundingCurrencyList;
    

    

    
    @JsonProperty("fundingCurrency")
    public List<SummaryChargeFundingCurrencyLevelType> getFundingCurrency() {
        return fundingCurrencyList;
    }

    public void setFundingCurrency(List<SummaryChargeFundingCurrencyLevelType> fundingCurrencyList) {
        this.fundingCurrencyList = fundingCurrencyList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SummaryChargeFundingCurrencySubType summaryChargeFundingCurrencySubType = (SummaryChargeFundingCurrencySubType) o;
        return 
            Objects.equals(this.fundingCurrencyList, summaryChargeFundingCurrencySubType.fundingCurrencyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundingCurrencyList);
    }

    @Override
    public String toString() {
        return "class SummaryChargeFundingCurrencySubType {\n" +
        
                "    fundingCurrencyList: " + toIndentedString(fundingCurrencyList) + "\n" +
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