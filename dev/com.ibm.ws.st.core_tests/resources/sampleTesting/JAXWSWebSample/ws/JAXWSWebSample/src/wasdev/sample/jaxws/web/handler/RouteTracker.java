/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package wasdev.sample.jaxws.web.handler;

import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 */
@WebService(name = "RouteTracker", serviceName = "RouteTrackerService", portName = "RouteTrackerPort", targetNamespace = "http://web.jaxws.sample.wasdev/")
@HandlerChain(file = "handler-test.xml")
public class RouteTracker {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public String track(@WebParam(name = "message") String message) {

        System.out.println(getClass().getName());
        return "response [" + message + "] Please check the outputs on the console";
    }
}
