package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema90 {
    

    
    @Override
    public boolean equals(Object o) {
        boolean result = false;
        if (this == o) {
            result=true;
        }
        if (o == null || getClass() != o.getClass()) {
            result=false;
        }
        AnonymousSchema90 anonymousSchema90 = (AnonymousSchema90) o;
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        return "class AnonymousSchema90 {\n" +
        
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