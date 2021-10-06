package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema179 {
    
    private @Valid CommunicationChannelType communicationChannel;
    
    private @Valid AnonymousSchema184 emailContactList;
    
    private @Valid AddressType address;
    

    

    
    @JsonProperty("communicationChannel")
    public CommunicationChannelType getCommunicationChannel() {
        return communicationChannel;
    }

    public void setCommunicationChannel(CommunicationChannelType communicationChannel) {
        this.communicationChannel = communicationChannel;
    }
    

    
    @JsonProperty("emailContactList")
    public AnonymousSchema184 getEmailContactList() {
        return emailContactList;
    }

    public void setEmailContactList(AnonymousSchema184 emailContactList) {
        this.emailContactList = emailContactList;
    }
    

    
    @JsonProperty("address")
    public AddressType getAddress() {
        return address;
    }

    public void setAddress(AddressType address) {
        this.address = address;
    }
    
    

    @Override
    public String toString() {
        return "class AnonymousSchema179 {\n" +
        
                "    communicationChannel: " + toIndentedString(communicationChannel) + "\n" +
                "    emailContactList: " + toIndentedString(emailContactList) + "\n" +
                "    address: " + toIndentedString(address) + "\n" +
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