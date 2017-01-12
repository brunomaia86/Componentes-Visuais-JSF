package controle;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Produto;

@ManagedBean
@SessionScoped
public class ProdutoBean {

	private Produto produto = new Produto();
	private List<Produto> produtos = new ArrayList<>();

	public void adiciona() {
		produtos.add(produto);
		produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
