package confeitaria;

public class Bolo {
	
	protected String sabor;
	protected String descricao;	
	protected double preco;
	
	public Bolo (String s, String d, double p) {
		this.sabor = s;
		this.descricao = d; 
		this.preco = p;
	}
	
	public String toString() {
		return "Sabor: " + this.sabor+ ", Descrição:  "+ this.descricao + ", Preço: " + this.preco;
	}
	
	public void desconto() {
		System.out.println("Não há desconto");
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
