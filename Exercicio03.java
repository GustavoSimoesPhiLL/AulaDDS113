package AlunoBurroQI99999;
//O seu programa deve receber a nota do aluno pelo console e depois voce vai fazer uma operação logica para saber se a nota do aluno é maior que 70.
//O resultado dessa operação logica deve ser atribuido a uma variavel do tipo Boolean.
//por Ultimo, voce deve utilizar a variavel do Tipo Boolean com a estrutura de decisao  if  para imprimir no console uma mensagem que vai dizer se o aluno passou ou nao passou.





import java.util.Scanner;


//nT = nota do aluno   E    cF  = confirmação ou declinação 

public class Exercicio03 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("____Digite a nota do aluno_____");	
    	Double nT = scanner.nextDouble();
        Boolean cF = nT>= 70;
       
        //nao sabia o que usar para reprovacao ou aprovacao entao ta nisso
       if (cF) {
    	   System.out.println("Bela nota! toma aqui um A+ .");
       }else {
    	   System.out.println("Ta Reprovado!  KKKKKKK.");
    	   
 scanner.close();
} 
}
}
