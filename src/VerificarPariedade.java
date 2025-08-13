public class VerificarPariedade { public static boolean ehPar(int numero) {
    return numero % 2 == 0; //
}

    public static void main(String[] args) {
        System.out.println("10 é par? " + ehPar(10)); // Saída: 10 é par? true
        System.out.println("7 é par? " + ehPar(7));   // Saída: 7 é par? false
    }
}