package observer;

public class ExibicaoPressao implements Observer{
    @Override
    public void atualizar(double valor) {
        System.out.println("Nova pressão: " + valor);
    }
}
