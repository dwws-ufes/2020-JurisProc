package br.ufes.informatica.jurisproc.core.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.jurisproc.core.domain.Usuario;

/** TODO: generated by FrameWeb. Should be documented. */
@Local
public interface UsuarioDAO extends BaseDAO<Usuario> {
	
	/** TODO: generated by FrameWeb. Should be documented. */
	public Usuario buscaPorEmail(String email);
	
	/** TODO: generated by FrameWeb. Should be documented. */
	public Usuario buscaPorEmailESenha(String email, String senha);
	
}