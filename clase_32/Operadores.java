public class Operadores {

    // Instanciado de un OBJETO (o crear un objeto)
    // Clase nombre_objeto = new Clase(valores);
    // Animal perro = new Animal("Sultan");

    public static void main(String[] args) {

        // Operadores aritmeticos
        /*
        System.out.println("3 + 5 = " + (3 + 5));
        System.out.println("7 - 1.2 = " + (7 - 1.2f));
        System.out.println("10 / 2 = " + (10.0 / 2.0));
        System.out.println("5 x 3.0 = " + (5 * 3.0));
        System.out.println("23 mod 7 = " + (23 % 7)); // Se usa para detectar multiplos
        */
        // Operadores de incremento
        // a = a + 1; // Contador

        // pos-incremento
        // a++;
        // a--;

        // pre-incremento
        // ++a;
        // --a;
        int a = 10;
        System.out.println(a++); // Se muestra 10 y se guarda 11
        System.out.println(++a); // Se guarda 12 y se muestra 12

        // Operadores de asignacion
        // alimentosEnStock = alimentosEnStock + z;
        // alimentosEnStock += z; // Acumulador
        // alimentosEnStock -= z;
        // alimentosEnStock *= z;
        // alimentosEnStock /= z;
        // alimentosEnStock %= z;

        // Operadores relacionales
        System.out.println(8 == 8); // -> true
        System.out.println(8 == 23); // -> false

        System.out.println(8 != 8); // -> false
        System.out.println(8 != 23); // -> true

        System.out.println(8 > 23); // -> false
        System.out.println(23 > 8); // -> true

        System.out.println(8 < 23); // -> true
        System.out.println(23 < 8); // -> false

        System.out.println(8 >= 8); // -> true
        System.out.println(8 >= 9); // -> false

        System.out.println(8 <= 8); // -> true
        System.out.println(8 <= 7); // -> false

        // Operadores logicos
        // AND
        System.out.println((1 == 1) && (3 > 2)); // -> true
        System.out.println((1 != 1) && (3 > 2)); // -> false

        // OR
        System.out.println((1 == 1) || (3 > 4)); // -> true
        System.out.println((1 != 1) || (3 > 4)); // -> false

        // NOT
        System.out.println(!(1 == 1)); // -> false
        System.out.println(!(1 != 1)); // -> true

        // Metodo length()

        String frase = new String("Estamos en la clase 32 de FS Java.");
        System.out.println("La longitud de la frase es de "+ frase.length() + " caracteres.");

    }
}
