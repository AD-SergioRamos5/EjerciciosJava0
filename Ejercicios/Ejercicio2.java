import java.util.Scanner;

public class Ejercicio2
{
   public static void main(String [] args)
   {
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("Escribe un numero entero: ");
      int numero = entrada.nextInt();
      
      int factorial = 1; 
      int i = 0;
      
      while(i<numero)
      {
         factorial *= numero; 
         numero -= 1;                 
      }
      
      /*for (int i=0; i<numero ; numero--)
      {
         factorial *= numero;                  
      }*/
      
      System.out.print(factorial);
   }
}