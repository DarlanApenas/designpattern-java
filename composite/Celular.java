package composite;

public class Celular extends ElementoRede{

    private String imei;

    public Celular(String nome) {
        super(nome);
    }

    public Celular(String nome, String imei){
        this(nome);
        this.imei = imei;
    }

    public String getImei(){
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }


}
