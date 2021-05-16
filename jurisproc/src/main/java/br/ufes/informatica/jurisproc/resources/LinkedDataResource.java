package br.ufes.informatica.jurisproc.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("linked_data")
public class LinkedDataResource
{
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Response executarConsulta(@FormParam("query") String query)
	{
		Client client = ClientBuilder.newClient();
		String uri = "http://localhost:2020/sparql";
		Form dadosDeEntradaForm = new Form("query", query);
		Entity<Form> formEntity = Entity.form(dadosDeEntradaForm);
		Response response = client.target(uri).request().post(formEntity);
		return response;
	}

}
