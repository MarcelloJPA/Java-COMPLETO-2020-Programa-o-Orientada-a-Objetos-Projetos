package Program;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import Entities.Funcionario;
import java.util.ArrayList;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Criando a Lista
        List<Funcionario> list = new ArrayList<Funcionario>();

        System.out.print("Quantos Funcionários serão registrados?");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary");
            Double salary = sc.nextDouble();

            //Instanciando Funcionario
            Funcionario func = new Funcionario(id, name, salary);

            //Colocando na Lista
            list.add(func);
        }

        System.out.print("Entre com o ID que irá incrementar o salario: ");
        int idsalary = sc.nextInt();

        Integer pos = position(list, idsalary);

        if(pos == null){
            System.out.println("Id não Encontrado");
        }
        else{
            System.out.println("Entre com a porcentagem: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println("Lista de Funcionarios");
        for(Funcionario emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            //list.get(i) -> Se o elemento da lista da posição i
            //.getId() -> pega o Id
            // == id -> verifica se é igual ao id do argumento
            if (list.get(i).getId() == id) {
                return i;
            }

        }
        return null;
    }
}

