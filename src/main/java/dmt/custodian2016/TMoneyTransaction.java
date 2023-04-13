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
 * Денежная транзакция 
 * 
 * <p>Java class for TMoneyTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMoneyTransaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TranID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="FinID" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="MoneyTransactionType" type="{urn:dmt:custodian2016}TMoneyTransactionType"/&gt;
 *         &lt;element name="Credit" type="{urn:dmt:custodian2016}TMoneyBankDetail"/&gt;
 *         &lt;element name="Debit" type="{urn:dmt:custodian2016}TMoneyBankDetail"/&gt;
 *         &lt;element name="Cost" type="{urn:dmt:custodian2016}TCost"/&gt;
 *         &lt;element name="Currency" type="{urn:dmt:custodian2016}TCurrency"/&gt;
 *         &lt;element name="sendedToABS" type="{urn:dmt:custodian2016}TsendedToABS" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMoneyTransaction", propOrder = {
    "tranID",
    "finID",
    "tranDate",
    "moneyTransactionType",
    "credit",
    "debit",
    "cost",
    "currency",
    "sendedToABS",
    "purpose"
})
public class TMoneyTransaction {

    @XmlElement(name = "TranID", required = true)
    protected BigInteger tranID;
    @XmlElement(name = "FinID", required = true)
    protected Object finID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tranDate;
    @XmlElement(name = "MoneyTransactionType", required = true)
    @XmlSchemaType(name = "string")
    protected TMoneyTransactionType moneyTransactionType;
    @XmlElement(name = "Credit", required = true)
    protected TMoneyBankDetail credit;
    @XmlElement(name = "Debit", required = true)
    protected TMoneyBankDetail debit;
    @XmlElement(name = "Cost", required = true)
    protected TCost cost;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendedToABS;
    @XmlElement(name = "Purpose")
    protected String purpose;

    /**
     * Gets the value of the tranID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTranID() {
        return tranID;
    }

    /**
     * Sets the value of the tranID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTranID(BigInteger value) {
        this.tranID = value;
    }

    /**
     * Gets the value of the finID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFinID() {
        return finID;
    }

    /**
     * Sets the value of the finID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFinID(Object value) {
        this.finID = value;
    }

    /**
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the moneyTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TMoneyTransactionType }
     *     
     */
    public TMoneyTransactionType getMoneyTransactionType() {
        return moneyTransactionType;
    }

    /**
     * Sets the value of the moneyTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMoneyTransactionType }
     *     
     */
    public void setMoneyTransactionType(TMoneyTransactionType value) {
        this.moneyTransactionType = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link TMoneyBankDetail }
     *     
     */
    public TMoneyBankDetail getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMoneyBankDetail }
     *     
     */
    public void setCredit(TMoneyBankDetail value) {
        this.credit = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link TMoneyBankDetail }
     *     
     */
    public TMoneyBankDetail getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMoneyBankDetail }
     *     
     */
    public void setDebit(TMoneyBankDetail value) {
        this.debit = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link TCost }
     *     
     */
    public TCost getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCost }
     *     
     */
    public void setCost(TCost value) {
        this.cost = value;
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

    /**
     * Gets the value of the sendedToABS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendedToABS() {
        return sendedToABS;
    }

    /**
     * Sets the value of the sendedToABS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendedToABS(XMLGregorianCalendar value) {
        this.sendedToABS = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

}