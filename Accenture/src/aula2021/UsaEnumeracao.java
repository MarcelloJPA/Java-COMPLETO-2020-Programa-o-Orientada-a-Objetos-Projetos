package aula2021;

enum Cores 
{
    Vermelho, Verde, Azul;  
}
public class UsaEnumeracao
{
public static void main(String[] args) 
{
for (Cores c : Cores.values())
            System.out.println(c);    
}
}
