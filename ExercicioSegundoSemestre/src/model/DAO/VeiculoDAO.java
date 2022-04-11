
package model.DAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Veiculo;

public class VeiculoDAO {
    Connection con = null;
    
    public void inserirVeiculo(Veiculo vei) throws SQLException, ClassNotFoundException
    {
        con = new Conexao().getConnection();
        String sql = "INSERT INTO Veiculo_LPM (placa, marca, modelo, cor, anoFabricacao) values (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, vei.getPlaca());
        stmt.setString(2, vei.getMarca());
        stmt.setString(3, vei.getModelo());
        stmt.setString(4, vei.getCor());
        stmt.setInt(5, vei.getAnoFabricacao());
        stmt.execute();
        stmt.close();

        con.close();
    }
    
    public void excluirVeiculo(String placa) throws SQLException, ClassNotFoundException{

        con = new Conexao().getConnection();
        String sql = "DELETE FROM Veiculo_LPM WHERE placa = ?;";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, placa);
        stmt.execute();
        
        stmt.close();
        con.close();
    }
    
    public ArrayList<Veiculo> pesquisarVeiculo(String parametroBusca, int tipoBusca) throws SQLException, NumberFormatException, ClassNotFoundException
    {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        ResultSet rs = null;
        
        con = new Conexao().getConnection();
        PreparedStatement stmt = null;

        String sql = "";

        if(parametroBusca.equals(""))
        {
           sql = "SELECT * FROM Veiculo_LPM;";
           stmt = con.prepareStatement(sql);
        }
        else
        {
            switch(tipoBusca)
            {
                case 0: //Placa
                    sql = "SELECT * FROM Veiculo_LPM WHERE placa LIKE ?";
                    stmt = con.prepareStatement(sql);
                    stmt.setString(1,parametroBusca + "%");
                    break;
                case 1: //Marca
                    sql = "SELECT * FROM Veiculo_LPM WHERE marca LIKE ?";
                    stmt = con.prepareStatement(sql);
                    stmt.setString(1,parametroBusca + "%");
                    break;
                case 2: //Ano
                    sql = "SELECT * FROM Veiculo_LPM WHERE anoFabricacao = ?";
                    stmt = con.prepareStatement(sql);
                    stmt.setInt(1,Integer.parseInt(parametroBusca));
                    break;
            }          
        }

       rs = stmt.executeQuery();

       while(rs.next())
       {
           Veiculo v = new Veiculo();

           v.setPlaca(rs.getString("placa"));
           v.setMarca(rs.getString("marca"));
           v.setModelo(rs.getString("modelo"));
           v.setCor(rs.getString("cor"));
           v.setAnoFabricacao(rs.getInt("anoFabricacao"));

           listaVeiculos.add(v);
       }
       
       stmt.close();
       con.close();

        return listaVeiculos;
    }
    
    public void alterarVeiculo(Veiculo vei) throws SQLException, ClassNotFoundException
    {
        con = new Conexao().getConnection();
        String sql = "UPDATE Veiculo_LPM SET marca = ?, modelo = ?, cor = ?, anoFabricacao = ? where placa = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, vei.getMarca());
        stmt.setString(2, vei.getModelo());
        stmt.setString(3, vei.getCor());
        stmt.setInt(4, vei.getAnoFabricacao());
        stmt.setString(5, vei.getPlaca());
        
        stmt.execute();
        stmt.close();

        con.close();
    }   
}
