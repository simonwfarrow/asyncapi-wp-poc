package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class ChargeSummaryType {
    
    private @Valid String headerName;
    
    private @Valid String chargeAmount;
    

    

    
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    

    
    @JsonProperty("chargeAmount")
    public String getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChargeSummaryType chargeSummaryType = (ChargeSummaryType) o;
        return 
            Objects.equals(this.headerName, chargeSummaryType.headerName) &&
            Objects.equals(this.chargeAmount, chargeSummaryType.chargeAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerName, chargeAmount);
    }

    @Override
    public String toString() {
        return "class ChargeSummaryType {\n" +
        
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    chargeAmount: " + toIndentedString(chargeAmount) + "\n" +
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