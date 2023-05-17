package facade;

public class ClienteDoBanco {
    
    private String nome;

    public ClienteDoBanco(String nome){
        this.nome = nome;
    }
    public ClienteDoBanco(){
        this.nome = null;
    }
    public String obterNomeCliente(){
        return this.nome;
    }

}


