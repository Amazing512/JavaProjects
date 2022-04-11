
package exercicio2;

public class Revista extends Produto{
    private int issn;

    public Revista(String descricao, int issn) {
        super(descricao);
        this.issn = issn;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }
    
    @Override
    public void mostrarDados()
    {
        super.mostrarDados();
        System.out.println("ISSN: " + issn);
    }
}
