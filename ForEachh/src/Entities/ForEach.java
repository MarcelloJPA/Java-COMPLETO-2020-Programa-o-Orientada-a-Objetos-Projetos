package Entities;

public class ForEach {

    public static void main(String[] args){

        // Instanciando o Vetor com os valores
        String[] vect = new String[]{"Maria", "Fernanda","Joana"};


        //Para cada objeto 'nomes' contido em vect, faça:
        for(String nomes : vect){
            System.out.println(nomes);
        }
    }
}
