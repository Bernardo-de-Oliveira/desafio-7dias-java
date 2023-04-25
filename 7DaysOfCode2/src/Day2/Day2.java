package Day2;

public class Day2 {
	  public static void main(String[] args) {
		    String Vetor[][] = new String[10][10];
		    for(int i=0;i<10;i++){
		      for(int j=0;j<10;j++){
		       Vetor[i][j]="-";
		      }
		    }
		    for(int i=0;i<10;i++){
		      System.out.print("\n ");
		      for(int j=0;j<10;j++){
		       System.out.print(Vetor[i][j]);
		       
		      }
		    }
		  }
		}