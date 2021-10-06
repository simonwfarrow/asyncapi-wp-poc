package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class SummaryChargeFundingCurrencyLevelType {
    
    private @Valid String fundingCurrencyCode;
    

    

    
    @JsonProperty("fundingCurrencyCode")
    public String getFundingCurrencyCode() {
        return fundingCurrencyCode;
    }

    public void setFundingCurrencyCode(String fundingCurrencyCode) {
        this.fundingCurrencyCode = fundingCurrencyCode;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SummaryChargeFundingCurrencyLevelType summaryChargeFundingCurrencyLevelType = (SummaryChargeFundingCurrencyLevelType) o;
        return 
            Objects.equals(this.fundingCurrencyCode, summaryChargeFundingCurrencyLevelType.fundingCurrencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundingCurrencyCode);
    }

    @Override
    public String toString() {
        return "class SummaryChargeFundingCurrencyLevelType {\n" +
        
                "    fundingCurrencyCode: " + toIndentedString(fundingCurrencyCode) + "\n" +
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