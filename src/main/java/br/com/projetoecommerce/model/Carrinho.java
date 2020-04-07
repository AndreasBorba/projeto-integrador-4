package br.com.projetoecommerce.model;

import java.util.ArrayList;

public class Carrinho {

	
	private ArrayList<Produto> produto;
	
	
	public boolean qntPossivel(Produto produto) {
		
		for(Produto prod : this.produto) {
			if(prod.equals(produto)) {
				if(prod.getQuantidade() > produto.getQuantidadeCompra()) {
					prod.incrementaQuantidade();
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
}
