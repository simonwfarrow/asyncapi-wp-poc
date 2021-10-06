package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class TaxSummaryType {
    
    private @Valid AnonymousSchema47 taxLines;
    
    private @Valid String totalTaxAmountBillCurrency;
    
    private @Valid AnonymousSchema56 totalTaxAmountLocalCurrency;
    

    

    
    @JsonProperty("taxLines")
    public AnonymousSchema47 getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(AnonymousSchema47 taxLines) {
        this.taxLines = taxLines;
    }
    

    
    @JsonProperty("totalTaxAmountBillCurrency")
    public String getTotalTaxAmountBillCurrency() {
        return totalTaxAmountBillCurrency;
    }

    public void setTotalTaxAmountBillCurrency(String totalTaxAmountBillCurrency) {
        this.totalTaxAmountBillCurrency = totalTaxAmountBillCurrency;
    }
    

    
    @JsonProperty("totalTaxAmountLocalCurrency")
    public AnonymousSchema56 getTotalTaxAmountLocalCurrency() {
        return totalTaxAmountLocalCurrency;
    }

    public void setTotalTaxAmountLocalCurrency(AnonymousSchema56 totalTaxAmountLocalCurrency) {
        this.totalTaxAmountLocalCurrency = totalTaxAmountLocalCurrency;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaxSummaryType taxSummaryType = (TaxSummaryType) o;
        return 
            Objects.equals(this.taxLines, taxSummaryType.taxLines) &&
            Objects.equals(this.totalTaxAmountBillCurrency, taxSummaryType.totalTaxAmountBillCurrency) &&
            Objects.equals(this.totalTaxAmountLocalCurrency, taxSummaryType.totalTaxAmountLocalCurrency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxLines, totalTaxAmountBillCurrency, totalTaxAmountLocalCurrency);
    }

    @Override
    public String toString() {
        return "class TaxSummaryType {\n" +
        
                "    taxLines: " + toIndentedString(taxLines) + "\n" +
                "    totalTaxAmountBillCurrency: " + toIndentedString(totalTaxAmountBillCurrency) + "\n" +
                "    totalTaxAmountLocalCurrency: " + toIndentedString(totalTaxAmountLocalCurrency) + "\n" +
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