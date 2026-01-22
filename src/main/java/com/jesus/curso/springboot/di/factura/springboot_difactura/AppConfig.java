package com.jesus.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration //Clase de configuracion
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8") //Cargar archivo de propiedades
public class AppConfig {

    @Bean //Definir un bean
    //@Primary
    List<Item> itemsInvoice() { //Metodo que retorna una lista de items para la factura
        Product p1 = new Product("Camara Sony", 100);
        Product p2 = new Product("Bicicleta Bianchi 26", 1200);
        return Arrays.asList(new Item(p1, 2), new Item(p2, 4)); //Retornar lista de items
    }

    @Bean("default") //Definir un bean con nombre
    List<Item> itemsInvoiceOffice() { //Metodo que retorna una lista de items para la factura
        Product p1 = new Product("Monitor Asus 24", 700);
        Product p2 = new Product("Notebook Razer", 2400);
        Product p3 = new Product("Impresora HP", 800);
        Product p4 = new Product("Escritorio Oficina", 900);
        return Arrays.asList(new Item(p1, 4), new Item(p2, 6), new Item(p3, 1), new Item(p4, 4)); //Retornar lista de items
    }
}
