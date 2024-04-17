package abril17;

import java.util.Scanner;

public class Exemplo2 {
	

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    String nome;
    
    for(int i=0; i <= 5; i++) {
    	System.out.println("Informe um nome: ");
        nome = ler.next();
    System.out.println("O nome é: " + nome);
    	
    }
    ler.close();	
    	
    }
    
    
    
	}

