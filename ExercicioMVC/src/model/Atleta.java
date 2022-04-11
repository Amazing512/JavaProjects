
package model;

public class Atleta {
    private int cpf;
    private String nome;
    private double peso;
    private double altura;
    private int idade;

    public Atleta(String nome, int cpf, int idade, double altura, double peso) {
        this.cpf = cpf;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }
    
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

}
