//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.01.30 at 12:49:43 PM PST
//


package com.adc.tableau.tableauSever.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for capabilityType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="capabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="AddComment"/>
 *             &lt;enumeration value="ChangeHierarchy"/>
 *             &lt;enumeration value="ChangePermissions"/>
 *             &lt;enumeration value="Connect"/>
 *             &lt;enumeration value="Delete"/>
 *             &lt;enumeration value="ExportData"/>
 *             &lt;enumeration value="ExportImage"/>
 *             &lt;enumeration value="ExportXml"/>
 *             &lt;enumeration value="Filter"/>
 *             &lt;enumeration value="ProjectLeader"/>
 *             &lt;enumeration value="Read"/>
 *             &lt;enumeration value="ShareView"/>
 *             &lt;enumeration value="ViewComments"/>
 *             &lt;enumeration value="ViewUnderlyingData"/>
 *             &lt;enumeration value="WebAuthoring"/>
 *             &lt;enumeration value="Write"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="mode" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Allow"/>
 *             &lt;enumeration value="Deny"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "capabilityType")
public class CapabilityType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "mode", required = true)
    protected String mode;

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
     * Gets the value of the mode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMode(String value) {
        this.mode = value;
    }

}
