//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.13 at 08:34:44 PM MSK 
//


package dmt.custodian2016;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Участник сделки
 * 
 * <p>Java class for TParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TParticipant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MDO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Account" type="{urn:dmt:custodian2016}TAccount_Num"/&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IDCode" type="{urn:dmt:custodian2016}TIDCode" minOccurs="0"/&gt;
 *         &lt;element name="Doc" type="{urn:dmt:custodian2016}Tdoc" minOccurs="0"/&gt;
 *         &lt;element name="Level" type="{urn:dmt:custodian2016}TAccountLevel" minOccurs="0"/&gt;
 *         &lt;element name="AccountType" type="{urn:dmt:custodian2016}TnbuAccountType" minOccurs="0"/&gt;
 *         &lt;element name="Broker" type="{urn:dmt:custodian2016}TBroker" minOccurs="0"/&gt;
 *         &lt;element name="AgregateAccountID" type="{urn:dmt:custodian2016}TAgregateAccountID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TParticipant", propOrder = {
    "mdo",
    "account",
    "name",
    "idCode",
    "doc",
    "level",
    "accountType",
    "broker",
    "agregateAccountID"
})
public class TParticipant {

    @XmlElement(name = "MDO")
    protected String mdo;
    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IDCode")
    protected String idCode;
    @XmlElement(name = "Doc")
    protected Tdoc doc;
    @XmlElement(name = "Level")
    protected BigInteger level;
    @XmlElement(name = "AccountType")
    protected BigInteger accountType;
    @XmlElement(name = "Broker")
    protected TBroker broker;
    @XmlElement(name = "AgregateAccountID")
    protected String agregateAccountID;

    /**
     * Gets the value of the mdo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDO() {
        return mdo;
    }

    /**
     * Sets the value of the mdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDO(String value) {
        this.mdo = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the idCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCode() {
        return idCode;
    }

    /**
     * Sets the value of the idCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCode(String value) {
        this.idCode = value;
    }

    /**
     * Gets the value of the doc property.
     * 
     * @return
     *     possible object is
     *     {@link Tdoc }
     *     
     */
    public Tdoc getDoc() {
        return doc;
    }

    /**
     * Sets the value of the doc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tdoc }
     *     
     */
    public void setDoc(Tdoc value) {
        this.doc = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountType(BigInteger value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the broker property.
     * 
     * @return
     *     possible object is
     *     {@link TBroker }
     *     
     */
    public TBroker getBroker() {
        return broker;
    }

    /**
     * Sets the value of the broker property.
     * 
     * @param value
     *     allowed object is
     *     {@link TBroker }
     *     
     */
    public void setBroker(TBroker value) {
        this.broker = value;
    }

    /**
     * Gets the value of the agregateAccountID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgregateAccountID() {
        return agregateAccountID;
    }

    /**
     * Sets the value of the agregateAccountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgregateAccountID(String value) {
        this.agregateAccountID = value;
    }

}