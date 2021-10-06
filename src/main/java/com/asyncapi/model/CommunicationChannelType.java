package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class CommunicationChannelType {
    
    private @Valid boolean store;
    
    private @Valid boolean post;
    
    private @Valid boolean email;
    
    private @Valid boolean portal;
    

    

    
    @JsonProperty("store")
    public boolean getStore() {
        return store;
    }

    public void setStore(boolean store) {
        this.store = store;
    }
    

    
    @JsonProperty("post")
    public boolean getPost() {
        return post;
    }

    public void setPost(boolean post) {
        this.post = post;
    }
    

    
    @JsonProperty("email")
    public boolean getEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }
    

    
    @JsonProperty("portal")
    public boolean getPortal() {
        return portal;
    }

    public void setPortal(boolean portal) {
        this.portal = portal;
    }
    
    

    @Override
    public String toString() {
        return "class CommunicationChannelType {\n" +
        
                "    store: " + toIndentedString(store) + "\n" +
                "    post: " + toIndentedString(post) + "\n" +
                "    email: " + toIndentedString(email) + "\n" +
                "    portal: " + toIndentedString(portal) + "\n" +
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