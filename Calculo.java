class Calculo {

    String nombre;
    double peso;
    double altura;

    public Calculo(String nombre,double altura ,double peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }

    public void prom (){

        double promedio = peso/(altura*altura);

        System.out.println(nombre+" Tu imc es "+ promedio);
    }

    public static void main(String[] args) {
        

        Calculo cal = new Calculo("Oscar", 1.78, 80);

        cal.prom();

    }

}