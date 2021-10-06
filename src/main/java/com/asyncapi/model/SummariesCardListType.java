package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class SummariesCardListType {
    
    private @Valid List<SummariesCardsType> cardListList;
    
    private @Valid SummariesCardsType allCardsSummary;
    

    

    
    @JsonProperty("cardList")
    public List<SummariesCardsType> getCardList() {
        return cardListList;
    }

    public void setCardList(List<SummariesCardsType> cardListList) {
        this.cardListList = cardListList;
    }
    

    
    @JsonProperty("allCardsSummary")
    public SummariesCardsType getAllCardsSummary() {
        return allCardsSummary;
    }

    public void setAllCardsSummary(SummariesCardsType allCardsSummary) {
        this.allCardsSummary = allCardsSummary;
    }
    
    

    @Override
    public String toString() {
        return "class SummariesCardListType {\n" +
        
                "    cardListList: " + toIndentedString(cardListList) + "\n" +
                "    allCardsSummary: " + toIndentedString(allCardsSummary) + "\n" +
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