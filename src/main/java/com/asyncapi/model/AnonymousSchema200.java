package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema200 {
    
    private @Valid String queryContact;
    

    

    
    @JsonProperty("queryContact")
    public String getQueryContact() {
        return queryContact;
    }

    public void setQueryContact(String queryContact) {
        this.queryContact = queryContact;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnonymousSchema200 anonymousSchema200 = (AnonymousSchema200) o;
        return 
            Objects.equals(this.queryContact, anonymousSchema200.queryContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryContact);
    }

    @Override
    public String toString() {
        return "class AnonymousSchema200 {\n" +
        
                "    queryContact: " + toIndentedString(queryContact) + "\n" +
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