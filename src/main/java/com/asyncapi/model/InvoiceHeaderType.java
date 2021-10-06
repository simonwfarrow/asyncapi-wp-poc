package com.asyncapi.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.Objects;


public class InvoiceHeaderType {
    
    private @Valid String invoiceNumber;
    
    private @Valid String regenFlag;
    
    private @Valid String contactReasonTypeId;
    
    private @Valid String documentTemplateTypeId;
    
    private @Valid String businessUnit;
    
    private @Valid String externalPartyId;
    
    private @Valid String internalPartyId;
    
    private @Valid String poNumber;
    
    private @Valid String previousBalance;
    
    private @Valid String batchId;
    
    private @Valid long batchTotalCount;
    
    private @Valid String invoicePackStart;
    
    private @Valid String invoicePackEnd;
    
    private @Valid long totalInvoices;
    
    private @Valid long invoiceCounter;
    
    private @Valid String invoiceDate;
    
    private @Valid String billCyclePeriod;
    
    private @Valid String invoiceTitleMsg;
    
    private @Valid String taxDisclaimerMsg;
    
    private @Valid MarketingMessagesType marketingMsg;
    
    private @Valid BrochureType brochure;
    
    private @Valid String premiumMsg;
    
    private @Valid String taxZeroReversedMsg;
    
    private @Valid MerchantBankAccountType bankAccount;
    
    private @Valid WorldpayBankAccountType worldpayBankAccount;
    
    private @Valid String taxRegNumber;
    
    private @Valid String paymentInfoMsg;
    
    private @Valid String paymentInvoiceNumber;
    
    private @Valid String paymentInvoiceAmount;
    

    

    
    @JsonProperty("invoiceNumber")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    

    
    @JsonProperty("regenFlag")
    public String getRegenFlag() {
        return regenFlag;
    }

