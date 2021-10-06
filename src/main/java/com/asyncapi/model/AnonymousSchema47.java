package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema47 {
    
    private @Valid List<TaxAnalysisType> taxLineList;

    @JsonProperty("taxLine")
    public List<TaxAnalysisType> getTaxLine() {
        return taxLineList;
    }

    public void setTaxLine(List<TaxAnalysisType> taxLineList) {
        this.taxLineList = taxLineList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnonymousSchema47 anonymousSchema47 = (AnonymousSchema47) o;
        return 
            Objects.equals(this.taxLineList, anonymousSchema47.taxLineList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxLineList);
    }

    @Override
    public String toString() {
        return "class AnonymousSchema47 {\n" +
        
                "    taxLineList: " + toIndentedString(taxLineList) + "\n" +
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