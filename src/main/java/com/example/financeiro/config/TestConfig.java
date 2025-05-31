package com.example.financeiro.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.financeiro.entities.Categoria;
import com.example.financeiro.entities.Transacao;
import com.example.financeiro.enums.TipoTransacao;
import com.example.financeiro.repositories.CategoriaRepository;
import com.example.financeiro.repositories.TransacaoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private TransacaoRepository transacaoRepository;

    @Override
    public void run(String... args) throws Exception {
        Categoria c1 = new Categoria(null, "Jogos");
        Categoria c2 = new Categoria(null, "Livros");

        Transacao t1 = new Transacao(null, "pagamento maio", new BigDecimal(3200.00), LocalDate.now(),TipoTransacao.INCOME, c1);
        Transacao t2 = new Transacao(null, "contas maio", new BigDecimal(2000.00), LocalDate.now(),TipoTransacao.EXPENSE, c1);
        Transacao t3 = new Transacao(null, "pagamento junho", new BigDecimal(4000.00), LocalDate.parse("2025-03-07"),TipoTransacao.INCOME, c2);
        Transacao t4 = new Transacao(null, "pagamento outubro", new BigDecimal(560.00), LocalDate.parse("2025-01-10"),TipoTransacao.INCOME, c2);

        categoriaRepository.saveAll(Arrays.asList(c1, c2));
        transacaoRepository.saveAll(Arrays.asList(t1,t2,t3,t4));
    }

}
