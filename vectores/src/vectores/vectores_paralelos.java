
package vectores;

import java.util.Scanner;


public class vectores_paralelos {
   
    public static void main(String[] args) {
        
        String[] nombre = new String[3];
        int[] edad = new int[3];
        
        for(int i = 0; i < 3; i++){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su nombre");
            nombre[i] = sc.next();
            System.out.println("Ingrese su edad");
            edad[i] = sc.nextInt();
            
            
        }
        
        for(int i = 0; i < 3; i++){
            
            System.out.println(nombre[i] + " " + edad[i]);
            
        }
        
    }
    
    
}
