package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class MidBatchTotalType {
    
    private @Valid List<AnonymousSchema171> batchListList;
    

    

    
    @JsonProperty("batchList")
    public List<AnonymousSchema171> getBatchList() {
        return batchListList;
    }

    public void setBatchList(List<AnonymousSchema171> batchListList) {
        this.batchListList = batchListList;
    }
    
    

    @Override
    public String toString() {
        return "class MidBatchTotalType {\n" +
        
                "    batchListList: " + toIndentedString(batchListList) + "\n" +
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