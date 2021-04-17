package br.ufes.informatica.jurisproc.core.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.ufes.informatica.jurisproc.core.domain.Usuario;

@ViewScoped
@Named
public class ResetaSenhaController implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -436529902556344049L;
	
	private Usuario usuario;
	private String uuidResetaSenha;
	
	public void carregaResetaSenha()
	{
		
	}
	
	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

	public String getUuidResetaSenha()
	{
		return uuidResetaSenha;
	}

	public void setUuidResetaSenha(String uuidResetaSenha)
	{
		this.uuidResetaSenha = uuidResetaSenha;
	}
	
	

}
