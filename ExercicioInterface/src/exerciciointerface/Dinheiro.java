/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerface;

/**
 *
 * @author mathe
 */
public class Dinheiro implements TipoPagamento{
    private static int diaFaturamento = 0;
    private static double porcentagemFinanceira = 0;
    private double valor;

    public Dinheiro(double valor) {
        this.valor = valor;
    }
    
    @Override
    public int getDiasFaturamento()
    {
        return diaFaturamento;
    }
    
    @Override
    public double getPorcentagemFinanceiraPaga()
    {
        valor-=valor*porcentagemFinanceira;
        return porcentagemFinanceira;
    }
}
