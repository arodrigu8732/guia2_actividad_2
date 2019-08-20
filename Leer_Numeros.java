/**
 * Write a description of class Leer_Numeros here.
 * @author Dennis Urrea/Alejandro Rodriguez Mancera 
 * @version 18-ago-2019
 */
import java.io.*;
import java.util.*;
public class Leer_Numeros
{
    public static void main(String[] args) {       
        InputStreamReader isr=new InputStreamReader (System.in);
        BufferedReader br=new BufferedReader (isr);
        Scanner teclado=new Scanner(System.in);
        int numero,val,mayor,menor;
        double media;
        System.out.println("------------------------------------------------"); 
        System.out.println("Guia 2 Actividad 2 Programa 1 Leer Numeros") ;
        System.out.println("------------------------------------------------");        
        System.out.println("Cuantos números desea ingresar: ");
        numero=teclado.nextInt();
        if (numero >0){
            System.out.println("vamos a calcular " + numero );
        }else{
            System.out.println("error numero de veces,volver a intentar");
        }
        mayor=0;
        menor=1000000000;
        media=0;
        while (numero > 0){
        for (int i=1;i<=numero;i++)
        {
            System.out.println("Ingrese número " + i+": ");
            val=teclado.nextInt();
            if (val>mayor){
                mayor=val;
            }
            if (val<menor){
                menor=val;
            }
            media=media+val;
        }  
        media=media/numero;
        System.out.println("El número mayor es: "+mayor+"\n");
        System.out.println("El número menor es: "+menor+"\n");
        System.out.println("El promedio de los números ingresados es: "+media);
        }
    }
 } 