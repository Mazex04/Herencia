public class Gato extends Animal {
    
    public Gato (String n, int e){
     super(n, e);

    }

    public void maullar(){
        System.out.println(nombre+" tiene "+ edad+" años y dice ¡Miau! ¡Miau!");
    }
}
