package com.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import co.com.touresbalon.service.CrearCliente;

@XmlRegistry
public class ObjectFactory {
	
	private final static QName _CrearCliente_QNAME = new QName("", "clienteJSON");
	
	public ObjectFactory() {
	}
	
	/**
     * Create an instance of {@link OrdenInfo }
     * 
     */
    public ClienteJSON createClienteJSON() {
        return new ClienteJSON();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearCliente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "clienteJSON")
    public JAXBElement<ClienteJSON> createClienteJSON(ClienteJSON value) {
        return new JAXBElement<ClienteJSON>(_CrearCliente_QNAME, ClienteJSON.class, null, value);
    }
}
