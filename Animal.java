public class Animal {
    String nombre;
    int edad;

    //Constructor

    public Animal (String n, int e){

        this.nombre = n;
        this.edad = e;

    }


    public void comer(){

        System.out.println(nombre+" esta comiendo");

    }
}
