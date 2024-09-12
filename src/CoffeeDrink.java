// CoffeeDrink object class

class CoffeeDrink {

    private int numberOfCups;
    private String flavor;
    private boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCups, String flavor, boolean hasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.numberOfCups = numberOfCups;
        // this. means that it is part of the identity for the object
        this.flavor = flavor;
        this.hasWhippedCream = hasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.println("There are " + numberOfCups + " cup(s) with the flavor " + flavor + " and it is " + hasWhippedCream + " that there is whipped cream.");
    }

    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }

    public String getFlavor(){
        return flavor;
    }
}
