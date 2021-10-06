package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class CardType {
    
    private @Valid String id;
    
    private @Valid String headerName;
    
    private @Valid AnonymousSchema110 transactions;
    
    private @Valid Object cardSummary;
    

    

    
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    

    
    @JsonProperty("transactions")
    public AnonymousSchema110 getTransactions() {
        return transactions;
    }

    public void setTransactions(AnonymousSchema110 transactions) {
        this.transactions = transactions;
    }
    

    
    @JsonProperty("cardSummary")
    public Object getCardSummary() {
        return cardSummary;
    }

    public void setCardSummary(Object cardSummary) {
        this.cardSummary = cardSummary;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CardType cardType = (CardType) o;
        return 
            Objects.equals(this.id, cardType.id) &&
            Objects.equals(this.headerName, cardType.headerName) &&
            Objects.equals(this.transactions, cardType.transactions) &&
            Objects.equals(this.cardSummary, cardType.cardSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, headerName, transactions, cardSummary);
    }

    @Override
    public String toString() {
        return "class CardType {\n" +
        
                "    id: " + toIndentedString(id) + "\n" +
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    transactions: " + toIndentedString(transactions) + "\n" +
                "    cardSummary: " + toIndentedString(cardSummary) + "\n" +
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