package com.desafio.mundovirtual.itens;

import java.util.HashMap;
import java.util.Map;


public class Mercado {
	String nome;
	Map<Item, Double> listaItens = new HashMap<>();
	public Mercado(String nome) {
		this.nome = nome;
	}
	
	void adicionarItem(Item item, double valor) {
		listaItens.put(item, valor);
	}

	public void removerItem(String item) {
		for (Map.Entry<Item, Double> entrada : listaItens.entrySet()) {
			if(!this.listaItens.containsKey(entrada.getKey())) {
				System.out.println("Item não pertence a lista!");
			}else {
				listaItens.remove(entrada.getKey(), entrada.getValue());
				System.err.println(entrada.getKey().getNome() + " Foi removido do seu Mercado!");
			}
		}
	}
	
	public Map<Item, Double> listarItens(){
		return listaItens;
	}
	
}
