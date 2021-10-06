package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class TaxAnalysisType {
    
    private @Valid String taxCode;
    
    private @Valid String headerName;
    
    private @Valid String taxNetAmount;
    
    private @Valid String taxRate;
    
    private @Valid String taxAmount;
    
    private @Valid String localNetAmount;
    

    

    
    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
    

    
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    

    
    @JsonProperty("taxNetAmount")
    public String getTaxNetAmount() {
        return taxNetAmount;
    }

    public void setTaxNetAmount(String taxNetAmount) {
        this.taxNetAmount = taxNetAmount;
    }
    

    
    @JsonProperty("taxRate")
    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }
    

    
    @JsonProperty("taxAmount")
    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }
    

    
    @JsonProperty("localNetAmount")
    public String getLocalNetAmount() {
        return localNetAmount;
    }

    public void setLocalNetAmount(String localNetAmount) {
        this.localNetAmount = localNetAmount;
    }
    
    

    @Override
    public String toString() {
        return "class TaxAnalysisType {\n" +
        
                "    taxCode: " + toIndentedString(taxCode) + "\n" +
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    taxNetAmount: " + toIndentedString(taxNetAmount) + "\n" +
                "    taxRate: " + toIndentedString(taxRate) + "\n" +
                "    taxAmount: " + toIndentedString(taxAmount) + "\n" +
                "    localNetAmount: " + toIndentedString(localNetAmount) + "\n" +
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