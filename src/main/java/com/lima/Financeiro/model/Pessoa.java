/**
 * 
 */
package com.lima.Financeiro.model;

import java.io.Serializable;

/**
 * @author jonathan.lima
 *
 */
public class Pessoa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Pessoa() {}
	
	private Long id;
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	
	
	
}
