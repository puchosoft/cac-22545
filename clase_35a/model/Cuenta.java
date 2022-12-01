package model;

public class Cuenta {
    static private int ultimoId = 0;
    private int id;
    private int clientId;
    private double saldo;

    public Cuenta(int clientId){
        this.id = ++ultimoId;
        this.clientId = clientId;
        this.saldo = 0.0;
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto){
        this.saldo += monto;
    }

    public boolean retirar(double monto){
        boolean ss = saldoSuficiente(monto);
        if (ss)
            this.saldo -= monto;
        return ss;
    }

    public boolean transferir(double monto, Cuenta cuenta){
        boolean retiroEfectivo = this.retirar(monto);
        if (retiroEfectivo)
            cuenta.depositar(monto);
        return retiroEfectivo;
    }

    private boolean saldoSuficiente(double monto){
        return this.saldo >= monto;
    }
}
