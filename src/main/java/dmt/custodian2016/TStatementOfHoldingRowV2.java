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
 * Строка выписки про состояние счета (с расширенным блоком иформации о ИСИН)
 * 
 * <p>Java class for TStatement_of_Holding_rowV2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TStatement_of_Holding_rowV2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISIN" type="{urn:dmt:custodian2016}TISIN_statement"/&gt;
 *         &lt;element name="BalAccount"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Code"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="6"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Name"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="256"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BlockedFor" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ShortName" type="{urn:dmt:custodian2016}TShortName"/&gt;
 *                             &lt;element name="IDCode" type="{urn:dmt:custodian2016}TIDCode"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="faceAmount" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="Percent" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "TStatement_of_Holding_rowV2", propOrder = {
    "isin",
    "balAccount",
    "quantity",
    "faceAmount",
    "percent",
    "agregateAccountID"
})
public class TStatementOfHoldingRowV2 {

    @XmlElement(name = "ISIN", required = true)
    protected TISINStatement isin;
    @XmlElement(name = "BalAccount", required = true)
    protected TStatementOfHoldingRowV2 .BalAccount balAccount;
    @XmlElement(name = "Quantity")
    protected long quantity;
    protected float faceAmount;
    @XmlElement(name = "Percent")
    protected Float percent;
    @XmlElement(name = "AgregateAccountID")
    protected String agregateAccountID;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link TISINStatement }
     *     
     */
    public TISINStatement getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TISINStatement }
     *     
     */
    public void setISIN(TISINStatement value) {
        this.isin = value;
    }

    /**
     * Gets the value of the balAccount property.
     * 
     * @return
     *     possible object is
     *     {@link TStatementOfHoldingRowV2 .BalAccount }
     *     
     */
    public TStatementOfHoldingRowV2 .BalAccount getBalAccount() {
        return balAccount;
    }

    /**
     * Sets the value of the balAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStatementOfHoldingRowV2 .BalAccount }
     *     
     */
    public void setBalAccount(TStatementOfHoldingRowV2 .BalAccount value) {
        this.balAccount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public long getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(long value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the faceAmount property.
     * 
     */
    public float getFaceAmount() {
        return faceAmount;
    }

    /**
     * Sets the value of the faceAmount property.
     * 
     */
    public void setFaceAmount(float value) {
        this.faceAmount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercent(Float value) {
        this.percent = value;
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
     *         &lt;element name="Code"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="6"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Name"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="256"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BlockedFor" minOccurs="0"&gt;
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
        "code",
        "name",
        "blockedFor"
    })
    public static class BalAccount {

        @XmlElement(name = "Code", required = true)
        protected String code;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "BlockedFor")
        protected TStatementOfHoldingRowV2 .BalAccount.BlockedFor blockedFor;

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
         * Gets the value of the blockedFor property.
         * 
         * @return
         *     possible object is
         *     {@link TStatementOfHoldingRowV2 .BalAccount.BlockedFor }
         *     
         */
        public TStatementOfHoldingRowV2 .BalAccount.BlockedFor getBlockedFor() {
            return blockedFor;
        }

        /**
         * Sets the value of the blockedFor property.
         * 
         * @param value
         *     allowed object is
         *     {@link TStatementOfHoldingRowV2 .BalAccount.BlockedFor }
         *     
         */
        public void setBlockedFor(TStatementOfHoldingRowV2 .BalAccount.BlockedFor value) {
            this.blockedFor = value;
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
        public static class BlockedFor {

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

}
