package matematica;

public class Estadistica {

     public static double promedio(double n1, double n2){
        double p;
        p = (n1 + n2) / 2;
        return p;
     }

    public static final double PI = 3.1416;

     // Este atributo protegido solo puede ser accedido por las clases del paquete 'matematica'
     protected static final double E = 2.71;

}
