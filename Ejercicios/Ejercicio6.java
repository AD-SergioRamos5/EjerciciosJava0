import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio6
{
   public static void main(String [] arg)
   {
      Scanner entrada = new Scanner(System.in);
      int numero = 0;
      
      ArrayList<Integer> numeros = new ArrayList<Integer>();
      
      while(numero>=0)
      {
         System.out.print("Introduce un numero entero (negativo para terminar): ");
         numero = entrada.nextInt();
                  
         if(numero >= 0)
            numeros.add(numero);
      }
      
      numero = 0; 
      
      while(numero>=0)
      {
         System.out.print("Introduce un numero entero para buscar (negativo para terminar): ");
         numero = entrada.nextInt();
                  
         if(numeros.contains(numero))
            System.out.println(numero + " aparece");
         else
            System.out.println(numero + " no existe");
      }
      
      Collections.sort(numeros);
      
      System.out.println("Valores introducidos: ");
      for (Integer unDato : numeros)
         System.out.println(unDato);            
   }
}