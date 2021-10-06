package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class CreditNoteType {
    
    private @Valid String chargingCurrency;
    
    private @Valid String taxAuthorityCode;
    
    private @Valid CreditNoteHeaderType header;
    
    private @Valid InvoiceSummaryType chargeSummary;
    
    private @Valid AnonymousSchema97 details;
    

    

    
    @JsonProperty("chargingCurrency")
    public String getChargingCurrency() {
        return chargingCurrency;
    }

    public void setChargingCurrency(String chargingCurrency) {
        this.chargingCurrency = chargingCurrency;
    }
    

    
    @JsonProperty("taxAuthorityCode")
    public String getTaxAuthorityCode() {
        return taxAuthorityCode;
    }

    public void setTaxAuthorityCode(String taxAuthorityCode) {
        this.taxAuthorityCode = taxAuthorityCode;
    }
    

    
    @JsonProperty("header")
    public CreditNoteHeaderType getHeader() {
        return header;
    }

    public void setHeader(CreditNoteHeaderType header) {
        this.header = header;
    }
    

    
    @JsonProperty("chargeSummary")
    public InvoiceSummaryType getChargeSummary() {
        return chargeSummary;
    }

    public void setChargeSummary(InvoiceSummaryType chargeSummary) {
        this.chargeSummary = chargeSummary;
    }
    

    
    @JsonProperty("details")
    public AnonymousSchema97 getDetails() {
        return details;
    }

    public void setDetails(AnonymousSchema97 details) {
        this.details = details;
    }
    
    

    @Override
    public String toString() {
        return "class CreditNoteType {\n" +
        
                "    chargingCurrency: " + toIndentedString(chargingCurrency) + "\n" +
                "    taxAuthorityCode: " + toIndentedString(taxAuthorityCode) + "\n" +
                "    header: " + toIndentedString(header) + "\n" +
                "    chargeSummary: " + toIndentedString(chargeSummary) + "\n" +
                "    details: " + toIndentedString(details) + "\n" +
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