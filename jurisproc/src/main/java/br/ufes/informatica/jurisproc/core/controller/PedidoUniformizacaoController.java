package br.ufes.informatica.jurisproc.core.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.model.UploadedFile;

import br.ufes.inf.nemo.jbutler.ejb.controller.JSFController;
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
@SessionScoped
public class PedidoUniformizacaoController extends JSFController
{
	/** Serialization id (using default value, change if necessary). */
	private static final long serialVersionUID = 1L;

	@EJB
	private PedidoUniformizacaoService pedidoUniformizacaoService;
	@Inject
	private AssuntoDAO assuntoDAO;
	@Inject
	private AcordaoDAO acordaoDAO;
	@Inject
	private PedidoUniformizacaoDAO pedidoUniformizacaoDAO;
	
	private Boolean isEdit = false;
	
	private UploadedFile file;
	private List<PedidoUniformizacao> registrosSelecionados;
	
	private PedidoUniformizacao pedido;
	private List<Assunto> assuntos;
	private List<Acordao> acordaos;
	private List<PedidoUniformizacao> pedidosUnformizacoes;

	@PostConstruct
	public void carregaFormulario()
	{
		assuntos = assuntoDAO.retrieveAll();
		acordaos = acordaoDAO.retrieveAll();
		pedidosUnformizacoes = pedidoUniformizacaoDAO.buscaPorUsuario();
	}

	public List<Acordao> getAcordaos()
	{
		return acordaos;
	}

	public List<Assunto> getAssuntos()
	{
		return assuntos;
	}

	public String cadastraPedidoUniformizacao()
	{
		pedidoUniformizacaoService.cadastraPedidoUniformizacao(pedido, file, isEdit);
		return redirecionamentoPadrao();
	}

	private String redirecionamentoPadrao()
	{
		pedidosUnformizacoes = pedidoUniformizacaoDAO.buscaPorUsuario();
		return "/core/peticao/index.xhtml?faces-redirect=true";
	}

	public String abreNovo()
	{
		file = null;
		isEdit = false;
		pedido = new PedidoUniformizacao();
		pedido.setDataPeticao(new Date());
		return "/core/peticao/form.xhtml?faces-redirect=true";
	}
	
	public String abreEditar(Long id)
	{
		file = null;
		isEdit = true;
		this.pedido = pedidoUniformizacaoDAO.retrieveById(id);
		assuntos = assuntoDAO.retrieveAll();
		acordaos = acordaoDAO.retrieveAll();
		return "/core/peticao/form.xhtml?faces-redirect=true";
	}
	
	public String excluirRegistro(Long id)
	{
		PedidoUniformizacao pedidoUniformizacao = pedidoUniformizacaoDAO.retrieveById(id);
		pedidoUniformizacaoDAO.delete(pedidoUniformizacao);
		return redirecionamentoPadrao();
	}
	
	public String voltarLista()
	{
		return "/core/peticao/index.xhtml?faces-redirect=true";
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
	
	public List<PedidoUniformizacao> getRegistrosSelecionados()
	{
		return registrosSelecionados;
	}

	public void setRegistrosSelecionados(List<PedidoUniformizacao> registrosSelecionados)
	{
		this.registrosSelecionados = registrosSelecionados;
	}

	public List<PedidoUniformizacao> getPedidosUnformizacoes()
	{
		return pedidosUnformizacoes;
	}

	public void setPedidosUnformizacoes(List<PedidoUniformizacao> pedidosUnformizacoes)
	{
		this.pedidosUnformizacoes = pedidosUnformizacoes;
	}

	public String getDeleteButtonMessage()
	{
		if ( existeRegistroSelecionado() )
		{
			int size = this.registrosSelecionados.size();
			return size > 1 ? size + " registros selecionados" : "1 registro selecionado";
		}
		
		return "Excluir";

	}

	public boolean existeRegistroSelecionado()
	{
		return this.registrosSelecionados != null && !this.registrosSelecionados.isEmpty();
	}

}