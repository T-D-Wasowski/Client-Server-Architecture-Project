/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import java.util.Collections;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Tomasz Dawid Wasowski - w1684891
 */
@WebService(serviceName = "ICT2WebService")
public class ICT2WebService {
    
    ArrayList<Double> serverDoubleList = new ArrayList();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "testConnection")
    public String testConnection() {
        System.out.println("[SERVER] - testConnection()");
        return "ok";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "product")
    public Double product(@WebParam(name = "d1") Double d1, @WebParam(name = "d2") Double d2) {
        System.out.println("[SERVER] - product()");
        return d1*d2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "safeProduct")
    public Double safeProduct(@WebParam(name = "d1") Double d1, @WebParam(name = "d2") Double d2) throws Exception {
        System.out.println("[SERVER] - product()");
        return d1*d2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addDoubleOnServer")
    public Boolean addDoubleOnServer(@WebParam(name = "d") Double d) throws Exception {
        System.out.println("[SERVER] - addDoubleOnServer()");
        
        if(d == null) {
            throw new Exception();
        } else {
            serverDoubleList.add(d);
        }
        
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getSmallestDouble")
    public Double getSmallestDouble() throws Exception {
        System.out.println("[SERVER] - getSmallestDouble()");
        return Collections.min(serverDoubleList);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllDoubleSamplesBelow")
    public ArrayList getAllDoubleSamplesBelow(@WebParam(name = "d") Double d) {
        
        System.out.println("[SERVER] - getAllDoubleSamplesBelow()");
        ArrayList<Double> doubleList = new ArrayList();
        
        for (Double i: serverDoubleList) {
            if (i >= d) {
                doubleList.add(i);
            }
        }
        
        return doubleList;
    }
}
