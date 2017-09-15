/*******************************************************************************
 * Copyright (c) 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package wasdev.sample.jaxws.ejb.ejbwebservices.webclient;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name = "UserQueryService", targetNamespace = "http://ejbwebservices.ejb.jaxws.sample.wasdev/",
                  wsdlLocation = "file:/D:/tmp/beta/wsgen_results/UserQueryService.wsdl")
public class UserQueryService
                extends Service
{

    private final static URL USERQUERYSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERQUERYSERVICE_EXCEPTION;
    private final static QName USERQUERYSERVICE_QNAME = new QName("http://ejbwebservices.ejb.jaxws.sample.wasdev/", "UserQueryService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/tmp/beta/wsgen_results/UserQueryService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERQUERYSERVICE_WSDL_LOCATION = url;
        USERQUERYSERVICE_EXCEPTION = e;
    }

    public UserQueryService() {
        super(__getWsdlLocation(), USERQUERYSERVICE_QNAME);
    }

    public UserQueryService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERQUERYSERVICE_QNAME, features);
    }

    public UserQueryService(URL wsdlLocation) {
        super(wsdlLocation, USERQUERYSERVICE_QNAME);
    }

    public UserQueryService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERQUERYSERVICE_QNAME, features);
    }

    public UserQueryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserQueryService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *         returns UserQuery
     */
    @WebEndpoint(name = "UserQueryPort")
    public UserQuery getUserQueryPort() {
        return super.getPort(new QName("http://ejbwebservices.ejb.jaxws.sample.wasdev/", "UserQueryPort"), UserQuery.class);
    }

    /**
     * 
     * @param features
     *            A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in the <code>features</code> parameter will have their default
     *            values.
     * @return
     *         returns UserQuery
     */
    @WebEndpoint(name = "UserQueryPort")
    public UserQuery getUserQueryPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejbwebservices.ejb.jaxws.sample.wasdev/", "UserQueryPort"), UserQuery.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERQUERYSERVICE_EXCEPTION != null) {
            throw USERQUERYSERVICE_EXCEPTION;
        }
        return USERQUERYSERVICE_WSDL_LOCATION;
    }

}
