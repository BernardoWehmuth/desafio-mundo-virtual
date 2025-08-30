package com.desafio.mundovirtual.usuario.Classes;

import com.desafio.mundovirtual.usuario.Inventario;
import com.desafio.mundovirtual.usuario.Personagem;

public class Arqueiro extends Personagem {
	private int quantidadeFlechas = 0;
	private double alcance = 15;
	
	public Arqueiro(String nome, int quantidadeFlechas) {
		super(nome);
		this.classe = this.getClass().getSimpleName();
		this.hp = HP_INICIAL;
		this.inventario = new Inventario();
		this.nivel = NIVEL_INICIAL;
		this.mana = MANA_INICIAL;
		this.quantidadeFlechas = quantidadeFlechas;
	}

	public int getFlechas() {
		return quantidadeFlechas;
	}
	
	public void setFlechas(int novaQuantidadeFlechas) {
		this.quantidadeFlechas = novaQuantidadeFlechas;
	}
	
	private void usarFlecha() {
		quantidadeFlechas--;
	}
	
	private boolean temFlechas() {
		if(quantidadeFlechas > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void atacar(double dano, Personagem alvo, double distancia) {
		if(distancia <= alcance && temFlechas()) {
			usarFlecha();
			this.mana -= 5;
			alvo.setHp(alvo.getHp() - dano);
			System.out.println(alvo.getNome() + " foi atacado por " + this.getNome() + " e esta com " + alvo.getHp() + " de vida");
		}else {
			System.out.println("Distancia alem do alcance de " + this.getClass().getSimpleName() +"(" + alcance + "m)");
		}
	}
	
}

