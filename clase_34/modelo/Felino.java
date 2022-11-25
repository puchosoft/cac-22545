package modelo;

public class Felino extends Mamifero {

    private static int lastId = 0;
    private final int id;
    private final String subespecie;
    private final int edad;

    public Felino(String subespecie, int edad){
        super("Carnivoro", "Felino");
        this.subespecie = subespecie;
        this.edad = edad;
        this.id = ++lastId;
    }

    public int getId() {
        return id;
    }

    public String getSubespecie() {
        return subespecie;
    }

    public int getEdad() {
        return edad;
    }

    // Implementamos el metodo ABSTRACTO de modelo.Mamifero
    public void comunicar() {
        System.out.println("---");
    }

}
