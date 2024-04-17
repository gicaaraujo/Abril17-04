package abril17;

import java.util.Scanner;

public class Ativ1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe um número: ");
		numero = ler.nextInt();

		for(int i=0; i <= numero; i++) {


			if (i%2!=0) {
				System.out.println("O número é ímpar");
			}
			else {
				System.out.println("O número é par");

			}
			ler.close();
		}













	}

}
