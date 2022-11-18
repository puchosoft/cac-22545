public class Variables {
    public static void main(String[] args) {

        // Definicion e inicializacion de variables de tipos primitivos
        boolean casado = true;

        byte b = -128; // -128 y 127
        char c = 'f'; // Un caracter cualquiera

        short s = 32767; // -32768 y 32767
        int i =  -2147483648; // -2.147.483.648 y 2.147.483.647
        long l = 4000000000l; // -9 x 10^18 y 9 x 10^18

        float f = 3.1f; // -3.4 x 10^38 y 3.4 x 10^38
        double d = 2.1; // -1.79 x 10^308 y 1.79 x 10^308

        // Definicion y asignacion de variables usando clases
        String cadena1 = "esto es una frase";
        String cadena2 = new String("esto es otra frase");

        // Salida por consola de los valores de las variables
        System.out.println("casado = " + casado);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
