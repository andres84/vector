package vectores;

import java.util.Scanner;

/*

dados 5 numeros obtener el numero mayor

 */
public class numeroMayor {

    public static void main(String... andres) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int mayor = 0;

        for (int i = 0; i < 4; i++) {

            System.out.println("Digite numero");
            int n = sc.nextInt();

            if (numeros[i] > mayor) {

                mayor = numeros[i];

            }

        }
        
        System.out.println("el numero mayor es " + mayor);

    }

}
