package br.ufes.informatica.jurisproc.core.persistence;

import java.util.List;

import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.transaction.Transactional;

import br.ufes.informatica.jurisproc.core.domain.Acordao;
import br.ufes.informatica.jurisproc.core.domain.Assunto;
import br.ufes.informatica.jurisproc.core.domain.PedidoUniformizacao;
import br.ufes.informatica.jurisproc.security.CurrentUser;

@Stateful
public class EspecialDAO
{
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager manager;
	@Inject
	private CurrentUser currentUser;

	public List<Assunto> carregaAssuntos()
	{
		return manager.createQuery("From Assunto a", Assunto.class).getResultList();
	}

	public List<Acordao> carregaAcordaos()
	{
		return manager.createQuery("From Acordao a", Acordao.class).getResultList();
	}

	public List<PedidoUniformizacao> carregaPedidosPorUsuario()
	{
		return manager.createQuery("FROM PedidoUniformizacao p JOIN FETCH p.acordao ac JOIN FETCH p.assuntos as WHERE p.usuario.id =:id_usu", PedidoUniformizacao.class)
				.setParameter("id_usu", currentUser.getUsuario().getId()).getResultList();
	}
	
	public PedidoUniformizacao buscaPorId(Long id)
	{
		return manager.find(PedidoUniformizacao.class, id);
	}
	
	@Transactional
	public void salvarPedido(PedidoUniformizacao pedidoUniformizacao)
	{
		manager.persist(pedidoUniformizacao);
	}

}
