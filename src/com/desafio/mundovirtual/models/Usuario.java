package com.desafio.mundovirtual.usuario;

public class Usuario {
	protected final int ID_INICIAL = 1;
	protected int id = ID_INICIAL;
	private String nome;
	private String email;
	private Personagem personagem;
	
	public Usuario(String nome, String email, Personagem personagem) {
		this.id = id++;
		this.nome = nome;
		this.email = email;
		this.personagem = personagem;
	}
	
	public String getNome() {return nome;}
	public void setNome(String novoNome) {this.nome = novoNome;}
	public String getEmail() {return email;}
	public void setEmail(String novoEmail) {this.email = novoEmail;}
	public Personagem getPersonagem() { return personagem; }
	public void setPersonagem(Personagem novoPersonagem) {this.personagem = novoPersonagem;}
	
	
}
