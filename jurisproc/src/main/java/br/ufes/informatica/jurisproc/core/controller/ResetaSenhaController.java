package br.ufes.informatica.jurisproc.core.controller;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.jboss.security.Base64Encoder;

import br.ufes.informatica.jurisproc.core.domain.Usuario;
import br.ufes.informatica.jurisproc.core.persistence.UsuarioDAO;

@ViewScoped
@Named
public class ResetaSenhaController implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -436529902556344049L;
	@EJB
	private UsuarioDAO usuarioDAO;
	
	private Usuario usuario;
	private String uuidResetaSenha;
	private String repeteSenha;
	
	public void carregaResetaSenha()
	{
		usuario = usuarioDAO.buscaPorLinkResetaSenha(uuidResetaSenha);
		usuario.setSenha(null);
	}
	
	public String resetarSenha()
	{
		if ( !usuario.getSenha().equals(repeteSenha) ) 
		{
			return "/users/reseta_senha.xhtml";
		}
		
		usuario.setLinkResetaSenha(null);
		
		String senhaCriptografada = usuario.getSenha();
		
		MessageDigest messageDigest;
		try
		{
			messageDigest = MessageDigest.getInstance("SHA-256");
			byte []encoded = messageDigest.digest(senhaCriptografada.getBytes(StandardCharsets.UTF_8));
			senhaCriptografada = Base64Encoder.encode(encoded);
			usuario.setSenha(senhaCriptografada);
			usuarioDAO.merge(usuario);		
		} catch (NoSuchAlgorithmException | IOException e)
		{
			return "/users/login.xhtml?faces-redirect=true";
		}
		
		return "/users/login.xhtml?faces-redirect=true";
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

	public String getRepeteSenha()
	{
		return repeteSenha;
	}

	public void setRepeteSenha(String repeteSenha)
	{
		this.repeteSenha = repeteSenha;
	}	

}
