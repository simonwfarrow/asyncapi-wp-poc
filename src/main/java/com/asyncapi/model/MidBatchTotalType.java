package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class MidBatchTotalType {
    
    private @Valid List<AnonymousSchema174> batchListList;
    

    

    
    @JsonProperty("batchList")
    public List<AnonymousSchema174> getBatchList() {
        return batchListList;
    }

    public void setBatchList(List<AnonymousSchema174> batchListList) {
        this.batchListList = batchListList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MidBatchTotalType midBatchTotalType = (MidBatchTotalType) o;
        return 
            Objects.equals(this.batchListList, midBatchTotalType.batchListList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchListList);
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