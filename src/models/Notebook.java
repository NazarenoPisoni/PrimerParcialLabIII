package models;

public class Notebook extends Informatica{

    private String memoria;


    public Notebook() {
    }

    public Notebook(String numeroStock, String nombre, double precio, String fabricante, String memoria) {
        super(numeroStock, nombre, precio, fabricante);
        this.memoria = memoria;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "Nombre = " + getNombre() +
                ", Precio = " + getPrecio() +
                ", Número de Stock = " + getNumeroStock() +
                ", Fabricante = " + getFabricante() +
                ", Memoria = " + getMemoria() +
                '}';
    }
}
