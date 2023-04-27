package Day4;
import java.util.Scanner;
public class Day4 {
  public static void main(String[] args) {
    Scanner Leitura = new Scanner(System.in);
    String X;
    Double XX;
    Double Vetor[] = new Double[10];
    Double Soma = 0.0;
    Double Media = 0.0;
    for(Integer i=0;i<10;i++) {
    System.out.print ("informe o valor para a posicao " + i + " do vetor ");
    X = Leitura.nextLine();
    XX = Double.valueOf(X);
    Vetor[i] = XX;
  }
    for(Integer i=0;i<10;i++) {
      Soma = Soma+Vetor[i];
      }
    Media = Soma/10;
    System.out.print("A média dos valores é " + Media);
}
}
