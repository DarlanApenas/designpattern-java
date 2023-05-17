package decorator1;

public class Casquinha implements ComponenteSorvete{

    @Override
    public double getPreco() {
        return 0.5;
    }

    @Override
    public String getSabor() {
        return "casquinha";
    }
    
}
