public class ContagemRegressiva {
    public static void contagemRegressiva(int inicio) {
        for (int i = inicio; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        contagemRegressiva(5);
    }
}