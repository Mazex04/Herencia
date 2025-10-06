class Caracter{

    char ch;
    public Caracter (char c){
        ch = c;
    }

    public void repetir (int num){
        int i ;
        for (i=0;i<num;i++)
        System.out.println(ch);
    }
}




public class Ej1 {
    public static void main(String[] args) {
        Caracter caracter = new Caracter('I');
        caracter.repetir(10);
    }
}
