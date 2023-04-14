//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.14 at 02:54:40 AM MSK 
//


package dmt.custodian2016;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TAccountNumRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAccountNumRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nssmcClientTypeCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;Tnssmc_ClientType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CNUM"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClientTypeCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;urn:dmt:custodian2016&gt;TClientType"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAccountNumRequest", propOrder = {
    "nssmcClientTypeCode",
    "cnum",
    "clientTypeCode",
    "country"
})
public class TAccountNumRequest {

    @XmlElement(required = true)
    protected TAccountNumRequest.NssmcClientTypeCode nssmcClientTypeCode;
    @XmlElement(name = "CNUM", required = true)
    protected TAccountNumRequest.CNUM cnum;
    @XmlElement(name = "ClientTypeCode", required = true)
    protected TAccountNumRequest.ClientTypeCode clientTypeCode;
    @XmlElement(required = true)
    protected TAccountNumRequest.Country country;

    /**
     * Gets the value of the nssmcClientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountNumRequest.NssmcClientTypeCode }
     *     
     */
    public TAccountNumRequest.NssmcClientTypeCode getNssmcClientTypeCode() {
        return nssmcClientTypeCode;
    }

    /**
     * Sets the value of the nssmcClientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountNumRequest.NssmcClientTypeCode }
     *     
     */
    public void setNssmcClientTypeCode(TAccountNumRequest.NssmcClientTypeCode value) {
        this.nssmcClientTypeCode = value;
    }

    /**
     * Gets the value of the cnum property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountNumRequest.CNUM }
     *     
     */
    public TAccountNumRequest.CNUM getCNUM() {
        return cnum;
    }

    /**
     * Sets the value of the cnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountNumRequest.CNUM }
     *     
     */
    public void setCNUM(TAccountNumRequest.CNUM value) {
        this.cnum = value;
    }

    /**
     * Gets the value of the clientTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountNumRequest.ClientTypeCode }
     *     
     */
    public TAccountNumRequest.ClientTypeCode getClientTypeCode() {
        return clientTypeCode;
    }

    /**
     * Sets the value of the clientTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountNumRequest.ClientTypeCode }
     *     
     */
    public void setClientTypeCode(TAccountNumRequest.ClientTypeCode value) {
        this.clientTypeCode = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link TAccountNumRequest.Country }
     *     
     */
    public TAccountNumRequest.Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAccountNumRequest.Country }
     *     
     */
    public void setCountry(TAccountNumRequest.Country value) {
        this.country = value;
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
