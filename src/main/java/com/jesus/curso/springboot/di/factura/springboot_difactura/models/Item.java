package com.jesus.curso.springboot.di.factura.springboot_difactura.models;

public class Item { //Clase Item

    //Atributos
    private Product product;
    private Integer quantity;

    //Constructor vacio
    public Item() {
    }

    //Constructor
    public Item(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    //Getters y Setters
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    //Metodo para calcular el importe del item
    public int getImporte() {
        return quantity * product.getPrice();
    }
    
}
