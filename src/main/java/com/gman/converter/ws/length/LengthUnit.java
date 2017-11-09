
package com.gman.converter.ws.length;

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
@WebServiceClient(name = "lengthUnit", targetNamespace = "http://www.webserviceX.NET/", wsdlLocation = "http://www.webservicex.net/length.asmx?WSDL")
public class LengthUnit
    extends Service
{

    private final static URL LENGTHUNIT_WSDL_LOCATION;
    private final static WebServiceException LENGTHUNIT_EXCEPTION;
    private final static QName LENGTHUNIT_QNAME = new QName("http://www.webserviceX.NET/", "lengthUnit");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/length.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LENGTHUNIT_WSDL_LOCATION = url;
        LENGTHUNIT_EXCEPTION = e;
    }

    public LengthUnit() {
        super(__getWsdlLocation(), LENGTHUNIT_QNAME);
    }

    public LengthUnit(WebServiceFeature... features) {
        super(__getWsdlLocation(), LENGTHUNIT_QNAME, features);
    }

    public LengthUnit(URL wsdlLocation) {
        super(wsdlLocation, LENGTHUNIT_QNAME);
    }

    public LengthUnit(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LENGTHUNIT_QNAME, features);
    }

    public LengthUnit(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LengthUnit(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LengthUnitSoap
     */
    @WebEndpoint(name = "lengthUnitSoap")
    public LengthUnitSoap getLengthUnitSoap() {
        return super.getPort(new QName("http://www.webserviceX.NET/", "lengthUnitSoap"), LengthUnitSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LengthUnitSoap
     */
    @WebEndpoint(name = "lengthUnitSoap")
    public LengthUnitSoap getLengthUnitSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webserviceX.NET/", "lengthUnitSoap"), LengthUnitSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LENGTHUNIT_EXCEPTION!= null) {
            throw LENGTHUNIT_EXCEPTION;
        }
        return LENGTHUNIT_WSDL_LOCATION;
    }

}
