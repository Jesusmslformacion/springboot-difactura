package com.jesus.curso.springboot.di.factura.springboot_difactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Client;
import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Invoice;

@RestController //Controlador REST
@RequestMapping("/invoices") //Ruta base para el controlador
public class InvoiceController {

    @Autowired //Inyeccion de dependencia
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show() {
        //Crear una nueva instancia de Invoice para evitar problemas de serializacion
        Invoice i = new Invoice();
        
        //Copiar los datos de la factura inyectada
        Client c = new Client();
        c.setLastname(invoice.getClient().getLastname());
        c.setName(invoice.getClient().getName());
        //Asignar los datos copiados a la nueva instancia
        i.setClient(c);
        i.setDescription(invoice.getDescription());
        i.setItems(invoice.getItems());
        return i; //Retornar la factura
    }
    
}
