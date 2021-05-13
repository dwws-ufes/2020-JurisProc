package br.ufes.informatica.jurisproc.core.persistence;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.informatica.jurisproc.core.domain.SecaoJudiciaria;

@Dependent
public class SJDAO
{
	@PersistenceContext
	private EntityManager manager;
	
	public List<SecaoJudiciaria> buscaTodos()
	{
		return manager.createQuery("FROM SecaoJudiciaria s", SecaoJudiciaria.class).getResultList();
	}

}
