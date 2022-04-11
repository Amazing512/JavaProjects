
package exercicio2;

public class ContaCorrente extends ContaBancaria{
    
    
    @Override
    public void calcularSaldo(){
        saldo = saldo * 0.9;
    }
}
