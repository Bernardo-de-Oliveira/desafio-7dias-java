package Day5;
import java.util.Scanner;
public class Day5 {
	  public static void main(String[] args) {
		    Scanner Leitura = new Scanner(System.in);
		    String X;
		    Integer XX;
		    Integer Vetor[] = new Integer[10];
		    Integer MaioA = 0;
		    Integer Maior = 0;
		    for(Integer i=0;i<10;i++) {
		    System.out.print ("informe o valor para a posicao " + i + " do vetor ");
		    X = Leitura.nextLine();
		    XX = Integer.valueOf(X);
		    Vetor[i] = XX;
		  }
		    for(Integer i=0;i<10;i++) {
		            if(Vetor[i]>Maior){
		            	Maior = Vetor[i];
		            }
		        }
		    for(Integer i=0;i<10;i++) {
		            if(Vetor[i]>MaioA && Vetor[i]<Maior){
		            	MaioA = Vetor[i];
		            }
		        }
		    System.out.print ("\nO segundo maior valor do vetor é " + MaioA);
		}
		}
