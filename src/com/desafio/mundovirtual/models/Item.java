package com.desafio.mundovirtual.itens;

import java.util.Map;
import java.util.Set;

import com.desafio.mundovirtual.usuario.Inventario;
import com.desafio.mundovirtual.usuario.Personagem;
import com.desafio.mundovirtual.itens.Mercado;

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
	public int getQuantidadeFlechas(Personagem personagem) {
		boolean condicao = true;
		int quantidadeFlechas = 0;
		Map<Item, Integer> listaInventarioPersonagem = personagem.inventario.listarItens();
		Set<Map.Entry<Item, Integer>> setListaArqueiro = listaInventarioPersonagem.entrySet(); 
		while(condicao) {
			for (Map.Entry<Item, Integer> item : setListaArqueiro) {
				if(item.getKey().getTipo() == ItemTipo.FLECHA) {
					condicao = false;
					quantidadeFlechas = item.getValue();
				}
			}
			condicao = false;
			
		}
		return quantidadeFlechas;
		
	}
	
	public void setQuantidade(int novaQuantidade) { this.quantidade = novaQuantidade; }
	
	public void adicionar(int q) {
		quantidade += q;
	}
	
	public void remover(int q) {
		quantidade -= q;
	}
	
	
}
