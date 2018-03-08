package com.tryonnmoney.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tryonnmoney.event.RecursoCriadoEvent;
import com.tryonnmoney.model.Categoria;
import com.tryonnmoney.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Categoria> listar(){		
		return categoriaRepository.findAll();
	}
	
	@PostMapping
	//depois que retornamos um ResponseEntity<Categoria> removemos essa anotação -> @ResponseStatus(HttpStatus.CREATED) // retorna o status 201 create
	public ResponseEntity<Categoria> criar(@Valid @RequestBody Categoria categoria, HttpServletResponse response) {
		Categoria categoriaSalva = categoriaRepository.save(categoria);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, categoriaSalva.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Categoria> buscarPeloCodigo(@PathVariable Long codigo) {
		ResponseEntity<Categoria> result;
		if (categoriaRepository.findOne(codigo) != null) {
			result = ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.findOne(codigo));
		} else {
			result = ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
		
		return result;

	}
}
