
import java.util.Scanner;

public class Numero2 {
    

    public static void main(String[] args) {
        

        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantos valores deseas ingresar ");
        int datos = sc.nextInt();

        int [] numeros = new int [datos];

        int numPar = numeros[0];
        int numImpar = numeros[0];


        for (int i = 0; i < numeros.length; i++){

            System.out.println("Ingresa el primer valor ");
            numeros[i] = sc.nextInt();

            if( numeros[i] % 2 == 0){

                numeros[i] = numPar;
                numPar++;
           }
           else {

              numeros[i] = numImpar;
            numImpar++;
           }
        }
        
       

        System.out.println("Hay "+ numPar+" par/es");
        System.out.println("Hay "+numImpar+" impar/es");

        sc.close();
    }
}
