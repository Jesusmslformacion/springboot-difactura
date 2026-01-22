package com.jesus.curso.springboot.di.factura.springboot_difactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope //Definir el alcance del bean como por solicitud HTTP
//@JsonIgnoreProperties({"targetSource","advisors"}) //Ignorar propiedades no deseadas en la serializacion JSON
public class Invoice { //Clase Factura

    //Atributos
    @Autowired //Inyeccion de dependencia
    private Client client;

    @Value("${invoice.description.office}") //Inyeccion de valor desde properties
    private String description;

    @Autowired //Inyeccion de dependencia
    @Qualifier("default") //Especificar el bean a inyectar
    private List<Item> items;

    public Invoice() { //Constructor
        System.out.println("Creando el componente de factura");

    }

    @PostConstruct //Metodo que se ejecuta despues de la construccion del bean
    public void init() {
        System.out.println("Creando el componente de factura"); //Mensaje de creacion
        client.setName(client.getName().concat(" Chechu"));
        description = description.concat(" del cliente: ".concat(client.getName()).concat(" ").concat(client.getLastname()));

    }

    @PreDestroy //Metodo que se ejecuta antes de la destruccion del bean
    public void destroy() {
        System.out.println("Destruyendo el componente o bean de factura");
    }

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
