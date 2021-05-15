package br.ufes.informatica.jurisproc.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("linked_data")
public class LinkedDataResource
{
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response executarConsulta(@FormParam("query") String query)
	{
		System.out.println(query);
		return null;
	}

}
