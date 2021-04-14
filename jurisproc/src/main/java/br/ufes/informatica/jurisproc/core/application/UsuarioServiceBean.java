package br.ufes.informatica.jurisproc.core.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.ufes.informatica.jurisproc.core.domain.Usuario;
import br.ufes.informatica.jurisproc.core.persistence.UsuarioDAO;

@Stateless
public class UsuarioServiceBean implements UsuarioService
{
	private static final long serialVersionUID = 1L;

	@EJB
	private UsuarioDAO usuarioDAO;

	@Override
	public Boolean fazLogin(Usuario usuario)
	{
		// FIXME: auto-generated method stub
		return null;
	}

	@Override
	public void enviaEmailParaRecuperacaoDeSenha(String email)
	{
		// FIXME: auto-generated method stub
		return;
	}

	@Override
	public void registrar(Usuario usuario)
	{
		usuarioDAO.incluir(usuario);
	}

}