public class InverterString { public static String inverterString (String texto) {
    StringBuilder sb = new StringBuilder(texto);
return sb.reverse().toString();
}
public static void main(String[] args) {
    System.out.println(inverterString("lara"));

}
}
