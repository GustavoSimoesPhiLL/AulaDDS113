package AULADDS113;

import java.util.Scanner;

 //
 // Crie um preograma que le, do console, 
 // o nome e sobrenome de uma pessoa e depois imprime o nome completo. 
 // Para isso, voc� vai precisar de duas variaveis: a primeira voc� pode chamar de "nome" 
 // e a segunda de "sobrenome". 
 //Por �ltimo, voc� vai juntar o nome e o sobrenome em uma �nica impress�o.
 //

public class Exercicio02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		
		String name = scanner.nextLine();
		
		System.out.print("Informe seu sobrenome: ");
		
		String sobrenome = scanner.nextLine();
		
		System.out.println("O seu nome � : " + name + "  " + sobrenome);
		
		scanner.close();
	}

}
