public class Quadrado extends Figura{

    //Atributos
    private double lado;

    //Construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }

    //Getters and Setters
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4* this.lado;
    }
}
