public class Cilindro {
    private double raio;
    private double altura;

    // Construtor
    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    // Método para calcular o volume do cilindro
    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    // Métodos getters para exibir os valores
    public double getRaio() {
        return raio;
    }

    public double getAltura() {
        return altura;
    }
}