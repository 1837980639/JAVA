
package webservice.tempuri.juzhuzheng.org.tempuri;

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

    private final static QName _QueryByMonthResponse_QNAME = new QName("http://tempuri.org/", "queryByMonthResponse");
    private final static QName _QueryByIDResponse_QNAME = new QName("http://tempuri.org/", "queryByIDResponse");
    private final static QName _QueryByMonth_QNAME = new QName("http://tempuri.org/", "queryByMonth");
    private final static QName _QueryByID_QNAME = new QName("http://tempuri.org/", "queryByID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryByMonthResponse }
     * 
     */
    public QueryByMonthResponse createQueryByMonthResponse() {
        return new QueryByMonthResponse();
    }

    /**
     * Create an instance of {@link QueryByIDResponse }
     * 
     */
    public QueryByIDResponse createQueryByIDResponse() {
        return new QueryByIDResponse();
    }

    /**
     * Create an instance of {@link QueryByMonth }
     * 
     */
    public QueryByMonth createQueryByMonth() {
        return new QueryByMonth();
    }

    /**
     * Create an instance of {@link QueryByID }
     * 
     */
    public QueryByID createQueryByID() {
        return new QueryByID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByMonthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryByMonthResponse")
    public JAXBElement<QueryByMonthResponse> createQueryByMonthResponse(QueryByMonthResponse value) {
        return new JAXBElement<QueryByMonthResponse>(_QueryByMonthResponse_QNAME, QueryByMonthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByIDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryByIDResponse")
    public JAXBElement<QueryByIDResponse> createQueryByIDResponse(QueryByIDResponse value) {
        return new JAXBElement<QueryByIDResponse>(_QueryByIDResponse_QNAME, QueryByIDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByMonth }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryByMonth")
    public JAXBElement<QueryByMonth> createQueryByMonth(QueryByMonth value) {
        return new JAXBElement<QueryByMonth>(_QueryByMonth_QNAME, QueryByMonth.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryByID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "queryByID")
    public JAXBElement<QueryByID> createQueryByID(QueryByID value) {
        return new JAXBElement<QueryByID>(_QueryByID_QNAME, QueryByID.class, null, value);
    }

}
