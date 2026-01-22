package com.jesus.curso.springboot.di.factura.springboot_difactura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component 
@RequestScope //Definir el alcance del bean como por solicitud HTTP
//@JsonIgnoreProperties({"targetSource","advisors"})
public class Client { //Clase Cliente

    //Attributos
    @Value("${client.name}") //Inyeccion de valor desde properties
    private String name; 
    
    @Value("${client.lastname}") //Inyeccion de valor desde properties
    private String lastname;
    

    //Getters y Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
}
