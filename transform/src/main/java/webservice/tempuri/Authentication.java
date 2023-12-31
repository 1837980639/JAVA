
package webservice.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Authentication", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Authentication {


    /**
     * 
     * @param password
     * @param userid
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loginByAccount", targetNamespace = "http://tempuri.org/", className = "webservice.tempuri.LoginByAccount")
    @ResponseWrapper(localName = "loginByAccountResponse", targetNamespace = "http://tempuri.org/", className = "webservice.tempuri.LoginByAccountResponse")
    public String loginByAccount(
        @WebParam(name = "userid", targetNamespace = "")
        String userid,
        @WebParam(name = "password", targetNamespace = "")
        String password);

}
