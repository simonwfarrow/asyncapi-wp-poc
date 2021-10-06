package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class MarketingMessagesType {
    
    private @Valid String optOutMarketMsgId;
    
    private @Valid String optInMarketMsgId;
    

    

    
    @JsonProperty("optOutMarketMsgId")
    public String getOptOutMarketMsgId() {
        return optOutMarketMsgId;
    }

    public void setOptOutMarketMsgId(String optOutMarketMsgId) {
        this.optOutMarketMsgId = optOutMarketMsgId;
    }
    

    
    @JsonProperty("optInMarketMsgId")
    public String getOptInMarketMsgId() {
        return optInMarketMsgId;
    }

    public void setOptInMarketMsgId(String optInMarketMsgId) {
        this.optInMarketMsgId = optInMarketMsgId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketingMessagesType marketingMessagesType = (MarketingMessagesType) o;
        return 
            Objects.equals(this.optOutMarketMsgId, marketingMessagesType.optOutMarketMsgId) &&
            Objects.equals(this.optInMarketMsgId, marketingMessagesType.optInMarketMsgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optOutMarketMsgId, optInMarketMsgId);
    }

    @Override
    public String toString() {
        return "class MarketingMessagesType {\n" +
        
                "    optOutMarketMsgId: " + toIndentedString(optOutMarketMsgId) + "\n" +
                "    optInMarketMsgId: " + toIndentedString(optInMarketMsgId) + "\n" +
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