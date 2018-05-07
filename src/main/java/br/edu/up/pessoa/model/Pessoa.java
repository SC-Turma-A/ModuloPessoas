package br.edu.up.pessoa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;

@Entity
public class Pessoa {
	@Id
    @GeneratedValue
	private Integer entidadeEmpresaId;

	@OneToOne
	@JoinColumn
	private Senha senha;

	@NonNull
	private String tipoPessoa;

	private String estiloNome;

	private String titulo;

	@NonNull
	private String primeiroNome;

	@NonNull
	private String segundoNome;

	@NonNull
	private String sobreNome;

	private String sufixo;

	private String emailPromocional;

	private String informacoesAdicionais;

	private String informacoesSociais;

	@NonNull
	private Date dataModificacao;

	public Pessoa() {
		super();
		dataModificacao = new Date();
	}

	public Pessoa(Senha senha, String tipoPessoa, String estiloNome, String titulo, String primeiroNome,
			String segundoNome, String sobreNome, String sufixo, String emailPromocional, String informacoesAdicionais,
			String informacoesSociais, Date dataModificacao) {
		super();
		this.senha = senha;
		this.tipoPessoa = tipoPessoa;
		this.estiloNome = estiloNome;
		this.titulo = titulo;
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		this.sobreNome = sobreNome;
		this.sufixo = sufixo;
		this.emailPromocional = emailPromocional;
		this.informacoesAdicionais = informacoesAdicionais;
		this.informacoesSociais = informacoesSociais;
		this.dataModificacao = dataModificacao;
	}



	public Integer getEntidadeEmpresaId() {
		return entidadeEmpresaId;
	}

	public void setEntidadeEmpresaId(Integer entidadeEmpresaId) {
		this.entidadeEmpresaId = entidadeEmpresaId;
	}

	public Senha getSenha() {
		return senha;
	}

	public void setSenha(Senha senha) {
		this.senha = senha;
	}

	public String getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public String getEstiloNome() {
		return estiloNome;
	}

	public void setEstiloNome(String estiloNome) {
		this.estiloNome = estiloNome;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSegundoNome() {
		return segundoNome;
	}

	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getSufixo() {
		return sufixo;
	}

	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}

	public String getEmailPromocional() {
		return emailPromocional;
	}

	public void setEmailPromocional(String emailPromocional) {
		this.emailPromocional = emailPromocional;
	}

	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}

	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	public String getInformacoesSociais() {
		return informacoesSociais;
	}

	public void setInformacoesSociais(String informacoesSociais) {
		this.informacoesSociais = informacoesSociais;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

}
