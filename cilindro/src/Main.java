public class Main {
    public static void main(String[] args) {
                
                Cilindro cilindro = new Cilindro(5, 10);

               
                System.out.println("Cilindro com raio " + cilindro.getRaio() +
                        " e altura " + cilindro.getAltura() +
                        " tem volume: " + cilindro.calcularVolume());
    }
}
