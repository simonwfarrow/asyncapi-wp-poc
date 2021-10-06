package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class BillRequest {
    
    private @Valid InvoiceType invoice;
    
    private @Valid CreditNoteType creditNote;
    
    @JsonProperty("invoice")
    public InvoiceType getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceType invoice) {
        this.invoice = invoice;
    }
    

    
    @JsonProperty("creditNote")
    public CreditNoteType getCreditNote() {
        return creditNote;
    }

    public void setCreditNote(CreditNoteType creditNote) {
        this.creditNote = creditNote;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillRequest billRequest = (BillRequest) o;
        return 
            Objects.equals(this.invoice, billRequest.invoice) &&
            Objects.equals(this.creditNote, billRequest.creditNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoice, creditNote);
    }

    @Override
    public String toString() {
        return "class BillRequest {\n" +
        
                "    invoice: " + toIndentedString(invoice) + "\n" +
                "    creditNote: " + toIndentedString(creditNote) + "\n" +
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