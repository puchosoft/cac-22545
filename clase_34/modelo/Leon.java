package modelo;

public class Leon extends Felino{

    public Leon(int edad){
        super("Leon", edad);
    }

    // Aplicamos POLIMORFISMO al método de modelo.Felino
    @Override
    public void comunicar() {
        System.out.println("Roarrr...!");
    }
}
