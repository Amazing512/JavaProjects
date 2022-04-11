
package exercicio1;

public class Aluno {
    //ATRIBUTOS
    private int ra;
    private int idade;
    private String nome;
    
    //CONSTRUTOR
    public Aluno(int ra,int idade, String nome)
    {
        this.ra = ra;
        this.idade = idade;
        this.nome = nome;
    }
    
    //GETTERS e SETTERS
    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
