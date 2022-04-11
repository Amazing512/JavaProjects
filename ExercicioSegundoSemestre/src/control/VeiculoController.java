/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.DAO.VeiculoDAO;
import model.Veiculo;

/**
 *
 * @author mathe
 */
public class VeiculoController {
    
    public VeiculoDAO veiDAO = new VeiculoDAO();
    
    public void cadastrarVeiculo(String placa, String marca, String modelo, String cor, int ano) throws SQLException, ClassNotFoundException
    {
        boolean sucesso = true;
        Veiculo vei = new Veiculo(placa, marca, modelo, cor, ano);
        veiDAO.inserirVeiculo(vei);
    }
    
    public ArrayList<Veiculo> pesquisarVeiculo(String param, int tipoBusca) throws SQLException, NumberFormatException, ClassNotFoundException
    {
        param = param.trim();
        return ( veiDAO.pesquisarVeiculo(param, tipoBusca) );
    }
    
    public void excluirVeiculo(String placa) throws SQLException, ClassNotFoundException
    {
        veiDAO.excluirVeiculo(placa);
    }
    
    public void alterarVeiculo(Veiculo vei) throws SQLException, ClassNotFoundException
    {
        veiDAO.alterarVeiculo(vei);
    }
}
