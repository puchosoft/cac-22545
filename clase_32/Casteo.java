public class Casteo {
    public static void main(String[] args) {

        int a = 30;
        int b = 12;

        int cocienteEnteroInt = 30 / 12;
        System.out.println(cocienteEnteroInt);

        double cocienteEnteroFloat = 30 / 12; //Casteo implicito int -> double
        System.out.println(cocienteEnteroFloat);

        double cocienteFloat = 30 / 12.0;
        System.out.println(cocienteFloat);

        double cocienteCasteado =  (double)a / b; // Casteo explicito
        System.out.println(cocienteCasteado);

    }
}
