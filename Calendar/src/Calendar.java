import java.text.SimpleDateFormat;
import java.time.Instant;

import java.util.Date;


public class Calendar {

    public static void main(String[] args){

        //Define o Formato para conversão Date/Time
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        //Adicionando Horas com Calendar
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(d);
        cal.add(java.util.Calendar.HOUR_OF_DAY, 2); // add +2Horas
        d = cal.getTime(); // Jogando Nova hora no d

        int minutes = cal.get(java.util.Calendar.MINUTE); // Pegando os minutos

        int month = 1 + cal.get(java.util.Calendar.MONTH);

        System.out.println(sdf.format(d));

        System.out.println(minutes);

        System.out.println(month);



    }
}
