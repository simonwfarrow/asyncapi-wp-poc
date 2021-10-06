package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class SummariesCardsType {
    
    private @Valid List<Object> cardList;
    

    

    
    @JsonProperty("card")
    public List<Object> getCard() {
        return cardList;
    }

    public void setCard(List<Object> cardList) {
        this.cardList = cardList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SummariesCardsType summariesCardsType = (SummariesCardsType) o;
        return 
            Objects.equals(this.cardList, summariesCardsType.cardList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardList);
    }

    @Override
    public String toString() {
        return "class SummariesCardsType {\n" +
        
                "    cardList: " + toIndentedString(cardList) + "\n" +
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