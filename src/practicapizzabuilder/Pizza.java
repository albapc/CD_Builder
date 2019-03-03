package practicapizzabuilder;

public class Pizza {

    private float grHarina, mlAgua, grSal, mlAceite, grTomate, grQueso, grPinha;
    private String tipoAceite, tipoQueso;

    public Pizza() {
    }

    public Pizza(final float grHarina, final float mlAgua, float grSal, float mlAceite, float grTomate, float grQueso, float grPinha, String tipoAceite, String tipoQueso) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.grPinha = grPinha;
        this.tipoAceite = tipoAceite;
        this.tipoQueso = tipoQueso;
    }

    @Override
    public String toString() {
        return "Pizza{" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua + ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", grTomate=" + grTomate + ", grQueso=" + grQueso + ", grPinha=" + grPinha + ", tipoAceite=" + tipoAceite + ", tipoQueso=" + tipoQueso + '}';
    }
}
