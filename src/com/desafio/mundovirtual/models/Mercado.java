package com.desafio.mundovirtual.itens;

import java.util.HashMap;
import java.util.Map;


public class Mercado {
	private String nome;
	protected Map<Item, Double> listaItens = new HashMap<>();
	public Mercado(String nome) {
		this.nome = nome;
	}
	
	public void adicionarItem(Item item, double valor) {
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
	
	
	public String getNome() { return nome; }
	public void setNome(String novoNome) { this.nome = novoNome; }
	
	public String listarMercado() {
		StringBuilder sb = new StringBuilder();
		sb.append("============  ").append(nome).append("  ============\n\n");
		for (Map.Entry<Item, Double> entrada : listaItens.entrySet()) {
			String precoString = String.valueOf(entrada.getValue());
			String itemNome = entrada.getKey().getNome();
	        sb.append(entrada.getKey().getQuantidade()).append(" - ").append(entrada.getKey().getNome()).append(" - ").append(entrada.getValue()).append("\n");
		}
		return sb.toString();
	}
	
}
