import java.util.ArrayList;

public class Meal {
    //Fields
    ArrayList<Ingredients> arrIngredients = new ArrayList<Ingredients>(); //Stores the ingredients
    Long lngRecipe; //The recipe
    int[] arrFresh; //Which 'meals of the days' it can be made fresh in | 0 = breakfast, 1 = lunch, 2 = dinner 
    boolean booReheat; //Can the meal can be reheated
    int[] arrReheat; //Which 'meals of the days' that it can be  in | 0 = breakfast, 1 = lunch, 2 = dinner
    int intTimeToCook; //The time to cook in minutes
    int intTimeToPrepare; //The time to cook in minutes
    boolean booBulk; //Can this meal be bulk cooked
    int intServings; //Stores the number of servings expected
    
    //Constructor
    public Meal(ArrayList<Ingredients> arrIngredients) {
        this.arrIngredients = arrIngredients;
    }

}
