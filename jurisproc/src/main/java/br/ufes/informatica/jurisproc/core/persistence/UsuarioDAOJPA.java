package br.ufes.informatica.jurisproc.core.persistence;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseJPADAO;
import br.ufes.informatica.jurisproc.core.domain.Usuario;

/** TODO: generated by FrameWeb. Should be documented. */
@Stateless
public class UsuarioDAOJPA extends BaseJPADAO<Usuario> implements UsuarioDAO{
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. */
    @PersistenceContext
    private EntityManager entityManager;

	/** TODO: generated by FrameWeb. Should be documented. */
	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
    
    
	/** TODO: generated by FrameWeb. Should be documented. */
    @Override
	public Usuario buscaPorEmail(String email) {
		// FIXME: auto-generated method stub
		return null;
	}
	
	/** TODO: generated by FrameWeb. Should be documented. */
    @Override
	public Usuario buscaPorEmailESenha(String email, String senha) {
		// FIXME: auto-generated method stub
		return null;
	}
	

}