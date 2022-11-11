public class Perro {

    // La clase tiene 4 atributos privados (solo se pueden acceder internamente en la clase)
    private int edad;
    private String pelo;
    private String raza;
    private String sexo;

    // 2 metodos constructores (se llaman identico a la clase)
    public Perro(String pelo, String raza, String sexo){
        this.edad = 0;
        this.pelo = pelo;
        this.raza = raza;
        this.sexo = sexo;
    }

    public Perro(){
    }

    // 4 metodos getters (1 por cada atributo privado)
    public int getEdad(){
        return this.edad;
    }

    public String getPelo() {
        return pelo;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    // Otros metodos de la clase
    public void envejecer(){
        this.edad ++;
    }

    public void comunicar(){
        System.out.println("guau!");
    }

}