    public void setRegenFlag(String regenFlag) {
        this.regenFlag = regenFlag;
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
    public long getInvoiceCounter() {
        return invoiceCounter;
    }

    public void setInvoiceCounter(long invoiceCounter) {
        this.invoiceCounter = invoiceCounter;
    }
    

    
    @JsonProperty("invoiceDate")
    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    

    
    @JsonProperty("billCyclePeriod")
    public String getBillCyclePeriod() {
        return billCyclePeriod;
    }

    public void setBillCyclePeriod(String billCyclePeriod) {
        this.billCyclePeriod = billCyclePeriod;
    }
    

    
    @JsonProperty("invoiceTitleMsg")
    public String getInvoiceTitleMsg() {
        return invoiceTitleMsg;
    }

    public void setInvoiceTitleMsg(String invoiceTitleMsg) {
        this.invoiceTitleMsg = invoiceTitleMsg;
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
    

    
    @JsonProperty("worldpayBankAccount")
    public WorldpayBankAccountType getWorldpayBankAccount() {
        return worldpayBankAccount;
    }

    public void setWorldpayBankAccount(WorldpayBankAccountType worldpayBankAccount) {
        this.worldpayBankAccount = worldpayBankAccount;
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
    

    
    @JsonProperty("paymentInvoiceNumber")
    public String getPaymentInvoiceNumber() {
        return paymentInvoiceNumber;
    }

    public void setPaymentInvoiceNumber(String paymentInvoiceNumber) {
        this.paymentInvoiceNumber = paymentInvoiceNumber;
    }
    

    
    @JsonProperty("paymentInvoiceAmount")
    public String getPaymentInvoiceAmount() {
        return paymentInvoiceAmount;
    }

    public void setPaymentInvoiceAmount(String paymentInvoiceAmount) {
        this.paymentInvoiceAmount = paymentInvoiceAmount;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvoiceHeaderType invoiceHeaderType = (InvoiceHeaderType) o;
        return 
            Objects.equals(this.invoiceNumber, invoiceHeaderType.invoiceNumber) &&
            Objects.equals(this.regenFlag, invoiceHeaderType.regenFlag) &&
            Objects.equals(this.contactReasonTypeId, invoiceHeaderType.contactReasonTypeId) &&
            Objects.equals(this.documentTemplateTypeId, invoiceHeaderType.documentTemplateTypeId) &&
            Objects.equals(this.businessUnit, invoiceHeaderType.businessUnit) &&
            Objects.equals(this.externalPartyId, invoiceHeaderType.externalPartyId) &&
            Objects.equals(this.internalPartyId, invoiceHeaderType.internalPartyId) &&
            Objects.equals(this.poNumber, invoiceHeaderType.poNumber) &&
            Objects.equals(this.previousBalance, invoiceHeaderType.previousBalance) &&
            Objects.equals(this.batchId, invoiceHeaderType.batchId) &&
            Objects.equals(this.batchTotalCount, invoiceHeaderType.batchTotalCount) &&
            Objects.equals(this.invoicePackStart, invoiceHeaderType.invoicePackStart) &&
            Objects.equals(this.invoicePackEnd, invoiceHeaderType.invoicePackEnd) &&
            Objects.equals(this.totalInvoices, invoiceHeaderType.totalInvoices) &&
            Objects.equals(this.invoiceCounter, invoiceHeaderType.invoiceCounter) &&
            Objects.equals(this.invoiceDate, invoiceHeaderType.invoiceDate) &&
            Objects.equals(this.billCyclePeriod, invoiceHeaderType.billCyclePeriod) &&
            Objects.equals(this.invoiceTitleMsg, invoiceHeaderType.invoiceTitleMsg) &&
            Objects.equals(this.taxDisclaimerMsg, invoiceHeaderType.taxDisclaimerMsg) &&
            Objects.equals(this.marketingMsg, invoiceHeaderType.marketingMsg) &&
            Objects.equals(this.brochure, invoiceHeaderType.brochure) &&
            Objects.equals(this.premiumMsg, invoiceHeaderType.premiumMsg) &&
            Objects.equals(this.taxZeroReversedMsg, invoiceHeaderType.taxZeroReversedMsg) &&
            Objects.equals(this.bankAccount, invoiceHeaderType.bankAccount) &&
            Objects.equals(this.worldpayBankAccount, invoiceHeaderType.worldpayBankAccount) &&
            Objects.equals(this.taxRegNumber, invoiceHeaderType.taxRegNumber) &&
            Objects.equals(this.paymentInfoMsg, invoiceHeaderType.paymentInfoMsg) &&
            Objects.equals(this.paymentInvoiceNumber, invoiceHeaderType.paymentInvoiceNumber) &&
            Objects.equals(this.paymentInvoiceAmount, invoiceHeaderType.paymentInvoiceAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceNumber, regenFlag, contactReasonTypeId, documentTemplateTypeId, businessUnit, externalPartyId, internalPartyId, poNumber, previousBalance, batchId, batchTotalCount, invoicePackStart, invoicePackEnd, totalInvoices, invoiceCounter, invoiceDate, billCyclePeriod, invoiceTitleMsg, taxDisclaimerMsg, marketingMsg, brochure, premiumMsg, taxZeroReversedMsg, bankAccount, worldpayBankAccount, taxRegNumber, paymentInfoMsg, paymentInvoiceNumber, paymentInvoiceAmount);
    }

    @Override
    public String toString() {
        return "class InvoiceHeaderType {\n" +
        
                "    invoiceNumber: " + toIndentedString(invoiceNumber) + "\n" +
                "    regenFlag: " + toIndentedString(regenFlag) + "\n" +
                "    contactReasonTypeId: " + toIndentedString(contactReasonTypeId) + "\n" +
                "    documentTemplateTypeId: " + toIndentedString(documentTemplateTypeId) + "\n" +
                "    businessUnit: " + toIndentedString(businessUnit) + "\n" +
                "    externalPartyId: " + toIndentedString(externalPartyId) + "\n" +
                "    internalPartyId: " + toIndentedString(internalPartyId) + "\n" +
                "    poNumber: " + toIndentedString(poNumber) + "\n" +
                "    previousBalance: " + toIndentedString(previousBalance) + "\n" +
                "    batchId: " + toIndentedString(batchId) + "\n" +
                "    batchTotalCount: " + toIndentedString(batchTotalCount) + "\n" +
                "    invoicePackStart: " + toIndentedString(invoicePackStart) + "\n" +
                "    invoicePackEnd: " + toIndentedString(invoicePackEnd) + "\n" +
                "    totalInvoices: " + toIndentedString(totalInvoices) + "\n" +
                "    invoiceCounter: " + toIndentedString(invoiceCounter) + "\n" +
                "    invoiceDate: " + toIndentedString(invoiceDate) + "\n" +
                "    billCyclePeriod: " + toIndentedString(billCyclePeriod) + "\n" +
                "    invoiceTitleMsg: " + toIndentedString(invoiceTitleMsg) + "\n" +
                "    taxDisclaimerMsg: " + toIndentedString(taxDisclaimerMsg) + "\n" +
                "    marketingMsg: " + toIndentedString(marketingMsg) + "\n" +
                "    brochure: " + toIndentedString(brochure) + "\n" +
                "    premiumMsg: " + toIndentedString(premiumMsg) + "\n" +
                "    taxZeroReversedMsg: " + toIndentedString(taxZeroReversedMsg) + "\n" +
                "    bankAccount: " + toIndentedString(bankAccount) + "\n" +
                "    worldpayBankAccount: " + toIndentedString(worldpayBankAccount) + "\n" +
                "    taxRegNumber: " + toIndentedString(taxRegNumber) + "\n" +
                "    paymentInfoMsg: " + toIndentedString(paymentInfoMsg) + "\n" +
                "    paymentInvoiceNumber: " + toIndentedString(paymentInvoiceNumber) + "\n" +
                "    paymentInvoiceAmount: " + toIndentedString(paymentInvoiceAmount) + "\n" +
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