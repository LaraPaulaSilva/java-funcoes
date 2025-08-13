public class MediadosNumeros {

    public static double calcularMedia(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static String resultado(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        double media = calcularMedia(10.0, 8.0, 6.5);
        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado(media));
    }
}
