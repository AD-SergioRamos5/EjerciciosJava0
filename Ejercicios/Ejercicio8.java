import java.util.Scanner;

public class Ejercicio8
{
   public static void main(String [] arg)
   {
      ListaDeDatos datos = new ListaDeDatos();
      String palabra = " ";
      boolean flag = false;
	  Scanner entrada = new Scanner(System.in); 
	  
	  System.out.print("Introduce una palabra ('fin' para terminar): ");
		palabra = entrada.nextLine();
		 
	  while(!palabra.equals("fin"))
      {                           
         if(!palabra.equals("fin"))
            datos.incluir(palabra);      
			
		System.out.print("Introduce una palabra ('fin' para terminar): ");
         palabra = entrada.nextLine();
      }
	  
	  System.out.print("Introduce una palabra a buscar ('fin' para terminar): ");
      palabra = entrada.nextLine();
	  
      while(!palabra.equals("fin"))
      {
         
         if(!palabra.equals("fin"))
         {         
            if(datos.contiene(palabra))
            {
               System.out.println(palabra + " aparece");
               flag = true;
            }
            else
            {
               System.out.println(palabra + " no existe");
               flag = false;
            }
         }
		System.out.print("Introduce una palabra a buscar ('fin' para terminar): ");
        palabra = entrada.nextLine();
	  }
	  
      
      datos.mostrarOrdenados();
      
   }
}


