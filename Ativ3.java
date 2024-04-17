package abril17;

import java.util.Scanner;

public class Ativ3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero, soma=0;

		for(int i=0; i <= 9; i++) {
			System.out.println("Informe um número: ");
			numero = ler.nextInt();
			soma+=numero;
			System.out.println("A soma é " + soma);
			if (numero%2==0) {
				System.out.println("O número é par");
			}
			else {
				System.out.println("O número é ímpar");

			}
		
			

		}




	}

}
