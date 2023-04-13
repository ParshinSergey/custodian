//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.13 at 08:34:44 PM MSK 
//


package dmt.custodian2016;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Тип заголовка транзакций. Запрос
 * 
 * <p>Java class for TTransactionHeader_request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTransactionHeader_request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ISIN" type="{urn:dmt:custodian2016}TISIN"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Agreement"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{urn:dmt:custodian2016}TAgreementBase"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element name="AgreementCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="AgreementCurrency" type="{urn:dmt:custodian2016}TCurrency" minOccurs="0"/&gt;
 *                   &lt;element name="AgreementType" type="{urn:dmt:custodian2016}TTransactionContractType" minOccurs="0"/&gt;
 *                   &lt;element name="AgreementTypeName" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="100"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionProcessing" type="{urn:dmt:custodian2016}TTransactionProcessing" minOccurs="0"/&gt;
 *         &lt;element name="CommitAfterRegistr" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Statement_in_responce" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Statement_of_Holdings" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *                           &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Statement_of_Transactions" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
 *                           &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="request_in_responce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTransactionHeader_request", propOrder = {
    "isin",
    "quantity",
    "agreement",
    "transactionProcessing",
    "commitAfterRegistr",
    "statementInResponce",
    "requestInResponce"
})
@XmlSeeAlso({
    TTransactionRequest.class,
    TTransactionRequestStockBlock.class,
    TTransactionBlock.class,
    TTransactionUnBlock.class
})
public class TTransactionHeaderRequest {

