package entities;

import enumEntities.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

     private String name;
     private WorkerLevel level;
     private Double salaryBase;

     private Departament departament; // Worker tem 1 departament
     private List<HourContract> contracts = new ArrayList<>(); // Worker tem varios contracts

     public Worker(){

     }
    public Worker(String name, WorkerLevel level, Double salaryBase, Departament departament){
        this.name = name;
        this.level = level;
        this.salaryBase = salaryBase;
        this.departament = departament;
    }

    public String getName(){
         return name;
     }

     public void setName(String name){
         this.name = name;
     }

     public WorkerLevel getLevel(){
         return level;
     }

     public void setLevel(WorkerLevel level){
         this.level = level;
     }

     public Double getSalaryBase(){
         return salaryBase;
     }

     public void setSalaryBase(Double salaryBase){
         this.salaryBase = salaryBase;
     }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
         contracts.remove(contract);
    }


}
