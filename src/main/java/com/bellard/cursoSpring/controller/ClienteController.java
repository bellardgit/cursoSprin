package com.bellard.cursoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bellard.cursoSpring.entity.Cliente;
import com.bellard.cursoSpring.service.ClienteService;

@RestController
@RequestMapping(value = "/clientes")

public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> findAll() { 
		List<Cliente> listaDeClients = clienteService.findAll();
		
		return listaDeClients;
		
	}
		
	

}
