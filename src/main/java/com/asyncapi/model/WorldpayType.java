package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class WorldpayType {
    
    private @Valid String brandId;
    
    private @Valid String legalNoteId;
    
    private @Valid String taxRegNumber;
    
    private @Valid AnonymousSchema199 contact;
    

    

    
    @JsonProperty("brandId")
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }
    

    
    @JsonProperty("legalNoteId")
    public String getLegalNoteId() {
        return legalNoteId;
    }

    public void setLegalNoteId(String legalNoteId) {
        this.legalNoteId = legalNoteId;
    }
    

    
    @JsonProperty("taxRegNumber")
    public String getTaxRegNumber() {
        return taxRegNumber;
    }

    public void setTaxRegNumber(String taxRegNumber) {
        this.taxRegNumber = taxRegNumber;
    }
    

    
    @JsonProperty("contact")
    public AnonymousSchema199 getContact() {
        return contact;
    }

    public void setContact(AnonymousSchema199 contact) {
        this.contact = contact;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorldpayType worldpayType = (WorldpayType) o;
        return 
            Objects.equals(this.brandId, worldpayType.brandId) &&
            Objects.equals(this.legalNoteId, worldpayType.legalNoteId) &&
            Objects.equals(this.taxRegNumber, worldpayType.taxRegNumber) &&
            Objects.equals(this.contact, worldpayType.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, legalNoteId, taxRegNumber, contact);
    }

    @Override
    public String toString() {
        return "class WorldpayType {\n" +
        
                "    brandId: " + toIndentedString(brandId) + "\n" +
                "    legalNoteId: " + toIndentedString(legalNoteId) + "\n" +
                "    taxRegNumber: " + toIndentedString(taxRegNumber) + "\n" +
                "    contact: " + toIndentedString(contact) + "\n" +
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