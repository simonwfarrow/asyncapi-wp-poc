package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema110 {
    
    private @Valid List<TransactionType> transactionList;

    
    @JsonProperty("transaction")
    public List<TransactionType> getTransaction() {
        return transactionList;
    }

    public void setTransaction(List<TransactionType> transactionList) {
        this.transactionList = transactionList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnonymousSchema110 anonymousSchema110 = (AnonymousSchema110) o;
        return 
            Objects.equals(this.transactionList, anonymousSchema110.transactionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionList);
    }

    @Override
    public String toString() {
        return "class AnonymousSchema110 {\n" +
        
                "    transactionList: " + toIndentedString(transactionList) + "\n" +
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