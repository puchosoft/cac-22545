public class Condicionales {
    public static void main(String[] args) {

        int edad = 19;

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
        else {
            System.out.println("Es menor de edad.");
        }

        int opcion = 4;

        switch (opcion){
            case 1:
                System.out.println("La opcion elegida es 1");
                break;
            case 2:
                System.out.println("La opcion elegida es 2");
                break;
            case 3:
                System.out.println("La opcion elegida es 3");
                break;
            case 4:
                System.out.println("La opcion elegida es 4");
                break;
            case 5:
                System.out.println("La opcion elegida es 5");
                break;
            default:
                System.out.println("La opcion elegida es ninguna de las esperadas");
        }
    }
}
