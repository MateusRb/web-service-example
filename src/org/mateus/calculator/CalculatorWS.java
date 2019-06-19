package org.mateus.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class CalculatorWS {

    @WebMethod(operationName = "sum")
    public int sum(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2) {
        return value1 + value2;
    }

    @WebMethod(operationName = "subtraction")
    public int subtraction(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2) {
        return value1 - value2;
    }

    @WebMethod(operationName = "division")
    public int division(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2) {
        return value1 / value2;
    }

    @WebMethod(operationName = "multiplication")
    public int multiplication(@WebParam(name = "value1") int value1, @WebParam(name = "value2") int value2) {
        return value1 * value2;
    }

    public static void main(String[] argv) {
        Object implementor = new CalculatorWS();
        String address = "http://localhost:9000/CalculatorWS";
        Endpoint.publish(address, implementor);
    }
}
