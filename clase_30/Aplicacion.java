public class Aplicacion {

    public static void main(String[] args) {

        // Declaracion de variables con sus tipos de datos
        int i = 48;

        // Conversiones automaticas de tipos
        // i es int, pero se convierte a String para concatenar
        String frase = "Maria tiene " + i + " años de edad.";
        System.out.println(frase);
        String palabra = i + " pesos.";
        System.out.println(palabra);

        // Para indicar que un numero es float hay que agregar una f
        float f = 12.7f;
        int suma;

        // i es int, pero se convierte a float para hacer la suma
        System.out.println(i + f);

        String n = "100";
        // n es String y no se convierte automaticamente a int
        // si hago la suma automatica es resultado seria un String "48100"
        // Para convertir el String a int uso el metodo parseInt() de la clase Integer
        suma = i + Integer.parseInt(n);
        System.out.println(suma);

        // Sintaxis clasica de instanciar un objeto String
        String obj_str = new String("contenido");

        // Sintaxis implicita de instanciar un objeto String
        String s = "implicito";

        // Instanciamos un objeto 'pipo' de la clase Animal
        Animal pipo = new Animal();

        // Modificamos 2 atributos del objeto
        pipo.edad = 5;
        pipo.piel = "pelo marron";

        // Invocamos o llamamos 2 metodos del objeto
        pipo.respirar();
        pipo.comer();

        // Obtenemos 2 valores de atributos desde un metodo del objeto
        double desplazamiento;
        desplazamiento = pipo.desplazar(5.2);
        System.out.println(desplazamiento);
        System.out.println(pipo.habitat);

        // Cambiamos el valor de un atributo y comprobamos el cambio
        pipo.habitat = "Selva";
        System.out.println("El habitat de pipo es: " + pipo.habitat);

        // Instanciamos un objeto 'chuli' de la clase Animal y verificamos un atributo prdeterminado
        Animal chuli = new Animal();
        System.out.println("El habitat de chuli es: " + chuli.habitat);

        // Instanciamos el objeto 'bobby' de la clase Perro
        // Usamos el constructor que tiene 3 parametros
        Perro bobby = new Perro("marron", "mestizo", "hembra");

        // Hacemos que 'bobby' cumpla 5 años
        bobby.envejecer();
        bobby.envejecer();
        bobby.envejecer();
        bobby.envejecer();
        bobby.envejecer();

        // Obtenemos los atributos PRIVADOS mediante los metodos getter de la clase
        System.out.println(bobby.getEdad());
        System.out.println(bobby.getPelo());
        System.out.println(bobby.getRaza());
        System.out.println(bobby.getSexo());

        // Hacemos ladrar a 'bobby'
        bobby.comunicar();
        System.out.println("-----");

        // Instanciamos el objeto 'gandulfa' de la clase Perro
        // Usamos el constructor que no tiene parametros
        Perro gandulfa = new Perro();

        // Hacemos ladrar a 'gandulfa'
        gandulfa.comunicar();

    }
}
