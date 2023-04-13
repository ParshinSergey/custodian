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
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Запись по выплате доходов
 * 
 * <p>Java class for TIncome complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIncome"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="payout_id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="corporateEvent_id" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DateCreate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IncomeType" type="{urn:dmt:custodian2016}TIncomeType"/&gt;
 *         &lt;element name="IncomeValue" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Currency" type="{urn:dmt:custodian2016}TCurrency"/&gt;
 *         &lt;element name="Taxs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="Tax" type="{urn:dmt:custodian2016}TTax"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IncomeValueClear" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Customer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Account" type="{urn:dmt:custodian2016}TAccount_Num"/&gt;
 *                   &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="CNUM"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="idCode"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;urn:dmt:custodian2016&gt;TIDCode"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="shortName"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;urn:dmt:custodian2016&gt;TShortName"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BankDetail" type="{urn:dmt:custodian2016}TBankDetailBase"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ISIN"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ISIN" type="{urn:dmt:custodian2016}TISIN"/&gt;
 *                   &lt;element name="IssuerName" type="{urn:dmt:custodian2016}TShortName"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sendedToABS" type="{urn:dmt:custodian2016}TsendedToABS" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIncome", propOrder = {
    "id",
    "payoutId",
    "corporateEventId",
    "dateCreate",
    "incomeType",
    "incomeValue",
    "currency",
    "taxs",
    "incomeValueClear",
    "customer",
    "isin",
    "sendedToABS"
})
public class TIncome {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "payout_id", required = true)
    protected BigInteger payoutId;
    @XmlElement(name = "corporateEvent_id", required = true)
    protected BigInteger corporateEventId;
    @XmlElement(name = "DateCreate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreate;
    @XmlElement(name = "IncomeType", required = true)
    @XmlSchemaType(name = "string")
    protected TIncomeType incomeType;
    @XmlElement(name = "IncomeValue")
    protected float incomeValue;
    @XmlElement(name = "Currency", required = true)
    protected String currency;
    @XmlElement(name = "Taxs")
    protected TIncome.Taxs taxs;
    @XmlElement(name = "IncomeValueClear")
    protected float incomeValueClear;
    @XmlElement(name = "Customer", required = true)
    protected TIncome.Customer customer;
    @XmlElement(name = "ISIN", required = true)
    protected TIncome.ISIN isin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendedToABS;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the payoutId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPayoutId() {
        return payoutId;
    }

    /**
     * Sets the value of the payoutId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPayoutId(BigInteger value) {
        this.payoutId = value;
    }

    /**
     * Gets the value of the corporateEventId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCorporateEventId() {
        return corporateEventId;
    }

    /**
     * Sets the value of the corporateEventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCorporateEventId(BigInteger value) {
        this.corporateEventId = value;
    }

    /**
     * Gets the value of the dateCreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreate() {
        return dateCreate;
    }

    /**
     * Sets the value of the dateCreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreate(XMLGregorianCalendar value) {
        this.dateCreate = value;
    }

    /**
     * Gets the value of the incomeType property.
     * 
     * @return
     *     possible object is
     *     {@link TIncomeType }
     *     
     */
    public TIncomeType getIncomeType() {
        return incomeType;
    }

    /**
     * Sets the value of the incomeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIncomeType }
     *     
     */
    public void setIncomeType(TIncomeType value) {
        this.incomeType = value;
    }

    /**
     * Gets the value of the incomeValue property.
     * 
     */
    public float getIncomeValue() {
        return incomeValue;
    }

    /**
     * Sets the value of the incomeValue property.
     * 
     */
    public void setIncomeValue(float value) {
        this.incomeValue = value;
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
     * Gets the value of the taxs property.
     * 
     * @return
     *     possible object is
     *     {@link TIncome.Taxs }
     *     
     */
    public TIncome.Taxs getTaxs() {
        return taxs;
    }

    /**
     * Sets the value of the taxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIncome.Taxs }
     *     
     */
    public void setTaxs(TIncome.Taxs value) {
        this.taxs = value;
    }

    /**
     * Gets the value of the incomeValueClear property.
     * 
     */
    public float getIncomeValueClear() {
        return incomeValueClear;
    }

    /**
     * Sets the value of the incomeValueClear property.
     * 
     */
    public void setIncomeValueClear(float value) {
        this.incomeValueClear = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link TIncome.Customer }
     *     
     */
    public TIncome.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIncome.Customer }
     *     
     */
    public void setCustomer(TIncome.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link TIncome.ISIN }
     *     
     */
    public TIncome.ISIN getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIncome.ISIN }
     *     
     */
    public void setISIN(TIncome.ISIN value) {
        this.isin = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Account" type="{urn:dmt:custodian2016}TAccount_Num"/&gt;
     *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="CNUM"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="idCode"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TIDCode"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="shortName"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TShortName"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BankDetail" type="{urn:dmt:custodian2016}TBankDetailBase"/&gt;
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
        "account",
        "customerID",
        "cnum",
        "idCode",
        "shortName",
        "bankDetail"
    })
    public static class Customer {

        @XmlElement(name = "Account", required = true)
        protected String account;
        @XmlElement(name = "CustomerID", required = true)
        protected BigInteger customerID;
        @XmlElement(name = "CNUM", required = true)
        protected TIncome.Customer.CNUM cnum;
        @XmlElement(required = true)
        protected TIncome.Customer.IdCode idCode;
        @XmlElement(required = true)
        protected TIncome.Customer.ShortName shortName;
        @XmlElement(name = "BankDetail", required = true)
        protected TBankDetailBase bankDetail;

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
         *     {@link TIncome.Customer.CNUM }
         *     
         */
        public TIncome.Customer.CNUM getCNUM() {
            return cnum;
        }

        /**
         * Sets the value of the cnum property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIncome.Customer.CNUM }
         *     
         */
        public void setCNUM(TIncome.Customer.CNUM value) {
            this.cnum = value;
        }

        /**
         * Gets the value of the idCode property.
         * 
         * @return
         *     possible object is
         *     {@link TIncome.Customer.IdCode }
         *     
         */
        public TIncome.Customer.IdCode getIdCode() {
            return idCode;
        }

        /**
         * Sets the value of the idCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIncome.Customer.IdCode }
         *     
         */
        public void setIdCode(TIncome.Customer.IdCode value) {
            this.idCode = value;
        }

        /**
         * Gets the value of the shortName property.
         * 
         * @return
         *     possible object is
         *     {@link TIncome.Customer.ShortName }
         *     
         */
        public TIncome.Customer.ShortName getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIncome.Customer.ShortName }
         *     
         */
        public void setShortName(TIncome.Customer.ShortName value) {
            this.shortName = value;
        }

        /**
         * Gets the value of the bankDetail property.
         * 
         * @return
         *     possible object is
         *     {@link TBankDetailBase }
         *     
         */
        public TBankDetailBase getBankDetail() {
            return bankDetail;
        }

        /**
         * Sets the value of the bankDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link TBankDetailBase }
         *     
         */
        public void setBankDetail(TBankDetailBase value) {
            this.bankDetail = value;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ISIN" type="{urn:dmt:custodian2016}TISIN"/&gt;
     *         &lt;element name="IssuerName" type="{urn:dmt:custodian2016}TShortName"/&gt;
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
        "isin",
        "issuerName"
    })
    public static class ISIN {

        @XmlElement(name = "ISIN", required = true)
        protected TISIN isin;
        @XmlElement(name = "IssuerName", required = true)
        protected String issuerName;

        /**
         * Gets the value of the isin property.
         * 
         * @return
         *     possible object is
         *     {@link TISIN }
         *     
         */
        public TISIN getISIN() {
            return isin;
        }

        /**
         * Sets the value of the isin property.
         * 
         * @param value
         *     allowed object is
         *     {@link TISIN }
         *     
         */
        public void setISIN(TISIN value) {
            this.isin = value;
        }

        /**
         * Gets the value of the issuerName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssuerName() {
            return issuerName;
        }

        /**
         * Sets the value of the issuerName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssuerName(String value) {
            this.issuerName = value;
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
     *         &lt;element name="Tax" type="{urn:dmt:custodian2016}TTax"/&gt;
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
        "tax"
    })
    public static class Taxs {

        @XmlElement(name = "Tax", required = true)
        protected List<TTax> tax;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TTax }
         * 
         * 
         */
        public List<TTax> getTax() {
            if (tax == null) {
                tax = new ArrayList<TTax>();
            }
            return this.tax;
        }

    }

}
