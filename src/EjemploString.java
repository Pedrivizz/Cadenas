public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Orientada a Objetos";
        String curso2 = new String("Programación Orientada a Objetos");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("esIgual = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);
    }
}
