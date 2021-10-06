package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class DetailedChargeType {
    
    private @Valid String headerName;
    
    private @Valid String txnCount;
    
    private @Valid String chargePerTxn;
    
    private @Valid String txnValue;
    
    private @Valid String chargeRate;
    
    private @Valid String chargeAmount;
    
    private @Valid String taxCode;
    
    private @Valid String sourceMerchantId;
    

    

    
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    

    
    @JsonProperty("txnCount")
    public String getTxnCount() {
        return txnCount;
    }

    public void setTxnCount(String txnCount) {
        this.txnCount = txnCount;
    }
    

    
    @JsonProperty("chargePerTxn")
    public String getChargePerTxn() {
        return chargePerTxn;
    }

    public void setChargePerTxn(String chargePerTxn) {
        this.chargePerTxn = chargePerTxn;
    }
    

    
    @JsonProperty("txnValue")
    public String getTxnValue() {
        return txnValue;
    }

    public void setTxnValue(String txnValue) {
        this.txnValue = txnValue;
    }
    

    
    @JsonProperty("chargeRate")
    public String getChargeRate() {
        return chargeRate;
    }

    public void setChargeRate(String chargeRate) {
        this.chargeRate = chargeRate;
    }
    

    
    @JsonProperty("chargeAmount")
    public String getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
    }
    

    
    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
    

    
    @JsonProperty("sourceMerchantID")
    public String getSourceMerchantId() {
        return sourceMerchantId;
    }

    public void setSourceMerchantId(String sourceMerchantId) {
        this.sourceMerchantId = sourceMerchantId;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailedChargeType detailedChargeType = (DetailedChargeType) o;
        return 
            Objects.equals(this.headerName, detailedChargeType.headerName) &&
            Objects.equals(this.txnCount, detailedChargeType.txnCount) &&
            Objects.equals(this.chargePerTxn, detailedChargeType.chargePerTxn) &&
            Objects.equals(this.txnValue, detailedChargeType.txnValue) &&
            Objects.equals(this.chargeRate, detailedChargeType.chargeRate) &&
            Objects.equals(this.chargeAmount, detailedChargeType.chargeAmount) &&
            Objects.equals(this.taxCode, detailedChargeType.taxCode) &&
            Objects.equals(this.sourceMerchantId, detailedChargeType.sourceMerchantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerName, txnCount, chargePerTxn, txnValue, chargeRate, chargeAmount, taxCode, sourceMerchantId);
    }

    @Override
    public String toString() {
        return "class DetailedChargeType {\n" +
        
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    txnCount: " + toIndentedString(txnCount) + "\n" +
                "    chargePerTxn: " + toIndentedString(chargePerTxn) + "\n" +
                "    txnValue: " + toIndentedString(txnValue) + "\n" +
                "    chargeRate: " + toIndentedString(chargeRate) + "\n" +
                "    chargeAmount: " + toIndentedString(chargeAmount) + "\n" +
                "    taxCode: " + toIndentedString(taxCode) + "\n" +
                "    sourceMerchantId: " + toIndentedString(sourceMerchantId) + "\n" +
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