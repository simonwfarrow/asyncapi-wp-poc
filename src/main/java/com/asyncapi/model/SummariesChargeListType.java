package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class SummariesChargeListType {
    
    private @Valid List<Object> chargesListList;
    
    private @Valid Object chargesSummary;
    

    

    
    @JsonProperty("chargesList")
    public List<Object> getChargesList() {
        return chargesListList;
    }

    public void setChargesList(List<Object> chargesListList) {
        this.chargesListList = chargesListList;
    }
    

    
    @JsonProperty("chargesSummary")
    public Object getChargesSummary() {
        return chargesSummary;
    }

    public void setChargesSummary(Object chargesSummary) {
        this.chargesSummary = chargesSummary;
    }
    
    

    @Override
    public String toString() {
        return "class SummariesChargeListType {\n" +
        
                "    chargesListList: " + toIndentedString(chargesListList) + "\n" +
                "    chargesSummary: " + toIndentedString(chargesSummary) + "\n" +
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