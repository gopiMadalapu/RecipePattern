public class Test{

    public static void main(String []args){
        // Getting red and blue color shoes from sports shoes factory
        AbstractFactory RecipeFactory = RecipeFactory.getFactory("VEG");
        Recipe italianveg = RecipeFactory.getRecipe("ITALIAN");
        italianveg.details();
        Recipe chineseveg = RecipeFactory.getRecipe("CHINESE");
        chineseveg.details();
        
        //Getting the same color shoes but from dress shoes factory
        RecipeFactory = RecipeFactory.getFactory("NONVEG");
        Recipe italiannonveg = RecipeFactory.getRecipe("ITALIAN");
        italiannonveg.details();
        Recipe chinesenonveg = RecipeFactory.getRecipe("CHINESE");
        chinesenonveg.details();
    }
}