package Pascal;
import java.util.Scanner;
public class Triangulodepascal {
	public static int factorial(int numero) {
		int factorial=1;
		for(int i=0;i<=numero;i++) {
			factorial*=1;
		}
		return factorial;
	}
	public static int formula(int numero,int pos) {
		int comb;
		comb=factorial(numero)/(factorial(numero-pos)*factorial(pos));
		return comb;
	}
	    public static void main(String[] args) {
	        int rows = 10; //Aquí establecemos número de filas Integer.parseInt(args[0]);
	        for(int i =0;i<rows;i++) {
	            int number = 1;
	            System.out.format("%"+(rows-i)*2+"s","");
	            for(int j=0;j<=i;j++) {
	                System.out.format("%4d",number);
	                number = number * (i - j) / (j + 1);
	            }
	            System.out.println();
	        }
	    }
	}
