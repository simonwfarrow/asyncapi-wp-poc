package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class InvoiceSummaryType {
    
    private @Valid SummaryLevelChargesSubType charges;
    
    private @Valid TaxSummaryType taxAnalysis;
    

    

    
    @JsonProperty("charges")
    public SummaryLevelChargesSubType getCharges() {
        return charges;
    }

    public void setCharges(SummaryLevelChargesSubType charges) {
        this.charges = charges;
    }
    

    
    @JsonProperty("taxAnalysis")
    public TaxSummaryType getTaxAnalysis() {
        return taxAnalysis;
    }

    public void setTaxAnalysis(TaxSummaryType taxAnalysis) {
        this.taxAnalysis = taxAnalysis;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceSummaryType invoiceSummaryType = (InvoiceSummaryType) o;
        return 
            Objects.equals(this.charges, invoiceSummaryType.charges) &&
            Objects.equals(this.taxAnalysis, invoiceSummaryType.taxAnalysis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charges, taxAnalysis);
    }

    @Override
    public String toString() {
        return "class InvoiceSummaryType {\n" +
        
                "    charges: " + toIndentedString(charges) + "\n" +
                "    taxAnalysis: " + toIndentedString(taxAnalysis) + "\n" +
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