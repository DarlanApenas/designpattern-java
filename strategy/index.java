package strategy;
import java.math.BigDecimal;
import strategy.Estratégias.*;

public class index {
    public static void main(String [] args){
        BigDecimal valor = new BigDecimal("10");
        Compra compra = new Compra(valor);

        //compra.processarCompra(new PagamentoCartaoDeCredito());
        compra.processarCompra(new PagamentoCartaoDeCredito());
    }
}
