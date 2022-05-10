package com.bellard.cursoSpring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bellard.cursoSpring.entity.Cliente;
import com.bellard.cursoSpring.repository.ClienteRepository;

@Service

public class ClienteService {
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}
	
}
