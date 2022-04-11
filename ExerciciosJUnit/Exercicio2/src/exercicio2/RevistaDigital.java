/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author mathe
 */
public class RevistaDigital extends Revista implements Autenticar{
    private String doi;

    public RevistaDigital(String descricao, int issn, String doi) {
        super(descricao, issn);
        this.doi = doi;
    }
    
    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    @Override
    public boolean autentica(String username)
    {
        return username.equals("assinante");
    }
    
    @Override
    public void mostrarDados()
    {
        super.mostrarDados();
        System.out.println("DOI: " + doi);
    }
}
