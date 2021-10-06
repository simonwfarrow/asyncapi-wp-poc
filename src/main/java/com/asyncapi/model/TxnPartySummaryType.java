package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class TxnPartySummaryType {
    
    private @Valid String headerName;
    
    private @Valid String txnValue;
    
    private @Valid long txnCount;
    
    private @Valid String icFee;
    
    private @Valid String schemeFee;
    
    private @Valid String chargeAmount;
    
    private @Valid String taxAmount;
    
    private @Valid String billAmount;
    

    

    
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    

    
    @JsonProperty("txnValue")
    public String getTxnValue() {
        return txnValue;
    }

    public void setTxnValue(String txnValue) {
        this.txnValue = txnValue;
    }
    

    
    @JsonProperty("txnCount")
    public long getTxnCount() {
        return txnCount;
    }

    public void setTxnCount(long txnCount) {
        this.txnCount = txnCount;
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
    

    
    @JsonProperty("chargeAmount")
    public String getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(String chargeAmount) {
        this.chargeAmount = chargeAmount;
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
        TxnPartySummaryType txnPartySummaryType = (TxnPartySummaryType) o;
        return 
            Objects.equals(this.headerName, txnPartySummaryType.headerName) &&
            Objects.equals(this.txnValue, txnPartySummaryType.txnValue) &&
            Objects.equals(this.txnCount, txnPartySummaryType.txnCount) &&
            Objects.equals(this.icFee, txnPartySummaryType.icFee) &&
            Objects.equals(this.schemeFee, txnPartySummaryType.schemeFee) &&
            Objects.equals(this.chargeAmount, txnPartySummaryType.chargeAmount) &&
            Objects.equals(this.taxAmount, txnPartySummaryType.taxAmount) &&
            Objects.equals(this.billAmount, txnPartySummaryType.billAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerName, txnValue, txnCount, icFee, schemeFee, chargeAmount, taxAmount, billAmount);
    }

    @Override
    public String toString() {
        return "class TxnPartySummaryType {\n" +
        
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    txnValue: " + toIndentedString(txnValue) + "\n" +
                "    txnCount: " + toIndentedString(txnCount) + "\n" +
                "    icFee: " + toIndentedString(icFee) + "\n" +
                "    schemeFee: " + toIndentedString(schemeFee) + "\n" +
                "    chargeAmount: " + toIndentedString(chargeAmount) + "\n" +
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