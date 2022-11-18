public class ClaseMath {

    public static void main(String[] args) {
        // Declaracion de una CONSTANTE
        final double pi = 3.14159;
        System.out.println(pi);
        //pi = 2.0; -> Da error xq intenta modificar una CONSTANTE

        // Math m = new Math(); // -> no se pueden instanciar objetos de la clase Math

        System.out.println("PI = " + Math.PI);
        System.out.println("pow(25,3) = " + Math.pow(25,3));
        System.out.println("sqrt(144) = " + Math.sqrt(144));

        System.out.println("ceil(7.8) = " + Math.ceil(7.8));
        System.out.println("floor(7.8) = " + Math.floor(7.8));
        System.out.println("round(7.8) = " + Math.round(7.8));
        System.out.println("round(7.1) = " + Math.round(7.1));

    }
}
