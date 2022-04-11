
package com.example.springBeans;

public class Autor implements AutorLivro {
    private String nome;

    public String getNomeDoAutor() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void exibirAutor(){
        System.out.println(this.nome);
    }
}
