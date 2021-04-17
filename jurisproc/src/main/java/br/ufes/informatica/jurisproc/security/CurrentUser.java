package br.ufes.informatica.jurisproc.security;

import java.io.Serializable;
import java.security.Principal;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import br.ufes.informatica.jurisproc.core.domain.Usuario;
import br.ufes.informatica.jurisproc.core.persistence.UsuarioDAO;

@Named
@SessionScoped
public class CurrentUser implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private HttpServletRequest request;
	@Inject
	private UsuarioDAO usuarioDAO;
	private Usuario usuario;
	
	public Usuario getUsuario()
	{
		return usuario;
	}
	
	@PostConstruct
	private void carregaUsuario()
	{
		Principal principal = request.getUserPrincipal();
		if ( principal != null)
		{
			this.usuario = usuarioDAO.buscaPorEmail(principal.getName());
		}
	}
	
	

}
