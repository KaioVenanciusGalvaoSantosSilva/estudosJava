package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    private String nome;

    //Polimorfismo para evitar acoplamento (SET sendo diferente de LinkedHashSet)
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //Ordenado, criação e busca eficiente + elemetos únicos
    private Set<Conteudo> conteudosConcluidos= new LinkedHashSet<>(); //Ordenado, criação e busca eficiente + elemetos únicos

    public void inscreverBootcamp(Bootcamp bootcamp){

    }
    public void progredir(){

    }

    public double calcularXp(){

        return 20;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //Por usar LinkedHashSet precisa gerar o equals and hashcode
    //Usado para comparar os elementos por meio do conteudo e da HASH
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
