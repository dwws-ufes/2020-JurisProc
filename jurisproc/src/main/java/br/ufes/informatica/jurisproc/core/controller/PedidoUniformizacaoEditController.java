package br.ufes.informatica.jurisproc.core.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.UploadedFile;

import br.ufes.informatica.jurisproc.core.application.PedidoUniformizacaoService;
import br.ufes.informatica.jurisproc.core.domain.Acordao;
import br.ufes.informatica.jurisproc.core.domain.Assunto;
import br.ufes.informatica.jurisproc.core.domain.Opcoes;
import br.ufes.informatica.jurisproc.core.domain.PedidoUniformizacao;
import br.ufes.informatica.jurisproc.core.domain.TemaRecurso;
import br.ufes.informatica.jurisproc.core.persistence.AcordaoDAO;
import br.ufes.informatica.jurisproc.core.persistence.AssuntoDAO;
import br.ufes.informatica.jurisproc.core.persistence.PedidoUniformizacaoDAO;

@Named
@ViewScoped
public class PedidoUniformizacaoEditController implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2729418535647258947L;
	@EJB
	private PedidoUniformizacaoService pedidoUniformizacaoService;
	@Inject
	private AssuntoDAO assuntoDAO;
	@Inject
	private AcordaoDAO acordaoDAO;
	@Inject
	private PedidoUniformizacaoDAO pedidoUniformizacaoDAO;
	
	
	private Long id;
	private Boolean isEdit = true;
	
	private UploadedFile file;
	
	private PedidoUniformizacao pedido = new PedidoUniformizacao();
	private List<Assunto> assuntos;
	private List<Acordao> acordaos;
	private List<PedidoUniformizacao> pedidosUnformizacoes;

	@PostConstruct
	public void carregaFormulario()
	{
		assuntos = assuntoDAO.retrieveAll();
		acordaos = acordaoDAO.retrieveAll();
	}
	
	public void carregaRegistro()
	{
		pedido = pedidoUniformizacaoDAO.retrieveById(id);
	}

	public List<Acordao> getAcordaos()
	{
		return acordaos;
	}

	public List<Assunto> getAssuntos()
	{
		return assuntos;
	}

	public void cadastraPedidoUniformizacao()
	{
		System.out.println(pedido);
	}

	private String redirecionamentoPadrao()
	{
		pedidosUnformizacoes = pedidoUniformizacaoDAO.retrieveAll();
		return "/core/peticao/index.xhtml?faces-redirect=true";
	}

	public String abreNovo()
	{
		file = null;
		isEdit = false;
		pedido = new PedidoUniformizacao();
		return "/core/peticao/form.xhtml?faces-redirect=true";
	}
	
	public String abreEditar(Long id)
	{
		file = null;
		isEdit = true;
		this.pedido = pedidoUniformizacaoDAO.retrieveById(id);
		return "/core/peticao/form.xhtml?faces-redirect=true";
	}
	
	public String excluirRegistro(Long id)
	{
		PedidoUniformizacao pedidoUniformizacao = pedidoUniformizacaoDAO.retrieveById(id);
		pedidoUniformizacaoDAO.delete(pedidoUniformizacao);
		return redirecionamentoPadrao();
	}

	public TemaRecurso[] getTemasRecursos()
	{
		return TemaRecurso.values();
	}

	public Opcoes[] getOpcoes()
	{
		return Opcoes.values();
	}

	/** Getter for pedido. */
	public PedidoUniformizacao getPedido()
	{
		return pedido;
	}

	/** Setter for pedido. */
	public void setPedido(PedidoUniformizacao pedido)
	{
		this.pedido = pedido;
	}

	public UploadedFile getFile()
	{
		return file;
	}

	public void setFile(UploadedFile file)
	{
		this.file = file;
	}
	
	public List<PedidoUniformizacao> getPedidosUnformizacoes()
	{
		return pedidosUnformizacoes;
	}

	public void setPedidosUnformizacoes(List<PedidoUniformizacao> pedidosUnformizacoes)
	{
		this.pedidosUnformizacoes = pedidosUnformizacoes;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

}