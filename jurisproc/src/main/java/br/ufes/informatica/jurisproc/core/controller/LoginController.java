package br.ufes.informatica.jurisproc.core.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufes.informatica.jurisproc.core.domain.Usuario;
import br.ufes.informatica.jurisproc.core.persistence.UsuarioDAO;
import br.ufes.informatica.jurisproc.infra.MailSender;

@RequestScoped
@Named
public class LoginController
{
	@Inject
	private UsuarioDAO usuarioDAO;
	private Usuario usuario = new Usuario();
	@Inject
	private MailSender mailSender;

	public String processaRecuperarSenha()
	{
		if ( usuarioDAO.buscaPorEmail(usuario.getEmail()) != null )
		{
			String mailBody = String.format("A senha de seu login %s é: ", usuario.getEmail());
			mailSender.send("recuperacao@jurisproc.ufes.br", usuario.getEmail(), "Recuperação de senha", mailBody);			
		}
		return "/index.xhtml?faces-redirect=true";
	}

	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

}