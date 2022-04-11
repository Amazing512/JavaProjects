/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.abstrato;

/**
 *
 * @author mathe
 */
public class Revista extends Produto{
    private String mes;
    private int ano;

    public Revista(String descricao, double preco, String mes, int ano) {
        super(descricao, preco);
        this.mes = mes;
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
    public void mostraDados()
    {
        System.out.println("è uma revista");
    }
}
