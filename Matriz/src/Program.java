import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o Tamanho da Matriz");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for(int i=0; i<matriz.length; i++){

            for(int j=0; j<matriz[i].length; j++){
                System.out.print("  Linha " + i);
                System.out.print("  Coluna" + j);

                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<matriz.length; i++){
            System.out.println("Números Diagonal" + matriz[i][i]);
            //matriz[i][i] Mostra sempre a mesma posição do for exemplo linha 0 coluna 0, linha 1 coluna 1(Consequentemente Numeros da diagonal)
        }

        int count = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j] < 0 ){
                    count = count + 1;
                }
            }
        }
        System.out.print("Qtd Numeros negativos: " + count);

        sc.close();
    }
}
