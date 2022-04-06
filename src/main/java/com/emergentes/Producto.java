package com.emergentes;

/**
 *
 * @author Ester Choque H
 */
public class Producto {
    private int id;
    private String descripcion;
    private int cantidad;
    private int precio;
    private String categoria;

    public Producto() {        
        id = 0;
        descripcion = "";        
        cantidad = 0;        
        precio = 0; 
        categoria ="";
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
