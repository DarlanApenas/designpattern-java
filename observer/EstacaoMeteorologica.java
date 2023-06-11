package observer;

public class EstacaoMeteorologica {
    private PrevisorDeTempo previsorDeTempo;
    private AnalisadorHistoricoChuva analisadorHistoricoChuva;

    public EstacaoMeteorologica() {
        previsorDeTempo = new PrevisorDeTempo();
        analisadorHistoricoChuva = new AnalisadorHistoricoChuva();
    }

    public void novaMedicaoTemperatura(double temperatura) {
        previsorDeTempo.notificarNovaTemperatura(temperatura);
    }

    public void novaMedicaoPressao(double pressao) {
        analisadorHistoricoChuva.notificarNovaPressao(pressao);
    }

    public void adicionarObservadorTemperatura(Observer observador) {
        previsorDeTempo.adicionarObservador(observador);
    }

    public void removerObservadorTemperatura(Observer observador) {
        previsorDeTempo.removerObservador(observador);
    }

    public void adicionarObservadorPressao(Observer observador) {
        analisadorHistoricoChuva.adicionarObservador(observador);
    }

    public void removerObservadorPressao(Observer observador) {
        analisadorHistoricoChuva.removerObservador(observador);
    }
}