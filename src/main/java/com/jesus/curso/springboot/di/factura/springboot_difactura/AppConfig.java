package com.jesus.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.jesus.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration //Clase de configuracion
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8") //Cargar archivo de propiedades
public class AppConfig {

    @Bean //Definir un bean
    List<Item> itemsInvoice() { //Metodo que retorna una lista de items para la factura
        Product p1 = new Product("Camara Sony", 100);
        Product p2 = new Product("Bicicleta Bianchi 26", 1200);
        return Arrays.asList(new Item(p1, 2), new Item(p2, 4)); //Retornar lista de items
    }
}
