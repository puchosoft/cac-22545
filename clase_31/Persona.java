public class Persona {
    private String nombre;
    public int edad;
    private String dni;

    static public int cantPersonas = 0;

    public Persona() {
        cantPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        cantPersonas++;
    }

    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        cantPersonas++;
    }

    private char esMayorDeEdad(){
        char mayor = 'S';
        if (edad < 18) {
            mayor = 'N';
        }
        return mayor;
    }

    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", mayorEdad=" + esMayorDeEdad() +
                '}';
    }

    public String _toString(){
        String s;
        s = "Nombre: " + nombre;
        s += " - Edad: " + edad;
        s += " - DNI: " + dni;
        return s;
    }
    public void cumplirAnios(){
        edad++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }




}
