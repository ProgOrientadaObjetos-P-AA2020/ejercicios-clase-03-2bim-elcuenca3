package paquetesiete;

public class Rombo extends Figura {

    public Rombo(double b, double a) {
        super(b, a);
    }

    @Override
    public void calcular_area() {
        area = (base * altura) / 2;
    }

    @Override
    public String toString() {
   
        String cadena = String.format("Area del Rombo: %s\n",
                 obtenerArea());
        return cadena;
    }

}
