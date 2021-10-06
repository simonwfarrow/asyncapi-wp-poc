package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class AnonymousSchema182 {
    
    private @Valid CommunicationChannelType communicationChannel;
    
    private @Valid AnonymousSchema187 emailContactList;
    
    private @Valid AddressType address;
    
    @JsonProperty("communicationChannel")
    public CommunicationChannelType getCommunicationChannel() {
        return communicationChannel;
    }

    public void setCommunicationChannel(CommunicationChannelType communicationChannel) {
        this.communicationChannel = communicationChannel;
    }
    

    
    @JsonProperty("emailContactList")
    public AnonymousSchema187 getEmailContactList() {
        return emailContactList;
    }

    public void setEmailContactList(AnonymousSchema187 emailContactList) {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnonymousSchema182 anonymousSchema182 = (AnonymousSchema182) o;
        return 
            Objects.equals(this.communicationChannel, anonymousSchema182.communicationChannel) &&
            Objects.equals(this.emailContactList, anonymousSchema182.emailContactList) &&
            Objects.equals(this.address, anonymousSchema182.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(communicationChannel, emailContactList, address);
    }

    @Override
    public String toString() {
        return "class AnonymousSchema182 {\n" +
        
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