package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class BatchTotalType {
    
    private @Valid String date;
    
    private @Valid String startRef;
    
    private @Valid String grossAmount;
    
    private @Valid String adjustmentAmount;
    
    private @Valid String netAmount;
    

    

    
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    

    
    @JsonProperty("startRef")
    public String getStartRef() {
        return startRef;
    }

    public void setStartRef(String startRef) {
        this.startRef = startRef;
    }
    

    
    @JsonProperty("grossAmount")
    public String getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(String grossAmount) {
        this.grossAmount = grossAmount;
    }
    

    
    @JsonProperty("adjustmentAmount")
    public String getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(String adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }
    

    
    @JsonProperty("netAmount")
    public String getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(String netAmount) {
        this.netAmount = netAmount;
    }
    
    

    @Override
    public String toString() {
        return "class BatchTotalType {\n" +
        
                "    date: " + toIndentedString(date) + "\n" +
                "    startRef: " + toIndentedString(startRef) + "\n" +
                "    grossAmount: " + toIndentedString(grossAmount) + "\n" +
                "    adjustmentAmount: " + toIndentedString(adjustmentAmount) + "\n" +
                "    netAmount: " + toIndentedString(netAmount) + "\n" +
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