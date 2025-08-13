public class VerificarMaior {
    public static int maior(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        System.out.println("O maior n° é: " + maior(15, 20)); // Saída:  20
    }
}