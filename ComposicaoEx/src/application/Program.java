package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import enumEntities.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner sc  = new Scanner(System.in);
        System.out.println("Entre com o nome do Departamento");
        String departament = sc.nextLine();

        System.out.println("Descrição do Trabalhador");

        System.out.print("Nome");
        String nomeTrabalhador = sc.nextLine();

        System.out.print("Nivel");
        String level = sc.nextLine();

        System.out.print("Salario Base");
        Double salaryBase = sc.nextDouble();

        Worker worker = new Worker(nomeTrabalhador, WorkerLevel.valueOf(level), salaryBase,  new Departament(departament));

        System.out.print("Quantos contratos deseja cadastrar?");
         int n = sc.nextInt();

         for(int i=1; i<=n; i++){
            System.out.print("Entre com o contrato" + i );

            System.out.print("Data: ");
             Date contractDate = sdf.parse(sc.next());

             System.out.print("Valor por Hora");
             double valorPorHora = sc.nextDouble();

             System.out.print("Duração(HRS)");
             int horas = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valorPorHora, horas);

            worker.


         }



        sc.close();
    }
}
