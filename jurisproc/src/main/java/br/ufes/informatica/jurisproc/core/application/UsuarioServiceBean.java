package br.ufes.informatica.jurisproc.core.application;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

import br.ufes.informatica.jurisproc.core.domain.Usuario;
import br.ufes.informatica.jurisproc.core.persistence.UsuarioDAO;
import br.ufes.informatica.jurisproc.infra.MailSender;

@Stateless
public class UsuarioServiceBean implements UsuarioService
{
	private static final long serialVersionUID = 1L;

	@EJB
	private UsuarioDAO usuarioDAO;
	@Inject
	private MailSender mailSender;

	@Override
	public Boolean fazLogin(Usuario usuario)
	{
		// FIXME: auto-generated method stub
		return null;
	}

	@Override
	public void enviaEmailParaRecuperacaoDeSenha(String email)
	{
		Usuario usuario = usuarioDAO.buscaPorEmail(email);
		if ( usuario != null )
		{
			String mailBody = "A senha de seu login: " + usuario.getSenha();
			mailSender.send("recuperacao@jurisproc.ufes.br", email, "Recuperação de senha", mailBody);			
		}
	}

	@Override
	public void registrar(Usuario usuario)
	{
		usuarioDAO.incluir(usuario);
	}

}