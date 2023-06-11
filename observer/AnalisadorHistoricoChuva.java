package observer;

import java.util.ArrayList;
import java.util.List;

public class AnalisadorHistoricoChuva implements Sujeito {
    private List<Observer> observadores = new ArrayList<>();

    public void notificarNovaPressao(double pressao) {
        for (Observer observador : observadores) {
            observador.atualizar(pressao);
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
