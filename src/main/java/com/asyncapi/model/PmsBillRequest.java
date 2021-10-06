package com.asyncapi.model;

import javax.validation.Valid;

import java.util.Objects;
import java.util.List;


public class PmsBillRequest {
    private @Valid BillRequest payload;

    public BillRequest getPayload() {
        return payload;
    }

    public void setPayload(BillRequest payload) {
        this.payload = payload;
    }

    

    @Override
    public String toString() {
        return "class PmsBillRequest {\n" +
                "    payload: " + toIndentedString(payload) + "\n" +
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