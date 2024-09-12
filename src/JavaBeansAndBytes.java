import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    public String name;
    public boolean isOpen;
    public int yearFounded;

    public static void main(String[] args) {
        // Where the program starts
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2000;
        System.out.println("Actually, we were founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Caramel Macchiato");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        CoffeeDrink espressoConPanna = new CoffeeDrink(2, "espresso", true);
        CoffeeDrink icedMocha = new CoffeeDrink(4, "chocolate", false);

        // TODO
        // Print out the order details
        espressoConPanna.printInfo();
        icedMocha.printInfo();

        specialOfTheDay(icedMocha.getFlavor());
    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int discount = (int)(Math.random()*31);
        System.out.println("Congratulations! Your discount is " + discount + "%");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's special is " + special + ".");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");
        // TODO
        // Write three different for loops that print the indicated numbers:
        // Print 1 to 5
        for (int i = 1; i < 6; i++){
            System.out.println(i);
        }
        // Print 2, 5, 8, 11
        for (int i = 2; i < 12; i+=3){
            if (i == 11){
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        // Print 8 to 0
        for (int i = 8; i >= 0; i--){
            System.out.println(i);
        }
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
        double rand = Math.random();
        if (rand < 0.25){
            System.out.println("The barista recommends black coffee");
        } else if (rand < 0.5){
            System.out.println("The barista recommends a pumpkin spice latte");
        } else if (rand < 0.75) {
            System.out.println("The barista recommends a cappuccino");
        } else {
            System.out.println("The barista recommends an Americano");
        }
    }
}

