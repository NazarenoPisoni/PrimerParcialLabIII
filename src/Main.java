import models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();

        Silla silla1 = new Silla("374394758", "Silla de Madera", 3500, false);
        productos.add(silla1);
        Escritorio esc1 = new Escritorio("4379374343", "Escritorio de Mármol", 40000, 0.5, 1.5);
        productos.add(esc1);
        Impresora imp1 = new Impresora("347439348", "Impresora Láser", 30000, "Epson", 8);
        productos.add(imp1);
        Notebook note1 = new Notebook("4843628243", "Notebook 14", 100000, "Lenovo", "8GB");
        productos.add(note1);

        for(Producto p : productos){
            if(p instanceof Silla){
                System.out.println("El siguiente producto es una Silla: ");
                System.out.println(p.toString());
            }else if (p instanceof Escritorio){
                System.out.println("El siguiente producto es un Escritorio: ");
                System.out.println(p.toString());
            } else if (p instanceof Impresora) {
                System.out.println("El siguiente producto es una Impresora: ");
                System.out.println(p.toString());
            }else{
                System.out.println("El siguiente producto es una Notebook: ");
                System.out.println(p.toString());
            }
        }

        silla1.getDescuento(10);
        imp1.getDescuento(25);

        for(Producto p : productos){
            p.actualizarPrecio(p);
        }
    }
}