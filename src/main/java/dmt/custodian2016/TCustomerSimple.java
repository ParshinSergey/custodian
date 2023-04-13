//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.13 at 08:34:44 PM MSK 
//


package dmt.custodian2016;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Анкета клиента
 * 
 * <p>Java class for TCustomerSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCustomerSimple"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{urn:dmt:custodian2016}TAccount_Num" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CNUM" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="country"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TCountry"&gt;
 *                 &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CountryTax" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TCountry"&gt;
 *                 &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TIDCode"&gt;
 *                 &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClientTypeCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TClientType"&gt;
 *                 &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name" type="{urn:dmt:custodian2016}TName"/&gt;
 *         &lt;element name="addresses"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="address" type="{urn:dmt:custodian2016}Taddress"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="docFO" type="{urn:dmt:custodian2016}TdocFO" minOccurs="0"/&gt;
 *           &lt;element name="docUO" type="{urn:dmt:custodian2016}TdocUO" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="bankDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="bankDetail" type="{urn:dmt:custodian2016}TBankDetail"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="addParams" type="{urn:dmt:custodian2016}TAddParams" minOccurs="0"/&gt;
 *         &lt;element name="contact" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{urn:dmt:custodian2016}TContact"&gt;
 *                 &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BirthInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="BirthPlace"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="500"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCustomerSimple", propOrder = {
    "account",
    "customerID",
    "cnum",
    "country",
    "countryTax",
    "idCode",
    "clientTypeCode",
    "name",
    "addresses",
    "docFO",
    "docUO",
    "bankDetails",
    "addParams",
    "contact",
    "birthInfo"
})
@XmlSeeAlso({
    dmt.custodian2016.TCustomerListSimple.Customer.class,
    TAccountSimple.class
})
public class TCustomerSimple {

    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "CustomerID")
    protected BigInteger customerID;
    @XmlElement(name = "CNUM")
    protected TCustomerSimple.CNUM cnum;
    @XmlElement(required = true)
    protected TCustomerSimple.Country country;
    @XmlElement(name = "CountryTax")
    protected TCustomerSimple.CountryTax countryTax;
    @XmlElement(required = true)
    protected TCustomerSimple.IdCode idCode;
    @XmlElement(name = "ClientTypeCode")
    protected TCustomerSimple.ClientTypeCode clientTypeCode;
    @XmlElement(required = true)
    protected TName name;
    @XmlElement(required = true)
    protected TCustomerSimple.Addresses addresses;
    protected TdocFO docFO;
    protected TdocUO docUO;
    protected TCustomerSimple.BankDetails bankDetails;
    protected TAddParams addParams;
    protected TCustomerSimple.Contact contact;
    @XmlElement(name = "BirthInfo")
    protected TCustomerSimple.BirthInfo birthInfo;

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
     * Gets the value of the cnum property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.CNUM }
     *     
     */
    public TCustomerSimple.CNUM getCNUM() {
        return cnum;
    }

    /**
     * Sets the value of the cnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.CNUM }
     *     
     */
    public void setCNUM(TCustomerSimple.CNUM value) {
        this.cnum = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.Country }
     *     
     */
    public TCustomerSimple.Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.Country }
     *     
     */
    public void setCountry(TCustomerSimple.Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryTax property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.CountryTax }
     *     
     */
    public TCustomerSimple.CountryTax getCountryTax() {
        return countryTax;
    }

    /**
     * Sets the value of the countryTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.CountryTax }
     *     
     */
    public void setCountryTax(TCustomerSimple.CountryTax value) {
        this.countryTax = value;
    }

    /**
     * Gets the value of the idCode property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.IdCode }
     *     
     */
    public TCustomerSimple.IdCode getIdCode() {
        return idCode;
    }

    /**
     * Sets the value of the idCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.IdCode }
     *     
     */
    public void setIdCode(TCustomerSimple.IdCode value) {
        this.idCode = value;
    }

    /**
     * Gets the value of the clientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.ClientTypeCode }
     *     
     */
    public TCustomerSimple.ClientTypeCode getClientTypeCode() {
        return clientTypeCode;
    }

    /**
     * Sets the value of the clientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.ClientTypeCode }
     *     
     */
    public void setClientTypeCode(TCustomerSimple.ClientTypeCode value) {
        this.clientTypeCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TName }
     *     
     */
    public TName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TName }
     *     
     */
    public void setName(TName value) {
        this.name = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.Addresses }
     *     
     */
    public TCustomerSimple.Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.Addresses }
     *     
     */
    public void setAddresses(TCustomerSimple.Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the docFO property.
     * 
     * @return
     *     possible object is
     *     {@link TdocFO }
     *     
     */
    public TdocFO getDocFO() {
        return docFO;
    }

    /**
     * Sets the value of the docFO property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdocFO }
     *     
     */
    public void setDocFO(TdocFO value) {
        this.docFO = value;
    }

    /**
     * Gets the value of the docUO property.
     * 
     * @return
     *     possible object is
     *     {@link TdocUO }
     *     
     */
    public TdocUO getDocUO() {
        return docUO;
    }

    /**
     * Sets the value of the docUO property.
     * 
     * @param value
     *     allowed object is
     *     {@link TdocUO }
     *     
     */
    public void setDocUO(TdocUO value) {
        this.docUO = value;
    }

    /**
     * Gets the value of the bankDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.BankDetails }
     *     
     */
    public TCustomerSimple.BankDetails getBankDetails() {
        return bankDetails;
    }

    /**
     * Sets the value of the bankDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.BankDetails }
     *     
     */
    public void setBankDetails(TCustomerSimple.BankDetails value) {
        this.bankDetails = value;
    }

    /**
     * Gets the value of the addParams property.
     * 
     * @return
     *     possible object is
     *     {@link TAddParams }
     *     
     */
    public TAddParams getAddParams() {
        return addParams;
    }

    /**
     * Sets the value of the addParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAddParams }
     *     
     */
    public void setAddParams(TAddParams value) {
        this.addParams = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.Contact }
     *     
     */
    public TCustomerSimple.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.Contact }
     *     
     */
    public void setContact(TCustomerSimple.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the birthInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomerSimple.BirthInfo }
     *     
     */
    public TCustomerSimple.BirthInfo getBirthInfo() {
        return birthInfo;
    }

    /**
     * Sets the value of the birthInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomerSimple.BirthInfo }
     *     
     */
    public void setBirthInfo(TCustomerSimple.BirthInfo value) {
        this.birthInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="address" type="{urn:dmt:custodian2016}Taddress"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class Addresses {

        @XmlElement(required = true)
        protected List<Taddress> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Taddress }
         * 
         * 
         */
        public List<Taddress> getAddress() {
            if (address == null) {
                address = new ArrayList<Taddress>();
            }
            return this.address;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="bankDetail" type="{urn:dmt:custodian2016}TBankDetail"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bankDetail"
    })
    public static class BankDetails {

        @XmlElement(required = true)
        protected List<TBankDetail> bankDetail;

        /**
         * Gets the value of the bankDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the bankDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBankDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TBankDetail }
         * 
         * 
         */
        public List<TBankDetail> getBankDetail() {
            if (bankDetail == null) {
                bankDetail = new ArrayList<TBankDetail>();
            }
            return this.bankDetail;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="BirthPlace"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="500"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "birthDate",
        "birthPlace"
    })
    public static class BirthInfo {

        @XmlElement(name = "BirthDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlElement(name = "BirthPlace", required = true)
        protected String birthPlace;
        @XmlAttribute(name = "changed")
        protected Boolean changed;

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the birthPlace property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthPlace() {
            return birthPlace;
        }

        /**
         * Sets the value of the birthPlace property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthPlace(String value) {
            this.birthPlace = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChanged(Boolean value) {
            this.changed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CNUM {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "changed")
        protected Boolean changed;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChanged(Boolean value) {
            this.changed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:dmt:custodian2016&gt;TClientType"&gt;
     *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ClientTypeCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "changed")
        protected Boolean changed;

        /**
         * Tип клиента согласно классификации ПО "Хранитель 2016"
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChanged(Boolean value) {
            this.changed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{urn:dmt:custodian2016}TContact"&gt;
     *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Contact
        extends TContact
    {

        @XmlAttribute(name = "changed")
        protected Boolean changed;

        /**
         * Gets the value of the changed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChanged(Boolean value) {
            this.changed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:dmt:custodian2016&gt;TCountry"&gt;
     *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Country {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "changed")
        protected Boolean changed;

        /**
         * Цифровой код страны ISO 3166-1 numeric
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChanged(Boolean value) {
            this.changed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:dmt:custodian2016&gt;TCountry"&gt;
     *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CountryTax {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "changed")
        protected Boolean changed;

        /**
         * Цифровой код страны ISO 3166-1 numeric
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChanged(Boolean value) {
            this.changed = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;urn:dmt:custodian2016&gt;TIDCode"&gt;
     *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class IdCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "changed")
        protected Boolean changed;

        /**
         * ИНН физического лица или ЕГРПОУ юридического лица
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChanged(Boolean value) {
            this.changed = value;
        }

    }

}
