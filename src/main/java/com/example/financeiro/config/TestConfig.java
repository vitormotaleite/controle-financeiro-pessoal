package com.example.financeiro.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.financeiro.entities.Categoria;
import com.example.financeiro.repositories.CategoriaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public void run(String... args) throws Exception {
        Categoria c1 = new Categoria(null, "Jogos");
        Categoria c2 = new Categoria(null, "Livros");

        categoriaRepository.saveAll(Arrays.asList(c1,c2));
    }
    
}
