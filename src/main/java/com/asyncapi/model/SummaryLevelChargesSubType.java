package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class SummaryLevelChargesSubType {
    
    private @Valid Object worldpayAcquiredCards;
    
    private @Valid Object otherAcquirerCards;
    
    private @Valid Object chargebacks;
    
    private @Valid Object premium;
    
    private @Valid Object miscellaneous;
    
    private @Valid Object otherFees;
    
    private @Valid ChargeSummaryType totalNetCharges;
    
    private @Valid ChargeSummaryType totalTaxAmount;
    
    private @Valid ChargeSummaryType billTotalChargesDue;
    

    

    
    @JsonProperty("worldpayAcquiredCards")
    public Object getWorldpayAcquiredCards() {
        return worldpayAcquiredCards;
    }

    public void setWorldpayAcquiredCards(Object worldpayAcquiredCards) {
        this.worldpayAcquiredCards = worldpayAcquiredCards;
    }
    

    
    @JsonProperty("otherAcquirerCards")
    public Object getOtherAcquirerCards() {
        return otherAcquirerCards;
    }

    public void setOtherAcquirerCards(Object otherAcquirerCards) {
        this.otherAcquirerCards = otherAcquirerCards;
    }
    

    
    @JsonProperty("chargebacks")
    public Object getChargebacks() {
        return chargebacks;
    }

    public void setChargebacks(Object chargebacks) {
        this.chargebacks = chargebacks;
    }
    

    
    @JsonProperty("premium")
    public Object getPremium() {
        return premium;
    }

    public void setPremium(Object premium) {
        this.premium = premium;
    }
    

    
    @JsonProperty("miscellaneous")
    public Object getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(Object miscellaneous) {
        this.miscellaneous = miscellaneous;
    }
    

    
    @JsonProperty("otherFees")
    public Object getOtherFees() {
        return otherFees;
    }

    public void setOtherFees(Object otherFees) {
        this.otherFees = otherFees;
    }
    

    
    @JsonProperty("totalNetCharges")
    public ChargeSummaryType getTotalNetCharges() {
        return totalNetCharges;
    }

    public void setTotalNetCharges(ChargeSummaryType totalNetCharges) {
        this.totalNetCharges = totalNetCharges;
    }
    

    
    @JsonProperty("totalTaxAmount")
    public ChargeSummaryType getTotalTaxAmount() {
        return totalTaxAmount;
    }

    public void setTotalTaxAmount(ChargeSummaryType totalTaxAmount) {
        this.totalTaxAmount = totalTaxAmount;
    }
    

    
    @JsonProperty("billTotalChargesDue")
    public ChargeSummaryType getBillTotalChargesDue() {
        return billTotalChargesDue;
    }

    public void setBillTotalChargesDue(ChargeSummaryType billTotalChargesDue) {
        this.billTotalChargesDue = billTotalChargesDue;
    }
    
    

    @Override
    public String toString() {
        return "class SummaryLevelChargesSubType {\n" +
        
                "    worldpayAcquiredCards: " + toIndentedString(worldpayAcquiredCards) + "\n" +
                "    otherAcquirerCards: " + toIndentedString(otherAcquirerCards) + "\n" +
                "    chargebacks: " + toIndentedString(chargebacks) + "\n" +
                "    premium: " + toIndentedString(premium) + "\n" +
                "    miscellaneous: " + toIndentedString(miscellaneous) + "\n" +
                "    otherFees: " + toIndentedString(otherFees) + "\n" +
                "    totalNetCharges: " + toIndentedString(totalNetCharges) + "\n" +
                "    totalTaxAmount: " + toIndentedString(totalTaxAmount) + "\n" +
                "    billTotalChargesDue: " + toIndentedString(billTotalChargesDue) + "\n" +
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