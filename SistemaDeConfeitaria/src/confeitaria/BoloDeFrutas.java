package confeitaria;

/* Herança */

public class BoloDeFrutas extends Bolo{
	
	public BoloDeFrutas(String s, String d, double p) {
		super(s, d, p);		
	}

	/* Sobreposição */ 
	
	@Override
	public void desconto() 
	{		
		this.preco*=0.6;
	}

	
	/* Sobrecarga */ 
	
	
}
