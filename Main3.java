class Animal {
    String nombre;
    int edad;

    Animal(String n, int e) {
        nombre = n;
        edad = e;
    }

    void comer() {
        System.out.println(nombre + " está comiendo.");
    }
}

// Clase hija
class Perro extends Animal {
    Perro(String n, int e) {
        super(n, e);
    }

    void ladrar() {
        System.out.println(nombre + " tiene " + edad + " años y dice ¡Guau! ¡Guau!");
    }
}

// Clase con main
public class Main3 {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Max", 8);

        miPerro.comer();   // heredado de Animal
        miPerro.ladrar();  // propio de Perro
    }
}