import java.util.Scanner;

public class Entradas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        System.out.print("Ingrese su altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);


    }

}
