
package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;

public class AlunoDAO {
    Connection con = null;
    
    public void inserirAluno(Aluno al)
    {
        try {
            con = new Conexao().getConnection();
            String sql = "INSERT INTO Alunos_LPM (RA,NOME) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, al.getRa());
            stmt.setString(2, al.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro de conexão");   
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro de conexão");
        } 
        finally
        {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Não foi possível fechar a conexão");
            }
        }
    }
    
    public void excluirAluno(int ra){

        try {
            con = new Conexao().getConnection();
            String sql = "DELETE FROM Aluno WHERE RA = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, ra);
            stmt.execute();
            stmt.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro: "+ex.toString());
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Não foi possível fechar a conexão");
            }
        }
    }
    
    public ArrayList<Aluno> buscar() throws SQLException
    {
        ResultSet rs = null;
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        try
        {
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM Aluno";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next())
            {
                Aluno al = new Aluno();
                al.setNome(rs.getString("nome"));
                al.setRa(rs.getInt("ra"));
                listaAlunos.add(al);
            }
            stmt.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally
        {
            con.close();
        }
        return listaAlunos;
    }

}

