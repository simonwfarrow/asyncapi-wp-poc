package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class OverpaymentsType {
    
    private @Valid String currentInvoiceAmount;
    
    private @Valid String overpaymentsAmount;
    
    private @Valid String totalDue;
    
    private @Valid String remainingOverpayment;
    

    

    
    @JsonProperty("currentInvoiceAmount")
    public String getCurrentInvoiceAmount() {
        return currentInvoiceAmount;
    }

    public void setCurrentInvoiceAmount(String currentInvoiceAmount) {
        this.currentInvoiceAmount = currentInvoiceAmount;
    }
    

    
    @JsonProperty("overpaymentsAmount")
    public String getOverpaymentsAmount() {
        return overpaymentsAmount;
    }

    public void setOverpaymentsAmount(String overpaymentsAmount) {
        this.overpaymentsAmount = overpaymentsAmount;
    }
    

    
    @JsonProperty("totalDue")
    public String getTotalDue() {
        return totalDue;
    }

    public void setTotalDue(String totalDue) {
        this.totalDue = totalDue;
    }
    

    
    @JsonProperty("remainingOverpayment")
    public String getRemainingOverpayment() {
        return remainingOverpayment;
    }

    public void setRemainingOverpayment(String remainingOverpayment) {
        this.remainingOverpayment = remainingOverpayment;
    }
    
    

    @Override
    public String toString() {
        return "class OverpaymentsType {\n" +
        
                "    currentInvoiceAmount: " + toIndentedString(currentInvoiceAmount) + "\n" +
                "    overpaymentsAmount: " + toIndentedString(overpaymentsAmount) + "\n" +
                "    totalDue: " + toIndentedString(totalDue) + "\n" +
                "    remainingOverpayment: " + toIndentedString(remainingOverpayment) + "\n" +
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