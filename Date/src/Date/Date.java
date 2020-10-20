package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {


    public static void main(String[] args) throws ParseException {

        // SimpleDateFormat Define formatos para conversão entre Date e String.
       SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
       SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

       // A classe Date representa um instante específico no tempo, com precisão de milissegundos.
       java.util.Date y1 = sdf1.parse("22/05/1993");
       java.util.Date y2 = sdf2.parse("08/10/2020 23:35:10");
       java.util.Date dataAtual = new java.util.Date();

       System.out.println(sdf1.format(y1));
       System.out.println(sdf2.format(y2));
       System.out.println(sdf2.format(dataAtual));






    }

}
