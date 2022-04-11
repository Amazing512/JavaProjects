
package control;

import java.util.ArrayList;
import model.Aluno;

public class AlunoController {
    private ArrayList<Aluno> listaAl;
    
    public AlunoController() {
        listaAl = new ArrayList<>();
    }
    
    public void cadastrarAluno(String nome, int idade)
    {           
        Aluno al = new Aluno(nome,idade);
        listaAl.add(al);
    }
    
    public ArrayList<Aluno> buscarAluno()
    {
        return listaAl;
    }

    
    
}
