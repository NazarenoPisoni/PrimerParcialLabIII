package models;

public class Informatica extends Producto{

    private String fabricante;


    public Informatica() {
    }

    public Informatica(String numeroStock, String nombre, double precio, String fabricante) {
        super(numeroStock, nombre, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Informatica { " +
                "Número de Stock = '" + getNumeroStock() + '\'' +
                ", Nombre = '" + getNombre() + '\'' +
                ", Precio = '" + getPrecio() + '\'' +
                ", Fabricante = '" + getFabricante() + '\'' +
                '}';
    }
}
