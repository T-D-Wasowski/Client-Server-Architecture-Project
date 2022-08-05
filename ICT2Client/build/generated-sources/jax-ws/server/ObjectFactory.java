
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _Exception_QNAME = new QName("http://server/", "Exception");
    private final static QName _GetSmallestDouble_QNAME = new QName("http://server/", "getSmallestDouble");
    private final static QName _ProductResponse_QNAME = new QName("http://server/", "productResponse");
    private final static QName _AddDoubleOnServer_QNAME = new QName("http://server/", "addDoubleOnServer");
    private final static QName _AddDoubleOnServerResponse_QNAME = new QName("http://server/", "addDoubleOnServerResponse");
    private final static QName _TestConnection_QNAME = new QName("http://server/", "testConnection");
    private final static QName _Product_QNAME = new QName("http://server/", "product");
    private final static QName _GetSmallestDoubleResponse_QNAME = new QName("http://server/", "getSmallestDoubleResponse");
    private final static QName _TestConnectionResponse_QNAME = new QName("http://server/", "testConnectionResponse");
    private final static QName _SafeProductResponse_QNAME = new QName("http://server/", "safeProductResponse");
    private final static QName _GetAllDoubleSamplesBelowResponse_QNAME = new QName("http://server/", "getAllDoubleSamplesBelowResponse");
    private final static QName _SafeProduct_QNAME = new QName("http://server/", "safeProduct");
    private final static QName _GetAllDoubleSamplesBelow_QNAME = new QName("http://server/", "getAllDoubleSamplesBelow");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link AddDoubleOnServer }
     * 
     */
    public AddDoubleOnServer createAddDoubleOnServer() {
        return new AddDoubleOnServer();
    }

    /**
     * Create an instance of {@link AddDoubleOnServerResponse }
     * 
     */
    public AddDoubleOnServerResponse createAddDoubleOnServerResponse() {
        return new AddDoubleOnServerResponse();
    }

    /**
     * Create an instance of {@link TestConnection }
     * 
     */
    public TestConnection createTestConnection() {
        return new TestConnection();
    }

    /**
     * Create an instance of {@link GetSmallestDouble }
     * 
     */
    public GetSmallestDouble createGetSmallestDouble() {
        return new GetSmallestDouble();
    }

    /**
     * Create an instance of {@link ProductResponse }
     * 
     */
    public ProductResponse createProductResponse() {
        return new ProductResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetAllDoubleSamplesBelow }
     * 
     */
    public GetAllDoubleSamplesBelow createGetAllDoubleSamplesBelow() {
        return new GetAllDoubleSamplesBelow();
    }

    /**
     * Create an instance of {@link SafeProduct }
     * 
     */
    public SafeProduct createSafeProduct() {
        return new SafeProduct();
    }

    /**
     * Create an instance of {@link GetAllDoubleSamplesBelowResponse }
     * 
     */
    public GetAllDoubleSamplesBelowResponse createGetAllDoubleSamplesBelowResponse() {
        return new GetAllDoubleSamplesBelowResponse();
    }

    /**
     * Create an instance of {@link SafeProductResponse }
     * 
     */
    public SafeProductResponse createSafeProductResponse() {
        return new SafeProductResponse();
    }

    /**
     * Create an instance of {@link GetSmallestDoubleResponse }
     * 
     */
    public GetSmallestDoubleResponse createGetSmallestDoubleResponse() {
        return new GetSmallestDoubleResponse();
    }

    /**
     * Create an instance of {@link TestConnectionResponse }
     * 
     */
    public TestConnectionResponse createTestConnectionResponse() {
        return new TestConnectionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmallestDouble }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getSmallestDouble")
    public JAXBElement<GetSmallestDouble> createGetSmallestDouble(GetSmallestDouble value) {
        return new JAXBElement<GetSmallestDouble>(_GetSmallestDouble_QNAME, GetSmallestDouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "productResponse")
    public JAXBElement<ProductResponse> createProductResponse(ProductResponse value) {
        return new JAXBElement<ProductResponse>(_ProductResponse_QNAME, ProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoubleOnServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addDoubleOnServer")
    public JAXBElement<AddDoubleOnServer> createAddDoubleOnServer(AddDoubleOnServer value) {
        return new JAXBElement<AddDoubleOnServer>(_AddDoubleOnServer_QNAME, AddDoubleOnServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddDoubleOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addDoubleOnServerResponse")
    public JAXBElement<AddDoubleOnServerResponse> createAddDoubleOnServerResponse(AddDoubleOnServerResponse value) {
        return new JAXBElement<AddDoubleOnServerResponse>(_AddDoubleOnServerResponse_QNAME, AddDoubleOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "testConnection")
    public JAXBElement<TestConnection> createTestConnection(TestConnection value) {
        return new JAXBElement<TestConnection>(_TestConnection_QNAME, TestConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSmallestDoubleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getSmallestDoubleResponse")
    public JAXBElement<GetSmallestDoubleResponse> createGetSmallestDoubleResponse(GetSmallestDoubleResponse value) {
        return new JAXBElement<GetSmallestDoubleResponse>(_GetSmallestDoubleResponse_QNAME, GetSmallestDoubleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "testConnectionResponse")
    public JAXBElement<TestConnectionResponse> createTestConnectionResponse(TestConnectionResponse value) {
        return new JAXBElement<TestConnectionResponse>(_TestConnectionResponse_QNAME, TestConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "safeProductResponse")
    public JAXBElement<SafeProductResponse> createSafeProductResponse(SafeProductResponse value) {
        return new JAXBElement<SafeProductResponse>(_SafeProductResponse_QNAME, SafeProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDoubleSamplesBelowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllDoubleSamplesBelowResponse")
    public JAXBElement<GetAllDoubleSamplesBelowResponse> createGetAllDoubleSamplesBelowResponse(GetAllDoubleSamplesBelowResponse value) {
        return new JAXBElement<GetAllDoubleSamplesBelowResponse>(_GetAllDoubleSamplesBelowResponse_QNAME, GetAllDoubleSamplesBelowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SafeProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "safeProduct")
    public JAXBElement<SafeProduct> createSafeProduct(SafeProduct value) {
        return new JAXBElement<SafeProduct>(_SafeProduct_QNAME, SafeProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDoubleSamplesBelow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getAllDoubleSamplesBelow")
    public JAXBElement<GetAllDoubleSamplesBelow> createGetAllDoubleSamplesBelow(GetAllDoubleSamplesBelow value) {
        return new JAXBElement<GetAllDoubleSamplesBelow>(_GetAllDoubleSamplesBelow_QNAME, GetAllDoubleSamplesBelow.class, null, value);
    }

}
