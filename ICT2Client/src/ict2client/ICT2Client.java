/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ict2client;

import java.util.logging.Level;
import java.util.logging.Logger;
import server.Exception_Exception;

/**
 *
 * @author Dawid
 */
public class ICT2Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ICT2Client client = new ICT2Client();
        client.execute();
        
    }

    private void execute() {
        
        System.out.println("[CLIENT] - Starting test...");
        
        //Q2 - testConnection()
        System.out.println("[CLIENT] - Server testConnection() return value = " 
                + testConnection());
        
        if (testConnection().equals("ok")) {
            System.out.println("[CLIENT] - The server is connected.");
        } else {
            System.out.println("[CLIENT] - The server is not connected.");
        }
        
        //Q3 - product()
        System.out.println("[CLIENT] - Testing product():");
        
        System.out.println("[CLIENT] - product(1.0, 2.0) = " 
                + product(1.0, 2.0));
        System.out.println("[CLIENT] - product(3.1, 8.9) = " 
                + product(3.1, 8.9));
        System.out.println("[CLIENT] - product(0.3, 2.7) = " 
                + product(0.3, 2.7));
        System.out.println("[CLIENT] - product(3.4, 5.5) = " 
                + product(3.4, 5.5));
        
        //Q4 - safeProduct()       
        System.out.println("[CLIENT] - Testing safeProduct():");

        try {
            System.out.println("[CLIENT] - safeProduct(1.0, 2.0) = "
                    + safeProduct(1.0, 2.0));
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error in test 1. safeProduct(1.0, 2.0) - At least one of the values was null.");
        }
        
        try {
            System.out.println("[CLIENT] - safeProduct(null, 8.9) = "
                    + safeProduct(null, 8.9));
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error in test 2. safeProduct(null, 8.9) - At least one of the values was null.");
        }
        
        try {
            System.out.println("[CLIENT] - safeProduct(0.3, null) = "
                    + safeProduct(0.3, null));
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error in test 3. safeProduct(0.3, null) - At least one of the values was null.");
        }
        
        try {
            System.out.println("[CLIENT] - safeProduct(null, null) = "
                    + safeProduct(null, null));
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error in test 4. safeProduct(null, null) - At least one of the values was null.");
        }
        
        //Q5
        
        System.out.println("[CLIENT] - Testing addDoubleOnServer():");
        
        System.out.println("[CLIENT] - addDoubleOnServer(0.1)");
        try {
            addDoubleOnServer(0.1);
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error adding Double to server. Value is null!");
        }
        
        System.out.println("[CLIENT] - addDoubleOnServer(3.7)");
        try { 
            addDoubleOnServer(3.7);
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error adding Double to server. Value is null!");
        }
        
        System.out.println("[CLIENT] - addDoubleOnServer(2.1)");
        try { 
            addDoubleOnServer(2.1);
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error adding Double to server. Value is null!");
        }
        
        System.out.println("[CLIENT] - addDoubleOnServer(8.9)");
        try {
            addDoubleOnServer(8.9);
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error adding Double to server. Value is null!");
        }
        
        System.out.println("[CLIENT] - Testing getSmallestDouble():");
        try {
            System.out.println("[CLIENT] - getSmallestDouble() = "
                    + getSmallestDouble());
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error getting smallest double. Null / No values in list!");
        }
        
        
        //Q6
        /*
        System.out.println("[CLIENT] - Testing getSmallestDouble() with no values: ");
        
        try {
            getSmallestDouble();
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error getting smallest double. No values in list!");
        }
        
        System.out.println("[CLIENT] - Testing addDoubleOnServer() with null values: ");
        try {
            addDoubleOnServer(null);
        } catch (Exception ex) {
            System.out.println("[CLIENT] - Error adding Double to server. Value is null!");
        }
        */
        
        //Q7
        System.out.println("[CLIENT] - Testing getAllDoubleSamplesBelow():");
        
        System.out.println("[CLIENT] - getAllDoubleSamplesBelow(4.0)");
        System.out.println(getAllDoubleSamplesBelow(4.0));
        
        System.out.println("[CLIENT] - getAllDoubleSamplesBelow(3.0)");
        System.out.println(getAllDoubleSamplesBelow(3.0));
        
        System.out.println("[CLIENT] - getAllDoubleSamplesBelow(2.0)");
        System.out.println(getAllDoubleSamplesBelow(2.0));
        
        System.out.println("[CLIENT] - ...ending test.");
        
    }

    private static String testConnection() {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.testConnection();
    }

    private static Double product(java.lang.Double d1, java.lang.Double d2) {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.product(d1, d2);
    }

    private static Double safeProduct(java.lang.Double d1, java.lang.Double d2) throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.safeProduct(d1, d2);
    }

    private static Boolean addDoubleOnServer(java.lang.Double d) throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.addDoubleOnServer(d);
    }

    private static Double getSmallestDouble() throws Exception_Exception {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.getSmallestDouble();
    }

    private static java.util.List<java.lang.Object> getAllDoubleSamplesBelow(java.lang.Double d) {
        server.ICT2WebService_Service service = new server.ICT2WebService_Service();
        server.ICT2WebService port = service.getICT2WebServicePort();
        return port.getAllDoubleSamplesBelow(d);
    }
    
}
