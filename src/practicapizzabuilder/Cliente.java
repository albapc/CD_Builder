package practicapizzabuilder;

public class Cliente {
    
    public static void main(String[] args) {
        Pizza miPizzaHawaiana;
        
        miPizzaHawaiana = new PizzaBuilder(500, 350f)
                .setGrPinha(100)
                .setGrSal(5f)
                .setGrQueso(10f)
                .setGrTomate(30f)
                .createPizza();
        
        System.out.println(miPizzaHawaiana.toString());
    }
    
}
