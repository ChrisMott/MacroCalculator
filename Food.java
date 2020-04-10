import java.util.ArrayList;

public class Food {





        String name;
        double servings;
        int calories;
        double carbs;
        double fat;
        double protein;

        String macroStatement;

        public static ArrayList<Food> meals = new ArrayList<Food>();



        public Food(String name, double servings, int calories, double carbs, double fat, double protein){

            this.name = name;

            this.servings = servings;

            this.calories =calories;

            this.carbs = carbs;

            this.fat = fat;

            this.protein = protein;





        }

//    public void getNameFood(){
//
//        return nameFood;
//
//    }

//    public static void addFood(Food meal){
//        meals.add(meal);
//
//    }

        @Override
        public String toString() {

            macroStatement = name + ", " + servings + " servings, " + calories + " calories per serving, " + carbs + " g of carbs per serving, " + fat + " g of fat per serving, " + protein + " g of protein per serving." ;
            return macroStatement;

//        return "" + name + ", " + servings + " servings, " + calories + " calories per serving, " + carbs + " g of carbs per serving, " + fat + " g of fat per serving, " + protein + " g of protein per serving." ;
        }



}
