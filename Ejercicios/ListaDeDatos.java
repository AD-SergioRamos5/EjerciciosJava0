import java.util.ArrayList;
import java.util.Collections;

public class ListaDeDatos
{
   protected ArrayList<String> palabras;
   
   public ListaDeDatos()
   {
      palabras = new ArrayList<String> ();
   }
   
   public void incluir (String palabra)
   {     
      palabras.add(palabra);   
   }
   
   public boolean contiene(String palabra)
   {
      boolean flag = false;
	  
	  if(palabras.contains(palabra))
		  flag = true;
	  else
		  flag = false;
              
      return flag;
   }
   
   public void mostrarOrdenados()
   {
      Collections.sort(palabras);
      
      System.out.println("Palabras introducidas: ");
      for (String unDato : palabras)
         System.out.println(unDato);
   }
}

