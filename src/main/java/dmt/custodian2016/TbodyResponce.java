//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.13 at 08:34:44 PM MSK 
//


package dmt.custodian2016;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тело ответа
 * 
 * <p>Java class for TbodyResponce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TbodyResponce"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Customer" type="{urn:dmt:custodian2016}TCustomer"/&gt;
 *         &lt;element name="account" type="{urn:dmt:custodian2016}TAccount"/&gt;
 *         &lt;element name="status" type="{urn:dmt:custodian2016}TStatus"/&gt;
 *         &lt;element name="Statement_of_Holdings" type="{urn:dmt:custodian2016}TStatement_of_Holding"/&gt;
 *         &lt;element name="Statement_of_Transactions" type="{urn:dmt:custodian2016}TStatement_of_Transactions"/&gt;
 *         &lt;element name="Balance" type="{urn:dmt:custodian2016}TBalance_responce"/&gt;
 *         &lt;element name="Transaction" type="{urn:dmt:custodian2016}TTransaction_responce"/&gt;
 *         &lt;element name="Transaction_pre_check" type="{urn:dmt:custodian2016}TTransaction_pre_check_responce"/&gt;
 *         &lt;element name="CustomerList" type="{urn:dmt:custodian2016}TCustomerList"/&gt;
 *         &lt;element name="CustomerListSimple" type="{urn:dmt:custodian2016}TCustomerListSimple"/&gt;
 *         &lt;element name="AccountList" type="{urn:dmt:custodian2016}TAccountList"/&gt;
 *         &lt;element name="AccountListV2" type="{urn:dmt:custodian2016}TAccountListV2"/&gt;
 *         &lt;element name="AccountListSimple" type="{urn:dmt:custodian2016}TAccountListSimple"/&gt;
 *         &lt;element name="QueueList" type="{urn:dmt:custodian2016}TQueueList"/&gt;
 *         &lt;element name="limitList" type="{urn:dmt:custodian2016}TLimits"/&gt;
 *         &lt;element name="fiList" type="{urn:dmt:custodian2016}TFI_list"/&gt;
 *         &lt;element name="invoiceList" type="{urn:dmt:custodian2016}TInvoiceList"/&gt;
 *         &lt;element name="AccountNum" type="{urn:dmt:custodian2016}TAccount_Num"/&gt;
 *         &lt;element name="dictionary" type="{urn:dmt:custodian2016}TDictionaryCustom"/&gt;
 *         &lt;element name="binary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Balance_compare" type="{urn:dmt:custodian2016}TBalance_compare_rows_abstract"/&gt;
 *         &lt;element name="Notification" type="{urn:dmt:custodian2016}TNotification_parent"/&gt;
 *         &lt;element name="IncomeList" type="{urn:dmt:custodian2016}TIncomeList"/&gt;
 *         &lt;element name="customReport" type="{urn:dmt:custodian2016}TCustomReport"/&gt;
 *         &lt;element name="reportParams" type="{urn:dmt:custodian2016}TCustomReportParams"/&gt;
 *         &lt;element name="customReports" type="{urn:dmt:custodian2016}TCustomReportList"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TbodyResponce", propOrder = {
    "customer",
    "account",
    "status",
    "statementOfHoldings",
    "statementOfTransactions",
    "balance",
    "transaction",
    "transactionPreCheck",
    "customerList",
    "customerListSimple",
    "accountList",
    "accountListV2",
    "accountListSimple",
    "queueList",
    "limitList",
    "fiList",
    "invoiceList",
    "accountNum",
    "dictionary",
    "binary",
    "balanceCompare",
    "notification",
    "incomeList",
    "customReport",
    "reportParams",
    "customReports"
})
public class TbodyResponce {

