package confeitaria;

public class Bolo {
	
	/* Atributos */ 
	
	protected String sabor;
	protected String descricao;	
	protected double preco;
	
	public Bolo (String s, String d, double p) {
		this.sabor = s;
		this.descricao = d; 
		this.preco = p;
	}
	
	public String toString() {
		return "Sabor: " + this.sabor + ", Descrição: " + this.descricao + ", Preço: " + this.preco;
	}
	
	/* Método para a aplicação de sobreposição */ 
	
	public void desconto() {
		System.out.println("Não há desconto");
	}
	
	/* Método para a aplicação de sobrecarga */ 
	
	
	public void precoTotal(double precoMassa, double precoCobertura, double precoRecheio) {
		double preco = precoMassa + precoCobertura + precoRecheio;
	}
	
	
	public void precoTotal(double precoMassa, double precoCobertura) {
		double preco = precoMassa + precoCobertura;
	}
	
	
	/* Métodos acessores */ 
	
	public String getSabor() {
		return sabor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	/* Métodos modificadores */ 
	
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	

}
