/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_oo;

/**
 *
 * @author mathe
 */
public class Pessoa {

    private int idade;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;
    private String nome;
    
    public Pessoa(int diaNasc, int mesNasc, int anoNasc, String nome)
    {
        if(diaNasc > 31 || diaNasc < 1)
        {
            this.diaNasc = diaNasc;
        }
        if(mesNasc > 12 || mesNasc < 0) 
        {
            this.mesNasc = mesNasc;
        }
        if(anoNasc > 1000)
        {
            this.anoNasc = anoNasc;
        }
        this.nome = nome;
    }
    
    public Pessoa(int diaNasc, int mesNasc, int anoNasc)
    {
        if(diaNasc > 31 || diaNasc < 1)
        {
            this.diaNasc = diaNasc;
        }
        if(mesNasc > 12 || mesNasc < 1) 
        {
            this.mesNasc = mesNasc;
        }
        if(anoNasc > 1000)
        {
            this.anoNasc = anoNasc;
        }
    }
    
        public int getIdade() {
        return idade;
    }
        //Removi setIdade pq vai ser por meio de função
    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        if(diaNasc > 31 || diaNasc < 1)
        {
            this.diaNasc = diaNasc;
        }
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        if(mesNasc > 12 || mesNasc < 1) 
        {
            this.mesNasc = mesNasc;
        }
        
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        if(anoNasc > 1000)
        {
            this.anoNasc = anoNasc;
        }
    }

    public String informaNome() { //Modificacao getNome
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual)
    {
        if(diaAtual > 31 || diaAtual < 1 || mesAtual > 12 || mesAtual < 1 || anoAtual < 1000)
        {
            System.out.println("Por favor insira uma data atual válida.");
        }
        else
        {
            this.idade = anoAtual - this.anoNasc;
        }
       
    }
}
