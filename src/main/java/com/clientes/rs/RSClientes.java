package com.clientes.rs;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.touresbalon.service.ResultadoConsultaCliente;

@Path("/")
@WebService
@Produces({"application/json","application/xml"})
public interface RSClientes {
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/bucarIdentificacion/{id}")
	public ResultadoConsultaCliente buscarIdentificacion (@PathParam("id")  String identificacion);
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/bucarIdentificacion/{producto}")
	public ResultadoConsultaCliente buscarProducto (@PathParam("producto")  String producto);
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)	
	@Path("/bucarIdentificacion/{fechaInicial}/{fechaFinal}")
	public ResultadoConsultaCliente buscarFechas (@PathParam("fechaInicial")  String fechaInicial, @PathParam("fechaFinal")  String fechaFinal);
	
	
}
