package Day7;
import java.util.Scanner;
public class Day7 {
	  public static void main(String[] args) {
		    Scanner Leitura = new Scanner(System.in);
		    String X;
		    Integer XX;
		    Integer Vetor[] = new Integer[10];
		    Integer Imp=0;
		    Integer Par=0;
		    for(Integer i=0;i<10;i++) {
		    System.out.print ("informe o valor para a posicao " + i + " do vetor ");
		    X = Leitura.nextLine();
		    XX = Integer.valueOf(X);
		    Vetor[i] = XX;
		  }
		    for(Integer i=0;i<10;i++) {
		            if(Vetor[i]%2==0){
		            	Par=Par+1;
		            } else{
		              Imp=Imp+1;
		            }
		        }
		    System.out.print ("O número de números impares é " + Imp);
		    System.out.print ("\nO número de números pares é " + Par);
		  }
		}