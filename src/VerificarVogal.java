public class VerificarVogal {
public static boolean ehVogal(char caractere){
    char c = Character.toLowerCase(caractere);
    return c == 'a' || c == 'e' || c == 'i'  || c == 'o' || c == 'u';
}
public static void main(String[] args){
    System.out.println(ehVogal('a'));
    System.out.println(ehVogal('B'));
}
}