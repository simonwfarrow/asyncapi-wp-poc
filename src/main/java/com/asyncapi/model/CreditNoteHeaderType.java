package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class CreditNoteHeaderType {
    
    private @Valid String creditNoteNumber;
    
    private @Valid String invoiceNumber;
    
    private @Valid String contactReasonTypeId;
    
    private @Valid String documentTemplateTypeId;
    
    private @Valid String businessUnit;
    
    private @Valid String externalPartyId;
    
    private @Valid String internalPartyId;
    
    private @Valid String poNumber;
    
    private @Valid String previousBalance;
    
    private @Valid String batchId;
    
    private @Valid long batchTotalCount;
    
    private @Valid String invoiceAmount;
    
    private @Valid String invoicePackStart;
    
    private @Valid String invoicePackEnd;
    
    private @Valid long totalInvoices;
    
    private @Valid String invoiceCounter;
    
    private @Valid String creditNoteDate;
    
    private @Valid String chargingPeriod;
    
    private @Valid String creditNoteTitleMsg;
    
    private @Valid String taxDisclaimerMsg;
    
    private @Valid MarketingMessagesType marketingMsg;
    
    private @Valid BrochureType brochure;
    
    private @Valid String premiumMsg;
    
    private @Valid String refundMsg;
    
    private @Valid String taxZeroReversedMsg;
    
    private @Valid MerchantBankAccountType bankAccount;
    
    private @Valid String taxRegNumber;
    
    private @Valid String paymentInfoMsg;
    
    private @Valid String creditNoteReason;
    

    

    
    @JsonProperty("creditNoteNumber")
    public String getCreditNoteNumber() {
        return creditNoteNumber;
    }

    public void setCreditNoteNumber(String creditNoteNumber) {
        this.creditNoteNumber = creditNoteNumber;
    }
    

    
    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    

    
    @JsonProperty("contactReasonTypeId")
    public String getContactReasonTypeId() {
        return contactReasonTypeId;
    }

    public void setContactReasonTypeId(String contactReasonTypeId) {
        this.contactReasonTypeId = contactReasonTypeId;
    }
    

    
    @JsonProperty("documentTemplateTypeId")
    public String getDocumentTemplateTypeId() {
        return documentTemplateTypeId;
    }

    public void setDocumentTemplateTypeId(String documentTemplateTypeId) {
        this.documentTemplateTypeId = documentTemplateTypeId;
    }
    

    
    @JsonProperty("businessUnit")
    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }
    

    
    @JsonProperty("externalPartyId")
    public String getExternalPartyId() {
        return externalPartyId;
    }

    public void setExternalPartyId(String externalPartyId) {
        this.externalPartyId = externalPartyId;
    }
    

    
    @JsonProperty("internalPartyId")
    public String getInternalPartyId() {
        return internalPartyId;
    }

    public void setInternalPartyId(String internalPartyId) {
        this.internalPartyId = internalPartyId;
    }
    

    
    @JsonProperty("poNumber")
    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }
    

    
    @JsonProperty("previousBalance")
    public String getPreviousBalance() {
        return previousBalance;
    }

    public void setPreviousBalance(String previousBalance) {
        this.previousBalance = previousBalance;
    }
    

    
    @JsonProperty("batchId")
    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
    

    
    @JsonProperty("batchTotalCount")
    public long getBatchTotalCount() {
        return batchTotalCount;
    }

    public void setBatchTotalCount(long batchTotalCount) {
        this.batchTotalCount = batchTotalCount;
    }
    

    
    @JsonProperty("invoiceAmount")
    public String getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(String invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }
    

    
    @JsonProperty("invoicePackStart")
    public String getInvoicePackStart() {
        return invoicePackStart;
    }

    public void setInvoicePackStart(String invoicePackStart) {
        this.invoicePackStart = invoicePackStart;
    }
    

    
    @JsonProperty("invoicePackEnd")
    public String getInvoicePackEnd() {
        return invoicePackEnd;
    }

    public void setInvoicePackEnd(String invoicePackEnd) {
        this.invoicePackEnd = invoicePackEnd;
    }
    

    
    @JsonProperty("totalInvoices")
    public long getTotalInvoices() {
        return totalInvoices;
    }

    public void setTotalInvoices(long totalInvoices) {
        this.totalInvoices = totalInvoices;
    }
    

    
    @JsonProperty("invoiceCounter")
    public String getInvoiceCounter() {
        return invoiceCounter;
    }

    public void setInvoiceCounter(String invoiceCounter) {
        this.invoiceCounter = invoiceCounter;
    }
    

    
    @JsonProperty("creditNoteDate")
    public String getCreditNoteDate() {
        return creditNoteDate;
    }

    public void setCreditNoteDate(String creditNoteDate) {
        this.creditNoteDate = creditNoteDate;
    }
    

    
    @JsonProperty("chargingPeriod")
    public String getChargingPeriod() {
        return chargingPeriod;
    }

    public void setChargingPeriod(String chargingPeriod) {
        this.chargingPeriod = chargingPeriod;
    }
    

    
    @JsonProperty("creditNoteTitleMsg")
    public String getCreditNoteTitleMsg() {
        return creditNoteTitleMsg;
    }

    public void setCreditNoteTitleMsg(String creditNoteTitleMsg) {
        this.creditNoteTitleMsg = creditNoteTitleMsg;
    }
    

    
    @JsonProperty("taxDisclaimerMsg")
    public String getTaxDisclaimerMsg() {
        return taxDisclaimerMsg;
    }

    public void setTaxDisclaimerMsg(String taxDisclaimerMsg) {
        this.taxDisclaimerMsg = taxDisclaimerMsg;
    }
    

    
    @JsonProperty("marketingMsg")
    public MarketingMessagesType getMarketingMsg() {
        return marketingMsg;
    }

    public void setMarketingMsg(MarketingMessagesType marketingMsg) {
        this.marketingMsg = marketingMsg;
    }
    

    
    @JsonProperty("brochure")
    public BrochureType getBrochure() {
        return brochure;
    }

    public void setBrochure(BrochureType brochure) {
        this.brochure = brochure;
    }
    

    
    @JsonProperty("premiumMsg")
    public String getPremiumMsg() {
        return premiumMsg;
    }

    public void setPremiumMsg(String premiumMsg) {
        this.premiumMsg = premiumMsg;
    }
    

    
    @JsonProperty("refundMsg")
    public String getRefundMsg() {
        return refundMsg;
    }

    public void setRefundMsg(String refundMsg) {
        this.refundMsg = refundMsg;
    }
    

    
    @JsonProperty("taxZeroReversedMsg")
    public String getTaxZeroReversedMsg() {
        return taxZeroReversedMsg;
    }

    public void setTaxZeroReversedMsg(String taxZeroReversedMsg) {
        this.taxZeroReversedMsg = taxZeroReversedMsg;
    }
    

    
    @JsonProperty("bankAccount")
    public MerchantBankAccountType getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(MerchantBankAccountType bankAccount) {
        this.bankAccount = bankAccount;
    }
    

    
    @JsonProperty("taxRegNumber")
    public String getTaxRegNumber() {
        return taxRegNumber;
    }

    public void setTaxRegNumber(String taxRegNumber) {
        this.taxRegNumber = taxRegNumber;
    }
    

    
    @JsonProperty("paymentInfoMsg")
    public String getPaymentInfoMsg() {
        return paymentInfoMsg;
    }

    public void setPaymentInfoMsg(String paymentInfoMsg) {
        this.paymentInfoMsg = paymentInfoMsg;
    }
    

    
    @JsonProperty("creditNoteReason")
    public String getCreditNoteReason() {
        return creditNoteReason;
    }

    public void setCreditNoteReason(String creditNoteReason) {
        this.creditNoteReason = creditNoteReason;
    }
    
    

    @Override
    public String toString() {
        return "class CreditNoteHeaderType {\n" +
        
                "    creditNoteNumber: " + toIndentedString(creditNoteNumber) + "\n" +
                "    invoiceNumber: " + toIndentedString(invoiceNumber) + "\n" +
                "    contactReasonTypeId: " + toIndentedString(contactReasonTypeId) + "\n" +
                "    documentTemplateTypeId: " + toIndentedString(documentTemplateTypeId) + "\n" +
                "    businessUnit: " + toIndentedString(businessUnit) + "\n" +
                "    externalPartyId: " + toIndentedString(externalPartyId) + "\n" +
                "    internalPartyId: " + toIndentedString(internalPartyId) + "\n" +
                "    poNumber: " + toIndentedString(poNumber) + "\n" +
                "    previousBalance: " + toIndentedString(previousBalance) + "\n" +
                "    batchId: " + toIndentedString(batchId) + "\n" +
                "    batchTotalCount: " + toIndentedString(batchTotalCount) + "\n" +
                "    invoiceAmount: " + toIndentedString(invoiceAmount) + "\n" +
                "    invoicePackStart: " + toIndentedString(invoicePackStart) + "\n" +
                "    invoicePackEnd: " + toIndentedString(invoicePackEnd) + "\n" +
                "    totalInvoices: " + toIndentedString(totalInvoices) + "\n" +
                "    invoiceCounter: " + toIndentedString(invoiceCounter) + "\n" +
                "    creditNoteDate: " + toIndentedString(creditNoteDate) + "\n" +
                "    chargingPeriod: " + toIndentedString(chargingPeriod) + "\n" +
                "    creditNoteTitleMsg: " + toIndentedString(creditNoteTitleMsg) + "\n" +
                "    taxDisclaimerMsg: " + toIndentedString(taxDisclaimerMsg) + "\n" +
                "    marketingMsg: " + toIndentedString(marketingMsg) + "\n" +
                "    brochure: " + toIndentedString(brochure) + "\n" +
                "    premiumMsg: " + toIndentedString(premiumMsg) + "\n" +
                "    refundMsg: " + toIndentedString(refundMsg) + "\n" +
                "    taxZeroReversedMsg: " + toIndentedString(taxZeroReversedMsg) + "\n" +
                "    bankAccount: " + toIndentedString(bankAccount) + "\n" +
                "    taxRegNumber: " + toIndentedString(taxRegNumber) + "\n" +
                "    paymentInfoMsg: " + toIndentedString(paymentInfoMsg) + "\n" +
                "    creditNoteReason: " + toIndentedString(creditNoteReason) + "\n" +
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