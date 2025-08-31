package com.desafio.mundovirtual.usuario.Classes;

import com.desafio.mundovirtual.itens.ItemTipo;
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
	
	public Arqueiro(String nome) {
		super(nome);
		this.classe = this.getClass().getSimpleName();
		this.hp = HP_INICIAL;
		this.inventario = new Inventario();
		this.nivel = NIVEL_INICIAL;
		this.mana = MANA_INICIAL;
		this.quantidadeFlechas = 0;
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
	
	private boolean temArco() {
		if(this.inventario.listarItens().containsKey(ItemTipo.ARCO)) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean temFlechas() {
		if(this.getFlechas() > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void atacar(double dano, Personagem alvo, double distancia) {
		if(distancia <= alcance && temFlechas() && temArco()) {
			usarFlecha();
			this.mana -= 5;
			alvo.setHp(alvo.getHp() - dano);
			System.out.println(alvo.getNome() + " foi atacado por " + this.getNome() + " e esta com " + alvo.getHp() + " de vida");
		}else if(distancia > alcance){
			System.out.println("Distancia alem do alcance de " + this.getClass().getSimpleName() +"(" + alcance + "m)");
		}else if(!temFlechas() && temArco()) {
			System.out.println("O personagem precisa de flechas para atirar!");
		}else if(!temArco() && temFlechas()) {
			 System.out.println("O personagem precisa de um arco para atirar");
		}else if(!temFlechas() && !temArco()){
			System.out.println("O personagem precisa de um arco e de flechas para atirar!");
		}else if(!temFlechas() && !temArco() && distancia > alcance) {
			System.out.println("O personagem precisa de um arco e de flechas para atirar e precisa estar a 15m ou menos de distancia!");
		}
	}
	
}

