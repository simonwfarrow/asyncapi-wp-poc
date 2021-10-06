package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema174 {
    
    private @Valid BatchTotalType batchTotal;

    @JsonProperty("batchTotal")
    public BatchTotalType getBatchTotal() {
        return batchTotal;
    }

    public void setBatchTotal(BatchTotalType batchTotal) {
            batchTotal = batchTotal;
    }


    @Override
    public int hashCode() {
        return Objects.hash(batchTotal);
    }

    @Override
    public String toString() {
        return "class AnonymousSchema174 {\n" +
        
                "    batchTotal: " + toIndentedString(batchTotal) + "\n" +
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