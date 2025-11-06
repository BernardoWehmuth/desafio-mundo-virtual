package com.desafio.mundovirtual.usuario;

import java.util.HashMap;
import java.util.Map;

import com.desafio.mundovirtual.itens.Item;

public class Inventario {
    private Map<Item, Integer> listaInventario = new HashMap<>();

    public void adicionarItem(Item item, int quantidade) {
        int quantidadeAtual = listaInventario.getOrDefault(item, 0);
        listaInventario.put(item, quantidadeAtual + quantidade);
        item.setQuantidade(item.getQuantidade() - quantidade); // Se necessário atualizar o estoque global
    }

    public void removerItem(Item item, int menosQuantidade) {
        if (!listaInventario.containsKey(item)) {
            System.out.println("Você não possui esse item!");
            return;
        }

        int quantidadeAtual = listaInventario.get(item);

        if (quantidadeAtual <= menosQuantidade) {
            listaInventario.remove(item);
            System.out.println(item.getNome() + " foi completamente removido do seu inventário.");
        } else {
            listaInventario.put(item, quantidadeAtual - menosQuantidade);
            System.out.println("Removido " + menosQuantidade + " de " + item.getNome());
        }

        item.remover(menosQuantidade); // Atualiza a quantidade total do item, se necessário
    }

    public int getQuantidadeItem(Item item) {
        return listaInventario.getOrDefault(item, 0);
    }

    public Map<Item, Integer> listarItens() {
        return listaInventario;
    }
}
