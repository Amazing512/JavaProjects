/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exexcecoes;

/**
 *
 * @author mathe
 */
public class ExExcecoes {

    public static void main(String[] args) {
        String teste = null;
        try
        {
            System.out.println(teste.toUpperCase());
        }
        catch(NullPointerException e)
        {
            System.out.println("A string nao pode ser nula");
        }
        catch(Exception e)
        {
            System.out.println("Erro");
        }
        finally
        {
            teste = "x";
        }
        Aluno al1 = new Aluno();
        try {
            al1.setRa(-2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        al1.setNome(null);
        
        
        System.out.println("Término do Programa" + teste);
    }
    
}
