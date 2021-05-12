package br.ufes.informatica.jurisproc.core.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;

@Named
@RequestScoped
public class MapaViewController
{

	private MapModel simpleModel;
	private String dadoInserido;

	@PostConstruct
	public void init()
	{
		simpleModel = new DefaultMapModel();

		LatLng coord1 = new LatLng(36.879466, 30.667648);
		LatLng coord2 = new LatLng(36.883707, 30.689216);
		LatLng coord3 = new LatLng(36.879703, 30.706707);
		LatLng coord4 = new LatLng(36.885233, 30.702323);

		simpleModel.addOverlay(new Marker(coord1, "Konyaalti"));
		simpleModel.addOverlay(new Marker(coord2, "Ataturk Parki"));
		simpleModel.addOverlay(new Marker(coord3, "Karaalioglu Parki"));
		simpleModel.addOverlay(new Marker(coord4, "Kaleici"));

	}
	
	public void adicionaNoMapa()
	{
		String nome = dadoInserido;
		if ( nome != null && nome.length() > 3)
		{
			String query = "PREFIX dbo: <http://dbpedia.org/ontology/>\n" +
					"PREFIX dbp: <http://dbpedia.org/property/>\n" +
					"PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
					"SELECT ?desc\n" +
					"WHERE {\n" +
					" ?uri a dbo:City ;\n" +
					"dbp:name \"Rio de Janeiro\"@en ;\n" +
					"rdfs:comment ?desc .\n" +
					"FILTER (langMatches(lang(?desc), \"EN\"))\n" +
					"}";
			
			QueryExecution queryExecution = QueryExecutionFactory.sparqlService("https://dbpedia.org/sparql", query);
			
			ResultSet results = queryExecution.execSelect();
			
			if ( results.hasNext() )
			{
				QuerySolution querySolution = results.next();
				Literal literal = querySolution.getLiteral("desc");
			}
			
		}
		
	}

	public MapModel getSimpleModel()
	{
		return simpleModel;
	}

	public String getDadoInserido()
	{
		return dadoInserido;
	}

	public void setDadoInserido(String dadoInserido)
	{
		this.dadoInserido = dadoInserido;
	}
}
