package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class InvoiceDetailsType {
    
    private @Valid InvoiceDetailsBillingPartyType billingParty;
    

    

    
    @JsonProperty("billingParty")
    public InvoiceDetailsBillingPartyType getBillingParty() {
        return billingParty;
    }

    public void setBillingParty(InvoiceDetailsBillingPartyType billingParty) {
        this.billingParty = billingParty;
    }
    
    

    @Override
    public String toString() {
        return "class InvoiceDetailsType {\n" +
        
                "    billingParty: " + toIndentedString(billingParty) + "\n" +
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