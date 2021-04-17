package br.ufes.informatica.jurisproc.core.application;

import javax.ejb.Local;

import br.ufes.inf.nemo.jbutler.ejb.application.CrudService;
import br.ufes.informatica.jurisproc.core.domain.Workshop;

@Local
public interface ManageWorkshopsService extends CrudService<Workshop> {

}