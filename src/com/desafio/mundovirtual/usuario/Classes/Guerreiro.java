package com.desafio.mundovirtual.usuario.Classes;

import com.desafio.mundovirtual.usuario.Inventario;
import com.desafio.mundovirtual.usuario.Personagem;

public class Guerreiro extends Personagem{
	
	public Guerreiro(String nome) {
		super(nome);
		this.classe = this.getClass().getSimpleName();
		this.hp = HP_INICIAL;
		this.inventario = new Inventario();
		this.nivel = NIVEL_INICIAL;
		this.mana = MANA_INICIAL;
	}
	
	@Override
	public void atacar(double dano, Personagem alvo, double distancia) {
		if(distancia <= 2) {
			this.mana -= 10;
			alvo.setHp(hp -= dano);
		}else {
			System.out.println("Distancia alem do alcance de " + this.getClass().getSimpleName());
		}
	}
	
}
