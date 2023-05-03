package models;
import java.util.ArrayList;

public class Producto {
    private String numeroStock;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(String numeroStock, String nombre, double precio) {
        this.numeroStock = numeroStock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNumeroStock() {
        return numeroStock;
    }

    public void setNumeroStock(String numeroStock) {
        this.numeroStock = numeroStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Número de Stock = '" + getNumeroStock() + '\'' +
                ", Nombre = '" + getNombre() + '\'' +
                ", Precio = '" + getPrecio() + '\'' +
                '}';
    }

    public void actualizarPrecio(Producto p){
        double precioViejo;
        double precioNuevo;
        if(p instanceof Silla){
            precioViejo = p.getPrecio();
            precioNuevo = precioViejo + precioViejo * 0.05;
            p.setPrecio(precioNuevo);
            System.out.println("El precio de la Silla era de $" + precioViejo + " y ahora con el aumento es de $"
                    + precioNuevo);
        } else if (p instanceof Escritorio) {
            precioViejo = p.getPrecio();
            precioNuevo = precioViejo + precioViejo * 0.10;
            p.setPrecio(precioNuevo);
            System.out.println("El precio del Escritorio era de $" + precioViejo + " y ahora con el aumento es de $"
                    + precioNuevo);
        } else if (p instanceof Impresora) {
            precioViejo = p.getPrecio();
            precioNuevo = precioViejo + precioViejo * 0.15;
            p.setPrecio(precioNuevo);
            System.out.println("El precio de la Impresora era de $" + precioViejo + " y ahora con el aumento es de $"
                    + precioNuevo);
        }else{
            precioViejo = p.getPrecio();
            precioNuevo = precioViejo + precioViejo * 0.20;
            p.setPrecio(precioNuevo);
            System.out.println("El precio de la Notebook era de $" + precioViejo + " y ahora con el aumento es de $"
                    + precioNuevo);
        }
    }
}
