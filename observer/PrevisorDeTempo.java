package observer;

import java.util.ArrayList;
import java.util.List;

public class PrevisorDeTempo implements Sujeito {
    private List<Observer> observadores = new ArrayList<>();

    public void notificarNovaTemperatura(double temperatura) {
        for (Observer observador : observadores) {
            observador.atualizar(temperatura);
        }
    }
    @Override
    public void adicionarObservador(Observer observador) {
        observadores.add(observador);
    }
    @Override
    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }
}