    @XmlElement(name = "ISIN", required = true)
    protected TISIN isin;
    @XmlElement(name = "Quantity")
    protected long quantity;
    @XmlElement(name = "Agreement", required = true)
    protected TTransactionHeaderRequest.Agreement agreement;
    @XmlElement(name = "TransactionProcessing")
    @XmlSchemaType(name = "string")
    protected TTransactionProcessing transactionProcessing;
    @XmlElement(name = "CommitAfterRegistr")
    protected boolean commitAfterRegistr;
    @XmlElement(name = "Statement_in_responce")
    protected TTransactionHeaderRequest.StatementInResponce statementInResponce;
    @XmlElement(name = "request_in_responce")
    protected Boolean requestInResponce;

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
     * Gets the value of the agreement property.
     * 
     * @return
     *     possible object is
     *     {@link TTransactionHeaderRequest.Agreement }
     *     
     */
    public TTransactionHeaderRequest.Agreement getAgreement() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTransactionHeaderRequest.Agreement }
     *     
     */
    public void setAgreement(TTransactionHeaderRequest.Agreement value) {
        this.agreement = value;
    }

    /**
     * Gets the value of the transactionProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link TTransactionProcessing }
     *     
     */
    public TTransactionProcessing getTransactionProcessing() {
        return transactionProcessing;
    }

    /**
     * Sets the value of the transactionProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTransactionProcessing }
     *     
     */
    public void setTransactionProcessing(TTransactionProcessing value) {
        this.transactionProcessing = value;
    }

    /**
     * Gets the value of the commitAfterRegistr property.
     * 
     */
    public boolean isCommitAfterRegistr() {
        return commitAfterRegistr;
    }

    /**
     * Sets the value of the commitAfterRegistr property.
     * 
     */
    public void setCommitAfterRegistr(boolean value) {
        this.commitAfterRegistr = value;
    }

    /**
     * Gets the value of the statementInResponce property.
     * 
     * @return
     *     possible object is
     *     {@link TTransactionHeaderRequest.StatementInResponce }
     *     
     */
    public TTransactionHeaderRequest.StatementInResponce getStatementInResponce() {
        return statementInResponce;
    }

    /**
     * Sets the value of the statementInResponce property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTransactionHeaderRequest.StatementInResponce }
     *     
     */
    public void setStatementInResponce(TTransactionHeaderRequest.StatementInResponce value) {
        this.statementInResponce = value;
    }

    /**
     * Gets the value of the requestInResponce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestInResponce() {
        return requestInResponce;
    }

    /**
     * Sets the value of the requestInResponce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestInResponce(Boolean value) {
        this.requestInResponce = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{urn:dmt:custodian2016}TAgreementBase"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="AgreementCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="AgreementCurrency" type="{urn:dmt:custodian2016}TCurrency" minOccurs="0"/&gt;
     *         &lt;element name="AgreementType" type="{urn:dmt:custodian2016}TTransactionContractType" minOccurs="0"/&gt;
     *         &lt;element name="AgreementTypeName" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="100"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "agreementCost",
        "agreementCurrency",
        "agreementType",
        "agreementTypeName"
    })
    public static class Agreement
        extends TAgreementBase
    {

        @XmlElement(name = "AgreementCost")
        protected BigDecimal agreementCost;
        @XmlElement(name = "AgreementCurrency")
        protected String agreementCurrency;
        @XmlElement(name = "AgreementType")
        protected BigInteger agreementType;
        @XmlElement(name = "AgreementTypeName")
        protected String agreementTypeName;

        /**
         * Gets the value of the agreementCost property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAgreementCost() {
            return agreementCost;
        }

        /**
         * Sets the value of the agreementCost property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAgreementCost(BigDecimal value) {
            this.agreementCost = value;
        }

        /**
         * Gets the value of the agreementCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgreementCurrency() {
            return agreementCurrency;
        }

        /**
         * Sets the value of the agreementCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgreementCurrency(String value) {
            this.agreementCurrency = value;
        }

        /**
         * Gets the value of the agreementType property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAgreementType() {
            return agreementType;
        }

        /**
         * Sets the value of the agreementType property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAgreementType(BigInteger value) {
            this.agreementType = value;
        }

        /**
         * Gets the value of the agreementTypeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgreementTypeName() {
            return agreementTypeName;
        }

        /**
         * Sets the value of the agreementTypeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgreementTypeName(String value) {
            this.agreementTypeName = value;
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
     *         &lt;element name="Statement_of_Holdings" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
     *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Statement_of_Transactions" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
     *                 &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
        "statementOfHoldings",
        "statementOfTransactions"
    })
    public static class StatementInResponce {

        @XmlElement(name = "Statement_of_Holdings")
        protected TTransactionHeaderRequest.StatementInResponce.StatementOfHoldings statementOfHoldings;
        @XmlElement(name = "Statement_of_Transactions")
        protected TTransactionHeaderRequest.StatementInResponce.StatementOfTransactions statementOfTransactions;

        /**
         * Gets the value of the statementOfHoldings property.
         * 
         * @return
         *     possible object is
         *     {@link TTransactionHeaderRequest.StatementInResponce.StatementOfHoldings }
         *     
         */
        public TTransactionHeaderRequest.StatementInResponce.StatementOfHoldings getStatementOfHoldings() {
            return statementOfHoldings;
        }

        /**
         * Sets the value of the statementOfHoldings property.
         * 
         * @param value
         *     allowed object is
         *     {@link TTransactionHeaderRequest.StatementInResponce.StatementOfHoldings }
         *     
         */
        public void setStatementOfHoldings(TTransactionHeaderRequest.StatementInResponce.StatementOfHoldings value) {
            this.statementOfHoldings = value;
        }

        /**
         * Gets the value of the statementOfTransactions property.
         * 
         * @return
         *     possible object is
         *     {@link TTransactionHeaderRequest.StatementInResponce.StatementOfTransactions }
         *     
         */
        public TTransactionHeaderRequest.StatementInResponce.StatementOfTransactions getStatementOfTransactions() {
            return statementOfTransactions;
        }

        /**
         * Sets the value of the statementOfTransactions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TTransactionHeaderRequest.StatementInResponce.StatementOfTransactions }
         *     
         */
        public void setStatementOfTransactions(TTransactionHeaderRequest.StatementInResponce.StatementOfTransactions value) {
            this.statementOfTransactions = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
         *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
        public static class StatementOfHoldings {

            @XmlValue
            protected boolean value;
            @XmlAttribute(name = "Version")
            protected BigInteger version;

            /**
             * Gets the value of the value property.
             * 
             */
            public boolean isValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(boolean value) {
                this.value = value;
            }

            /**
             * Gets the value of the version property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getVersion() {
                return version;
            }

            /**
             * Sets the value of the version property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setVersion(BigInteger value) {
                this.version = value;
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;boolean"&gt;
         *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
        public static class StatementOfTransactions {

            @XmlValue
            protected boolean value;
            @XmlAttribute(name = "Version")
            protected BigInteger version;

            /**
             * Gets the value of the value property.
             * 
             */
            public boolean isValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(boolean value) {
                this.value = value;
            }

            /**
             * Gets the value of the version property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getVersion() {
                return version;
            }

            /**
             * Sets the value of the version property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setVersion(BigInteger value) {
                this.version = value;
            }

        }

    }

}
