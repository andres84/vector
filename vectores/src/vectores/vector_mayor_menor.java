package vectores;

import java.util.Scanner;

public class vector_mayor_menor {

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
        //encontrando el mayor elemento

        int mayor = edad[0];
        int posicion = 0;

        for (int i = 0; i < 3; i++) {

            if (edad[i] > mayor) {

                mayor = edad[i];
                posicion = i;

            }

        }

        System.out.println("El mayor tiene " + mayor + " años y su nombre es " + nombre[posicion]);
        

    }

}
