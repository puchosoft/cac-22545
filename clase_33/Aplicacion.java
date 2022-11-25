public class Aplicacion {
    public static void main(String[] args) {
        // Hoy vamos a hablar sobre arreglos de Java
        // porque son muy importantes para manejar grandes cantidades de datos

        // Declaracion de un arreglo de elementos de tipo String
        // En este caso ubicamos los corchetes junto al nombre del arreglo
        // Usamos la sintaxis para instanciar objetos y declaramos el tamaño = 7
        // El TAMAÑO es lo mismo que la cantidad de elementos del arreglo
        String semana[] = new String[7];

        // Asignacion de valores a algunos de los elemenos del arreglo.
        // Se usa un indice para indicar el elemento deseado.
        // Los indices siempre van desde 0 hasta N-1, donde N es el tamaño del arreglo.
        semana[6] = "Sabado";
        semana[0] = "Domingo";

        // a = { 56, 4, 68, -9 }
        // a[0]
        // N = 4 --> indices 0 .. N-1 = 0 .. 3
        // a[3] --- a[N-1]

        // Acceso y salida por consola de uno de los elementos del arreglo
        System.out.println(semana[0]);

        // Declaracion de un arreglo de elementos de tipo int
        // En este caso usamos la opcion de ubicar los corchetes junto al tipo de datos
        int[] numeros = new int[10];

        // Otra forma de declaracion de arreglos sin indicar su tamaño
        // El tamaño se indica en forma implicita por la cantidad de elementos
        // con los que se lo inicializa (en este caso 4 elementos)
        float precios[] = { 34.5f, 65.1f, 98.7f, 65.4f };
        System.out.println(precios[2]);

        // El atributo 'length' nos devuelve el tamaño o longitud de un arreglo
        System.out.println(precios.length);

        System.out.println("\n----------\n");

        // Declaracion e inicializacion de un arreglo de 2 dimensiones
        // La primera dimension es igual a 4 (4 elementos array)
        // La segunda dimension es igual a 2 (2 elementos String)
        String[][] capitales = {
                {"Buenos Aires", "La Plata"},
                {"Cordoba", "Cordoba"},
                {"Chaco", "Resistencia"},
                {"Misiones", "Posadas"}
        };

        // Usamos un bucle para recorrer o iterar el arreglo de 2 dimensiones
        // Por cada fila, se muestran sus 2 valores (provincia y capital en este caso)
        // Observar como se aprovecha el atributo 'length' como limite maximo
        for (int i=0; i < capitales.length; i++){
            System.out.println("La capital de "+ capitales[i][0]+ " es "+ capitales[i][1]);
        }

        System.out.println("\n----------\n");

        // Cargamos el arreglo 'numeros' con los cubos de los nº de 0 a 9
        // Aprovechamos el valor del indice i para obtener los cubos
        // Observar como se aprovecha el atributo 'length' como limite maximo
        for (int i=0; i < numeros.length; i++){
            numeros[i] = (int) Math.pow(i,3);
        }

        // Usamos un bucle para mostrar el contenido del arreglo
        // Observar como se aprovecha el atributo 'length' como limite maximo
        for (int i=0; i < numeros.length; i++){
            System.out.println("El cubo de "+ i + " es "+ numeros[i]);
        }

        System.out.println("\n----------\n");

        // Cargamos el arreglo 'numeros' con los cubos de los nº desde 7 a 16
        // Aprovechamos el valor del indice i para obtener los cubos
        // Observar como se aprovecha el atributo 'length' como limite maximo
        for (int i=0; i < numeros.length; i++){
            numeros[i] = (int) Math.pow((i+7),3);
        }

        // Usamos un bucle para mostrar el contenido del arreglo
        // Observar como se aprovecha el atributo 'length' como limite maximo
        for (int i=0; i < numeros.length; i++){
            System.out.println("El cubo de "+ (i+7) + " es "+ numeros[i]);
        }

        System.out.println("\n----------\n");

    }
}
