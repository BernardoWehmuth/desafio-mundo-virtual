package com.desafio.mundovirtual.itens;

public enum ItemTipo {
	ARMA("Arma de Ataque para Guerreiros", 100),
	ARMADURA("Proteção para Personagem", 80),
	POCAO("Recupera HP ou Mana", 50),
	CETRO("Arma de Ataque para Magos", 100),
	ARCO("Arma de Ataque para Arqueiros", 100),
	ALJAVA("Armazena Flechas", 100),
	FLECHA("Usadas com um Arco", 100);

	
	
	private final String descricao;
	private final int valorBase;
	
	ItemTipo(String descricao, int valorBase){
		this.descricao = descricao;
		this.valorBase = valorBase;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getValorBase() {
		return valorBase;
	}
	
	public boolean ehConsumivel() {
		return this == POCAO;
	}
	
}
