package com.bellard.cursoSpring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String cpf_Ou_Cnpj;
	private String email;
	private String nome;
	private Integer tipo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCpf_Ou_Cnpj() {
		return cpf_Ou_Cnpj;
	}
	public void setCpf_Ou_Cnpj(String cpf_Ou_Cnpj) {
		this.cpf_Ou_Cnpj = cpf_Ou_Cnpj;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	

}
