package com.bellard.cursoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bellard.cursoSpring.entity.Cliente;

@Repository

public interface ClienteRepository extends JpaRepository<Cliente,Integer>  {
	

}
