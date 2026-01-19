package br.com.zellner.produtosApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zellner.produtosApi.model.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping 
    public Product save(@RequestBody Product product) {
        System.out.println("Produto recebido: " + product);
        return product;
    }

}
