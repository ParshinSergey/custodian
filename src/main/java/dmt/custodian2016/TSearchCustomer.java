//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.14 at 02:54:40 AM MSK 
//


package dmt.custodian2016;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Поисковый запрос для получения списка клиентов
 * 
 * <p>Java class for TSearchCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSearchCustomer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{urn:dmt:custodian2016}TLongName" minOccurs="0"/&gt;
 *         &lt;element name="IDCode" type="{urn:dmt:custodian2016}TIDCode" minOccurs="0"/&gt;
 *         &lt;element name="CNUM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="fullResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="docFO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="docSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="docNumber"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="26"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="boolOper"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="2"/&gt;
 *             &lt;maxLength value="3"/&gt;
 *             &lt;enumeration value="OR"/&gt;
 *             &lt;enumeration value="AND"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSearchCustomer", propOrder = {
    "name",
    "idCode",
    "cnum",
    "fullResult",
    "docFO"
})
@XmlSeeAlso({
    TSearchAccount.class
})
public class TSearchCustomer {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "IDCode")
    protected String idCode;
    @XmlElement(name = "CNUM")
    protected String cnum;
    protected Boolean fullResult;
    protected TSearchCustomer.DocFO docFO;
    @XmlAttribute(name = "boolOper")
    protected String boolOper;

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
     * Gets the value of the cnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNUM() {
        return cnum;
    }

    /**
     * Sets the value of the cnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNUM(String value) {
        this.cnum = value;
    }

    /**
     * Gets the value of the fullResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFullResult() {
        return fullResult;
    }

    /**
     * Sets the value of the fullResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullResult(Boolean value) {
        this.fullResult = value;
    }

    /**
     * Gets the value of the docFO property.
     * 
     * @return
     *     possible object is
     *     {@link TSearchCustomer.DocFO }
     *     
     */
    public TSearchCustomer.DocFO getDocFO() {
        return docFO;
    }

    /**
     * Sets the value of the docFO property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSearchCustomer.DocFO }
     *     
     */
    public void setDocFO(TSearchCustomer.DocFO value) {
        this.docFO = value;
    }

    /**
     * Gets the value of the boolOper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoolOper() {
        return boolOper;
    }

    /**
     * Sets the value of the boolOper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoolOper(String value) {
        this.boolOper = value;
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
     *         &lt;element name="docSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="docNumber"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="26"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
        "docSerial",
        "docNumber"
    })
    public static class DocFO {

        protected String docSerial;
        @XmlElement(required = true)
        protected String docNumber;

        /**
         * Gets the value of the docSerial property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocSerial() {
            return docSerial;
        }

        /**
         * Sets the value of the docSerial property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocSerial(String value) {
            this.docSerial = value;
        }

        /**
         * Gets the value of the docNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocNumber() {
            return docNumber;
        }

        /**
         * Sets the value of the docNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocNumber(String value) {
            this.docNumber = value;
        }

    }

}
