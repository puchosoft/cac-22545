package modelo;

public abstract class Mamifero extends Animal {

    private final String dieta;
    private final String especie;

    Mamifero(String dieta, String especie){
        super("Vertebrado", "Mamifero");
        this.dieta = dieta;
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public String getEspecie() {
        return especie;
    }

    // Metodo ABSTRACTO que obligamos a implementar a las subclases
    public abstract void comunicar();
}
