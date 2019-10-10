import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio7
{
   public static void main(String [] arg)
   {
      Scanner entrada = new Scanner(System.in);
      String palabra = " ";
      
      ArrayList<String> palabras = new ArrayList<String>();
      
      while(!palabra.equals("fin"))
      {
         System.out.print("Introduce una palabra ('fin' para terminar): ");
         palabra = entrada.nextLine();
                  
         if(!palabra.equals("fin"))
            palabras.add(palabra);        
      }
      
      palabra = " "; 
      
      while(!palabra.equals("fin"))
      {
         System.out.print("Introduce una palabra a buscar ('fin' para terminar): ");
         palabra = entrada.nextLine();
         if(!palabra.equals("fin"))
         {         
            if(palabras.contains(palabra))
               System.out.println(palabra + " aparece");
            else
               System.out.println(palabra + " no existe");
         }
      }
      
      Collections.sort(palabras);
      
      System.out.println("Palabras introducidas: ");
      for (String unDato : palabras)
         System.out.println(unDato);            
   }
}