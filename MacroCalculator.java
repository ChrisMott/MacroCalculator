import java.util.*;

public class MacroCalculator {




        public static ArrayList<Food> meals = new ArrayList<Food>();


        public static void main(String[] args) {


            Food greenBeans = new Food("Green Beans", 4, 140, 24, 0, 8);
            meals.add(greenBeans);


            Food eggs = new Food("Eggs", 1, 20, 5, 12, 16);
            meals.add(eggs);

            Food bacon = new Food("Bacon", 1, 150, 0, 20, 20);
            meals.add(bacon);

            Food chicken = new Food("Chicken", 1, 200, 8, 2, 22);
            meals.add(chicken);

            Food pasta = new Food("Pasta", 1, 350, 80, 0, 2);
            meals.add(pasta);

            Food turkey = new Food("Turkey", 1, 120, 0, 2, 24);
            meals.add(turkey);


            //Prints out all the meals logged today

            meals.forEach((meal) -> System.out.println(meal));

            calculateMacros(meals);


        }


        public static void calculateMacros(ArrayList<Food> meals){

            int i = 0;

            double totalCal = 0;
            double totalCarbs = 0;
            double totalFat = 0;
            double totalProtein = 0;

            while(i < meals.size()){

                totalCal += meals.get(i).servings*meals.get(i).calories;

                totalCarbs += meals.get(i).servings*meals.get(i).carbs;

                totalFat += meals.get(i).servings*meals.get(i).fat;

                totalProtein += meals.get(i).servings*meals.get(i).protein;

                i++;


            }

            System.out.println();
            System.out.println("Today's total calories is " + totalCal + ".");
            System.out.println();

            System.out.println("Today's total carbohydrates is " + totalCarbs + " grams.");
            System.out.println();

            System.out.println("Today's total fat is " + totalFat + " grams.");
            System.out.println();

            System.out.println("Today's total protein is " + totalProtein + " grams.");
            System.out.println();



        }








}
