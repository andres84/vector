
package vectores;

import java.util.Scanner;


public class Vectores {

    public static void main(String[] args) {

        /*
        //arreglo de tamaño fijo
        String[] arreglo = new String[2];
        
        arreglo[0] = "andres";
        arreglo[1] = "fragozo";
        
        for(String s : arreglo){
            
            System.out.println(s);
            
        }*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese tamaño del arreglo");
        int tamanio = sc.nextInt();
        
        String[] arreglo = new String[tamanio];
        
        for(int i = 0; i < arreglo.length; i++){
            
            System.out.println("ingrese contenido para la posicion " + i + " :");
            arreglo[i] = sc.next();
            
        }
        
        
        System.out.println("------------------------------------------------");
        
        for(String dato : arreglo){
            
            System.out.println(dato);
            
        }
        
    }
    
}
