package composite;

public class SistGerentRede {
    
    public static void main (String [] args){
        
        Celular celular = new Celular("darlan2","123123154");
        celular.setIP("123.123.123-12");
        
        Roteador r = new Roteador("roteador quarto");
        Switch s = new Switch("nintendo");

        r.addElementoRede(celular);
        r.addElementoRede(new Notebook("Darlan's notebook"));
        

        s.addElementoRede(new Celular("Katia phone"));

    }
}
