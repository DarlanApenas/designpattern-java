package composite;

public class ElementoRede {
    private String ip;
    private String nome;


    public ElementoRede(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIP(){
        return ip;
    }

    public void setIP(String ip) {
        this.ip = ip;
    }
}
