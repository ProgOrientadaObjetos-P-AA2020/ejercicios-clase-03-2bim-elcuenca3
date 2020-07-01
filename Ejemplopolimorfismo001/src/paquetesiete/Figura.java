package paquetesiete;

public abstract class Figura {

    protected double area;
    protected double base;
    protected double altura;

    public Figura(double b, double a) {
        base = b;
        altura = a;
    }

    public void establecerArea(double n) {
        area = n;
    }

    public void establecerBase(double n) {
        base = n;
    }

    public void establecerAltura(double n) {
        altura = n;
    }

    public double obtenerBase() {
        return base;
    }

    public double obtenerAltura() {
        return altura;
    }

    public abstract void calcular_area();

    public double obtenerArea() {
        return area;
    }

}
