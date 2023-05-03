package models;

public class Impresora extends Informatica{

    private int impresionesPorMinuto;


    public Impresora() {
    }

    public Impresora(String numeroStock, String nombre, double precio, String fabricante, int impresionesPorMinuto) {
        super(numeroStock, nombre, precio, fabricante);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    public int getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    public void setImpresionesPorMinuto(int impresionesPorMinuto) {
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresora {" +
                "Nombre = " + getNombre() +
                ", Precio = " + getPrecio() +
                ", Número de Stock = " + getNumeroStock() +
                ", Fabricante = " + getFabricante() +
                ", Impresiones por minuto = " + getImpresionesPorMinuto() +
                '}';
    }

    public void getDescuento(int porcentaje){
        double totalConDescuento = getPrecio() - (getPrecio() * porcentaje) / 100;
        System.out.println("El precio de la Impresora con descuento es de $" + totalConDescuento);
    }
}
