package com.desafio.mundovirtual.usuario;

public class Usuario {
	private final int ID_INICIAL = 1;
	private int id = ID_INICIAL;
	private String nome;
	private String email;
	private Personagem personagem;
	
	public Usuario(String nome, String email, Personagem personagem) {
		this.id = id++;
		this.nome = nome;
		this.email = email;
		this.personagem = personagem;
	}
	
	
	
}
