package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class CreditNoteNettingType {
    
    private @Valid String currentInvoiceNumber;
    
    private @Valid String currentInvoiceAmount;
    
    private @Valid String linkedCreditNoteNumber;
    
    private @Valid String linkedCreditNoteAmount;
    
    private @Valid String currentInvoiceLessCreditNoteAmount;
    
    private @Valid String recalcPaymentInfoMsg;
    

    

    
    @JsonProperty("currentInvoiceNumber")
    public String getCurrentInvoiceNumber() {
        return currentInvoiceNumber;
    }

    public void setCurrentInvoiceNumber(String currentInvoiceNumber) {
        this.currentInvoiceNumber = currentInvoiceNumber;
    }
    

    
    @JsonProperty("currentInvoiceAmount")
    public String getCurrentInvoiceAmount() {
        return currentInvoiceAmount;
    }

    public void setCurrentInvoiceAmount(String currentInvoiceAmount) {
        this.currentInvoiceAmount = currentInvoiceAmount;
    }
    

    
    @JsonProperty("linkedCreditNoteNumber")
    public String getLinkedCreditNoteNumber() {
        return linkedCreditNoteNumber;
    }

    public void setLinkedCreditNoteNumber(String linkedCreditNoteNumber) {
        this.linkedCreditNoteNumber = linkedCreditNoteNumber;
    }
    

    
    @JsonProperty("linkedCreditNoteAmount")
    public String getLinkedCreditNoteAmount() {
        return linkedCreditNoteAmount;
    }

    public void setLinkedCreditNoteAmount(String linkedCreditNoteAmount) {
        this.linkedCreditNoteAmount = linkedCreditNoteAmount;
    }
    

    
    @JsonProperty("currentInvoiceLessCreditNoteAmount")
    public String getCurrentInvoiceLessCreditNoteAmount() {
        return currentInvoiceLessCreditNoteAmount;
    }

    public void setCurrentInvoiceLessCreditNoteAmount(String currentInvoiceLessCreditNoteAmount) {
        this.currentInvoiceLessCreditNoteAmount = currentInvoiceLessCreditNoteAmount;
    }
    

    
    @JsonProperty("recalcPaymentInfoMsg")
    public String getRecalcPaymentInfoMsg() {
        return recalcPaymentInfoMsg;
    }

    public void setRecalcPaymentInfoMsg(String recalcPaymentInfoMsg) {
        this.recalcPaymentInfoMsg = recalcPaymentInfoMsg;
    }
    
    

    @Override
    public String toString() {
        return "class CreditNoteNettingType {\n" +
        
                "    currentInvoiceNumber: " + toIndentedString(currentInvoiceNumber) + "\n" +
                "    currentInvoiceAmount: " + toIndentedString(currentInvoiceAmount) + "\n" +
                "    linkedCreditNoteNumber: " + toIndentedString(linkedCreditNoteNumber) + "\n" +
                "    linkedCreditNoteAmount: " + toIndentedString(linkedCreditNoteAmount) + "\n" +
                "    currentInvoiceLessCreditNoteAmount: " + toIndentedString(currentInvoiceLessCreditNoteAmount) + "\n" +
                "    recalcPaymentInfoMsg: " + toIndentedString(recalcPaymentInfoMsg) + "\n" +
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