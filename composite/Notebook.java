package composite;

public class Notebook extends ElementoRede{

    private SSD ssd;

    public Notebook(String nome) {
        super(nome);
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }
    

}
