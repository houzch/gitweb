package org.tempuri;

public class CtripHotelBookingServiceSoapProxy implements org.tempuri.CtripHotelBookingServiceSoap {
  private String _endpoint = null;
  private org.tempuri.CtripHotelBookingServiceSoap ctripHotelBookingServiceSoap = null;
  
  public CtripHotelBookingServiceSoapProxy() {
    _initCtripHotelBookingServiceSoapProxy();
  }
  
  public CtripHotelBookingServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCtripHotelBookingServiceSoapProxy();
  }
  
  private void _initCtripHotelBookingServiceSoapProxy() {
    try {
      ctripHotelBookingServiceSoap = (new org.tempuri.CtripHotelBookingServiceLocator()).getCtripHotelBookingServiceSoap();
      if (ctripHotelBookingServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ctripHotelBookingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ctripHotelBookingServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ctripHotelBookingServiceSoap != null)
      ((javax.xml.rpc.Stub)ctripHotelBookingServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.CtripHotelBookingServiceSoap getCtripHotelBookingServiceSoap() {
    if (ctripHotelBookingServiceSoap == null)
      _initCtripHotelBookingServiceSoapProxy();
    return ctripHotelBookingServiceSoap;
  }
  
  public java.lang.String invoke(java.lang.String xml, java.lang.String invoketype) throws java.rmi.RemoteException{
    if (ctripHotelBookingServiceSoap == null)
      _initCtripHotelBookingServiceSoapProxy();
    return ctripHotelBookingServiceSoap.invoke(xml, invoketype);
  }
  
  
}