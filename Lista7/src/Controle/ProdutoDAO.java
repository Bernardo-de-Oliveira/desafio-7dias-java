package Controle;

import java.util.ArrayList;

import Modelo.Produto;

public class ProdutoDAO {

	private ArrayList<Produto> Produtos;
	
	public ProdutoDAO() {
		Produtos = new ArrayList<>();
	}
	public boolean inserir(Produto p) {
		Produtos.add(p);
		return true;
	}
	public boolean alterar(Produto p) {
		for(Produto produto : Produtos) {
			if(produto.getCodbarras() == p.getCodbarras()) {
				produto.setNome("Vergalhão");
				return true;
			}
		}
		return false;
	}
	public boolean excluir(Produto p) {
		for(Produto produto : Produtos) {
			if(produto.getCodbarras() == p.getCodbarras()) {
				Produtos.remove(produto);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Produto> listar(){
		return this.Produtos;
	}
	
}
