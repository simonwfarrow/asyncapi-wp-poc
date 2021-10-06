package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class CreditNoteDetailsType {
    
    private @Valid DetailedChargeTopCategoryType charges;
    

    

    
    @JsonProperty("charges")
    public DetailedChargeTopCategoryType getCharges() {
        return charges;
    }

    public void setCharges(DetailedChargeTopCategoryType charges) {
        this.charges = charges;
    }
    
    

    @Override
    public String toString() {
        return "class CreditNoteDetailsType {\n" +
        
                "    charges: " + toIndentedString(charges) + "\n" +
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