package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class InvoiceDetailsType {
    
    private @Valid DetailedChargeTopCategoryType charges;
    
    private @Valid Object batchTotals;
    
    private @Valid OverpaymentsType overpayments;
    
    private @Valid CreditNoteNettingType creditNoteNetting;
    

    

    
    @JsonProperty("charges")
    public DetailedChargeTopCategoryType getCharges() {
        return charges;
    }

    public void setCharges(DetailedChargeTopCategoryType charges) {
        this.charges = charges;
    }
    

    
    @JsonProperty("batchTotals")
    public Object getBatchTotals() {
        return batchTotals;
    }

    public void setBatchTotals(Object batchTotals) {
        this.batchTotals = batchTotals;
    }
    

    
    @JsonProperty("overpayments")
    public OverpaymentsType getOverpayments() {
        return overpayments;
    }

    public void setOverpayments(OverpaymentsType overpayments) {
        this.overpayments = overpayments;
    }
    

    
    @JsonProperty("creditNoteNetting")
    public CreditNoteNettingType getCreditNoteNetting() {
        return creditNoteNetting;
    }

    public void setCreditNoteNetting(CreditNoteNettingType creditNoteNetting) {
        this.creditNoteNetting = creditNoteNetting;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceDetailsType invoiceDetailsType = (InvoiceDetailsType) o;
        return 
            Objects.equals(this.charges, invoiceDetailsType.charges) &&
            Objects.equals(this.batchTotals, invoiceDetailsType.batchTotals) &&
            Objects.equals(this.overpayments, invoiceDetailsType.overpayments) &&
            Objects.equals(this.creditNoteNetting, invoiceDetailsType.creditNoteNetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charges, batchTotals, overpayments, creditNoteNetting);
    }

    @Override
    public String toString() {
        return "class InvoiceDetailsType {\n" +
        
                "    charges: " + toIndentedString(charges) + "\n" +
                "    batchTotals: " + toIndentedString(batchTotals) + "\n" +
                "    overpayments: " + toIndentedString(overpayments) + "\n" +
                "    creditNoteNetting: " + toIndentedString(creditNoteNetting) + "\n" +
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