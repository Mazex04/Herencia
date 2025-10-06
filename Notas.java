public class Notas {
    String nombre;
    String apellido;
    String curso;
    double nota;   
    double nota1,nota2,nota3;

    public Notas (String n, String a, String c, double s, double  z1,double  x2,double  y3){
        nombre = n;
        apellido = a; 
        curso = c;
        nota = s;
        nota1 = z1;
        nota2 = x2;
        nota3 = y3;
    }

 public void estudiante() {
         System.out.println("Estudiante con nombre " + nombre + 
                           " apellido " + apellido + 
                           " de curso " + curso + 
                           " tuvo una nota final de " + nota);
        double promedio1  = (nota1+nota2+nota3)/3;
        if (promedio1 > 5.9){
        System.out.println("Pasaste");
        }else{
            System.out.println("Perdiste");
        }
 }


    public static void main(String[] args) {
        
    Notas notas = new Notas("Jorge", "Ramirez", "A101", 7.6, 6.7, 6.9, 8.9);

    notas.estudiante();

    }
}
