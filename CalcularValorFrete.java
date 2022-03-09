package AULADDS113;

import java.util.Scanner;

public class CalcularValorFrete {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite o valor do produto: ");
	        Double valorProduto = scanner.nextDouble();
	        System.out.print("Digite o valor do Frete :");
	        Double frete = scanner.nextDouble();
	        Double valorTotal = valorProduto + frete ;
	        System.out.println("A soma do Produto com o Frete é:" + valorTotal);
	        scanner.close();
	    }
	}