package br.ufes.informatica.jurisproc.core.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.Part;

import br.ufes.inf.nemo.jbutler.ejb.controller.JSFController;
import br.ufes.informatica.jurisproc.core.application.PedidoUniformizacaoService;
import br.ufes.informatica.jurisproc.core.domain.Acordao;
import br.ufes.informatica.jurisproc.core.domain.Assunto;
import br.ufes.informatica.jurisproc.core.domain.Opcoes;
import br.ufes.informatica.jurisproc.core.domain.PedidoUniformizacao;
import br.ufes.informatica.jurisproc.core.domain.TemaRecurso;
import br.ufes.informatica.jurisproc.core.persistence.AcordaoDAO;
import br.ufes.informatica.jurisproc.core.persistence.AssuntoDAO;

@Named
@RequestScoped
public class PedidoUniformizacaoController extends JSFController {
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;

	
	
	@EJB
	private PedidoUniformizacaoService pedidoUniformizacaoService;
	@Inject
	private AssuntoDAO assuntoDAO;
	@Inject
	private AcordaoDAO acordaoDAO;
	private Part anexoPedidoUniformizacao;
	private PedidoUniformizacao pedido = new PedidoUniformizacao();
	private List<Assunto> assuntos;	
	private List<Acordao> acordaos;
	
	@PostConstruct
	public void carregaFormulario()
	{
		assuntos = assuntoDAO.retrieveAll();
		acordaos = acordaoDAO.retrieveAll();
	}
	
	public List<Acordao> getAcordaos()
	{
		return acordaos;
	}

	public List<Assunto> getAssuntos()
	{
		return assuntos;
	}

	public String cadastraPedidoUniformizacao() {
		pedidoUniformizacaoService.cadastraPedidoUniformizacao(pedido, anexoPedidoUniformizacao);
		return "/core/peticao/index.xhtml?faces-redirect=true";
	}
	
	public String abreNovo()
	{
		return "/core/peticao/form.xhtml?faces-redirect=true";
	}
	
	public TemaRecurso []getTemasRecursos()
	{
		return TemaRecurso.values();
	}
	
	public Opcoes []getOpcoes()
	{
		return Opcoes.values();
	}
	
	/** Getter for anexoPedidoUniformizacao. */
	public Part getAnexoPedidoUniformizacao() {
		return anexoPedidoUniformizacao;
	}

	/** Setter for anexoPedidoUniformizacao. */
	public void setAnexoPedidoUniformizacao(Part anexoPedidoUniformizacao) {
		this.anexoPedidoUniformizacao = anexoPedidoUniformizacao;
	}
	
	/** Getter for pedido. */
	public PedidoUniformizacao getPedido() {
		return pedido;
	}

	/** Setter for pedido. */
	public void setPedido(PedidoUniformizacao pedido) {
		this.pedido = pedido;
	}
	
}