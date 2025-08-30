package com.desafio.mundovirtual.main;

import java.util.ArrayList;
import java.util.List;

import com.desafio.mundovirtual.itens.Item;
import com.desafio.mundovirtual.itens.ItemTipo;
import com.desafio.mundovirtual.usuario.Classes.Arqueiro;
import com.desafio.mundovirtual.usuario.Classes.Guerreiro;
import com.desafio.mundovirtual.usuario.Classes.Mago;

public class Main {

	public static void main(String[] args) {
		
		Arqueiro batman = new Arqueiro("Batman", 10);
		Arqueiro cesar = new Arqueiro("Cesar", 10);
		batman.atacar(50, cesar, 15);
		
		
		Guerreiro guerreiro1 = new Guerreiro("Claudio");
		Guerreiro guerreiro2 = new Guerreiro("Augusto");
		guerreiro1.atacar(50, guerreiro2, 2);
		
		
		Mago mago1 = new Mago("Astolfo");
		Mago mago2 = new Mago("Miguel");
		mago2.atacar(50, mago1, 10);
		
		System.out.println(mago1.getMana());
		mago1.usarHabilidade();
		
		System.out.println(mago1.getHp());
		System.out.println(mago1.getMana());
		
	}

}
