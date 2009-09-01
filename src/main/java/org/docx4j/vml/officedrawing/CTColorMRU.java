/*
 *  Copyright 2007-2009, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.vml.officedrawing;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.docx4j.vml.STExt;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_ColorMRU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_ColorMRU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colors" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="8" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{urn:schemas-microsoft-com:vml}ext"/>
 *       &lt;attribute name="colors" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_ColorMRU", propOrder = {
    "colors"
})
public class CTColorMRU
    implements Child
{

    protected List<String> colors;
    @XmlAttribute(namespace = "urn:schemas-microsoft-com:vml")
    protected STExt ext;
    @XmlAttribute(name = "colors")
    protected String colorsAttr;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the colors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the colors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColors() {
        if (colors == null) {
            colors = new ArrayList<String>();
        }
        return this.colors;
    }

    /**
     * Gets the value of the ext property.
     * 
     * @return
     *     possible object is
     *     {@link STExt }
     *     
     */
    public STExt getExt() {
        if (ext == null) {
            return STExt.VIEW;
        } else {
            return ext;
        }
    }

    /**
     * Sets the value of the ext property.
     * 
     * @param value
     *     allowed object is
     *     {@link STExt }
     *     
     */
    public void setExt(STExt value) {
        this.ext = value;
    }

    /**
     * Gets the value of the colorsAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorsAttr() {
        return colorsAttr;
    }

    /**
     * Sets the value of the colorsAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorsAttr(String value) {
        this.colorsAttr = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}