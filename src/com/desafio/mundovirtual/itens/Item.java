package com.desafio.mundovirtual.itens;

public class Item {
	private int quantidade;
	private String nome;
	private ItemTipo tipo;
	
	public Item(String nome, ItemTipo tipo, int quantidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.quantidade = quantidade;
		
	}
	
	public String getNome(){return nome;}
	public ItemTipo getTipo(){return tipo;}
	public int getQuantidade(){return quantidade;}

	public void adicionar(int q) {
		quantidade += q;
	}
	
	public void remover(int q) {
		quantidade -= q;
	}
	
	@Override
	public String toString() {
		return "Item [nome=" + nome + ", tipo=" + tipo + ", quantidade=" + quantidade + "]";
	}
	
	
}
