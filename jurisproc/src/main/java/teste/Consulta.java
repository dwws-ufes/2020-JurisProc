package teste;

import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;
import org.apache.jena.rdf.model.Literal;

public class Consulta
{
	public static void main(String[] args)
	{
		String name = "Cariacica";
		if ( name != null && name.length() > 3)
		{
			String query = String.format("PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n"
					+ "PREFIX geo: <http://www.w3.org/2003/01/geo/wgs84_pos#>\n"
					+ "SELECT ?x ?lat ?long\n"
					+ "WHERE {\n"
					+ "?x rdfs:label \"%s\"@pt;\n"
					+ "geo:lat ?lat;\n"
					+ "geo:long ?long .\n"
					+ "}", name);
			
			QueryExecution queryExecution = QueryExecutionFactory.sparqlService("https://dbpedia.org/sparql", query);
			ResultSet results = queryExecution.execSelect();
			
			if ( results.hasNext() )
			{
				QuerySolution querySolution = results.next();
				Literal literalLat = querySolution.getLiteral("lat");
				Literal literalLong = querySolution.getLiteral("long");
				System.out.println("Latitude: " + literalLat.getValue() + "Longitude:" + literalLong.getValue());
			}
		}
	}

}
