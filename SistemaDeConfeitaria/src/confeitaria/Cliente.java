package confeitaria;

public class Cliente {
	
	/* Atributos */ 
	
	private String nome;	
	private Long telefone; 
	
	 public Cliente(String nome, Long telefone) 
	 {	     
	        this.nome = nome;	        
	        this.telefone = telefone;
	 }

	 
	 /* Métodos acessores */ 
	 
	 
	public String getNome() {
		return nome;
	}

	public Long getTelefone() {
		return telefone;
	}
	
	/* Métodos modificadores */ 
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	 
	 
}
