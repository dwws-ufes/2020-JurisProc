package br.ufes.informatica.jurisproc.core.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.informatica.jurisproc.core.domain.Acordao;

@Stateless
public class AcordaoDAOJPA extends BaseJPADAO<Acordao> implements AcordaoDAO
{
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager()
	{
		return entityManager;
	}

}
