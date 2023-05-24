package Visao;

import Controle.ProdutoDAO;
import Modelo.Produto;

public class MainProduto {
	
	public static void main(String[] args) {
		
		Produto prod = new Produto();
		
		prod.setNome("Martelo");
		prod.setCodbarras((long) 1234);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(prod);
		System.out.println(prod.getNome());
		dao.alterar(prod);
		System.out.println(prod.getNome());
		dao.excluir(prod);
		dao.listar();
		
		System.out.println(dao.listar().size());
		
	}

}
