package com.clientes.rs;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.dto.ClienteJSON;
import com.dto.ObjPrueba;

import co.com.touresbalon.service.ActualizarCliente;
import co.com.touresbalon.service.FiltroConsultaCliente;
import co.com.touresbalon.service.ResultadoConsultaCliente;

@Path("/")
@WebService
@Produces({"application/json","application/xml"})
public interface RSClientes {
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/bucarIdentificacion/{id}")
	public FiltroConsultaCliente buscarIdentificacion (@Context UriInfo uri);
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/buscarProducto/{producto}")
	public ResultadoConsultaCliente buscarProducto (@PathParam("producto")  String producto);
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})	
	@Path("/buscarFechas/{fechaInicial}/final/{fechaFinal}")
	public ResultadoConsultaCliente buscarFechas (@Context UriInfo uri);
	
	@POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/crearClienteJSON") 
    public ClienteJSON crearClienteJSON(ClienteJSON clienteNuevo);
								   
}
