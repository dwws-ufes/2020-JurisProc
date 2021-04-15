package br.ufes.informatica.jurisproc.core.application;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Inject;

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