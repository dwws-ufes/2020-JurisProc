package br.ufes.informatica.jurisproc.core.controller;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;
import javax.inject.Named;

import org.picketbox.util.StringUtil;

import br.ufes.inf.nemo.jbutler.ejb.controller.JSFController;
import br.ufes.informatica.jurisproc.core.application.UsuarioService;
import br.ufes.informatica.jurisproc.core.domain.Usuario;
import br.ufes.informatica.jurisproc.infra.MessagesHelper;

@Named
@RequestScoped
public class UsuarioController extends JSFController
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private UsuarioService usuarioService;
	private Usuario usuario = new Usuario();
	private String repeteSenha;
	@Inject
	private MessagesHelper messagesHelper;

	public String registrar()
	{
		System.out.println(usuario);
		if ( StringUtil.isNullOrEmpty(repeteSenha) || !repeteSenha.equals(usuario.getSenha()) )
		{
			messagesHelper.addFlash(new FacesMessage("As senhas não são iguais"));
			return "index.xhtml";
		}		
		usuarioService.registrar(usuario);
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

	public String getRepeteSenha()
	{
		return repeteSenha;
	}

	public void setRepeteSenha(String repeteSenha)
	{
		this.repeteSenha = repeteSenha;
	}

}