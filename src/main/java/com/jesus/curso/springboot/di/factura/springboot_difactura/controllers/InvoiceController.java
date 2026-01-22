package com.jesus.curso.springboot.di.factura.springboot_difactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Invoice;

@RestController //Controlador REST
@RequestMapping("/invoices") //Ruta base para el controlador
public class InvoiceController {

    @Autowired //Inyeccion de dependencia
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice show() {
        return invoice; //Retornar la factura
    }
    
}
