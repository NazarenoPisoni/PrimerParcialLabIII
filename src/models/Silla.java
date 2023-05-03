package models;

public class Silla extends Producto {
    private boolean tieneRuedas;

    public Silla() {
    }

    public Silla(String numeroStock, String nombre, double precio, boolean tieneRuedas) {
        super(numeroStock, nombre, precio);
        this.tieneRuedas = tieneRuedas;
    }

    public boolean istieneRuedas() {
        return tieneRuedas;
    }

    public void settieneRuedas(boolean tieneRuedas) {
        this.tieneRuedas = tieneRuedas;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "Nombre = " + getNombre() +
                ", Precio = " + getPrecio() +
                ", Número de Stock = " + getNumeroStock() +
                ", Tiene Ruedas = " + istieneRuedas() +
                '}';
    }

    public void getDescuento(int porcentaje){
        double totalConDescuento = getPrecio() - (getPrecio() * porcentaje) / 100;
        System.out.println("El precio de la Silla con descuento es de $" + totalConDescuento);
    }
}
