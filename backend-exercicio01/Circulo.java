public class Circulo extends Figura{

    //Atributos
    private double raio;

    //Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }


    //Getters and Setters
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * this.raio * Math.PI;
    }
}
