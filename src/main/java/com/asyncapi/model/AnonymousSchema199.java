package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema199 {
    
    private @Valid AddressType address;
    
    private @Valid AnonymousSchema200 phone;
    

    

    
    @JsonProperty("address")
    public AddressType getAddress() {
        return address;
    }

    public void setAddress(AddressType address) {
        this.address = address;
    }
    

    
    @JsonProperty("phone")
    public AnonymousSchema200 getPhone() {
        return phone;
    }

    public void setPhone(AnonymousSchema200 phone) {
        this.phone = phone;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnonymousSchema199 anonymousSchema199 = (AnonymousSchema199) o;
        return 
            Objects.equals(this.address, anonymousSchema199.address) &&
            Objects.equals(this.phone, anonymousSchema199.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, phone);
    }

    @Override
    public String toString() {
        return "class AnonymousSchema199 {\n" +
        
                "    address: " + toIndentedString(address) + "\n" +
                "    phone: " + toIndentedString(phone) + "\n" +
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