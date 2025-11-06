package com.desafio.mundovirtual.main;

import com.desafio.mundovirtual.itens.Item;
import com.desafio.mundovirtual.itens.ItemTipo;
import com.desafio.mundovirtual.itens.Mercado;
import com.desafio.mundovirtual.usuario.Classes.Arqueiro;


public class Main {

	public static void main(String[] args) {
		Arqueiro arqueiro = new Arqueiro("Cleber", 50);
		Item flecha = new Item("Flecha", ItemTipo.FLECHA, 15);
		arqueiro.inventario.adicionarItem(flecha, 10);
		System.out.println(flecha.getQuantidadeFlechas(arqueiro));
		Arqueiro arqueiro2 = new Arqueiro("Cesar", 50);
		arqueiro.atacar(25, arqueiro2, 10);
		System.out.println("Quantidade de Flechas = "+ flecha.getQuantidade());
		System.out.println(arqueiro2.getHp());
		
		Mercado mercado = new Mercado("Mercadinho");
		arqueiro.inventario.removerItem(flecha, 3);
		System.out.println(flecha.getQuantidade());
		mercado.adicionarItem(flecha, 15.0);
		Item arco = new Item("Arco de Madeira", ItemTipo.ARCO, 10);
		mercado.adicionarItem(arco, 15);
		System.out.println(mercado.listarMercado());
	}

}
