package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class TransactionType {
    
    private @Valid String headerName;
    
    private @Valid String subType;
    
    private @Valid int count;
    
    private @Valid String chargePerTxn;
    
    private @Valid String valueAmount;
    
    private @Valid String txnCurrency;
    
    private @Valid String chargeRate;
    
    private @Valid String chargeAmount;
    
    private @Valid String icFee;
    
    private @Valid String schemeFee;
    
    private @Valid String taxCode;
    
    private @Valid String taxAmount;
    
    private @Valid String billAmount;
    

    

    
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    

    
    @JsonProperty("subType")
    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }
    

    
    @JsonProperty("count")
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    

    
    @JsonProperty("chargePerTxn")
    public String getChargePerTxn() {
        return chargePerTxn;
    }

    public void setChargePerTxn(String chargePerTxn) {
        this.chargePerTxn = chargePerTxn;
    }
    

    
    @JsonProperty("valueAmount")
    public String getValueAmount() {
        return valueAmount;
    }

    public void setValueAmount(String valueAmount) {
        this.valueAmount = valueAmount;
    }
    

    
    @JsonProperty("txnCurrency")
    public String getTxnCurrency() {
        return txnCurrency;
    }

    public void setTxnCurrency(String txnCurrency) {
        this.txnCurrency = txnCurrency;
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
    

    
    @JsonProperty("icFee")
    public String getIcFee() {
        return icFee;
    }

    public void setIcFee(String icFee) {
        this.icFee = icFee;
    }
    

    
    @JsonProperty("schemeFee")
    public String getSchemeFee() {
        return schemeFee;
    }

    public void setSchemeFee(String schemeFee) {
        this.schemeFee = schemeFee;
    }
    

    
    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
    

    
    @JsonProperty("taxAmount")
    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }
    

    
    @JsonProperty("billAmount")
    public String getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(String billAmount) {
        this.billAmount = billAmount;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransactionType transactionType = (TransactionType) o;
        return 
            Objects.equals(this.headerName, transactionType.headerName) &&
            Objects.equals(this.subType, transactionType.subType) &&
            Objects.equals(this.count, transactionType.count) &&
            Objects.equals(this.chargePerTxn, transactionType.chargePerTxn) &&
            Objects.equals(this.valueAmount, transactionType.valueAmount) &&
            Objects.equals(this.txnCurrency, transactionType.txnCurrency) &&
            Objects.equals(this.chargeRate, transactionType.chargeRate) &&
            Objects.equals(this.chargeAmount, transactionType.chargeAmount) &&
            Objects.equals(this.icFee, transactionType.icFee) &&
            Objects.equals(this.schemeFee, transactionType.schemeFee) &&
            Objects.equals(this.taxCode, transactionType.taxCode) &&
            Objects.equals(this.taxAmount, transactionType.taxAmount) &&
            Objects.equals(this.billAmount, transactionType.billAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerName, subType, count, chargePerTxn, valueAmount, txnCurrency, chargeRate, chargeAmount, icFee, schemeFee, taxCode, taxAmount, billAmount);
    }

    @Override
    public String toString() {
        return "class TransactionType {\n" +
        
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    subType: " + toIndentedString(subType) + "\n" +
                "    count: " + toIndentedString(count) + "\n" +
                "    chargePerTxn: " + toIndentedString(chargePerTxn) + "\n" +
                "    valueAmount: " + toIndentedString(valueAmount) + "\n" +
                "    txnCurrency: " + toIndentedString(txnCurrency) + "\n" +
                "    chargeRate: " + toIndentedString(chargeRate) + "\n" +
                "    chargeAmount: " + toIndentedString(chargeAmount) + "\n" +
                "    icFee: " + toIndentedString(icFee) + "\n" +
                "    schemeFee: " + toIndentedString(schemeFee) + "\n" +
                "    taxCode: " + toIndentedString(taxCode) + "\n" +
                "    taxAmount: " + toIndentedString(taxAmount) + "\n" +
                "    billAmount: " + toIndentedString(billAmount) + "\n" +
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