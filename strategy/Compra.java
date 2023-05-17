package strategy;

import java.math.BigDecimal;

public class Compra {
    private BigDecimal valor;

    public Compra(BigDecimal valor){   
        this.valor = valor;
    }

    public void processarCompra(EstrategiaInterface estrategia){
        estrategia.pagar(valor);
    }
}
