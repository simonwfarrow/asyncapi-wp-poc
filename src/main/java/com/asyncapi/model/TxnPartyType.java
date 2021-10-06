package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class TxnPartyType {
    
    private @Valid String storeref;
    
    private @Valid String txnPartyId;
    
    private @Valid String town;
    
    private @Valid Object fundingCurrencyList;
    

    

    
    @JsonProperty("storeref")
    public String getStoreref() {
        return storeref;
    }

    public void setStoreref(String storeref) {
        this.storeref = storeref;
    }
    

    
    @JsonProperty("txnPartyId")
    public String getTxnPartyId() {
        return txnPartyId;
    }

    public void setTxnPartyId(String txnPartyId) {
        this.txnPartyId = txnPartyId;
    }
    

    
    @JsonProperty("town")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
    

    
    @JsonProperty("fundingCurrencyList")
    public Object getFundingCurrencyList() {
        return fundingCurrencyList;
    }

    public void setFundingCurrencyList(Object fundingCurrencyList) {
        this.fundingCurrencyList = fundingCurrencyList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TxnPartyType txnPartyType = (TxnPartyType) o;
        return 
            Objects.equals(this.storeref, txnPartyType.storeref) &&
            Objects.equals(this.txnPartyId, txnPartyType.txnPartyId) &&
            Objects.equals(this.town, txnPartyType.town) &&
            Objects.equals(this.fundingCurrencyList, txnPartyType.fundingCurrencyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeref, txnPartyId, town, fundingCurrencyList);
    }

    @Override
    public String toString() {
        return "class TxnPartyType {\n" +
        
                "    storeref: " + toIndentedString(storeref) + "\n" +
                "    txnPartyId: " + toIndentedString(txnPartyId) + "\n" +
                "    town: " + toIndentedString(town) + "\n" +
                "    fundingCurrencyList: " + toIndentedString(fundingCurrencyList) + "\n" +
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