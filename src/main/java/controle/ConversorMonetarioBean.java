package controle;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ConversorMonetarioBean {

	private String de;
	private String para;
	private Double valor;

	private Double resultado;

	private Map<String, Double> valorMoedas = new LinkedHashMap<>();

	public ConversorMonetarioBean() {
		this.valorMoedas.put("Real", 1.0);
		this.valorMoedas.put("Euro", 2.33);
		this.valorMoedas.put("Peso argentino", 0.42);
		this.valorMoedas.put("Dolar americano", 1.84);
	}

	public void converte() {

		resultado = valor * valorMoedas.get(para); 

	}

	public Map<String, Double> getValorMoedas() {
		return valorMoedas;
	}

	public void setValorMoedas(Map<String, Double> valorMoedas) {
		this.valorMoedas = valorMoedas;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
		System.out.println(de);
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
		System.out.println(para);

	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
		System.out.println(valor);

	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

}
