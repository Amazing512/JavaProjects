
package control;

import exceptions.ArgumentoNegativoException;
import java.util.ArrayList;
import model.Atleta;

public class AtletaController {
    private ArrayList<Atleta> listaAt;
    
    public AtletaController()
    {
        listaAt = new ArrayList<>();
    }

    public ArrayList<Atleta> getListaAt() {
        return listaAt;
    }

    public void setListaAt(ArrayList<Atleta> listaAt) {
        this.listaAt = listaAt;
    }
    
    public void cadastrarAtleta(String nome, int cpf, int idade, double altura, double peso)
    {
        if(cpf <= 0 || idade <= 0 || altura <= 0 || peso <= 0)
        {
            throw new ArgumentoNegativoException();
        }
        else{
            Atleta at = new Atleta(nome,cpf,idade,altura,peso);
            listaAt.add(at);
        }
    }
    
    public ArrayList<Atleta> buscarAtleta(String cpfAtleta)
    {
        if("".equals(cpfAtleta.trim()) && listaAt.isEmpty() == false)
        {
            return listaAt;
        }
        else
        {
            ArrayList<Atleta> lista = new ArrayList<>();
            for(Atleta a: listaAt)
            {
                if(a.getCpf() == Integer.parseInt(cpfAtleta))
                {
                    lista.add(a);
                    return lista;
                }
            }
            return null;
        }
    }
    
    public boolean excluirAtleta(int cpfAtleta)
    {
        for(Atleta at: listaAt)
        {
            if(at.getCpf() == cpfAtleta)
            {
                listaAt.remove(at);
                return true;
            }
        
        }
        return false;
    }
    
    public Atleta calcularMaisAlto()
    {
        double altura = 0;
        Atleta maisAlto = null;
        for(Atleta at: listaAt)
        {
            if(at.getAltura() > altura)
            {
                maisAlto = at;
            }
        }
        return maisAlto;
    }
    
    public double calcularMediaPeso()
    {
        double somaPesos = 0;
        int qtdAtletas = 0;
        if(listaAt.isEmpty() == true)
        {
            return -1;
        }
        for(Atleta at: listaAt)
        {
            somaPesos += at.getPeso();
            qtdAtletas++;
        }
        return somaPesos/qtdAtletas;
    }
    
    public int[] calcularMaiorEMenorDeIdade()
    {
        int maioresEMenores[] = {0,0};
        
        for(Atleta at: listaAt)
        {
            if(at.getIdade() >= 18)
            {
                maioresEMenores[0]++;
            }
            else
            {
                maioresEMenores[1]++;
            }
        }
        return maioresEMenores;
    }
}
