package br.com.impacta.ibpf.conta.repositories;

import br.com.impacta.ibpf.conta.entities.Conta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

	Conta findByAgenciaAndConta(String Agencia, String Conta);
}
