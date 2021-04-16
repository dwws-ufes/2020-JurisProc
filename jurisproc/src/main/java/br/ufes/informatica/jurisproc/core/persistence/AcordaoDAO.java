package br.ufes.informatica.jurisproc.core.persistence;

import javax.ejb.Local;

import br.ufes.inf.nemo.jbutler.ejb.persistence.BaseDAO;
import br.ufes.informatica.jurisproc.core.domain.Acordao;

@Local
public interface AcordaoDAO extends BaseDAO<Acordao>
{

}
