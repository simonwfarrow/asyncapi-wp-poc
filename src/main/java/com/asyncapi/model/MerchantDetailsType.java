package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class MerchantDetailsType {
    
    private @Valid String taxdsRegNumber;
    
    private @Valid long storeReference;
    
    private @Valid String id;
    
    private @Valid String name;
    
    private @Valid String storeTown;
    
    private @Valid String tradingName;
    
    private @Valid String merType;
    
    private @Valid AnonymousSchema182 contact;
    
    private @Valid MerchantBankAccountType bankAccount;
    
    private @Valid WorldpayBankAccountType worldpayBankAccount;
    

    

    
    @JsonProperty("taxdsRegNumber")
    public String getTaxdsRegNumber() {
        return taxdsRegNumber;
    }

    public void setTaxdsRegNumber(String taxdsRegNumber) {
        this.taxdsRegNumber = taxdsRegNumber;
    }
    

    
    @JsonProperty("storeReference")
    public long getStoreReference() {
        return storeReference;
    }

    public void setStoreReference(long storeReference) {
        this.storeReference = storeReference;
    }
    

    
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    

    
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
    @JsonProperty("storeTown")
    public String getStoreTown() {
        return storeTown;
    }

    public void setStoreTown(String storeTown) {
        this.storeTown = storeTown;
    }
    

    
    @JsonProperty("tradingName")
    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }
    

    
    @JsonProperty("merType")
    public String getMerType() {
        return merType;
    }

    public void setMerType(String merType) {
        this.merType = merType;
    }
    

    
    @JsonProperty("contact")
    public AnonymousSchema182 getContact() {
        return contact;
    }

    public void setContact(AnonymousSchema182 contact) {
        this.contact = contact;
    }
    

    
    @JsonProperty("bankAccount")
    public MerchantBankAccountType getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(MerchantBankAccountType bankAccount) {
        this.bankAccount = bankAccount;
    }
    

    
    @JsonProperty("worldpayBankAccount")
    public WorldpayBankAccountType getWorldpayBankAccount() {
        return worldpayBankAccount;
    }

    public void setWorldpayBankAccount(WorldpayBankAccountType worldpayBankAccount) {
        this.worldpayBankAccount = worldpayBankAccount;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MerchantDetailsType merchantDetailsType = (MerchantDetailsType) o;
        return 
            Objects.equals(this.taxdsRegNumber, merchantDetailsType.taxdsRegNumber) &&
            Objects.equals(this.storeReference, merchantDetailsType.storeReference) &&
            Objects.equals(this.id, merchantDetailsType.id) &&
            Objects.equals(this.name, merchantDetailsType.name) &&
            Objects.equals(this.storeTown, merchantDetailsType.storeTown) &&
            Objects.equals(this.tradingName, merchantDetailsType.tradingName) &&
            Objects.equals(this.merType, merchantDetailsType.merType) &&
            Objects.equals(this.contact, merchantDetailsType.contact) &&
            Objects.equals(this.bankAccount, merchantDetailsType.bankAccount) &&
            Objects.equals(this.worldpayBankAccount, merchantDetailsType.worldpayBankAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxdsRegNumber, storeReference, id, name, storeTown, tradingName, merType, contact, bankAccount, worldpayBankAccount);
    }

    @Override
    public String toString() {
        return "class MerchantDetailsType {\n" +
        
                "    taxdsRegNumber: " + toIndentedString(taxdsRegNumber) + "\n" +
                "    storeReference: " + toIndentedString(storeReference) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    storeTown: " + toIndentedString(storeTown) + "\n" +
                "    tradingName: " + toIndentedString(tradingName) + "\n" +
                "    merType: " + toIndentedString(merType) + "\n" +
                "    contact: " + toIndentedString(contact) + "\n" +
                "    bankAccount: " + toIndentedString(bankAccount) + "\n" +
                "    worldpayBankAccount: " + toIndentedString(worldpayBankAccount) + "\n" +
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