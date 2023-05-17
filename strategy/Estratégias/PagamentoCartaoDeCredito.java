package strategy.Estratégias;
import java.math.BigDecimal;

import strategy.EstrategiaInterface;

public class PagamentoCartaoDeCredito implements EstrategiaInterface{

    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pago com Cartão de Crédito");
    }
}
