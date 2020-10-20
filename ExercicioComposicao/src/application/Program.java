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
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com nome do Departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Entre com a descrição do Trabalhador: ");

        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();

        System.out.print("Nível: ");
        String nivelTrabalhador = sc.nextLine();

        System.out.print("Salario Base ");
        double salarioBase = sc.nextDouble();

        Worker worker = new Worker(nomeTrabalhador, WorkerLevel.valueOf(nivelTrabalhador), salarioBase, new Departament(nomeDepartamento) );

        System.out.println("Quantos contratos para o Trabalhador? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Entre com o contrato" + i + ": ");

            System.out.print("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());

            System.out.print("Valor por Hora");
            double valorPorHora = sc.nextDouble();

            System.out.print("Duração");
            int horas = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valorPorHora, horas);

            worker.addContract(contract); //Associa o Contrato ao trabalhador
        }

        System.out.println();
        System.out.println("Entre com o mes e ano para calcular o salario(MM/YYYY)");

        String mesEano = sc.next();
        //substring -> pega a posição 0 ate 2 da String
        //parseInt  -> converte para Inteiro
        int mes = Integer.parseInt(mesEano.substring(0, 2));

        int year = Integer.parseInt(mesEano.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.print("renda de" + mesEano + ": " + worker.income(year, mes));






        sc.close();
    }
}
