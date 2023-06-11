package factory;

public class main {
    public static void main (String [] args){
        FactoryFormas factory = new FactoryFormas();

        Forma c = factory.criarForma("circulo");
        c.desenhar();
        Forma r = factory.criarForma("retangulo");
        r.desenhar();
    }
}
