
package exercicio2;

public abstract class ContaBancaria {
    protected double saldo;
    
    public void depositar(double valorDeposito){
        if(valorDeposito <= 0)
            throw new ValorInvalidoException("ERRO - O valor do depósito não pode ser negativo: ",valorDeposito);
        
        this.saldo+=valorDeposito;
    }
    public void sacar(double valorSaque){
        if(valorSaque <= 0)
            throw new ValorInvalidoException("ERRO - O valor do saque não pode ser igual ou menor que zero: ",valorSaque);
        
        if(saldo < valorSaque)
            throw new SaldoInsuficienteException("ERRO - Voce não tem saldo suficiente para sacar: ", saldo);
        
        this.saldo-=valorSaque;
    }
    
    public void transferir(double valorTransferencia, ContaBancaria conta){
        if(valorTransferencia <= 0)
            throw new ValorInvalidoException("ERRO - O valor da transferencia não pode ser igual ou menor que zero: ",valorTransferencia);
            
        if(saldo < valorTransferencia)
            throw new SaldoInsuficienteException("ERRO - Voce não tem saldo suficiente para transferir: ", saldo);
        
        this.saldo-=valorTransferencia;
        conta.depositar(valorTransferencia);
 
        
    }
    public void calcularSaldo(){
    
    }
}
