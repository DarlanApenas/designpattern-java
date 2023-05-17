package decorator1;

public class SorveteDecorator implements ComponenteSorvete{
    private ComponenteSorvete componente;

    public SorveteDecorator(ComponenteSorvete componente){
        this.componente = componente;
    }
    public SorveteDecorator(){
    }

    @Override
    public double getPreco() {
        return componente.getPreco();
    }

    @Override
    public String getSabor() {
        return componente.getSabor();
    }
    public void setComponente(ComponenteSorvete componente){
        this.componente = componente;
    }
}
