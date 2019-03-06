package practicapizzabuilder;

public class Cliente {
    
    public static void main(String[] args) {
        //creamos un obj de tipo Pizza
        Pizza miPizzaHawaiana;
        
        //creamos la pizza a partir de los métodos PizzaBuilder
        miPizzaHawaiana = new PizzaBuilder(500, 350f)
                .setGrPinha(100)
                .setGrSal(5f)
                .setGrQueso(10f)
                .setGrTomate(30f)
                .createPizza();
        
        //mostramos el resultado en pantalla
        System.out.println(miPizzaHawaiana.toString());
    }
    
}
