package AULADDS113;

import java.util.Scanner;

public class QuadradodoNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		Integer numero = scanner.nextInt();
		Integer quadrado = numero * numero;
		System.out.println("O quadrado de " + numero + " e " + quadrado + " . ");
		scanner.close();
	}

}
