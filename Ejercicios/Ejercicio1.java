import java.util.Scanner;

public class Ejercicio1
{
   public static void main(String [] args)
   {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Dime tu nombre: ");
      String nombre = teclado.nextLine();
      
      for (int i=0; i<5 ; i++)
         System.out.println("Hola, " + nombre);
   }
}