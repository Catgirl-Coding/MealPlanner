import java.util.ArrayList;

public abstract class Ingredients extends Meal{
    //Constructor
    public Ingredients(ArrayList<Ingredients> arrIngredients) {
        super(arrIngredients);

    }

    protected ArrayList<MacroNutrients> arrMacroNutrients = new ArrayList<MacroNutrients>();

    //Gets
    public ArrayList<MacroNutrients> getArrMacroNutrients() {
        return arrMacroNutrients;
    }

    //Sets
    public void setArrMacroNutrients(ArrayList<MacroNutrients> arrMacroNutrients) {
        this.arrMacroNutrients = arrMacroNutrients;
    }
    
}