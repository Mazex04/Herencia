public class Main2 {
    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Max", 5);

        miPerro.comer();
        miPerro.ladrar();


        System.out.println("");

        Gato miGato = new Gato("Katy", 7);
        
        miGato.comer();
        miGato.maullar();

        System.out.println("");

        Pajaro miPajaro = new Pajaro("Fuleco", 3);

        miPajaro.comer();
        miPajaro.silbar();




    }
}
