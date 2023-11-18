
package org.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example package. 
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

    private final static QName _Compute_QNAME = new QName("http://example.org/", "compute");
    private final static QName _GetTaxResponse_QNAME = new QName("http://example.org/", "getTaxResponse");
    private final static QName _ComputeResponse_QNAME = new QName("http://example.org/", "computeResponse");
    private final static QName _GetTax_QNAME = new QName("http://example.org/", "getTax");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compute }
     * 
     */
    public Compute createCompute() {
        return new Compute();
    }

    /**
     * Create an instance of {@link GetTaxResponse }
     * 
     */
    public GetTaxResponse createGetTaxResponse() {
        return new GetTaxResponse();
    }

    /**
     * Create an instance of {@link ComputeResponse }
     * 
     */
    public ComputeResponse createComputeResponse() {
        return new ComputeResponse();
    }

    /**
     * Create an instance of {@link GetTax }
     * 
     */
    public GetTax createGetTax() {
        return new GetTax();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "compute")
    public JAXBElement<Compute> createCompute(Compute value) {
        return new JAXBElement<Compute>(_Compute_QNAME, Compute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getTaxResponse")
    public JAXBElement<GetTaxResponse> createGetTaxResponse(GetTaxResponse value) {
        return new JAXBElement<GetTaxResponse>(_GetTaxResponse_QNAME, GetTaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComputeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "computeResponse")
    public JAXBElement<ComputeResponse> createComputeResponse(ComputeResponse value) {
        return new JAXBElement<ComputeResponse>(_ComputeResponse_QNAME, ComputeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.org/", name = "getTax")
    public JAXBElement<GetTax> createGetTax(GetTax value) {
        return new JAXBElement<GetTax>(_GetTax_QNAME, GetTax.class, null, value);
    }

}
