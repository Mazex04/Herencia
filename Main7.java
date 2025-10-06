import java.util.Scanner;

public class Main7 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);



        System.out.println("Cuantos deseas ingresar ");
        int cantidad = sc.nextInt();
        int [] numeros = new int [cantidad];
        int par = numeros[0];
        int impar = numeros[0];

        for (int i = 0; i < numeros.length; i++){

            System.out.println("Ingresa el valor "+(i+1));
            numeros[i] = sc.nextInt();
        }

       

        for (int i = 0; i < numeros.length; i++){

            if(numeros[i] % 2 == 0){

                numeros[i] = par;
                par++;
            }else {

                numeros[i] = impar;
                impar++;
            }

           
        }

         System.out.println("Hay "+par+" pare/s");
         System.out.println("Hay "+impar+" impar/es");


sc.close();

    }
}
