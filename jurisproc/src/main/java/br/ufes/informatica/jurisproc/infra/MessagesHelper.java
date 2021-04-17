package br.ufes.informatica.jurisproc.infra;

import javax.enterprise.context.Dependent;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@Dependent
public class MessagesHelper
{
	@Inject
	private FacesContext facesContext;
	
	public void addFlash(FacesMessage facesMessage)
	{
		facesContext.getExternalContext().getFlash().setKeepMessages(true);
		facesContext.addMessage(null, facesMessage);
	}

}
