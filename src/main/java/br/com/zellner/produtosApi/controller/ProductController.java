package br.com.zellner.produtosApi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.zellner.produtosApi.model.Product;
import br.com.zellner.produtosApi.repository.ProductRepository;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping 
    public Product save(@RequestBody Product product) {
        System.out.println("Produto recebido: " + product);
        String id = UUID.randomUUID().toString();
        product.setId(id);
        productRepository.save(product);
        return product;
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }

    @GetMapping()
    public List<Product> find(@RequestParam("nome") String nome) {
        return productRepository.findByNome(nome);
    }

    @PutMapping("{id}")
    public Product update(@PathVariable("id") String id, @RequestBody Product product) {
        product.setId(id);
        productRepository.save(product);
        return product;
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }
}
