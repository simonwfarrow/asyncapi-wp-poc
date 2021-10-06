package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AddressType {
    
    private @Valid String name;
    
    private @Valid String line1;
    
    private @Valid String line2;
    
    private @Valid String line3;
    
    private @Valid String cityTown;
    
    private @Valid String postcode;
    
    private @Valid String country;
    

    

    
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }
    

    
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }
    

    
    @JsonProperty("line3")
    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }
    

    
    @JsonProperty("cityTown")
    public String getCityTown() {
        return cityTown;
    }

    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
    }
    

    
    @JsonProperty("postcode")
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    

    
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    

    @Override
    public String toString() {
        return "class AddressType {\n" +
        
                "    name: " + toIndentedString(name) + "\n" +
                "    line1: " + toIndentedString(line1) + "\n" +
                "    line2: " + toIndentedString(line2) + "\n" +
                "    line3: " + toIndentedString(line3) + "\n" +
                "    cityTown: " + toIndentedString(cityTown) + "\n" +
                "    postcode: " + toIndentedString(postcode) + "\n" +
                "    country: " + toIndentedString(country) + "\n" +
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