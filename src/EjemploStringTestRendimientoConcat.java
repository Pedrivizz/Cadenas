public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio =  System.currentTimeMillis();

        for(int i = 0; i < 500; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms
            // c += a + b + "\n"; // 500 => 17ms
            sb.append(a); // 500 => 0ms
            sb.append(b);
            sb.append("\n");
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
