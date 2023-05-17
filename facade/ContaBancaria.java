package facade;

import java.math.BigDecimal;

public class ContaBancaria {
    
    private String conta;
    private BigDecimal saldo;

    public ContaBancaria(String conta){
        this.conta = conta;
        this.saldo = BigDecimal.valueOf(0);
    }

    
    public ContaBancaria(){
        this.conta = null;
        this.saldo = BigDecimal.valueOf(0);
    }

    public BigDecimal depositar(BigDecimal valor){
        System.out.println("Depositando...");
        
        return this.setSaldo(valor);
    }

    public BigDecimal obterSaldo(){
        System.out.println("Obtendo Saldo...");
        return this.getSaldo();
    }
    public String obterNumConta(){
        System.out.println("Obtendo Número da Conta...");
        return this.getConta();
    }

    public String getConta() {
        return conta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal setSaldo(BigDecimal valor) {
        this.saldo = valor;
        return saldo;
    }
    

}
