package br.ufes.informatica.jurisproc.core.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObjectSupport;

/** TODO: generated by FrameWeb. Should be documented. */
@Entity
public class PedidoUniformizacao extends PersistentObjectSupport implements Comparable<PedidoUniformizacao>
{
	/** Serialization id. */
	private static final long serialVersionUID = 1L;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private String caminhoPeticaoAnexo;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private Long numeroPeticao;

	/** TODO: generated by FrameWeb. Should be documented. true */
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dataAcordao;

	/** TODO: generated by FrameWeb. Should be documented. true */
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPeticao;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private Long paradigma;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private Boolean direitoMaterial;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private Boolean copiaParadigma;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private TemaRecurso temaRecurso;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private String parteAutor;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private String parteReu;

	/** TODO: generated by FrameWeb. Should be documented. false */
	@NotNull
	private Opcoes acordaoRetratacao;

	/** TODO: generated by FrameWeb. Should be documented. */
	@ManyToOne
	private Usuario usuario;

	/** TODO: generated by FrameWeb. Should be documented. */
	@ManyToMany
	private Set<Assunto> assuntos;

	/** TODO: generated by FrameWeb. Should be documented. */
	@ManyToOne
	private Acordao acordao;

	/** Getter for caminhoPeticaoAnexo. */
	public String getCaminhoPeticaoAnexo()
	{
		return caminhoPeticaoAnexo;
	}

	/** Setter for caminhoPeticaoAnexo. */
	public void setCaminhoPeticaoAnexo(String caminhoPeticaoAnexo)
	{
		this.caminhoPeticaoAnexo = caminhoPeticaoAnexo;
	}

	/** Getter for numeroPeticao. */
	public Long getNumeroPeticao()
	{
		return numeroPeticao;
	}

	/** Setter for numeroPeticao. */
	public void setNumeroPeticao(Long numeroPeticao)
	{
		this.numeroPeticao = numeroPeticao;
	}

	/** Getter for dataAcordao. */
	public Date getDataAcordao()
	{
		return dataAcordao;
	}

	/** Setter for dataAcordao. */
	public void setDataAcordao(Date dataAcordao)
	{
		this.dataAcordao = dataAcordao;
	}

	/** Getter for dataPeticao. */
	public Date getDataPeticao()
	{
		return dataPeticao;
	}

	/** Setter for dataPeticao. */
	public void setDataPeticao(Date dataPeticao)
	{
		this.dataPeticao = dataPeticao;
	}

	/** Getter for paradigma. */
	public Long getParadigma()
	{
		return paradigma;
	}

	/** Setter for paradigma. */
	public void setParadigma(Long paradigma)
	{
		this.paradigma = paradigma;
	}

	/** Getter for direitoMaterial. */
	public Boolean getDireitoMaterial()
	{
		return direitoMaterial;
	}

	/** Setter for direitoMaterial. */
	public void setDireitoMaterial(Boolean direitoMaterial)
	{
		this.direitoMaterial = direitoMaterial;
	}

	/** Getter for copiaParadigma. */
	public Boolean getCopiaParadigma()
	{
		return copiaParadigma;
	}

	/** Setter for copiaParadigma. */
	public void setCopiaParadigma(Boolean copiaParadigma)
	{
		this.copiaParadigma = copiaParadigma;
	}

	/** Getter for temaRecurso. */
	public TemaRecurso getTemaRecurso()
	{
		return temaRecurso;
	}

	/** Setter for temaRecurso. */
	public void setTemaRecurso(TemaRecurso temaRecurso)
	{
		this.temaRecurso = temaRecurso;
	}

	/** Getter for parteAutor. */
	public String getParteAutor()
	{
		return parteAutor;
	}

	/** Setter for parteAutor. */
	public void setParteAutor(String parteAutor)
	{
		this.parteAutor = parteAutor;
	}

	/** Getter for parteReu. */
	public String getParteReu()
	{
		return parteReu;
	}

	/** Setter for parteReu. */
	public void setParteReu(String parteReu)
	{
		this.parteReu = parteReu;
	}

	/** Getter for acordaoRetratacao. */
	public Opcoes getAcordaoRetratacao()
	{
		return acordaoRetratacao;
	}

	/** Setter for acordaoRetratacao. */
	public void setAcordaoRetratacao(Opcoes acordaoRetratacao)
	{
		this.acordaoRetratacao = acordaoRetratacao;
	}

	public Usuario getUsuario()
	{
		return usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

	public Set<Assunto> getAssuntos()
	{
		return assuntos;
	}

	public void setAssuntos(Set<Assunto> assuntos)
	{
		this.assuntos = assuntos;
	}

	public Acordao getAcordao()
	{
		return acordao;
	}

	public void setAcordao(Acordao acordao)
	{
		this.acordao = acordao;
	}

	@Override
	public String toString()
	{
		return "PedidoUniformizacao [caminhoPeticaoAnexo=" + caminhoPeticaoAnexo + ", numeroPeticao=" + numeroPeticao
				+ ", dataAcordao=" + dataAcordao + ", dataPeticao=" + dataPeticao + ", paradigma=" + paradigma
				+ ", direitoMaterial=" + direitoMaterial + ", copiaParadigma=" + copiaParadigma + ", temaRecurso="
				+ temaRecurso + ", parteAutor=" + parteAutor + ", parteReu=" + parteReu + ", acordaoRetratacao="
				+ acordaoRetratacao + ", usuario=" + usuario + ", assuntos=" + assuntos + ", acordao=" + acordao + "]";
	}

	/** @see java.lang.Comparable#compareTo(java.lang.Object) */
	@Override
	public int compareTo(PedidoUniformizacao o)
	{
		// FIXME: auto-generated method stub
		return super.compareTo(o);
	}
}