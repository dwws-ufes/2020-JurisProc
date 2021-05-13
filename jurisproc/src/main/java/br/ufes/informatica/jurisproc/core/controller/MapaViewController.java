package br.ufes.informatica.jurisproc.core.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
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

import br.ufes.informatica.jurisproc.core.domain.SecaoJudiciaria;
import br.ufes.informatica.jurisproc.core.persistence.SJDAO;

@Named
@RequestScoped
public class MapaViewController
{

	private MapModel simpleModel;
	@Inject
	private SJDAO sjDAO;

	@PostConstruct
	public void init()
	{
		simpleModel = new DefaultMapModel();
		List<SecaoJudiciaria> secaoJudiciarias = sjDAO.buscaTodos();

		for (SecaoJudiciaria j : secaoJudiciarias)
		{
			String query = String.format("PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
					+ "PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#>\n" + "SELECT ?x ?lat ?long\n"
					+ "WHERE {\n" + "?x rdfs:label \"%s\"@pt;\n" + "geo:lat ?lat;\n" + "geo:long ?long .\n" + "}",
					j.getNome());

			QueryExecution queryExecution = QueryExecutionFactory.sparqlService("https://dbpedia.org/sparql", query);
			ResultSet results = queryExecution.execSelect();

			if (results.hasNext())
			{
				QuerySolution querySolution = results.next();
				Literal literalLat = querySolution.getLiteral("lat");
				Literal literalLong = querySolution.getLiteral("long");

				LatLng coordenada = new LatLng(Double.parseDouble(literalLat.getValue().toString()),
						Double.parseDouble(literalLong.getValue().toString()));

				simpleModel.addOverlay(new Marker(coordenada, j.getNome()));
			}
		}

	}

//	private void testeMontagem()
//	{
//		simpleModel = new DefaultMapModel();
//
//		LatLng coord1 = new LatLng(36.879466, 30.667648);
//		LatLng coord2 = new LatLng(36.883707, 30.689216);
//		LatLng coord3 = new LatLng(36.879703, 30.706707);
//		LatLng coord4 = new LatLng(36.885233, 30.702323);
//
//		simpleModel.addOverlay(new Marker(coord1, "Konyaalti"));
//		simpleModel.addOverlay(new Marker(coord2, "Ataturk Parki"));
//		simpleModel.addOverlay(new Marker(coord3, "Karaalioglu Parki"));
//		simpleModel.addOverlay(new Marker(coord4, "Kaleici"));
//	}

	/*
	 * private void adicionaNoMapaTeste() { String nome = "Cariacica"; if ( nome !=
	 * null && nome.length() > 3) { String query =
	 * "PREFIX dbo: <http://dbpedia.org/ontology/>\n" +
	 * "PREFIX dbp: <http://dbpedia.org/property/>\n" +
	 * "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" + "SELECT ?desc\n" +
	 * "WHERE {\n" + " ?uri a dbo:City ;\n" + "dbp:name \"Rio de Janeiro\"@en ;\n" +
	 * "rdfs:comment ?desc .\n" + "FILTER (langMatches(lang(?desc), \"EN\"))\n" +
	 * "}";
	 * 
	 * QueryExecution queryExecution =
	 * QueryExecutionFactory.sparqlService("https://dbpedia.org/sparql", query);
	 * 
	 * ResultSet results = queryExecution.execSelect();
	 * 
	 * if ( results.hasNext() ) { QuerySolution querySolution = results.next();
	 * Literal literal = querySolution.getLiteral("desc");
	 * System.out.println(literal.getValue()); }
	 * 
	 * }
	 * 
	 * }
	 */

	public MapModel getSimpleModel()
	{
		return simpleModel;
	}
}
