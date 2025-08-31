package com.desafio.mundovirtual.usuario;

public abstract class Personagem {
	protected final double HP_INICIAL = 100;
	protected final double MANA_INICIAL = 120;
	protected final int NIVEL_INICIAL = 1;
	protected String nome;
	protected int nivel;
	protected String classe;
	protected double hp;
	protected double mana;
	public Inventario inventario;
	
	public Personagem(String nome) {
		super();
		this.nome = nome;
	}
	
	public void setHp(double novoHp) {
		this.hp = novoHp;
	}
	
	public void setMana(double novoMana) {
		this.mana = novoMana;
	}
	
	public String getNome() {
		return nome;
	}

	public double getHp() {
		return hp;
	}

	@Override
	public String toString() {
		return "Bernardo";
	}

	public abstract void atacar(double dano, Personagem alvo, double distancia);
	
}
