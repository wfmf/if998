
package br.ufpe.cin;

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
@WebServiceClient(name = "FIPEServerService", targetNamespace = "http://cin.ufpe.br/", wsdlLocation = "http://localhost:8080/?wsdl")
public class FIPEServerService
    extends Service
{

    private final static URL FIPESERVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException FIPESERVERSERVICE_EXCEPTION;
    private final static QName FIPESERVERSERVICE_QNAME = new QName("http://cin.ufpe.br/", "FIPEServerService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FIPESERVERSERVICE_WSDL_LOCATION = url;
        FIPESERVERSERVICE_EXCEPTION = e;
    }

    public FIPEServerService() {
        super(__getWsdlLocation(), FIPESERVERSERVICE_QNAME);
    }

    public FIPEServerService(WebServiceFeature... features) {
        super(__getWsdlLocation(), FIPESERVERSERVICE_QNAME, features);
    }

    public FIPEServerService(URL wsdlLocation) {
        super(wsdlLocation, FIPESERVERSERVICE_QNAME);
    }

    public FIPEServerService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FIPESERVERSERVICE_QNAME, features);
    }

    public FIPEServerService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FIPEServerService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FIPEServer
     */
    @WebEndpoint(name = "FIPEServerPort")
    public FIPEServer getFIPEServerPort() {
        return super.getPort(new QName("http://cin.ufpe.br/", "FIPEServerPort"), FIPEServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FIPEServer
     */
    @WebEndpoint(name = "FIPEServerPort")
    public FIPEServer getFIPEServerPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cin.ufpe.br/", "FIPEServerPort"), FIPEServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FIPESERVERSERVICE_EXCEPTION!= null) {
            throw FIPESERVERSERVICE_EXCEPTION;
        }
        return FIPESERVERSERVICE_WSDL_LOCATION;
    }

}