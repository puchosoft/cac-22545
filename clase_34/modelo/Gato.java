package modelo;

public class Gato extends Felino{

    public Gato(int edad){
        super("Gato", edad);
    }

    @Override public void comunicar(){
        System.out.println("Miau...");
    }
}

