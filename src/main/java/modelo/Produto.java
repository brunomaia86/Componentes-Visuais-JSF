package modelo;

public class Produto {

	private String nome;
	private Double preco;
	private boolean exibePreco = true;
	private String msg;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public boolean getExibePreco() {
		
		return exibePreco;
	}

	public void setExibePreco(boolean exibePreco) {
		if (exibePreco == false){
			msg = "nao mostrar produto";
			preco = null;
		}
		this.exibePreco = exibePreco;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
