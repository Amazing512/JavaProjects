
package exercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Escola {
    //ATRIBUTOS
    private ArrayList<Aluno> matricula;
    private int maisVelho;
    private int maisNovo;
    //CONSTRUTOR
    public Escola(ArrayList<Aluno> matricula)
    {
        this.matricula = matricula;
        analisa();
    }

    //GETTERS E SETTERS
    public ArrayList<Aluno> getMatricula() {
        return matricula;
    }

    public void setMatricula(ArrayList<Aluno> matricula) {
        this.matricula = matricula;
    }

    public int getMaisVelho() {
        return maisVelho;
    }

    public void setMaisVelho(int maisVelho) {
        this.maisVelho = maisVelho;
    }

    public int getMaisNovo() {
        return maisNovo;
    }

    public void setMaisNovo(int maisNovo) {
        this.maisNovo = maisNovo;
    }
    
    public void analisa(){
        Iterator<Aluno> it = matricula.iterator();
        Aluno al = (Aluno) it.next();
        int maior = al.getIdade();
        int menor = al.getIdade();
        while (it.hasNext()){
            al = it.next();
            if (al.getIdade()>maior)
            maior = al.getIdade();
            else
            if (al.getIdade()<menor)
            menor = al.getIdade();
        }
        maisVelho = maior;
        maisNovo = menor;
}
    
    
}
