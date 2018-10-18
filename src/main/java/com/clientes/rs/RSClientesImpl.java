package com.clientes.rs;

import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.UriInfo;

import co.com.touresbalon.service.FiltroConsultaCliente;
import co.com.touresbalon.service.ResultadoConsultaCliente;

public class RSClientesImpl implements RSClientes {

	@Override
	public FiltroConsultaCliente buscarIdentificacion(UriInfo uri) {
		// TODO Auto-generated method stub
		FiltroConsultaCliente clientecito = new FiltroConsultaCliente();
		
		MultivaluedMap<String, ?> paramMap = uri.getPathParameters();
	    String id = (String) paramMap.getFirst("id");
	    
		clientecito.setIdentificacion(id);
		return clientecito;
	}

	@Override
	public ResultadoConsultaCliente buscarProducto(String producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultadoConsultaCliente buscarFechas(UriInfo uri) {
		MultivaluedMap paramMap = uri.getPathParameters();
	    
		return null;
	}

}
