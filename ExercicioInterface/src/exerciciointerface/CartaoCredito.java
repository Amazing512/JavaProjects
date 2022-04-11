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
public class CartaoCredito implements TipoPagamento{
    private static int diaFaturamento = 20;
    private static double porcentagemFinanceira = 0.1;
    private double valor;
    
    public CartaoCredito(double valor)
    {
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
