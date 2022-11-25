package modelo;

public class Animal {

    private final String grupo;
    private final String subgrupo;

    public Animal(String grupo, String subgrupo){
        this.grupo = grupo;
        this. subgrupo = subgrupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getSubgrupo() {
        return subgrupo;
    }
}
