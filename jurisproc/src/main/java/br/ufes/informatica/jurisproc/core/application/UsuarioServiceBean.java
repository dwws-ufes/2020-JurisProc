package br.ufes.informatica.jurisproc.core.application;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.jboss.security.Base64Encoder;

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
	@Inject
	private HttpServletRequest request;
	

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
			String uuid = null;
			try
			{
				uuid = URLEncoder.encode(UUID.randomUUID().toString(), "UTF-8");
			} catch (UnsupportedEncodingException e)
			{
				e.printStackTrace();
			}
			usuario.setLinkResetaSenha(uuid);
			usuarioDAO.save(usuario);
			String mailBody = "Link para recuperação de senha: " + "http://localhost:8080" + request.getServletContext().getContextPath() +  "/users/reseta_senha.xhtml?id=" + usuario.getLinkResetaSenha();
			mailSender.send("recuperacao@jurisproc.ufes.br", email, "Recuperação de senha", mailBody);			
		}
	}

	@Override
	public void registrar(Usuario usuario)
	{
		usuario.setDataRegistro(new Date());
		usuario.setRoles(Arrays.asList(usuarioDAO.buscaPapelPadrao()));
		
		String senhaCriptografada = usuario.getSenha();
		try
		{
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			byte []encoded = messageDigest.digest(senhaCriptografada.getBytes(StandardCharsets.UTF_8));
			senhaCriptografada = Base64Encoder.encode(encoded);
			
			usuario.setSenha(senhaCriptografada);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		usuarioDAO.incluir(usuario);
	}

}