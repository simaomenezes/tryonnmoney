package com.tryonnmoney.api.event.listener;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.tryonnmoney.api.event.RecursoCriadoEvent;

/*
 * Fica ouvindo nosso evento
 * 
 * */
@Component
public class RecursoCriadoListener implements ApplicationListener<RecursoCriadoEvent>{

	@Override
	public void onApplicationEvent(RecursoCriadoEvent recursoCriadoEvent) {
		
		// aqui sera executado os eventos ouvidos
		HttpServletResponse response = recursoCriadoEvent.getResponse();
		Long codigo = recursoCriadoEvent.getCodigo();
		
		adicionarHedaderLocation(response, codigo);
	}

	private void adicionarHedaderLocation(HttpServletResponse response, Long codigo) {
		//Pegando a requisição atual 
		//Retornando o codigo que do registro que foi salvo
		//Devolve tambem uma URI do java.net
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}").buildAndExpand(codigo).toUri();
		response.setHeader("Location", uri.toASCIIString());
	}

}
