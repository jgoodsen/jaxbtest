//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.07.01 at 04:19:53 PM EDT 
//


package com.test;

import com.test.WSClassStub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Setting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Setting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SettingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SettingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Setting", propOrder = {
    "settingId",
    "settingValue"
})
@XmlRootElement(name = "Setting")
public class Setting extends WSClassStub {

    @XmlElement(name = "SettingId")
    protected String settingId;
    @XmlElement(name = "SettingValue")
    protected String settingValue;

    /**
     * Gets the value of the settingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingId() {
        return settingId;
    }

    /**
     * Sets the value of the settingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingId(String value) {
        this.settingId = value;
    }

    /**
     * Gets the value of the settingValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettingValue() {
        return settingValue;
    }

    /**
     * Sets the value of the settingValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettingValue(String value) {
        this.settingValue = value;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Setting [settingId=" + settingId + ", settingValue=" + settingValue + "]";
	}

}