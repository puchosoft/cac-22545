import modelo.*;

public class Herencia {

    public static void main(String[] args) {

        // Instanciamos la clase Animal
        Animal foca = new Animal("Vertebrado", "Mamifero");

        // Intentamos instanciar la clase Mamifero, pero no se puede
        // Las clases abstractas no se pueden instanciar
        // Mamifero willy = new Mamifero("Carnivoro", "Cetaceo");

        // Instanciamos la clase Felino
        // Como es generica su metodo comunicar() no es muy definido
        Felino tigger = new Felino("Tigre", 10);
        System.out.println(tigger.getGrupo());
        System.out.println(tigger.getDieta());
        tigger.comunicar();

        // Instanciamos la clase Gato
        // Ahora si, el metodo comunicar() está bien implementado
        Gato tom = new Gato(3);
        tom.comunicar();

        // Instanciamos la clase Leon
        // Ahora si, el metodo comunicar() está bien implementado
        Leon clarence = new Leon(7);
        clarence.comunicar();


    }

    /* 4 Principios basicos de POO

    Herencia
    --------
    Las subclases y las instancias de una clase, heredan sus atributos y metodos.

    Polimorfismo
    ------------
    Un mismo metodo heredado puede tener diferentes comportamiento segun la subclase

    Encapsulamiento
    --------------
    Los atributos son privados y se pueden manipular exclusivamente con getters y setters.

    Abstracion
    ----------
    Una clase tiene metodos declarados sin implementacion y obligar a sus subclases a implementarlos.

     */

}
