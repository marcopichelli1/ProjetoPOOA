package confeitaria;
import java.util.ArrayList;
import java.util.Scanner;

public class OrcamentoBolos {

	public static void main(String[] args) {
		
		Bolo b1 = new Bolo("Bolo Floresta Negra", "Bolo gostoso", 100.00);
		
		//Aplicação de collections
		
		ArrayList<Bolo> bolos = new ArrayList<>();
		
		bolos.add(b1);
				
		System.out.println("Olá, bem vindo/a a nossa confeitaria!");
		System.out.println("*************************************");
		System.out.println("Conheça o nosso cardápio");
		System.out.println(bolos);
		System.out.println("*************************************");
		
		Scanner telefone = new Scanner(System.in);
		
			System.out.println("Digite o seu celular: ");
			try {				
			int n = telefone.nextInt();
			
			System.out.println(30/n);
			} catch(Exception erro) {
				System.out.println("Por favor, informe o seu número de celular");
			}
		
		
		
			
		

	}

	
}
