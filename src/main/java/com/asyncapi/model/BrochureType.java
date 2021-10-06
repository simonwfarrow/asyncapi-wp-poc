package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class BrochureType {
    
    private @Valid String brochureName;
    
    private @Valid String brochureCode;
    

    

    
    @JsonProperty("brochureName")
    public String getBrochureName() {
        return brochureName;
    }

    public void setBrochureName(String brochureName) {
        this.brochureName = brochureName;
    }
    

    
    @JsonProperty("brochureCode")
    public String getBrochureCode() {
        return brochureCode;
    }

    public void setBrochureCode(String brochureCode) {
        this.brochureCode = brochureCode;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrochureType brochureType = (BrochureType) o;
        return 
            Objects.equals(this.brochureName, brochureType.brochureName) &&
            Objects.equals(this.brochureCode, brochureType.brochureCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brochureName, brochureCode);
    }

    @Override
    public String toString() {
        return "class BrochureType {\n" +
        
                "    brochureName: " + toIndentedString(brochureName) + "\n" +
                "    brochureCode: " + toIndentedString(brochureCode) + "\n" +
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