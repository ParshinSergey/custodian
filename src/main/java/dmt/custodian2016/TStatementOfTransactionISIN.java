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


/**
 * Класс описывающий операции по ISIN. Состояние счета по ISIN на начало и конец периода
 * 
 * <p>Java class for TStatement_of_Transaction_ISIN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TStatement_of_Transaction_ISIN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISIN" type="{urn:dmt:custodian2016}TISIN"/&gt;
 *         &lt;element name="Issuer"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ShortName" type="{urn:dmt:custodian2016}TShortName"/&gt;
 *                   &lt;element name="IDCode" type="{urn:dmt:custodian2016}TIDCode"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="startQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="stopQuantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Rows" type="{urn:dmt:custodian2016}TStatement_of_Transaction_ISIN_rows"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TStatement_of_Transaction_ISIN", propOrder = {
    "isin",
    "issuer",
    "startQuantity",
    "stopQuantity",
    "rows"
})
public class TStatementOfTransactionISIN {

    @XmlElement(name = "ISIN", required = true)
    protected TISIN isin;
    @XmlElement(name = "Issuer", required = true)
    protected TStatementOfTransactionISIN.Issuer issuer;
    protected long startQuantity;
    protected long stopQuantity;
    @XmlElement(name = "Rows", required = true)
    protected TStatementOfTransactionISINRows rows;

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
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link TStatementOfTransactionISIN.Issuer }
     *     
     */
    public TStatementOfTransactionISIN.Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStatementOfTransactionISIN.Issuer }
     *     
     */
    public void setIssuer(TStatementOfTransactionISIN.Issuer value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the startQuantity property.
     * 
     */
    public long getStartQuantity() {
        return startQuantity;
    }

    /**
     * Sets the value of the startQuantity property.
     * 
     */
    public void setStartQuantity(long value) {
        this.startQuantity = value;
    }

    /**
     * Gets the value of the stopQuantity property.
     * 
     */
    public long getStopQuantity() {
        return stopQuantity;
    }

    /**
     * Sets the value of the stopQuantity property.
     * 
     */
    public void setStopQuantity(long value) {
        this.stopQuantity = value;
    }

    /**
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link TStatementOfTransactionISINRows }
     *     
     */
    public TStatementOfTransactionISINRows getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStatementOfTransactionISINRows }
     *     
     */
    public void setRows(TStatementOfTransactionISINRows value) {
        this.rows = value;
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
     *         &lt;element name="ShortName" type="{urn:dmt:custodian2016}TShortName"/&gt;
     *         &lt;element name="IDCode" type="{urn:dmt:custodian2016}TIDCode"/&gt;
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
        "idCode"
    })
    public static class Issuer {

        @XmlElement(name = "ShortName", required = true)
        protected String shortName;
        @XmlElement(name = "IDCode", required = true)
        protected String idCode;

        /**
         * Gets the value of the shortName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortName() {
            return shortName;
        }

        /**
         * Sets the value of the shortName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortName(String value) {
            this.shortName = value;
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

    }

}
