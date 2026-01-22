package com.jesus.curso.springboot.di.factura.springboot_difactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Invoice { //Clase Factura

    //Atributos
    @Autowired //Inyeccion de dependencia
    private Client client;

    @Value("${invoice.description.office}") //Inyeccion de valor desde properties
    private String description;

    @Autowired //Inyeccion de dependencia
    @Qualifier("default") //Especificar el bean a inyectar
    private List<Item> items;

    //Getters y Setters
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    //Metodo para calcular el total de la factura
    public int getTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getImporte();
        }
        return total;
    }

    
    
}
