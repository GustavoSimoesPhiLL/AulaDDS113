package AlunoBurroQI99999;

import java.util.Scanner;

public class MediaDeNotas
{
public static void main(String args[])
{
java.util.Scanner nota = new Scanner(System.in);
float n1, n2, n3, n4, mf;
System.out.print("Entre com a nota do primeiro BI: ");
n1 = nota.nextFloat();
System.out.print("Entre com a nota do segundo BI: ");
n2 = nota.nextFloat();
System.out.print("Entre com a nota do terceiro BI: ");
n3 = nota.nextFloat();
System.out.print("Entre com a nota do quarto BI: ");
n4 = nota.nextFloat();
mf = (n1+n2+n3+n4)/4;
if(mf >= 5)
{
System.out.print("Voce foi APROVADO. ");
}
else
{
System.out.print("Voce foi REPROVADO. ");
}
System.out.print("A media final eh de: " + mf + " pontos.");
}
}