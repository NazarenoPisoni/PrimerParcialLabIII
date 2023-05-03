package models;

public class Escritorio extends Producto{
    private double alto;
    private double ancho;

    public Escritorio() {
    }

    public Escritorio(String numeroStock, String nombre, double precio, double alto, double ancho) {
        super(numeroStock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "Nombre = " + getNombre() +
                ", Precio = " + getPrecio() +
                ", Número de Stock = " + getNumeroStock() +
                ", Alto = " + getAlto() +
                ", Ancho = " + getAncho() +
                '}';
    }
}
