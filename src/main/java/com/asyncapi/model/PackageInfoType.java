package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class PackageInfoType {
    
    private @Valid String key1;
    
    private @Valid String key2;
    
    private @Valid String tranCode;
    
    private @Valid int keyId;
    
    private @Valid java.time.OffsetDateTime creationTime;
    
    private @Valid String description;
    

    

    
    @JsonProperty("key1")
    public String getKey1() {
        return key1;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }
    

    
    @JsonProperty("key2")
    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }
    

    
    @JsonProperty("tranCode")
    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }
    

    
    @JsonProperty("keyId")
    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }
    

    
    @JsonProperty("creationTime")
    public java.time.OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(java.time.OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }
    

    
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

    @Override
    public String toString() {
        return "class PackageInfoType {\n" +
        
                "    key1: " + toIndentedString(key1) + "\n" +
                "    key2: " + toIndentedString(key2) + "\n" +
                "    tranCode: " + toIndentedString(tranCode) + "\n" +
                "    keyId: " + toIndentedString(keyId) + "\n" +
                "    creationTime: " + toIndentedString(creationTime) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
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