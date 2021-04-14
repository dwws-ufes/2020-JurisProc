package br.ufes.informatica.jurisproc.core.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.ufes.informatica.jurisproc.core.application.UsuarioService;
import br.ufes.informatica.jurisproc.core.domain.Usuario;

@RequestScoped
@Named
public class LoginController
{
	@Inject
	private UsuarioService usuarioService;
	private Usuario usuario = new Usuario();
	

	public String processaRecuperarSenha()
	{
		usuarioService.enviaEmailParaRecuperacaoDeSenha(usuario.getEmail());
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