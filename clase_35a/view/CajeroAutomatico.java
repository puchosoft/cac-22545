package view;

import model.Cuenta;
import java.util.Scanner;

public class CajeroAutomatico {
    private static String opciones[] = {
            "1 - Consultar saldo",
            "2 - Depositar efectivo",
            "3 - Retirar efectivo",
            "4 - Transferir a cuenta secundaria",
            "5 - Salir"
    };
    
    static Scanner entrada = new Scanner(System.in);

    public static void operar(Cuenta cuentaPrincipal, Cuenta cuentaSecundaria){
        int opcion;
        boolean salir = false;
        double saldo, monto;

        do {
            mostrarMenu();
            System.out.print("\nSu elección: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    saldo = cuentaPrincipal.getSaldo();
                    System.out.println("* Su saldo es: $" + saldo + " *");
                    pausaEnter();
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    monto = entrada.nextDouble();
                    cuentaPrincipal.depositar(monto);
                    saldo = cuentaPrincipal.getSaldo();
                    System.out.println("* Su saldo es: $" + saldo + " *");
                    pausaEnter();
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    monto = entrada.nextDouble();
                    if(!cuentaPrincipal.retirar(monto))
                        System.out.println("* Su saldo es insuficiente *");
                    saldo = cuentaPrincipal.getSaldo();
                    System.out.println("* Su saldo es: $" + saldo + " *");
                    pausaEnter();
                    break;

                case 4:
                    System.out.print("Ingrese el monto a transferir: $");
                    monto = entrada.nextDouble();
                    if(!cuentaPrincipal.transferir(monto, cuentaSecundaria))
                        System.out.println("* Su saldo es insuficiente *");
                    saldo = cuentaPrincipal.getSaldo();
                    System.out.println("* Su saldo es: $" + saldo + " *");
                    pausaEnter();
                    break;

                case 5:
                    salir = true;
                    System.out.println("* Gracias por operar con nosotros *");
                    pausaEnter();
                    break;

                default:
                    System.out.println("* Opción no esperada *");
                    pausaEnter();
            }
        } while (!salir);
    }

    private static void mostrarMenu(){
        System.out.println("-----------------");
        System.out.println("Cajero automatico");
        System.out.println("-----------------");
        for (int i=0; i < opciones.length; i++) {
            System.out.println(opciones[i]);
        }
    }

    private static void pausaEnter(){
        System.out.println("[ENTER] para continuar");
        entrada.nextLine();
        entrada.nextLine();
    }
}
