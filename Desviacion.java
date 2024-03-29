/**
* Write a description of class Desviacion here.
* @author Dennis Urrea/Alejandro Rodriguez Mancera 
* @version 18-ago-2019
*/
import java.util.Scanner;
import java.lang.Math;
public class Desviacion
{
    public static double [] agregar_elementos()
    {
      Scanner teclado = new Scanner(System.in);
      int numero_de_elementos;
      System.out.println("------------------------------------------------");
      System.out.println("Guia 2 Actividad 2 Programa 2 Desviación        ");
      System.out.println("------------------------------------------------");        
      // Solicito el numero de elementos 
      System.out.println("Ingrese el número de elementos " );
      numero_de_elementos = teclado.nextInt();
      if (numero_de_elementos >= 0){
          System.out.println("Numero de elementos ingresado " + numero_de_elementos);
       }else{
          System.out.println("Numero de elementos errado ");
       }
      // defino el arreglo
      double [] arreglo;
      arreglo = new double [numero_de_elementos];
      for(int i = 0; i < numero_de_elementos; i++)
      {
      System.out.println("Ingrese el número de la posición " + i);
      arreglo[i] = teclado.nextDouble();
      } 
      return arreglo;
    } 
    public static double promedio(double [] arreglo )
    {
       double promedio = 0.0;
       double sumatoria = 0.0;
       for(int i = 0; i < arreglo.length; i++)
       {
       sumatoria = arreglo[i]+ sumatoria;
       } 
       promedio = sumatoria / arreglo.length; 
       return promedio;
    }
    public static double desviacion (double [] arreglo )
    {
       double promedio = 0.0;
       double sumatoria = 0.0;
       promedio = promedio(arreglo);
       double desviacion;
       for(int i = 0; i < arreglo.length; i++)
       {
       sumatoria = (Math.pow((arreglo[i] - promedio),2));
       } 
       desviacion = Math.sqrt(sumatoria / arreglo.length); 
       return desviacion;
    }
    public static void main (String [] args)
    {
       double []arreglo;
       arreglo = agregar_elementos();
       double promedio = promedio(arreglo);
       double desviacion = desviacion(arreglo);
       System.out.println("La desviación estándar  es: " + desviacion);
    }
}