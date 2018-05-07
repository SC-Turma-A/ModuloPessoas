package br.edu.up.pessoa.model;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import org.springframework.lang.NonNull;

@Entity
public class Email {
	@EmbeddedId
	private EmailId id;

	@NonNull
	private String email;

	private Date dataModificacao;

	public Email() {
		super();
		dataModificacao = new Date();
	}

	public Email(Date dataModificacao, String email) {
		super();
		this.dataModificacao = dataModificacao;
		this.email = email;
	}

	public EmailId getId() {
		return id;
	}

	public void setId(EmailId id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

}
