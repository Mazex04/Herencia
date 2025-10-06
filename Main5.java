
class Ccoche {

    String marca;
    int velocidad; 

    public Ccoche(String m, int v) {

        marca = m;
        velocidad = v;
    
    }
    public void acelerar(int incremento){
        velocidad+=incremento;
        System.out.println("Con una velocidad de incremento de "+ incremento);
    }
    void mostrar (){
    System.out.println(marca+ " tiene una velocidad final de "+velocidad);

    }
}
public class Main5 {
public static void main(String[] args){
    Ccoche coche = new Ccoche("Ford", 120);
    coche.acelerar(8);
    coche.mostrar();
    System.out.println("");
}    
}
