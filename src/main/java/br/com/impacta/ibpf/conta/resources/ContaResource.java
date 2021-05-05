package br.com.impacta.ibpf.conta.resources;

import br.com.impacta.ibpf.conta.entities.Conta;
import br.com.impacta.ibpf.conta.repositories.ContaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contas")
public class ContaResource {

	@Autowired
	private ContaRepository contaRepository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Conta> findById(@PathVariable Long id) {

		Conta conta = contaRepository.findById(id).get();
		return ResponseEntity.ok(conta);
	}

	@GetMapping(value = "/search")
	public ResponseEntity<Conta> findByAgenciaAndConta(@RequestParam String agencia, @RequestParam String conta) {
		Conta contaFound = contaRepository.findByAgenciaAndConta(agencia, conta);
		return ResponseEntity.ok(contaFound);
	}
}