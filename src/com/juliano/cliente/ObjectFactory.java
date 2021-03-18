
package com.juliano.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.juliano.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExibeNomeResponse_QNAME = new QName("http://juliano.com/", "exibeNomeResponse");
    private final static QName _CalculaResponse_QNAME = new QName("http://juliano.com/", "calculaResponse");
    private final static QName _ExibeNome_QNAME = new QName("http://juliano.com/", "exibeNome");
    private final static QName _Calcula_QNAME = new QName("http://juliano.com/", "calcula");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.juliano.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculaResponse }
     * 
     */
    public CalculaResponse createCalculaResponse() {
        return new CalculaResponse();
    }

    /**
     * Create an instance of {@link ExibeNome }
     * 
     */
    public ExibeNome createExibeNome() {
        return new ExibeNome();
    }

    /**
     * Create an instance of {@link Calcula }
     * 
     */
    public Calcula createCalcula() {
        return new Calcula();
    }

    /**
     * Create an instance of {@link ExibeNomeResponse }
     * 
     */
    public ExibeNomeResponse createExibeNomeResponse() {
        return new ExibeNomeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExibeNomeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://juliano.com/", name = "exibeNomeResponse")
    public JAXBElement<ExibeNomeResponse> createExibeNomeResponse(ExibeNomeResponse value) {
        return new JAXBElement<ExibeNomeResponse>(_ExibeNomeResponse_QNAME, ExibeNomeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://juliano.com/", name = "calculaResponse")
    public JAXBElement<CalculaResponse> createCalculaResponse(CalculaResponse value) {
        return new JAXBElement<CalculaResponse>(_CalculaResponse_QNAME, CalculaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExibeNome }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://juliano.com/", name = "exibeNome")
    public JAXBElement<ExibeNome> createExibeNome(ExibeNome value) {
        return new JAXBElement<ExibeNome>(_ExibeNome_QNAME, ExibeNome.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calcula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://juliano.com/", name = "calcula")
    public JAXBElement<Calcula> createCalcula(Calcula value) {
        return new JAXBElement<Calcula>(_Calcula_QNAME, Calcula.class, null, value);
    }

}
