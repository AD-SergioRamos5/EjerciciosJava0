import java.util.Scanner;

public class Ejercicio5
{
   public static boolean esPrimo(int numero) 
   {
      int contador = 2;
      boolean primo=true;
      while ((primo) && (contador!=numero))
      {
       if ( (numero % contador) == 0)
          primo = false;
       contador++;
      }
      return primo;
   }
   
   public static boolean esPalindromo(int numero) 
   {
      String sPalabra=String.valueOf(numero);
      int inc = 0;
      int des = sPalabra.length()-1;
      boolean palindromo = true;
      while ((inc<des) && (palindromo))
      {
         if (sPalabra.charAt(inc)==sPalabra.charAt(des))
         {
            inc++;
            des--;
         } 
         else 
         {
            palindromo = false;
         }
      }
      return palindromo;
   }
   
   public static void main(String [] arg)
   {
   
      Scanner entrada = new Scanner(System.in);
      System.out.print("Escribe un numero entero: ");
      int numero = entrada.nextInt();
      
      if(esPrimo(numero))
         System.out.println("El numero es primo");
      else
         System.out.println("No es primo");
         
      if(esPalindromo(numero))
         System.out.println("El numero es palindromo");
      else
         System.out.println("No es palindromo");
   }
}