package com.dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //IoC associa esse componente ao component de Calculadora.java
public class MyApp implements CommandLineRunner {
    // implementa CommandLineRunner

    @Autowired //substitui a instancia do objeto calculadora = new Calculadora();
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é "+ calculadora.somar(10,10));

    }
}
