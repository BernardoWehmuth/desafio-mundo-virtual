package com.desafio.mundovirtual.usuario;

import java.util.HashMap;
import java.util.Map;

import com.desafio.mundovirtual.itens.Item;

public class Inventario {
	Map<Item, Double> listaInventario = new HashMap<>();
	
	void adicionarItem(Item item, double valor) {
		listaInventario.put(item, valor);
	}

	public void removerItem(String item) {
		for (Map.Entry<Item, Double> entrada : listaInventario.entrySet()) {
			if(!this.listaInventario.containsKey(entrada.getKey())) {
				System.out.println("Você não possui esse item!");
			}else {
				listaInventario.remove(entrada.getKey(), entrada.getValue());
				System.err.println(entrada.getKey().getNome() + " Foi removido do seu Inventario!");
			}
		}
	}
	
	public Map<Item, Double> listarItens(){
		return listaInventario;
	}
}
