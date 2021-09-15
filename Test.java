public class Test{

    public static void main(String []args){
        
        AbstractFactory RecipeFactory = RecipeFactory.getFactory("VEG");
        Recipe italianveg = RecipeFactory.getRecipe("ITALIAN");
        italianveg.details();
        Recipe chineseveg = RecipeFactory.getRecipe("CHINESE");
        chineseveg.details();
        
        
        RecipeFactory = RecipeFactory.getFactory("NONVEG");
        Recipe italiannonveg = RecipeFactory.getRecipe("ITALIAN");
        italiannonveg.details();
        Recipe chinesenonveg = RecipeFactory.getRecipe("CHINESE");
        chinesenonveg.details();
    }
}
