package factory;

public class FactoryFormas {
    public Forma criarForma(String tipo) {
        switch(tipo) {
            case "retangulo":
                return new Circulo();
            case "circulo":
                return new Retangulo();
            default:
                return null;
        }
    }
}

