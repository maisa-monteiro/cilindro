public class Main {
    public static void main(String[] args) {
                // Criando um cilindro com raio 5 e altura 10
                Cilindro cilindro = new Cilindro(5, 10);

                // Calculando e exibindo o volume
                System.out.println("Cilindro com raio " + cilindro.getRaio() +
                        " e altura " + cilindro.getAltura() +
                        " tem volume: " + cilindro.calcularVolume());
    }
}