package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class DetailedBatchTotalFundingCurrencyLevelType {
    
    private @Valid String fundingCurrencyCode;
    
    private @Valid String headerName;
    
    private @Valid List<BatchListType> batchListList;
    

    

    
    @JsonProperty("fundingCurrencyCode")
    public String getFundingCurrencyCode() {
        return fundingCurrencyCode;
    }

    public void setFundingCurrencyCode(String fundingCurrencyCode) {
        this.fundingCurrencyCode = fundingCurrencyCode;
    }
    

    
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }
    

    
    @JsonProperty("batchList")
    public List<BatchListType> getBatchList() {
        return batchListList;
    }

    public void setBatchList(List<BatchListType> batchListList) {
        this.batchListList = batchListList;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetailedBatchTotalFundingCurrencyLevelType detailedBatchTotalFundingCurrencyLevelType = (DetailedBatchTotalFundingCurrencyLevelType) o;
        return 
            Objects.equals(this.fundingCurrencyCode, detailedBatchTotalFundingCurrencyLevelType.fundingCurrencyCode) &&
            Objects.equals(this.headerName, detailedBatchTotalFundingCurrencyLevelType.headerName) &&
            Objects.equals(this.batchListList, detailedBatchTotalFundingCurrencyLevelType.batchListList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fundingCurrencyCode, headerName, batchListList);
    }

    @Override
    public String toString() {
        return "class DetailedBatchTotalFundingCurrencyLevelType {\n" +
        
                "    fundingCurrencyCode: " + toIndentedString(fundingCurrencyCode) + "\n" +
                "    headerName: " + toIndentedString(headerName) + "\n" +
                "    batchListList: " + toIndentedString(batchListList) + "\n" +
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