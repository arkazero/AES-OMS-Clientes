
package co.com.touresbalon.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.touresbalon.service package. 
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

    private final static QName _ActualizarCliente_QNAME = new QName("http://service.touresbalon.com.co/", "actualizarCliente");
    private final static QName _ActualizarClienteResponse_QNAME = new QName("http://service.touresbalon.com.co/", "actualizarClienteResponse");
    private final static QName _ConsultarClientePorFacturacion_QNAME = new QName("http://service.touresbalon.com.co/", "consultarClientePorFacturacion");
    private final static QName _ConsultarClientePorFacturacionResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarClientePorFacturacionResponse");
    private final static QName _ConsultarClientePorIdentificacion_QNAME = new QName("http://service.touresbalon.com.co/", "consultarClientePorIdentificacion");
    private final static QName _ConsultarClientePorIdentificacionResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarClientePorIdentificacionResponse");
    private final static QName _ConsultarClientePorNumeroProducto_QNAME = new QName("http://service.touresbalon.com.co/", "consultarClientePorNumeroProducto");
    private final static QName _ConsultarClientePorNumeroProductoResponse_QNAME = new QName("http://service.touresbalon.com.co/", "consultarClientePorNumeroProductoResponse");
    private final static QName _CrearCliente_QNAME = new QName("http://service.touresbalon.com.co/", "crearCliente");
    private final static QName _CrearClienteResponse_QNAME = new QName("http://service.touresbalon.com.co/", "crearClienteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.touresbalon.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarCliente }
     * 
     */
    public ActualizarCliente createActualizarCliente() {
        return new ActualizarCliente();
    }

    /**
     * Create an instance of {@link ActualizarClienteResponse }
     * 
     */
    public ActualizarClienteResponse createActualizarClienteResponse() {
        return new ActualizarClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarClientePorFacturacion }
     * 
     */
    public ConsultarClientePorFacturacion createConsultarClientePorFacturacion() {
        return new ConsultarClientePorFacturacion();
    }

    /**
     * Create an instance of {@link ConsultarClientePorFacturacionResponse }
     * 
     */
    public ConsultarClientePorFacturacionResponse createConsultarClientePorFacturacionResponse() {
        return new ConsultarClientePorFacturacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarClientePorIdentificacion }
     * 
     */
    public ConsultarClientePorIdentificacion createConsultarClientePorIdentificacion() {
        return new ConsultarClientePorIdentificacion();
    }

    /**
     * Create an instance of {@link ConsultarClientePorIdentificacionResponse }
     * 
     */
    public ConsultarClientePorIdentificacionResponse createConsultarClientePorIdentificacionResponse() {
        return new ConsultarClientePorIdentificacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarClientePorNumeroProducto }
     * 
     */
    public ConsultarClientePorNumeroProducto createConsultarClientePorNumeroProducto() {
        return new ConsultarClientePorNumeroProducto();
    }

    /**
     * Create an instance of {@link ConsultarClientePorNumeroProductoResponse }
     * 
     */
    public ConsultarClientePorNumeroProductoResponse createConsultarClientePorNumeroProductoResponse() {
        return new ConsultarClientePorNumeroProductoResponse();
    }

    /**
     * Create an instance of {@link CrearCliente }
     * 
     */
    public CrearCliente createCrearCliente() {
        return new CrearCliente();
    }

    /**
     * Create an instance of {@link CrearClienteResponse }
     * 
     */
    public CrearClienteResponse createCrearClienteResponse() {
        return new CrearClienteResponse();
    }

    /**
     * Create an instance of {@link FiltroConsultaCliente }
     * 
     */
    public FiltroConsultaCliente createFiltroConsultaCliente() {
        return new FiltroConsultaCliente();
    }

    /**
     * Create an instance of {@link ResultadoConsultaCliente }
     * 
     */
    public ResultadoConsultaCliente createResultadoConsultaCliente() {
        return new ResultadoConsultaCliente();
    }

    /**
     * Create an instance of {@link ClienteBO }
     * 
     */
    public ClienteBO createClienteBO() {
        return new ClienteBO();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ResultadoCliente }
     * 
     */
    public ResultadoCliente createResultadoCliente() {
        return new ResultadoCliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "actualizarCliente")
    public JAXBElement<ActualizarCliente> createActualizarCliente(ActualizarCliente value) {
        return new JAXBElement<ActualizarCliente>(_ActualizarCliente_QNAME, ActualizarCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "actualizarClienteResponse")
    public JAXBElement<ActualizarClienteResponse> createActualizarClienteResponse(ActualizarClienteResponse value) {
        return new JAXBElement<ActualizarClienteResponse>(_ActualizarClienteResponse_QNAME, ActualizarClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClientePorFacturacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarClientePorFacturacion")
    public JAXBElement<ConsultarClientePorFacturacion> createConsultarClientePorFacturacion(ConsultarClientePorFacturacion value) {
        return new JAXBElement<ConsultarClientePorFacturacion>(_ConsultarClientePorFacturacion_QNAME, ConsultarClientePorFacturacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClientePorFacturacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarClientePorFacturacionResponse")
    public JAXBElement<ConsultarClientePorFacturacionResponse> createConsultarClientePorFacturacionResponse(ConsultarClientePorFacturacionResponse value) {
        return new JAXBElement<ConsultarClientePorFacturacionResponse>(_ConsultarClientePorFacturacionResponse_QNAME, ConsultarClientePorFacturacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClientePorIdentificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarClientePorIdentificacion")
    public JAXBElement<ConsultarClientePorIdentificacion> createConsultarClientePorIdentificacion(ConsultarClientePorIdentificacion value) {
        return new JAXBElement<ConsultarClientePorIdentificacion>(_ConsultarClientePorIdentificacion_QNAME, ConsultarClientePorIdentificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClientePorIdentificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarClientePorIdentificacionResponse")
    public JAXBElement<ConsultarClientePorIdentificacionResponse> createConsultarClientePorIdentificacionResponse(ConsultarClientePorIdentificacionResponse value) {
        return new JAXBElement<ConsultarClientePorIdentificacionResponse>(_ConsultarClientePorIdentificacionResponse_QNAME, ConsultarClientePorIdentificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClientePorNumeroProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarClientePorNumeroProducto")
    public JAXBElement<ConsultarClientePorNumeroProducto> createConsultarClientePorNumeroProducto(ConsultarClientePorNumeroProducto value) {
        return new JAXBElement<ConsultarClientePorNumeroProducto>(_ConsultarClientePorNumeroProducto_QNAME, ConsultarClientePorNumeroProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarClientePorNumeroProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "consultarClientePorNumeroProductoResponse")
    public JAXBElement<ConsultarClientePorNumeroProductoResponse> createConsultarClientePorNumeroProductoResponse(ConsultarClientePorNumeroProductoResponse value) {
        return new JAXBElement<ConsultarClientePorNumeroProductoResponse>(_ConsultarClientePorNumeroProductoResponse_QNAME, ConsultarClientePorNumeroProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "crearCliente")
    public JAXBElement<CrearCliente> createCrearCliente(CrearCliente value) {
        return new JAXBElement<CrearCliente>(_CrearCliente_QNAME, CrearCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearClienteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.touresbalon.com.co/", name = "crearClienteResponse")
    public JAXBElement<CrearClienteResponse> createCrearClienteResponse(CrearClienteResponse value) {
        return new JAXBElement<CrearClienteResponse>(_CrearClienteResponse_QNAME, CrearClienteResponse.class, null, value);
    }

}
