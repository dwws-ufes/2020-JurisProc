package teste;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.vocabulary.VCARD;

public class Teste
{
	public static void main(String[] args)
	{
		String personURI = "http://somewhere/JohnSmith";
		String givenName = "John";
		String familyName = "Smith";
		String fullName = givenName + " " + familyName;

		Model model = ModelFactory.createDefaultModel();

		Resource johnSmith = model.createResource(personURI).addProperty(VCARD.FN, fullName).addProperty(VCARD.N,
				model.createResource().addProperty(VCARD.Given, givenName).addProperty(VCARD.Family, familyName));
		
		StmtIterator iter = model.listStatements();
		
		while ( iter.hasNext() )
		{
			Statement stmt = iter.nextStatement();
			Resource subject = stmt.getSubject();
			Property predicate = stmt.getPredicate();
			RDFNode object = stmt.getObject();
			
			System.out.println(subject.toString());
			System.out.println(" " + predicate.toString() + " ");
			if ( object instanceof Resource )
			{
				System.out.print(object.toString());
			}
			else
			{
				System.out.println(" \"" + object.toString() + "\"");
			}
			System.out.println(" .");
		}
	}

}
