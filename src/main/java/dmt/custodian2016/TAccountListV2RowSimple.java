//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.14 at 02:54:40 AM MSK 
//


package dmt.custodian2016;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Запись по каждому клиенту в результатах поиска (сокращеный набор данных) V2
 * 
 * <p>Java class for TAccountListV2_row_simple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAccountListV2_row_simple"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{urn:dmt:custodian2016}TAccount_Num"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="idCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TIDCode"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="country"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TCountry"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CountryTax" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TCountry"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="name"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="shortName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;urn:dmt:custodian2016&gt;TShortName"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="longName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;urn:dmt:custodian2016&gt;TLongName"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="docFO" type="{urn:dmt:custodian2016}TdocFO"/&gt;
 *           &lt;element name="docUO" type="{urn:dmt:custodian2016}TdocUO" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ClientTypeCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TClientType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nssmcClientTypeCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;Tnssmc_ClientType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="State" type="{urn:dmt:custodian2016}TAccountState"/&gt;
 *         &lt;element name="Status" type="{urn:dmt:custodian2016}TAccountStatus"/&gt;
 *         &lt;element name="accountDateopen" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="accountDateClose" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="Level"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NDU" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="NBU" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNUM" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AccountID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAccountListV2_row_simple", propOrder = {
    "account",
    "customerID",
    "idCode",
    "country",
    "countryTax",
    "name",
    "docFO",
    "docUO",
    "clientTypeCode",
    "nssmcClientTypeCode",
    "state",
    "status",
    "accountDateopen",
    "accountDateClose",
    "level",
    "cnum",
    "accountID"
})
public class TAccountListV2RowSimple {

    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "CustomerID")
    protected BigInteger customerID;
    @XmlElement(required = true)
    protected TAccountListV2RowSimple.IdCode idCode;
    @XmlElement(required = true)
    protected TAccountListV2RowSimple.Country country;
    @XmlElement(name = "CountryTax")
    protected TAccountListV2RowSimple.CountryTax countryTax;
    @XmlElement(required = true)
    protected TAccountListV2RowSimple.Name name;
    protected TdocFO docFO;
    protected TdocUO docUO;
    @XmlElement(name = "ClientTypeCode", required = true)
    protected TAccountListV2RowSimple.ClientTypeCode clientTypeCode;
    @XmlElement(required = true)
    protected TAccountListV2RowSimple.NssmcClientTypeCode nssmcClientTypeCode;
    @XmlElement(name = "State", required = true)
    protected BigInteger state;
    @XmlElement(name = "Status", required = true)
    protected BigInteger status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accountDateopen;
    protected Object accountDateClose;
    @XmlElement(name = "Level", required = true)
    protected TAccountListV2RowSimple.Level level;
    @XmlElement(name = "CNUM")
    protected TAccountListV2RowSimple.CNUM cnum;
    @XmlElement(name = "AccountID", required = true)
    protected BigInteger accountID;

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
     * Gets the value of the idCode property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2RowSimple.IdCode }
     *     
     */
    public TAccountListV2RowSimple.IdCode getIdCode() {
        return idCode;
    }

    /**
     * Sets the value of the idCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2RowSimple.IdCode }
     *     
     */
    public void setIdCode(TAccountListV2RowSimple.IdCode value) {
        this.idCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2RowSimple.Country }
     *     
     */
    public TAccountListV2RowSimple.Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2RowSimple.Country }
     *     
     */
    public void setCountry(TAccountListV2RowSimple.Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryTax property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2RowSimple.CountryTax }
     *     
     */
    public TAccountListV2RowSimple.CountryTax getCountryTax() {
        return countryTax;
    }

    /**
     * Sets the value of the countryTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2RowSimple.CountryTax }
     *     
     */
    public void setCountryTax(TAccountListV2RowSimple.CountryTax value) {
        this.countryTax = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2RowSimple.Name }
     *     
     */
    public TAccountListV2RowSimple.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2RowSimple.Name }
     *     
     */
    public void setName(TAccountListV2RowSimple.Name value) {
        this.name = value;
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
     * Gets the value of the clientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2RowSimple.ClientTypeCode }
     *     
     */
    public TAccountListV2RowSimple.ClientTypeCode getClientTypeCode() {
        return clientTypeCode;
    }

    /**
     * Sets the value of the clientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2RowSimple.ClientTypeCode }
     *     
     */
    public void setClientTypeCode(TAccountListV2RowSimple.ClientTypeCode value) {
        this.clientTypeCode = value;
    }

    /**
     * Gets the value of the nssmcClientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2RowSimple.NssmcClientTypeCode }
     *     
     */
    public TAccountListV2RowSimple.NssmcClientTypeCode getNssmcClientTypeCode() {
        return nssmcClientTypeCode;
    }

    /**
     * Sets the value of the nssmcClientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2RowSimple.NssmcClientTypeCode }
     *     
     */
    public void setNssmcClientTypeCode(TAccountListV2RowSimple.NssmcClientTypeCode value) {
        this.nssmcClientTypeCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setState(BigInteger value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatus(BigInteger value) {
        this.status = value;
    }

    /**
     * Gets the value of the accountDateopen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccountDateopen() {
        return accountDateopen;
    }

    /**
     * Sets the value of the accountDateopen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccountDateopen(XMLGregorianCalendar value) {
        this.accountDateopen = value;
    }

    /**
     * Gets the value of the accountDateClose property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAccountDateClose() {
        return accountDateClose;
    }

    /**
     * Sets the value of the accountDateClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAccountDateClose(Object value) {
        this.accountDateClose = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2RowSimple.Level }
     *     
     */
    public TAccountListV2RowSimple.Level getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2RowSimple.Level }
     *     
     */
    public void setLevel(TAccountListV2RowSimple.Level value) {
        this.level = value;
    }

    /**
     * Gets the value of the cnum property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountListV2RowSimple.CNUM }
     *     
     */
    public TAccountListV2RowSimple.CNUM getCNUM() {
        return cnum;
    }

    /**
     * Sets the value of the cnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountListV2RowSimple.CNUM }
     *     
     */
    public void setCNUM(TAccountListV2RowSimple.CNUM value) {
        this.cnum = value;
    }

    /**
     * Gets the value of the accountID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAccountID() {
        return accountID;
    }

    /**
     * Sets the value of the accountID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAccountID(BigInteger value) {
        this.accountID = value;
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
     *         &lt;element name="NDU" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="NBU" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
        "ndu",
        "nbu"
    })
    public static class Level {

        @XmlElement(name = "NDU", required = true)
        protected Object ndu;
        @XmlElement(name = "NBU", required = true)
        protected Object nbu;

        /**
         * Gets the value of the ndu property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNDU() {
            return ndu;
        }

        /**
         * Sets the value of the ndu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNDU(Object value) {
            this.ndu = value;
        }

        /**
         * Gets the value of the nbu property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getNBU() {
            return nbu;
        }

        /**
         * Sets the value of the nbu property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setNBU(Object value) {
            this.nbu = value;
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
     *         &lt;element name="shortName"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TShortName"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="longName"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TLongName"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
    @XmlType(name = "", propOrder = {
        "shortName",
        "longName"
    })
    public static class Name {

        @XmlElement(required = true)
        protected TAccountListV2RowSimple.Name.ShortName shortName;
        @XmlElement(required = true)
        protected TAccountListV2RowSimple.Name.LongName longName;

        /**
         * Gets the value of the shortName property.
         * 
         * @return
         *     possible object is
         *     {@link TAccountListV2RowSimple.Name.ShortName }
         *     
         */
        public TAccountListV2RowSimple.Name.ShortName getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link TAccountListV2RowSimple.Name.ShortName }
         *     
         */
        public void setShortName(TAccountListV2RowSimple.Name.ShortName value) {
            this.shortName = value;
        }

        /**
         * Gets the value of the longName property.
         * 
         * @return
         *     possible object is
         *     {@link TAccountListV2RowSimple.Name.LongName }
         *     
         */
        public TAccountListV2RowSimple.Name.LongName getLongName() {
            return longName;
        }

        /**
         * Sets the value of the longName property.
         * 
         * @param value
         *     allowed object is
         *     {@link TAccountListV2RowSimple.Name.LongName }
         *     
         */
        public void setLongName(TAccountListV2RowSimple.Name.LongName value) {
            this.longName = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;urn:dmt:custodian2016&gt;TLongName"&gt;
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
        public static class LongName {

            @XmlValue
            protected String value;

            /**
             * Полное наименоване для юридических лиц/ПИБ для физических
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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;urn:dmt:custodian2016&gt;TShortName"&gt;
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
        public static class ShortName {

            @XmlValue
            protected String value;

            /**
             * Сокращеное наименоване для юридических лиц/ПИБ для физических
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
     *     &lt;extension base="&lt;urn:dmt:custodian2016&gt;Tnssmc_ClientType"&gt;
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
    public static class NssmcClientTypeCode {

        @XmlValue
        protected String value;

        /**
         *  37. Довідник «Види депонентів, клієнтів депозитарної установи, клієнтів торговця цінними паперами»
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

    }

}
