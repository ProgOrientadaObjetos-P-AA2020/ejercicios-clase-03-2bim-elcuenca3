package paquetesiete;

public class Cuadrado extends Figura {

    public Cuadrado(double b, double a) {
        super(b, a);
    }

    @Override
    public void calcular_area() {
        area = base * altura;
    }

    @Override
    public String toString() {
        
        String cadena = String.format("Area del Cuadrado: %s\n",
                 obtenerArea());
        return cadena;
    }

}
