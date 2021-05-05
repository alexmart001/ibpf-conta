package br.com.impacta.ibpf.conta.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.HashCodeBuilder;

@Entity
@Table (name = "tb_conta")
public class Conta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "agencia", nullable = false, length = 4)
	private String agencia;

	@Column(name = "conta", nullable = false, length = 7)
	private String conta;

	@Column(name = "cpf", nullable = false, length = 11)
	private String cpf;

	@Column(name = "status", nullable = false)
	private boolean status;

	@Column(name = "nome_completo", nullable = false, length = 50)
	private String nomeCompleto;

	public Conta(Long id, String agencia, String conta, String cpf, boolean status, String nomeCompleto) {
		this.id = id;
		this.agencia = agencia;
		this.conta = conta;
		this.cpf = cpf;
		this.status = status;
		this.nomeCompleto = nomeCompleto;
	}

	public Conta() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	@Override
	public String toString() {
		return "Conta{" +
				"id=" + id +
				", agencia='" + agencia + '\'' +
				", conta='" + conta + '\'' +
				", cpf='" + cpf + '\'' +
				", status=" + status +
				", nomeCompleto='" + nomeCompleto + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;

		if (o == null || getClass() != o.getClass()) return false;

		Conta conta1 = (Conta) o;

		return new org.apache.commons.lang3.builder.EqualsBuilder().append(id, conta1.id)
				.append(agencia, conta1.agencia)
				.append(conta, conta1.conta).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).append(id).append(agencia).append(conta).toHashCode();
	}
}
