package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class TaxSummaryType {
    
    private @Valid List<TaxAnalysisType> taxLinesList;
    
    private @Valid String totalTaxAmountBillCurrency;
    
    private @Valid AnonymousSchema54 totalTaxAmountLocalCurrency;
    

    

    
    @JsonProperty("taxLines")
    public List<TaxAnalysisType> getTaxLines() {
        return taxLinesList;
    }

    public void setTaxLines(List<TaxAnalysisType> taxLinesList) {
        this.taxLinesList = taxLinesList;
    }
    

    
    @JsonProperty("totalTaxAmountBillCurrency")
    public String getTotalTaxAmountBillCurrency() {
        return totalTaxAmountBillCurrency;
    }

    public void setTotalTaxAmountBillCurrency(String totalTaxAmountBillCurrency) {
        this.totalTaxAmountBillCurrency = totalTaxAmountBillCurrency;
    }
    

    
    @JsonProperty("totalTaxAmountLocalCurrency")
    public AnonymousSchema54 getTotalTaxAmountLocalCurrency() {
        return totalTaxAmountLocalCurrency;
    }

    public void setTotalTaxAmountLocalCurrency(AnonymousSchema54 totalTaxAmountLocalCurrency) {
        this.totalTaxAmountLocalCurrency = totalTaxAmountLocalCurrency;
    }
    
    

    @Override
    public String toString() {
        return "class TaxSummaryType {\n" +
        
                "    taxLinesList: " + toIndentedString(taxLinesList) + "\n" +
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