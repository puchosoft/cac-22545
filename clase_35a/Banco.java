import model.Cliente;
import view.CajeroAutomatico;

public class Banco {
    public static void main(String[] args) {
        // Declarar clientes
        Cliente juan = new Cliente("Juan", "Perez", 98765432);
        Cliente eva = new Cliente("Eva", "Lopez", 23456789);

        // Operar el cajero automatico
        CajeroAutomatico.operar(juan.getMiCuenta(), eva.getMiCuenta());

        System.out.println("Saldo en la cuenta de "+ juan.getNombre()+ " : $"+ juan.getMiCuenta().getSaldo());
        System.out.println("Saldo en la cuenta de "+ eva.getNombre()+ " : $"+ eva.getMiCuenta().getSaldo());
    }
}
