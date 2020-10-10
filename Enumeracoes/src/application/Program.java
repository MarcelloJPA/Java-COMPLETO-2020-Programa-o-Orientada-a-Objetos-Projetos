package application;
import java.util.Date;

import entitie.Order;
import entities.enums.OrderStatus;

public class Program {

    public static void main(String[] args){

        Order order = new Order(1500, new Date(), OrderStatus.PENDING_PAYMENT);


        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        //valueOf retorna a CONSTANTE de enumeração cujo valor representado por string
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //Retorna a CONSTANTE DELIVERED


        System.out.println(os1);
        System.out.println(os2);

    }

}
