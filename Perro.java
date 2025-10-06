public class Perro extends Animal {
    
    public Perro (String n, int e){

        super(n, e);
    }


    public void ladrar(){
        System.out.println(nombre+ " tiene "+ edad+" años y dice ¡Guau! ¡Guau!");
    }
}
