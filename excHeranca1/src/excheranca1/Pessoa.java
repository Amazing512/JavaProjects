/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excheranca1;

/**
 *
 * @author mathe
 */
public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    protected int rg;
    
    public Pessoa(String nome, int idade, float altura)
    {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void mostraDados()
    {
        //System.out.println("Nome: " + this.nome);
        //System.out.println("Idade: " + this.idade);
        //System.out.println("Altura: " + this.altura);
        System.out.println("É uma pessoa");
    }
    
    
}
