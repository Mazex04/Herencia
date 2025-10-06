
import java.util.Scanner;

public class Practica2Denuevo {
 public static void main(String[] args) {
     

    Scanner sc = new Scanner (System.in);


    System.out.println("Cuantos datos deseas ingresar ");
    int datos = sc.nextInt();


    int [] numeros = new int [datos];

    int numPar = numeros[0];
    int numImpar = numeros[0];

    for (int i =0; i < numeros.length; i ++){

        System.out.println("Ingresa el valor: "+(i+1));
        numeros[i] = sc.nextInt();
    }

    for (int i = 0; i < numeros.length; i++){

        if(numeros[i] % 2 ==0){

            numeros[i] = numPar;
            numPar++;
        }else {
            numeros[i] = numImpar;
            numImpar++;
        }
    }
        System.out.println("Hay un total de "+numPar+" numeros pares");
        System.out.println("Hay un total de "+numImpar+" numeros impares"); 




    sc.close();


 }   
}
