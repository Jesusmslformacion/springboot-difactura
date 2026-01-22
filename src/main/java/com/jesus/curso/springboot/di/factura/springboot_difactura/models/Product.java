package com.jesus.curso.springboot.di.factura.springboot_difactura.models;

public class Product { //Clase Producto

    //Atributos
    private String name;
    private Integer price;

    //Constructor vacio
    public Product() {
    }

    //Constructor
    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    
    //Getters y Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }

    

}
