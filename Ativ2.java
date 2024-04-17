package abril17;

import java.util.Scanner;

public class Ativ2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numero, soma=0, media, resultado;

		for(int i=0; i <= 4; i++) {
			System.out.println("Informe um número: ");
			numero = ler.nextInt();
			soma= soma+numero;
			System.out.println("O resultado da soma é: " + soma);
		}

		media = (soma)/5;
		System.out.println("O resultado da média é: " + media);

		ler.close();



	}

}
