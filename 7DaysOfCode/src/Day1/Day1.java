package Day1;

import java.util.Scanner;

public class Day1 {
  public static void main(String[] args) {
    Scanner Leitura = new Scanner(System.in);
    String X;
    Integer XX;
    Integer Vetor[] = new Integer[10];
    Integer Menor = 9999;
    Integer Maior = 0;
    for(Integer i=0;i<10;i++) {
    System.out.print ("informe o valor para a posicao " + i + " do vetor ");
    X = Leitura.nextLine();
    XX = Integer.valueOf(X);
    Vetor[i] = XX;
  }
    for(Integer i=0;i<10;i++) {
            if(Vetor[i]<Menor){
            	Menor = Vetor[i];
            }
        }
    for(Integer i=0;i<10;i++) {
            if(Vetor[i]>Maior){
            	Maior = Vetor[i];
            }
        }
    System.out.print ("O menor valor do vetor é " + Menor);
    System.out.print ("\nO maior valor do vetor é " + Maior);
}
}