    @XmlElement(name = "Customer")
    protected TCustomer customer;
    protected TAccount account;
    protected TStatus status;
    @XmlElement(name = "Statement_of_Holdings")
    protected TStatementOfHolding statementOfHoldings;
    @XmlElement(name = "Statement_of_Transactions")
    protected TStatementOfTransactions statementOfTransactions;
    @XmlElement(name = "Balance")
    protected TBalanceResponce balance;
    @XmlElement(name = "Transaction")
    protected TTransactionResponce transaction;
    @XmlElement(name = "Transaction_pre_check")
    protected TTransactionPreCheckResponce transactionPreCheck;
    @XmlElement(name = "CustomerList")
    protected TCustomerList customerList;
    @XmlElement(name = "CustomerListSimple")
    protected TCustomerListSimple customerListSimple;
    @XmlElement(name = "AccountList")
    protected TAccountList accountList;
    @XmlElement(name = "AccountListV2")
    protected TAccountListV2 accountListV2;
    @XmlElement(name = "AccountListSimple")
    protected TAccountListSimple accountListSimple;
    @XmlElement(name = "QueueList")
    protected TQueueList queueList;
    protected TLimits limitList;
    protected TFIList fiList;
    protected TInvoiceList invoiceList;
    @XmlElement(name = "AccountNum")
    protected String accountNum;
    protected TDictionaryCustom dictionary;
    protected String binary;
    @XmlElement(name = "Balance_compare")
    protected TBalanceCompareRowsAbstract balanceCompare;
    @XmlElement(name = "Notification")
    protected TNotificationParent notification;
    @XmlElement(name = "IncomeList")
    protected TIncomeList incomeList;
    protected TCustomReport customReport;
    protected TCustomReportParams reportParams;
    protected TCustomReportList customReports;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomer }
     *     
     */
    public TCustomer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomer }
     *     
     */
    public void setCustomer(TCustomer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link TAccount }
     *     
     */
    public TAccount getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccount }
     *     
     */
    public void setAccount(TAccount value) {
        this.account = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link TStatus }
     *     
     */
    public TStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStatus }
     *     
     */
    public void setStatus(TStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statementOfHoldings property.
     * 
     * @return
     *     possible object is
     *     {@link TStatementOfHolding }
     *     
     */
    public TStatementOfHolding getStatementOfHoldings() {
        return statementOfHoldings;
    }

    /**
     * Sets the value of the statementOfHoldings property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStatementOfHolding }
     *     
     */
    public void setStatementOfHoldings(TStatementOfHolding value) {
        this.statementOfHoldings = value;
    }

    /**
     * Gets the value of the statementOfTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link TStatementOfTransactions }
     *     
     */
    public TStatementOfTransactions getStatementOfTransactions() {
        return statementOfTransactions;
    }

    /**
     * Sets the value of the statementOfTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStatementOfTransactions }
     *     
     */
    public void setStatementOfTransactions(TStatementOfTransactions value) {
        this.statementOfTransactions = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link TBalanceResponce }
     *     
     */
    public TBalanceResponce getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBalanceResponce }
     *     
     */
    public void setBalance(TBalanceResponce value) {
        this.balance = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link TTransactionResponce }
     *     
     */
    public TTransactionResponce getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTransactionResponce }
     *     
     */
    public void setTransaction(TTransactionResponce value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the transactionPreCheck property.
     * 
     * @return
     *     possible object is
     *     {@link TTransactionPreCheckResponce }
     *     
     */
    public TTransactionPreCheckResponce getTransactionPreCheck() {
        return transactionPreCheck;
    }

    /**
     * Sets the value of the transactionPreCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTransactionPreCheckResponce }
     *     
     */
    public void setTransactionPreCheck(TTransactionPreCheckResponce value) {
        this.transactionPreCheck = value;
    }

    /**
     * Gets the value of the customerList property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerList }
     *     
     */
    public TCustomerList getCustomerList() {
        return customerList;
    }

    /**
     * Sets the value of the customerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerList }
     *     
     */
    public void setCustomerList(TCustomerList value) {
        this.customerList = value;
    }

    /**
     * Gets the value of the customerListSimple property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerListSimple }
     *     
     */
    public TCustomerListSimple getCustomerListSimple() {
        return customerListSimple;
    }

    /**
     * Sets the value of the customerListSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerListSimple }
     *     
     */
    public void setCustomerListSimple(TCustomerListSimple value) {
        this.customerListSimple = value;
    }

    /**
     * Gets the value of the accountList property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountList }
     *     
     */
    public TAccountList getAccountList() {
        return accountList;
    }

    /**
     * Sets the value of the accountList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountList }
     *     
     */
    public void setAccountList(TAccountList value) {
        this.accountList = value;
    }

    /**
     * Gets the value of the accountListV2 property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2 }
     *     
     */
    public TAccountListV2 getAccountListV2() {
        return accountListV2;
    }

    /**
     * Sets the value of the accountListV2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2 }
     *     
     */
    public void setAccountListV2(TAccountListV2 value) {
        this.accountListV2 = value;
    }

    /**
     * Gets the value of the accountListSimple property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListSimple }
     *     
     */
    public TAccountListSimple getAccountListSimple() {
        return accountListSimple;
    }

    /**
     * Sets the value of the accountListSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListSimple }
     *     
     */
    public void setAccountListSimple(TAccountListSimple value) {
        this.accountListSimple = value;
    }

    /**
     * Gets the value of the queueList property.
     * 
     * @return
     *     possible object is
     *     {@link TQueueList }
     *     
     */
    public TQueueList getQueueList() {
        return queueList;
    }

    /**
     * Sets the value of the queueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TQueueList }
     *     
     */
    public void setQueueList(TQueueList value) {
        this.queueList = value;
    }

    /**
     * Gets the value of the limitList property.
     * 
     * @return
     *     possible object is
     *     {@link TLimits }
     *     
     */
    public TLimits getLimitList() {
        return limitList;
    }

    /**
     * Sets the value of the limitList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLimits }
     *     
     */
    public void setLimitList(TLimits value) {
        this.limitList = value;
    }

    /**
     * Gets the value of the fiList property.
     * 
     * @return
     *     possible object is
     *     {@link TFIList }
     *     
     */
    public TFIList getFiList() {
        return fiList;
    }

    /**
     * Sets the value of the fiList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TFIList }
     *     
     */
    public void setFiList(TFIList value) {
        this.fiList = value;
    }

    /**
     * Gets the value of the invoiceList property.
     * 
     * @return
     *     possible object is
     *     {@link TInvoiceList }
     *     
     */
    public TInvoiceList getInvoiceList() {
        return invoiceList;
    }

    /**
     * Sets the value of the invoiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInvoiceList }
     *     
     */
    public void setInvoiceList(TInvoiceList value) {
        this.invoiceList = value;
    }

    /**
     * Gets the value of the accountNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNum() {
        return accountNum;
    }

    /**
     * Sets the value of the accountNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNum(String value) {
        this.accountNum = value;
    }

    /**
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link TDictionaryCustom }
     *     
     */
    public TDictionaryCustom getDictionary() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDictionaryCustom }
     *     
     */
    public void setDictionary(TDictionaryCustom value) {
        this.dictionary = value;
    }

    /**
     * Gets the value of the binary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinary() {
        return binary;
    }

    /**
     * Sets the value of the binary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinary(String value) {
        this.binary = value;
    }

    /**
     * Gets the value of the balanceCompare property.
     * 
     * @return
     *     possible object is
     *     {@link TBalanceCompareRowsAbstract }
     *     
     */
    public TBalanceCompareRowsAbstract getBalanceCompare() {
        return balanceCompare;
    }

    /**
     * Sets the value of the balanceCompare property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBalanceCompareRowsAbstract }
     *     
     */
    public void setBalanceCompare(TBalanceCompareRowsAbstract value) {
        this.balanceCompare = value;
    }

    /**
     * Gets the value of the notification property.
     * 
     * @return
     *     possible object is
     *     {@link TNotificationParent }
     *     
     */
    public TNotificationParent getNotification() {
        return notification;
    }

    /**
     * Sets the value of the notification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TNotificationParent }
     *     
     */
    public void setNotification(TNotificationParent value) {
        this.notification = value;
    }

    /**
     * Gets the value of the incomeList property.
     * 
     * @return
     *     possible object is
     *     {@link TIncomeList }
     *     
     */
    public TIncomeList getIncomeList() {
        return incomeList;
    }

    /**
     * Sets the value of the incomeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIncomeList }
     *     
     */
    public void setIncomeList(TIncomeList value) {
        this.incomeList = value;
    }

    /**
     * Gets the value of the customReport property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomReport }
     *     
     */
    public TCustomReport getCustomReport() {
        return customReport;
    }

    /**
     * Sets the value of the customReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomReport }
     *     
     */
    public void setCustomReport(TCustomReport value) {
        this.customReport = value;
    }

    /**
     * Gets the value of the reportParams property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomReportParams }
     *     
     */
    public TCustomReportParams getReportParams() {
        return reportParams;
    }

    /**
     * Sets the value of the reportParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomReportParams }
     *     
     */
    public void setReportParams(TCustomReportParams value) {
        this.reportParams = value;
    }

    /**
     * Gets the value of the customReports property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomReportList }
     *     
     */
    public TCustomReportList getCustomReports() {
        return customReports;
    }

    /**
     * Sets the value of the customReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomReportList }
     *     
     */
    public void setCustomReports(TCustomReportList value) {
        this.customReports = value;
    }

}
