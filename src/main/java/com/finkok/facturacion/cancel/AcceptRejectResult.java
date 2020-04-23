
package com.finkok.facturacion.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcceptRejectResult complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcceptRejectResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rechazo" type="{apps.services.soap.core.views}RechazaArray" minOccurs="0"/&gt;
 *         &lt;element name="aceptacion" type="{apps.services.soap.core.views}AceptaArray" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptRejectResult", namespace = "apps.services.soap.core.views", propOrder = {
    "rechazo",
    "aceptacion",
    "error"
})
public class AcceptRejectResult {

    @XmlElementRef(name = "rechazo", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<RechazaArray> rechazo;
    @XmlElementRef(name = "aceptacion", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<AceptaArray> aceptacion;
    @XmlElementRef(name = "error", namespace = "apps.services.soap.core.views", type = JAXBElement.class, required = false)
    protected JAXBElement<String> error;

    /**
     * Obtiene el valor de la propiedad rechazo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RechazaArray }{@code >}
     *     
     */
    public JAXBElement<RechazaArray> getRechazo() {
        return rechazo;
    }

    /**
     * Define el valor de la propiedad rechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RechazaArray }{@code >}
     *     
     */
    public void setRechazo(JAXBElement<RechazaArray> value) {
        this.rechazo = value;
    }

    /**
     * Obtiene el valor de la propiedad aceptacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AceptaArray }{@code >}
     *     
     */
    public JAXBElement<AceptaArray> getAceptacion() {
        return aceptacion;
    }

    /**
     * Define el valor de la propiedad aceptacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AceptaArray }{@code >}
     *     
     */
    public void setAceptacion(JAXBElement<AceptaArray> value) {
        this.aceptacion = value;
    }

    /**
     * Obtiene el valor de la propiedad error.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getError() {
        return error;
    }

    /**
     * Define el valor de la propiedad error.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setError(JAXBElement<String> value) {
        this.error = value;
    }

}
