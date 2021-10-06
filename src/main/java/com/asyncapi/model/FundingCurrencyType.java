package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class FundingCurrencyType {
    
    private @Valid String fundingCurrencyCode;
    
    private @Valid Object charges;
    
    private @Valid TxnPartySummaryType totals;
    
    private @Valid TxnPartySummaryType chargesPayable;
    

    

    
    @JsonProperty("fundingCurrencyCode")
    public String getFundingCurrencyCode() {
        return fundingCurrencyCode;
    }

    public void setFundingCurrencyCode(String fundingCurrencyCode) {
        this.fundingCurrencyCode = fundingCurrencyCode;
    }
    

    
    @JsonProperty("charges")
    public Object getCharges() {
        return charges;
    }

    public void setCharges(Object charges) {
        this.charges = charges;
    }
    

    
    @JsonProperty("totals")
    public TxnPartySummaryType getTotals() {
        return totals;
    }

    public void setTotals(TxnPartySummaryType totals) {
        this.totals = totals;
    }
    

    
    @JsonProperty("chargesPayable")
    public TxnPartySummaryType getChargesPayable() {
        return chargesPayable;
    }

    public void setChargesPayable(TxnPartySummaryType chargesPayable) {
        this.chargesPayable = chargesPayable;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FundingCurrencyType fundingCurrencyType = (FundingCurrencyType) o;
        return 
            Objects.equals(this.fundingCurrencyCode, fundingCurrencyType.fundingCurrencyCode) &&
            Objects.equals(this.charges, fundingCurrencyType.charges) &&
            Objects.equals(this.totals, fundingCurrencyType.totals) &&
            Objects.equals(this.chargesPayable, fundingCurrencyType.chargesPayable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundingCurrencyCode, charges, totals, chargesPayable);
    }

    @Override
    public String toString() {
        return "class FundingCurrencyType {\n" +
        
                "    fundingCurrencyCode: " + toIndentedString(fundingCurrencyCode) + "\n" +
                "    charges: " + toIndentedString(charges) + "\n" +
                "    totals: " + toIndentedString(totals) + "\n" +
                "    chargesPayable: " + toIndentedString(chargesPayable) + "\n" +
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