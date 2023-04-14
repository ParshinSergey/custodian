//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.14 at 02:54:40 AM MSK 
//


package dmt.custodian2016;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Документ физического лица
 * 
 * <p>Java class for TdocFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TdocFO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:dmt:custodian2016}Tdoc"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="docType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="docDatestart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="docDateStop" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="docSDRnumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="26"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="changed" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TdocFO", propOrder = {
    "docType",
    "docDatestart",
    "docDateStop",
    "docSDRnumber"
})
public class TdocFO
    extends Tdoc
{

    protected String docType;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDatestart;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDateStop;
    protected String docSDRnumber;
    @XmlAttribute(name = "changed")
    protected Boolean changed;

    /**
     * Gets the value of the docType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocType() {
        return docType;
    }

    /**
     * Sets the value of the docType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocType(String value) {
        this.docType = value;
    }

    /**
     * Gets the value of the docDatestart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDatestart() {
        return docDatestart;
    }

    /**
     * Sets the value of the docDatestart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDatestart(XMLGregorianCalendar value) {
        this.docDatestart = value;
    }

    /**
     * Gets the value of the docDateStop property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDateStop() {
        return docDateStop;
    }

    /**
     * Sets the value of the docDateStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDateStop(XMLGregorianCalendar value) {
        this.docDateStop = value;
    }

    /**
     * Gets the value of the docSDRnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSDRnumber() {
        return docSDRnumber;
    }

    /**
     * Sets the value of the docSDRnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSDRnumber(String value) {
        this.docSDRnumber = value;
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
