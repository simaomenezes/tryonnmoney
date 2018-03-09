package com.tryonnmoney.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tryonnmoney.event.RecursoCriadoEvent;
import com.tryonnmoney.model.Pessoa;
import com.tryonnmoney.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Pessoa> listar(){
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Pessoa> criar(@RequestBody Pessoa pessoa, HttpServletResponse response){
		Pessoa pessoaSalva = pessoaRepository.save(pessoa);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, pessoaSalva.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalva);
		
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Pessoa> buscarPorCodigo(@PathVariable Long codigo){
		Pessoa p = pessoaRepository.findOne(codigo);
		return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
	}

}
