package confeitaria;

/* Herança */

public class BoloDeChocolate extends Bolo{

	public BoloDeChocolate(String s, String d, double p) {
		super(s, d, p);		
	}
	
	
	/* Sobreposição */ 
	
	@Override
	public void desconto() 
	{		
		this.preco*=0.8;
	}

	/* Sobrecarga */ 

	public void precoTotal(double precoMassa, double precoCobertura) {
		double preco = precoMassa + precoCobertura;
	}

}
