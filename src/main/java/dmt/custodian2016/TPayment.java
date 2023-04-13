//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.13 at 08:34:44 PM MSK 
//


package dmt.custodian2016;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Оплата счет-фактуры/Погашение начисленных комиссий
 * 
 * <p>Java class for TPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Account" type="{urn:dmt:custodian2016}TAccount_Num" minOccurs="0"/&gt;
 *         &lt;element name="externalPaymentNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PaymentCost" type="{urn:dmt:custodian2016}TCost"/&gt;
 *         &lt;element name="PaymentDoc"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FromPrepayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ToPrepayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Currency" type="{urn:dmt:custodian2016}TCurrency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPayment", propOrder = {
    "invoiceNumber",
    "customerID",
    "account",
    "externalPaymentNumber",
    "paymentDate",
    "paymentCost",
    "paymentDoc",
    "fromPrepayment",
    "toPrepayment",
    "currency"
})
public class TPayment {

    @XmlElement(name = "InvoiceNumber")
    protected BigInteger invoiceNumber;
    @XmlElement(name = "CustomerID")
    protected BigInteger customerID;
    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(required = true)
    protected String externalPaymentNumber;
    @XmlElement(name = "PaymentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paymentDate;
    @XmlElement(name = "PaymentCost", required = true)
    protected TCost paymentCost;
    @XmlElement(name = "PaymentDoc", required = true)
    protected String paymentDoc;
    @XmlElement(name = "FromPrepayment")
    protected boolean fromPrepayment;
    @XmlElement(name = "ToPrepayment")
    protected Boolean toPrepayment;
    @XmlElement(name = "Currency")
    protected String currency;

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInvoiceNumber(BigInteger value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerID(BigInteger value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the externalPaymentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPaymentNumber() {
        return externalPaymentNumber;
    }

    /**
     * Sets the value of the externalPaymentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPaymentNumber(String value) {
        this.externalPaymentNumber = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the paymentCost property.
     * 
     * @return
     *     possible object is
     *     {@link TCost }
     *     
     */
    public TCost getPaymentCost() {
        return paymentCost;
    }

    /**
     * Sets the value of the paymentCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCost }
     *     
     */
    public void setPaymentCost(TCost value) {
        this.paymentCost = value;
    }

    /**
     * Gets the value of the paymentDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDoc() {
        return paymentDoc;
    }

    /**
     * Sets the value of the paymentDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDoc(String value) {
        this.paymentDoc = value;
    }

    /**
     * Gets the value of the fromPrepayment property.
     * 
     */
    public boolean isFromPrepayment() {
        return fromPrepayment;
    }

    /**
     * Sets the value of the fromPrepayment property.
     * 
     */
    public void setFromPrepayment(boolean value) {
        this.fromPrepayment = value;
    }

    /**
     * Gets the value of the toPrepayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isToPrepayment() {
        return toPrepayment;
    }

    /**
     * Sets the value of the toPrepayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setToPrepayment(Boolean value) {
        this.toPrepayment = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
