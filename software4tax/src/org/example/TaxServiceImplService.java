
package org.example;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TaxServiceImplService", targetNamespace = "http://example.org/", wsdlLocation = "http://localhost:8080/taxService?wsdl")
public class TaxServiceImplService
    extends Service
{

    private final static URL TAXSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException TAXSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName TAXSERVICEIMPLSERVICE_QNAME = new QName("http://example.org/", "TaxServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/taxService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TAXSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        TAXSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public TaxServiceImplService() {
        super(__getWsdlLocation(), TAXSERVICEIMPLSERVICE_QNAME);
    }

    public TaxServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), TAXSERVICEIMPLSERVICE_QNAME, features);
    }

    public TaxServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, TAXSERVICEIMPLSERVICE_QNAME);
    }

    public TaxServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TAXSERVICEIMPLSERVICE_QNAME, features);
    }

    public TaxServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TaxServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TaxServiceImpl
     */
    @WebEndpoint(name = "TaxServiceImplPort")
    public TaxServiceImpl getTaxServiceImplPort() {
        return super.getPort(new QName("http://example.org/", "TaxServiceImplPort"), TaxServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TaxServiceImpl
     */
    @WebEndpoint(name = "TaxServiceImplPort")
    public TaxServiceImpl getTaxServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://example.org/", "TaxServiceImplPort"), TaxServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TAXSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw TAXSERVICEIMPLSERVICE_EXCEPTION;
        }
        return TAXSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
