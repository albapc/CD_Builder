
package practicapizzabuilder;

public class PizzaBuilder {
    private float grHarina, mlAgua, grSal=0, mlAceite=0, grTomate=0, grQueso=0, grPinha=0;
    private String tipoAceite="", tipoQueso="";

    public PizzaBuilder() {
    }
    
    public PizzaBuilder(final float grHarina, final float mlAgua){
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
    }

    public PizzaBuilder setGrSal(float grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(float mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(float grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(float grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(float grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }
    
    public Pizza createPizza(){
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, grTomate, grQueso, grPinha, tipoAceite, tipoQueso);
    }
    
}
