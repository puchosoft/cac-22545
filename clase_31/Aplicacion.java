public class Aplicacion {
    public static void main(String[] args) {

        Persona lucho = new Persona();

        //lucho.nombre = "Luis";
        //lucho.edad = 30;
        lucho.setNombre("Luis");
        lucho.setEdad(30);

        //System.out.println("Nombre: " + lucho.nombre);
        //System.out.println("Edad: " + lucho.edad);
        System.out.println("Nombre: " + lucho.getNombre());
        System.out.println("Edad: " + lucho.getEdad());

        lucho.cumplirAnios();
        System.out.println("Edad: " + lucho.getEdad());

        Persona chelo = new Persona("Marcelo");

        Persona juancho = new Persona("Juan", 25, "98765432");

        System.out.println(lucho);
        System.out.println(chelo);
        System.out.println(juancho);

        Persona mecha = new Persona("Mercedes", 27, "36457987");
        System.out.println(mecha);

        // System.out.println(juancho.esMayorDeEdad());

        System.out.println("\nObjetos Persona en el programa: " + Persona.cantPersonas);

    }
}
