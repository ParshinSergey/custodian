//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.14 at 02:54:40 AM MSK 
//


package dmt.custodian2016;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Обратите внимание, на обработку удаленых строк. Если в справочнике отправленой внешней системой, будет отсутствовать запись, она будет удалена из справочника в ПО Хранитель. Если это значение использовалось, это может привести к некоректным данным в ПО "Хранитель". Рекомендуем вместо удаления записи использовать параметры DateStop и/или Enable
 * 
 * <p>Java class for TDictionaryList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDictionaryList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="Dictionary" type="{urn:dmt:custodian2016}TDictionary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDictionaryList", propOrder = {
    "dictionary"
})
public class TDictionaryList {

    @XmlElement(name = "Dictionary", required = true)
    protected List<TDictionary> dictionary;

    /**
     * Gets the value of the dictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDictionary }
     * 
     * 
     */
    public List<TDictionary> getDictionary() {
        if (dictionary == null) {
            dictionary = new ArrayList<TDictionary>();
        }
        return this.dictionary;
    }

}
