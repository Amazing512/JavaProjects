
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

public class AlunoController {
    
    
    public void inserirAluno(int ra, String nome)
    {
        Aluno al = new Aluno(ra,nome);
        AlunoDAO alDAO = new AlunoDAO();
        alDAO.inserirAluno(al);
    }
    public ArrayList<Aluno> buscarAluno() throws SQLException
    {
        AlunoDAO alDAO = new AlunoDAO();
        return(alDAO.buscar());
    }
    public void excluirAluno(int ra)
    {
        AlunoDAO alDAO = new AlunoDAO();
        alDAO.excluirAluno(ra);
    }
}
