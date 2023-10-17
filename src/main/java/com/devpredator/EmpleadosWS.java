package com.devpredator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Vegeta
 * web service generado con Jersey
 * http://localhost:8080/project-web-services/devpredator/empleadosWS
 */

@Path("empleadosWS")
public class EmpleadosWS {
	
	@Path("test")
	@GET
	public String test() {
		return "probando web service con jersey ..............";
	}

}
