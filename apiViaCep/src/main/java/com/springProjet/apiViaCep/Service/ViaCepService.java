package com.springProjet.apiViaCep.Service;


 

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springProjet.apiViaCep.Model.Endereco;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws/01001000/json/")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	Endereco consultarCep(@PathVariable String cep);

	// Endereco consultarCep(@PathVariable String cep);
}
