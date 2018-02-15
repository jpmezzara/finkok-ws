
package com.finkok.facturacion.registration;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RegistrationListResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistrationListResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="users" type="{apps.services.soap.core.views}ResellerUserArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationListResult", namespace = "apps.services.soap.core.views", propOrder = {
    "message",
    "users"
})
public class RegistrationListResult {

    @XmlElementRef(name = "message", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElementRef(name = "users", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<ResellerUserArray> users;

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad users.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResellerUserArray }{@code >}
     *     
     */
    public JAXBElement<ResellerUserArray> getUsers() {
        return users;
    }

    /**
     * Define el valor de la propiedad users.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResellerUserArray }{@code >}
     *     
     */
    public void setUsers(JAXBElement<ResellerUserArray> value) {
        this.users = value;
    }

}
