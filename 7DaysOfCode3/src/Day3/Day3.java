package Day3;
import java.util.Scanner;

public class Day3 {
  public static void main(String[] args) {
	  
    Scanner Leitura = new Scanner(System.in);
    String X;
    Integer XX;
    Integer Vetor[] = new Integer[10];
    Integer Soma = 0;
    for(Integer i=0;i<10;i++) {
    System.out.print ("informe o valor para a posicao " + i + " do vetor ");
    X = Leitura.nextLine();
    XX = Integer.valueOf(X);
    Vetor[i] = XX;
  }
    for(Integer i=0;i<10;i++) {
      Soma = Soma+Vetor[i];
      }
    System.out.print("O valor da soma é " + Soma);
}
}