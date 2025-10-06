

import java.util.Scanner;
public class Practica {
    

    public static void main (String [] args){

        
        Scanner sc = new Scanner (System.in);

        System.out.println("Cuantos valores deseas ingresar: ");
        int datos = sc.nextInt();
        
        int [] numeros = new int [datos];


       
        for (int i =0; i < numeros.length; i++){


            System.out.println("Ingresa el primera valor "+(i+1));
            numeros[i] = sc.nextInt();
        }

        
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 0; i< numeros.length; i ++){
                if(numeros[i] > mayor ){
                  mayor = numeros[i];
                }
                if (numeros[i] < menor ){
                    menor = numeros[i];
                }
        
        }

        
        System.out.println("El numero mayor es "+mayor);
        System.out.println("El numero menor es "+menor);
        sc.close();
    }
}
