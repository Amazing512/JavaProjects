/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a.defclasses;

/**
 *
 * @author mathe
 */
public class Aluno {
    String nome;
    int ra;
    double altura;
    String endereco;
    boolean feliz;
    
    
    void matarAula()
    {
        feliz = true;
    }
    
    void assistirAulaTania()
    {
        feliz=false;
    }
    boolean alturaMinima()
    {
        if(altura>=1.5)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
