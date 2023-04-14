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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Информация о договоре на открытие счета/брокерском договоре
 * 
 * <p>Java class for TAgreement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAgreement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:dmt:custodian2016}TAgreementBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateStart" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dateStop" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AgrID" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAgreement", propOrder = {
    "dateStart",
    "dateStop",
    "agrID"
})
@XmlSeeAlso({
    dmt.custodian2016.TupdateAccount.Agreements.Agreement.class,
    dmt.custodian2016.TAccountSimple.Agreements.Agreement.class,
    dmt.custodian2016.TnewAccountRequest.Agreements.Agreement.class,
    dmt.custodian2016.TnewAccountRequest.BrokerAgreements.BrokerAgreement.class
})
public class TAgreement
    extends TAgreementBase
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateStart;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateStop;
    @XmlElement(name = "AgrID")
    protected BigInteger agrID;

    /**
     * Gets the value of the dateStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStart() {
        return dateStart;
    }

    /**
     * Sets the value of the dateStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStart(XMLGregorianCalendar value) {
        this.dateStart = value;
    }

    /**
     * Gets the value of the dateStop property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateStop() {
        return dateStop;
    }

    /**
     * Sets the value of the dateStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateStop(XMLGregorianCalendar value) {
        this.dateStop = value;
    }

    /**
     * Gets the value of the agrID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAgrID() {
        return agrID;
    }

    /**
     * Sets the value of the agrID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAgrID(BigInteger value) {
        this.agrID = value;
    }

}
