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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TBalance_compare_row_standart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TBalance_compare_row_standart"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:dmt:custodian2016}TBalance_compare_row_simple"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Account" type="{urn:dmt:custodian2016}TAccount_Num"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TBalance_compare_row_standart", propOrder = {
    "account"
})
@XmlSeeAlso({
    TBalanceCompareRowDetailed.class
})
public class TBalanceCompareRowStandart
    extends TBalanceCompareRowSimple
{

    @XmlElement(name = "Account", required = true)
    protected String account;

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

}