package com.example.financeiro.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.financeiro.entities.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public ResponseEntity<Categoria> findAll() {
        Categoria c = new Categoria(1L, "Jogos");
        return ResponseEntity.ok(c);
    }
    
}
