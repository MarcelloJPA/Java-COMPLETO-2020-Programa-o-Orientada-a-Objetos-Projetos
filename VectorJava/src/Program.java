
import Entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos Produtos para cadastrar?");
        int n = sc.nextInt();

        //Criando o Vetor
        Product[] vect = new Product[n];

        for(int i=0; i<n; i++){
            System.out.println("Informe o nome: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.println("Informe o Preço: ");
            double price = sc.nextDouble();

            /*O i percorre todo o vetor colocando name e price em cada posição*/
            vect[i] = new Product(name, price);
        }
        /*Soma de todos os preços */
        double sum = 0.0;
        for(int i=0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }

        /* Media */
        double avg = sum / n;

        System.out.print(avg);



        sc.close();
    }
}
