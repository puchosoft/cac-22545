import matematica.*;

public class Funciones {
    public static void main(String[] args) {

        /*
        Ventajas de utilizar funciones
        1) Reutilizacion del codigo
        2) Modularizar el codigo
        3) Encapsular o aislar
        4) Codigo mas corto y legible
         */

        // Call o Llamada a una funcion
        //Estadistica est = new Estadistica();

        double prom = Estadistica.promedio(56.4, 31.2);
        System.out.println("El promedio es: " + prom);

        System.out.println(Estadistica.PI);

        // Estadisticas.E no se puede acceder porque esta protegido para el paquete 'matematica'
        // System.out.println(Estadistica.E);

    }

}
