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
 * Параметр звіту
 * 
 * <p>Java class for TCustomReportParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TCustomReportParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramDisplayName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paramName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paramDataType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Bool"/&gt;
 *               &lt;enumeration value="Date"/&gt;
 *               &lt;enumeration value="Text"/&gt;
 *               &lt;enumeration value="Int"/&gt;
 *               &lt;enumeration value="DBComboBox"/&gt;
 *               &lt;enumeration value="dpSubject"/&gt;
 *               &lt;enumeration value="dpAccount"/&gt;
 *               &lt;enumeration value="ISIN"/&gt;
 *               &lt;enumeration value="ComboBox"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paramDataSource" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="keyField"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="255"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="displayField"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="255"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ItemsList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValueList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCustomReportParam", propOrder = {
    "paramDisplayName",
    "paramName",
    "paramDataType",
    "paramDataSource",
    "itemsList",
    "valueList"
})
public class TCustomReportParam {

    @XmlElement(required = true)
    protected String paramDisplayName;
    @XmlElement(required = true)
    protected String paramName;
    @XmlElement(required = true)
    protected String paramDataType;
    protected TCustomReportParam.ParamDataSource paramDataSource;
    @XmlElement(name = "ItemsList")
    protected String itemsList;
    @XmlElement(name = "ValueList")
    protected String valueList;

    /**
     * Gets the value of the paramDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamDisplayName() {
        return paramDisplayName;
    }

    /**
     * Sets the value of the paramDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamDisplayName(String value) {
        this.paramDisplayName = value;
    }

    /**
     * Gets the value of the paramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * Sets the value of the paramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamName(String value) {
        this.paramName = value;
    }

    /**
     * Gets the value of the paramDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamDataType() {
        return paramDataType;
    }

    /**
     * Sets the value of the paramDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamDataType(String value) {
        this.paramDataType = value;
    }

    /**
     * Gets the value of the paramDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link TCustomReportParam.ParamDataSource }
     *     
     */
    public TCustomReportParam.ParamDataSource getParamDataSource() {
        return paramDataSource;
    }

    /**
     * Sets the value of the paramDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCustomReportParam.ParamDataSource }
     *     
     */
    public void setParamDataSource(TCustomReportParam.ParamDataSource value) {
        this.paramDataSource = value;
    }

    /**
     * Gets the value of the itemsList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemsList() {
        return itemsList;
    }

    /**
     * Sets the value of the itemsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemsList(String value) {
        this.itemsList = value;
    }

    /**
     * Gets the value of the valueList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueList() {
        return valueList;
    }

    /**
     * Sets the value of the valueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueList(String value) {
        this.valueList = value;
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
     *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="keyField"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="255"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="displayField"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="255"/&gt;
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
        "data",
        "keyField",
        "displayField"
    })
    public static class ParamDataSource {

        @XmlElement(required = true)
        protected Object data;
        @XmlElement(required = true)
        protected String keyField;
        @XmlElement(required = true)
        protected String displayField;

        /**
         * Gets the value of the data property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getData() {
            return data;
        }

        /**
         * Sets the value of the data property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setData(Object value) {
            this.data = value;
        }

        /**
         * Gets the value of the keyField property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyField() {
            return keyField;
        }

        /**
         * Sets the value of the keyField property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyField(String value) {
            this.keyField = value;
        }

        /**
         * Gets the value of the displayField property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayField() {
            return displayField;
        }

        /**
         * Sets the value of the displayField property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayField(String value) {
            this.displayField = value;
        }

    }

}
