package br.ufes.informatica.jurisproc.core.controller;

import javax.enterprise.inject.Model;

import org.picketbox.util.StringUtil;

import br.ufes.inf.nemo.jbutler.ejb.controller.JSFController;
import br.ufes.informatica.jurisproc.core.domain.Usuario;

@Model
public class UsuarioController extends JSFController
{
	private static final long serialVersionUID = 1L;

	private Usuario usuario = new Usuario();
	private String repeteSenha;

	public String registrar()
	{
		System.out.println(usuario);
		if ( StringUtil.isNullOrEmpty(repeteSenha) || !repeteSenha.equals(usuario.getSenha()) )
		{
			
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

	public String getRepeteSenha()
	{
		return repeteSenha;
	}

	public void setRepeteSenha(String repeteSenha)
	{
		this.repeteSenha = repeteSenha;
	}

}