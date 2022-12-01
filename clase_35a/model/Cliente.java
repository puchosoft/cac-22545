package model;

public class Cliente {
    static private int ultimoId = 0;
    private int id;
    private String nombre;
    private String apellido;
    private int dni;

    private Cuenta miCuenta;

    public Cliente(String nombre, String apellido, int dni){
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        setMiCuenta();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public Cuenta getMiCuenta() {
        return miCuenta;
    }

    private void setMiCuenta(){
        this.miCuenta = new Cuenta(this.id);
    }
}
