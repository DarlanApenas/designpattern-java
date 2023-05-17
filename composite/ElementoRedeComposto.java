package composite;

import java.util.LinkedList;
import java.util.List;

public class ElementoRedeComposto extends ElementoRede{

    private List<ElementoRede> elementos = new LinkedList<>();

    public ElementoRedeComposto(String nome) {
        super(nome);
    }

    public void addElementoRede(ElementoRede elemento){
        this.elementos.add(elemento);
    }
    
}
