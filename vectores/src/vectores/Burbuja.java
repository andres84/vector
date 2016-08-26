package vectores;

import java.util.Scanner;

public class Burbuja {

    public static void main(String[] args) {

        //llenando el array
        String[] nombre = new String[3];
        int[] edad = new int[3];

        for (int i = 0; i < 3; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese su nombre");
            nombre[i] = sc.next();
            System.out.println("Ingrese su edad");
            edad[i] = sc.nextInt();

        }

        System.out.println("---------------------------");
        //ordenando de menor a mayor

        int aux;

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2 - i; j++) {

                if (edad[j] > edad[j + 1]) {

                    aux = edad[j];
                    edad[j] = edad[j + 1];
                    edad[j + 1] = aux;

                }

            }

        }

        
        for(Integer dato : edad ){
            
            System.out.println(dato);
            
        }
        
    }

}
