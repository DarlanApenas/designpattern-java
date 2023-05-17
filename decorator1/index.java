package decorator1;


public class index {
    public static void main (String[]args){
        ComponenteSorvete sorvete = new BolaSorvete("Chocolate", new BolaSorvete("Morango", new Casquinha()));
        System.out.println(sorvete.getSabor());
        System.out.println(sorvete.getSabor());
    }
    
}
