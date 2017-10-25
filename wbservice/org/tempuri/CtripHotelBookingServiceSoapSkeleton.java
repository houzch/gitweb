/**
 * CtripHotelBookingServiceSoapSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CtripHotelBookingServiceSoapSkeleton implements org.tempuri.CtripHotelBookingServiceSoap, org.apache.axis.wsdl.Skeleton {
    private org.tempuri.CtripHotelBookingServiceSoap impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "xml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Invoketype"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("invoke", _params, new javax.xml.namespace.QName("http://tempuri.org/", "InvokeResult"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tempuri.org/", "Invoke"));
        _oper.setSoapAction("http://tempuri.org/Invoke");
        _myOperationsList.add(_oper);
        if (_myOperations.get("invoke") == null) {
            _myOperations.put("invoke", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("invoke")).add(_oper);
    }

    public CtripHotelBookingServiceSoapSkeleton() {
        this.impl = new org.tempuri.CtripHotelBookingServiceSoapImpl();
    }

    public CtripHotelBookingServiceSoapSkeleton(org.tempuri.CtripHotelBookingServiceSoap impl) {
        this.impl = impl;
    }
    public java.lang.String invoke(java.lang.String xml, java.lang.String invoketype) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.invoke(xml, invoketype);
        return ret;
    }

}
