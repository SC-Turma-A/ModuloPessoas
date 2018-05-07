package br.edu.up.pessoa.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class EmailId implements Serializable {

	private Integer entidadeEmpresaId;

	private Integer emailId;

	protected EmailId() {
		super();
	}

	protected EmailId(Integer entidadeEmpresaId, Integer emailId) {
		super();
		this.entidadeEmpresaId = entidadeEmpresaId;
		this.emailId = emailId;
	}

	public Integer getEntidadeEmpresaId() {
		return entidadeEmpresaId;
	}

	public void setEntidadeEmpresaId(Integer entidadeEmpresaId) {
		this.entidadeEmpresaId = entidadeEmpresaId;
	}

	public Integer getEmailId() {
		return emailId;
	}

	public void setEmailId(Integer emailId) {
		this.emailId = emailId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getEntidadeEmpresaId(), getEmailId());
	}

	@Override
    public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof EmailId)) return false;
		EmailId that = (EmailId) o;
		return Objects.equals(getEntidadeEmpresaId(), that.getEntidadeEmpresaId()) &&
				Objects.equals(getEmailId(), that.getEmailId());
    }

}
