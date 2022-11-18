public class Bucles {
    public static void main(String[] args) {
/*
        int a = 15;

        while (a > 0){
            System.out.println(a);
            // asegurarse de que la condicion
            // se deje de cumplir en algun momento
            a--;
        }

        System.out.println("------");

        do {
            a++;
            System.out.println(a);
        } while (a < 15);
*/
        System.out.println("------");

        for(int i=1; i<16; i++){

            // No es recomendable modificar el valor
            // de la variable de control dentro del bucle
            // i *= 2;

            //if (i == 7)
            //    break;

            //if (i == 7)
            //    continue;

            System.out.println(i);
        }
    }
}
