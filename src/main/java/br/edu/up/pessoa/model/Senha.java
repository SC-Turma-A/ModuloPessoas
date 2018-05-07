package br.edu.up.pessoa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.lang.NonNull;

@Entity
public class Senha {
	@Id
	@GeneratedValue
	private Integer entidadeEmpresaId;

	@NonNull
	private String hash;

	@NonNull
	private String salt;

	@NonNull
	private Date dataModificacao;

	protected Senha() {
		super();
		dataModificacao = new Date();
	}

	public Senha(Integer entidadeEmpresaId, String hash, String salt, Date dataModificacao) {
		super();
		this.entidadeEmpresaId = entidadeEmpresaId;
		this.hash = hash;
		this.salt = salt;
		this.dataModificacao = dataModificacao;
	}

}
