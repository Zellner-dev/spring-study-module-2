package br.com.zellner.produtosApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zellner.produtosApi.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findByNome(String nome); 
}
