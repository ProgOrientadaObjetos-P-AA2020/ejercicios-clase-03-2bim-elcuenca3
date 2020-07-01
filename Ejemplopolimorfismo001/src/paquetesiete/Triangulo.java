package paquetesiete;

public class Triangulo extends Figura {

    public Triangulo(double b, double a) {
        super(b, a);
    }

    @Override
    public void calcular_area() {
        area = (base * altura) / 2;
    }

    @Override
    public String toString() {

        String cadena = String.format("Area del Trinagulo: %s\n",
                 obtenerArea());
        return cadena;
    }

}
