public class CalcularArea {
    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    public static void main(String[] args) {
        System.out.println("Área do retângulo é: " + calcularAreaRetangulo(5.0, 20.0)); // Saída: 50.0
    }
}