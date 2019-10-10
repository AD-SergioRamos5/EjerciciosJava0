import java.util.Scanner;

public class Ejercicio4
{
   public static void main(String [] arg)
   {
      Scanner entrada = new Scanner(System.in);
      
      System.out.print("Introduce un numero del 1 al 12: ");
      int numero = entrada.nextInt();
      
      String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", 
                        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
      
      if(numero >= 1 && numero <= 12)
      {                    
         System.out.println(meses[numero-1]);
      }
      else
      {
         System.out.println("El numero no esta entre 1 y 12");                                      
      }
   }
}