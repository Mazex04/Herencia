public class MainPolimorfismo {
    public static void main(String[] args) {
        
        Animal[] animales = {
            new Perro("Max", 8),
            new Gato("Kity", 5),
            new Pajaro("Fuleco", 3)
        };

        for(Animal a: animales){
            a.comer();


            if(a instanceof Perro){

                ((Perro)a).ladrar();
            }else if (a instanceof Gato){
                ((Gato)a).maullar();
            }else if (a instanceof Pajaro){
                ((Pajaro)a).silbar();
            }
            System.out.println();
        }
    }
    
}
