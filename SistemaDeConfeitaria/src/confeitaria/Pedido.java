package confeitaria;

public class Pedido {

	/* Atributos */ 
	
	private String saborBolo;
    private Cliente cliente;   
  
 
	public Pedido(String saborBolo, Cliente cliente) {
        this.saborBolo = saborBolo;
        this.cliente = cliente;
    }

	/* Métodos acessores */ 
	
	public String getSaborBolo() {
		return saborBolo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	/* Métodos modificadores */ 
	
	
	public void setSaborBolo(String saborBolo) {
		this.saborBolo = saborBolo;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	

}

