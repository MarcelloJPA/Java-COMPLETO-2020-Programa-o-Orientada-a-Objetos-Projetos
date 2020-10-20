import java.util.Locale;
import java.util.Scanner;

public class ExMatriz {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Linhas");
        int m = sc.nextInt();
        System.out.print("Colunas");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        //Percorre as linhas

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                System.out.print("Linha  " + i);
                System.out.print("Coluna  " + j);
                matriz[i][j] = sc.nextInt();
            }
        }

        sc.nextLine();
        System.out.print("Número que deseja achar na matriz");
        int x = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz.length; j++){
                if( matriz[i][j] == x ){
                    System.out.println("Position:" + i + ", " +  j);
                    //Se o nº de colunas for maior que 0 -> Mostra a o nº anterior do X
                    if(j > 0 ){
                        System.out.println("Left " + matriz[i][j-1]);
                    }
                    if(i>0){
                        System.out.println("UP " + matriz[i-1][j]);
                    }
                    if (j < matriz[i].length-1) {
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }


            }
        }



        sc.close();
    }
}
