
package webservice.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginByAccountResponse_QNAME = new QName("http://tempuri.org/", "loginByAccountResponse");
    private final static QName _LoginByAccount_QNAME = new QName("http://tempuri.org/", "loginByAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginByAccountResponse }
     * 
     */
    public LoginByAccountResponse createLoginByAccountResponse() {
        return new LoginByAccountResponse();
    }

    /**
     * Create an instance of {@link LoginByAccount }
     * 
     */
    public LoginByAccount createLoginByAccount() {
        return new LoginByAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginByAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginByAccountResponse")
    public JAXBElement<LoginByAccountResponse> createLoginByAccountResponse(LoginByAccountResponse value) {
        return new JAXBElement<LoginByAccountResponse>(_LoginByAccountResponse_QNAME, LoginByAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginByAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginByAccount")
    public JAXBElement<LoginByAccount> createLoginByAccount(LoginByAccount value) {
        return new JAXBElement<LoginByAccount>(_LoginByAccount_QNAME, LoginByAccount.class, null, value);
    }

}
