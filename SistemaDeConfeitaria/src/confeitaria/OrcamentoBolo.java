package confeitaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OrcamentoBolo {

	public static void main(String[] args) throws Exception{				
		
		System.out.println("Veja nosso cardápio de bolos: ");
		
		// Instanciação de objetos. 
		
		BoloDeFrutas bf = new BoloDeFrutas(null, null, 0); 
		BoloDeChocolate bc = new BoloDeChocolate (null, null, 0);		
		
		bf.setSabor("Morango");
		bf.setDescricao("Bolo gostosinho");		
		bf.setPreco(100);	
		
		bc.setSabor("Floresta Negra");
		bc.setDescricao("Bolo gostosinho");		
		bc.setPreco(80);	
		
		bc.getSabor();
		bc.getDescricao();
		bc.desconto();
		bc.getPreco();
		
		bf.getSabor();
		bf.getDescricao();
		bf.desconto();
		bf.getPreco();
		
		// Aplicação de estrutura de collection ArrayList. 
		
		ArrayList<Bolo> bolos = new ArrayList <>();	
		
		bolos.add(bf);
		bolos.add(bc);			
		     
		System.out.println(bolos.toString());			

		// Tratamento de exceções com bloco try catch 
		
		while (true) {
            try {           

                Scanner scanner = new Scanner(System.in);

                System.out.println("Informe o sabor do bolo:");
                String saborBolo = scanner.nextLine();
                boolean resultadoSabor = validaNome(saborBolo);
                
                if(resultadoSabor == false){
                    System.err.println("Foi informado um valor inválido");
                    System.err.println("Você deve informar o sabor do bolo que deseja comprar");
                    break;
                 }  
                
                System.out.println("Informe um nome:");
                String nome = scanner.nextLine();
                boolean resultadoNome = validaNome(nome);
                
                if(resultadoNome == false){
                   System.err.println("Foi informado um valor de entrada inválido.");
                   System.err.println("Você de informar o seu nome");
                   break;
                }           
                
                System.out.println("Informe um telefone:");
                long telefone = scanner.nextLong();                  
                

                Cliente cliente = new Cliente(nome, telefone);       
                                                       
                Pedido pedido = new Pedido(saborBolo, cliente);                
                	
                scanner.close();     
                
                HashMap resumoPedido = new HashMap();
                resumoPedido.put(pedido.getSaborBolo(), cliente.getNome());               

                System.out.println("****************************");
                System.out.println("O pedido foi registrado com sucesso! ");                
                System.out.println("Cliente :" + cliente.getNome());
                System.out.println("Telefone de contato :" + cliente.getTelefone());
                                
                
                break;               
            
                
            } catch (InputMismatchException exception) {
                System.err.println("Foi informado um valor de entrada inválido para o telefone");
            } 
        }            
    }

  
    public static boolean validaNome(String nome) {
    return nome != null && nome.matches("^[a-zA-Z]*$");
    }  
    
    public static boolean validaSabor(String sabor) {
        return sabor != null && sabor.matches("^[a-zA-Z]*$");
    } 
        
		
}

