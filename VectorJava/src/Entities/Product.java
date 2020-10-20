package Entities;

public class Product {

    private String name;
    private double price;

    /*Construtor*/

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }


    /* Getters e Setters */
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }




}
