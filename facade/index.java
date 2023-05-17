package facade;

import java.math.BigDecimal;

public class index {

    public static void main (String [] args){
        ClienteDoBanco cliente = new ClienteDoBanco("Darlan Kássio");
        ContaBancaria conta = new ContaBancaria("123123-1");
        Facade facade = new Facade();
        facade.fazerDeposito(BigDecimal.valueOf(120), cliente, conta);
        System.out.println("Seu Saldo Atual é de " + conta.getSaldo());
    }
    
}
