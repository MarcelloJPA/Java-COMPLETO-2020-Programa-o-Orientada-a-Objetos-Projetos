import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		/*Leia um valor inteiro e com o FOR 
		 * smostre os ímpares de 1 até X, um valor por 
		 * linha, inclusive o
			X, se for o caso.*/
		 	
		Scanner sc = new Scanner(System.in);
		
	    int x = sc.nextInt();
	    
	    for(int i=1; i<=x; i++) {
	    	if (i % 2 != 0) {
	    		System.out.println(i);
	    	}
	    	
	    }
	    
	    

	}

}
