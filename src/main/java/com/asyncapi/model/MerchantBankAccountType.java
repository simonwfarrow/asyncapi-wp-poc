package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class MerchantBankAccountType {
    
    private @Valid String accountName;
    
    private @Valid String number;
    
    private @Valid String sortCode;
    
    private @Valid String iban;
    
    private @Valid String debitDate;
    
    private @Valid String paymentInfoMsg;
    

    

    
    @JsonProperty("accountName")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    

    
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    

    
    @JsonProperty("sortCode")
    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }
    

    
    @JsonProperty("iban")
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    

    
    @JsonProperty("debitDate")
    public String getDebitDate() {
        return debitDate;
    }

    public void setDebitDate(String debitDate) {
        this.debitDate = debitDate;
    }
    

    
    @JsonProperty("paymentInfoMsg")
    public String getPaymentInfoMsg() {
        return paymentInfoMsg;
    }

    public void setPaymentInfoMsg(String paymentInfoMsg) {
        this.paymentInfoMsg = paymentInfoMsg;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MerchantBankAccountType merchantBankAccountType = (MerchantBankAccountType) o;
        return 
            Objects.equals(this.accountName, merchantBankAccountType.accountName) &&
            Objects.equals(this.number, merchantBankAccountType.number) &&
            Objects.equals(this.sortCode, merchantBankAccountType.sortCode) &&
            Objects.equals(this.iban, merchantBankAccountType.iban) &&
            Objects.equals(this.debitDate, merchantBankAccountType.debitDate) &&
            Objects.equals(this.paymentInfoMsg, merchantBankAccountType.paymentInfoMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountName, number, sortCode, iban, debitDate, paymentInfoMsg);
    }

    @Override
    public String toString() {
        return "class MerchantBankAccountType {\n" +
        
                "    accountName: " + toIndentedString(accountName) + "\n" +
                "    number: " + toIndentedString(number) + "\n" +
                "    sortCode: " + toIndentedString(sortCode) + "\n" +
                "    iban: " + toIndentedString(iban) + "\n" +
                "    debitDate: " + toIndentedString(debitDate) + "\n" +
                "    paymentInfoMsg: " + toIndentedString(paymentInfoMsg) + "\n" +
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