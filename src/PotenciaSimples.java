public class PotenciaSimples {
  public static int Potencia(int base, int expoente) {
      int resultado = 1;
      for(int i =1; i <=expoente; i++) {
          resultado *= base;
      }
      return resultado;
  }
  public static void main(String[] args) {
      System.out.println(Potencia(2,3));
      System.out.println(Potencia(2,0));
  }
}
